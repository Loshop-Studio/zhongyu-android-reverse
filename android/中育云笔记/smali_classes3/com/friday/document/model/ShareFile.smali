.class public final Lcom/friday/document/model/ShareFile;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final createTime:Ljava/lang/String;

.field private final fileId:Ljava/lang/String;

.field private final fileName:Ljava/lang/String;

.field private final fileUrl:Ljava/lang/String;

.field private final ownerId:J

.field private ownerName:Ljava/lang/String;

.field private final parentId:Ljava/lang/String;

.field private final shareId:J

.field private shareTime:Ljava/lang/String;

.field private final shared:Z

.field private final type:Ljava/lang/String;

.field private final updateTime:Ljava/lang/String;

.field private final version:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V
    .locals 4

    .line 1
    move-object v0, p11

    .line 2
    move-object/from16 v1, p13

    .line 3
    .line 4
    move-object/from16 v2, p14

    .line 5
    .line 6
    const-string v3, "createTime"

    .line 7
    .line 8
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v3, "fileId"

    .line 12
    .line 13
    invoke-static {p2, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "fileName"

    .line 17
    .line 18
    invoke-static {p3, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "fileUrl"

    .line 22
    .line 23
    invoke-static {p4, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v3, "ownerName"

    .line 27
    .line 28
    invoke-static {p7, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v3, "parentId"

    .line 32
    .line 33
    invoke-static {p8, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v3, "shareTime"

    .line 37
    .line 38
    invoke-static {p11, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v3, "type"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "updateTime"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p2, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p3, p0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    .line 59
    .line 60
    iput-object p4, p0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    .line 61
    .line 62
    iput-wide p5, p0, Lcom/friday/document/model/ShareFile;->ownerId:J

    .line 63
    .line 64
    iput-object p7, p0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    .line 65
    .line 66
    iput-object p8, p0, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    .line 67
    .line 68
    iput-wide p9, p0, Lcom/friday/document/model/ShareFile;->shareId:J

    .line 69
    .line 70
    iput-object v0, p0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    .line 71
    .line 72
    move/from16 p1, p12

    .line 73
    .line 74
    iput-boolean p1, p0, Lcom/friday/document/model/ShareFile;->shared:Z

    .line 75
    .line 76
    iput-object v1, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 77
    .line 78
    iput-object v2, p0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    .line 79
    .line 80
    move/from16 p1, p15

    .line 81
    .line 82
    iput p1, p0, Lcom/friday/document/model/ShareFile;->version:I

    .line 83
    .line 84
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/document/model/ShareFile;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/friday/document/model/ShareFile;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-wide v6, v0, Lcom/friday/document/model/ShareFile;->ownerId:J

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-wide v10, v0, Lcom/friday/document/model/ShareFile;->shareId:J

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-object v12, v0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-boolean v13, v0, Lcom/friday/document/model/ShareFile;->shared:Z

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-object v14, v0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p14

    :goto_b
    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_c

    iget v1, v0, Lcom/friday/document/model/ShareFile;->version:I

    move/from16 p16, v1

    :goto_c
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-wide/from16 p6, v6

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-wide/from16 p10, v10

    move-object/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_d

    :cond_c
    move/from16 p16, p15

    goto :goto_c

    :goto_d
    invoke-virtual/range {p1 .. p16}, Lcom/friday/document/model/ShareFile;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lcom/friday/document/model/ShareFile;

    move-result-object v0

    return-object v0
.end method

.method private final userId()J
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/document/model/ShareFile;->shared:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/friday/document/model/ShareFile;->version:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/document/model/ShareFile;->ownerId:J

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/document/model/ShareFile;->shareId:J

    return-wide v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lcom/friday/document/model/ShareFile;
    .locals 17

    const-string v0, "createTime"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerName"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentId"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareTime"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/document/model/ShareFile;

    move-wide/from16 v6, p5

    move-wide/from16 v10, p9

    move/from16 v13, p12

    move/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/friday/document/model/ShareFile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/document/model/ShareFile;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/document/model/ShareFile;

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/friday/document/model/ShareFile;->ownerId:J

    iget-wide v5, p1, Lcom/friday/document/model/ShareFile;->ownerId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/friday/document/model/ShareFile;->shareId:J

    iget-wide v5, p1, Lcom/friday/document/model/ShareFile;->shareId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/friday/document/model/ShareFile;->shared:Z

    iget-boolean v3, p1, Lcom/friday/document/model/ShareFile;->shared:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/friday/document/model/ShareFile;->version:I

    iget p1, p1, Lcom/friday/document/model/ShareFile;->version:I

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getCoverFilePath()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ".jpg"

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final getCreateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDirPath()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final getFileId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLatestTimestamp()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/TimeUtils;->string2Millis(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2}, Lcom/blankj/utilcode/util/TimeUtils;->string2Millis(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
.end method

.method public final getMicroClassCoverUrl()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->isMicroClass()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x0

    .line 11
    const-string v2, ".zip"

    .line 12
    .line 13
    const-string v3, ".jpg"

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static/range {v1 .. v6}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string v0, ""

    .line 22
    .line 23
    return-object v0
.end method

.method public final getOthersPath()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "11"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "zip"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->isOfficeFile()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, "pdf"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    .line 34
    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, "."

    .line 47
    .line 48
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method

.method public final getOwnerId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/document/model/ShareFile;->ownerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getOwnerName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRealOssUrl()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/friday/common/helper/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final getShareId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/document/model/ShareFile;->shareId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getShareTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShared()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/model/ShareFile;->shared:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTxtFilePath()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ".txt"

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/document/model/ShareFile;->version:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/document/model/ShareFile;->ownerId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/document/model/ShareFile;->shareId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/document/model/ShareFile;->shared:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/document/model/ShareFile;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isAV()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "9"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "8"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public final isMicroClass()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "11"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final isOfficeFile()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "4"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "3"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "10"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    return v0

    .line 34
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 35
    return v0
.end method

.method public final setOwnerName(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setShareTime(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final shareNotePath()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/friday/document/model/ShareFile;->userId()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, "share"

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/friday/document/model/ShareFile;->createTime:Ljava/lang/String;

    iget-object v2, v0, Lcom/friday/document/model/ShareFile;->fileId:Ljava/lang/String;

    iget-object v3, v0, Lcom/friday/document/model/ShareFile;->fileName:Ljava/lang/String;

    iget-object v4, v0, Lcom/friday/document/model/ShareFile;->fileUrl:Ljava/lang/String;

    iget-wide v5, v0, Lcom/friday/document/model/ShareFile;->ownerId:J

    iget-object v7, v0, Lcom/friday/document/model/ShareFile;->ownerName:Ljava/lang/String;

    iget-object v8, v0, Lcom/friday/document/model/ShareFile;->parentId:Ljava/lang/String;

    iget-wide v9, v0, Lcom/friday/document/model/ShareFile;->shareId:J

    iget-object v11, v0, Lcom/friday/document/model/ShareFile;->shareTime:Ljava/lang/String;

    iget-boolean v12, v0, Lcom/friday/document/model/ShareFile;->shared:Z

    iget-object v13, v0, Lcom/friday/document/model/ShareFile;->type:Ljava/lang/String;

    iget-object v14, v0, Lcom/friday/document/model/ShareFile;->updateTime:Ljava/lang/String;

    iget v15, v0, Lcom/friday/document/model/ShareFile;->version:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v15

    const-string v15, "ShareFile(createTime="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fileId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fileName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fileUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ownerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", ownerName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", parentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shareId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", shareTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shared="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
