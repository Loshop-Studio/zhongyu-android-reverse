.class public final Lcom/friday/common/entity/NoteBean;
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

.field private final expirationTimeStamp:J

.field private final fileId:Ljava/lang/String;

.field private final fileName:Ljava/lang/String;

.field private final fileUrl:Ljava/lang/String;

.field private final isRecycleBin:Z

.field private isSelected:Z

.field private final parentId:Ljava/lang/String;

.field private final shared:Z

.field private final sharerId:J

.field private final type:Ljava/lang/String;

.field private final updateTime:Ljava/lang/String;

.field private final version:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJ)V
    .locals 1

    const-string v0, "fileId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    .line 9
    iput p8, p0, Lcom/friday/common/entity/NoteBean;->version:I

    .line 10
    iput-wide p9, p0, Lcom/friday/common/entity/NoteBean;->sharerId:J

    .line 11
    iput-boolean p11, p0, Lcom/friday/common/entity/NoteBean;->shared:Z

    .line 12
    iput-boolean p12, p0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    .line 13
    iput-boolean p13, p0, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    move-wide p1, p14

    .line 14
    iput-wide p1, p0, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJILkotlin/jvm/internal/n;)V
    .locals 19

    move/from16 v0, p16

    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v15, v2

    goto :goto_0

    :cond_0
    move/from16 v15, p12

    :goto_0
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_1

    move/from16 v16, v2

    goto :goto_1

    :cond_1
    move/from16 v16, p13

    :goto_1
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x0

    move-wide/from16 v17, v0

    :goto_2
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p8

    move-wide/from16 v12, p9

    move/from16 v14, p11

    goto :goto_3

    :cond_2
    move-wide/from16 v17, p14

    goto :goto_2

    .line 15
    :goto_3
    invoke-direct/range {v3 .. v18}, Lcom/friday/common/entity/NoteBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/NoteBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJILjava/lang/Object;)Lcom/friday/common/entity/NoteBean;
    .locals 15

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, p0, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, p0, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, p0, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, p0, Lcom/friday/common/entity/NoteBean;->version:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-wide v10, p0, Lcom/friday/common/entity/NoteBean;->sharerId:J

    goto :goto_8

    :cond_8
    move-wide/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, p0, Lcom/friday/common/entity/NoteBean;->shared:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, p0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, p0, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_c

    move-object/from16 p1, v2

    iget-wide v1, p0, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    move-object/from16 p2, p1

    move-wide/from16 p15, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-wide/from16 p10, v10

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p1, p0

    goto :goto_c

    :cond_c
    move-wide/from16 p15, p14

    move-object/from16 p2, v2

    move-object/from16 p1, p0

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-wide/from16 p10, v10

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    :goto_c
    invoke-virtual/range {p1 .. p16}, Lcom/friday/common/entity/NoteBean;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJ)Lcom/friday/common/entity/NoteBean;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/NoteBean;->shared:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    return v0
.end method

.method public final component13()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/NoteBean;->version:I

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/NoteBean;->sharerId:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJ)Lcom/friday/common/entity/NoteBean;
    .locals 17

    const-string v0, "fileId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentId"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/NoteBean;

    move/from16 v9, p8

    move-wide/from16 v10, p9

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-wide/from16 v15, p14

    invoke-direct/range {v1 .. v16}, Lcom/friday/common/entity/NoteBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/NoteBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/NoteBean;

    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/friday/common/entity/NoteBean;->version:I

    iget v3, p1, Lcom/friday/common/entity/NoteBean;->version:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/friday/common/entity/NoteBean;->sharerId:J

    iget-wide v5, p1, Lcom/friday/common/entity/NoteBean;->sharerId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/friday/common/entity/NoteBean;->shared:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/NoteBean;->shared:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    iget-wide v5, p1, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getCreateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExpirationTimeStamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getFileId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFullMicroLessonOssUrl()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "http"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-static {v0, v3, v4, v1, v2}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public final getMicroCoverOssUrl()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ".zip"

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
    move-result-object v2

    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-static {v0, v2, v5, v3, v4}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v2, ".jpg"

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lqd/c0;->z0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :cond_0
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    .line 62
    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Lcom/friday/common/helper/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShared()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/NoteBean;->shared:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSharerId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/NoteBean;->sharerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/NoteBean;->version:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/NoteBean;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/NoteBean;->sharerId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/NoteBean;->shared:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isRecycleBin()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/friday/common/entity/NoteBean;->fileId:Ljava/lang/String;

    iget-object v2, v0, Lcom/friday/common/entity/NoteBean;->fileName:Ljava/lang/String;

    iget-object v3, v0, Lcom/friday/common/entity/NoteBean;->parentId:Ljava/lang/String;

    iget-object v4, v0, Lcom/friday/common/entity/NoteBean;->fileUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/friday/common/entity/NoteBean;->type:Ljava/lang/String;

    iget-object v6, v0, Lcom/friday/common/entity/NoteBean;->createTime:Ljava/lang/String;

    iget-object v7, v0, Lcom/friday/common/entity/NoteBean;->updateTime:Ljava/lang/String;

    iget v8, v0, Lcom/friday/common/entity/NoteBean;->version:I

    iget-wide v9, v0, Lcom/friday/common/entity/NoteBean;->sharerId:J

    iget-boolean v11, v0, Lcom/friday/common/entity/NoteBean;->shared:Z

    iget-boolean v12, v0, Lcom/friday/common/entity/NoteBean;->isSelected:Z

    iget-boolean v13, v0, Lcom/friday/common/entity/NoteBean;->isRecycleBin:Z

    iget-wide v14, v0, Lcom/friday/common/entity/NoteBean;->expirationTimeStamp:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v16, v14

    const-string v14, "NoteBean(fileId="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fileName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", parentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fileUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sharerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", shared="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isRecycleBin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", expirationTimeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v16

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
