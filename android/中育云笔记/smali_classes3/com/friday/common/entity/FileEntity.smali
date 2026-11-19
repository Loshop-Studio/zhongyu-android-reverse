.class public final Lcom/friday/common/entity/FileEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Entity;
    tableName = "File"
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final accountId:J

.field private final cached:Z

.field private final createTime:Ljava/lang/String;

.field private depth:I
    .annotation build Landroidx/room/Ignore;
    .end annotation
.end field

.field private final errorTimes:I

.field private final expiredTime:J

.field private final fileId:Ljava/lang/String;
    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = false
    .end annotation
.end field

.field private final fileName:Ljava/lang/String;

.field private final fileType:Ljava/lang/String;

.field private final isRecycled:Z

.field private final isShared:Z

.field private final isSync:Z

.field private final localFileUrl:Ljava/lang/String;

.field private final md5:Ljava/lang/String;

.field private final ossFileUrl:Ljava/lang/String;

.field private final parentId:Ljava/lang/String;

.field private final preFileId:Ljava/lang/String;

.field private final state:I

.field private syncStatus:I
    .annotation build Landroidx/room/Ignore;
    .end annotation
.end field

.field private final updateTime:Ljava/lang/String;

.field private final version:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V
    .locals 1

    const-string v0, "fileId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ossFileUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localFileUrl"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentId"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createTime"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Lcom/friday/common/entity/FileEntity;->accountId:J

    .line 4
    iput-object p4, p0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    move p1, p11

    .line 11
    iput p1, p0, Lcom/friday/common/entity/FileEntity;->state:I

    move p1, p12

    .line 12
    iput-boolean p1, p0, Lcom/friday/common/entity/FileEntity;->isSync:Z

    move p1, p13

    .line 13
    iput p1, p0, Lcom/friday/common/entity/FileEntity;->version:I

    move p1, p14

    .line 14
    iput-boolean p1, p0, Lcom/friday/common/entity/FileEntity;->isShared:Z

    move-object/from16 p1, p15

    .line 15
    iput-object p1, p0, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

    move/from16 p1, p16

    .line 16
    iput p1, p0, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    move/from16 p1, p18

    .line 18
    iput-boolean p1, p0, Lcom/friday/common/entity/FileEntity;->cached:Z

    move-wide/from16 p1, p19

    .line 19
    iput-wide p1, p0, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    move/from16 p1, p21

    .line 20
    iput-boolean p1, p0, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V
    .locals 25

    move/from16 v0, p22

    and-int/lit16 v1, v0, 0x2000

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object/from16 v18, v2

    goto :goto_0

    :cond_0
    move-object/from16 v18, p15

    :goto_0
    and-int/lit16 v1, v0, 0x4000

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move/from16 v19, v3

    goto :goto_1

    :cond_1
    move/from16 v19, p16

    :goto_1
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    move-object/from16 v20, v2

    goto :goto_2

    :cond_2
    move-object/from16 v20, p17

    :goto_2
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    move/from16 v21, v3

    goto :goto_3

    :cond_3
    move/from16 v21, p18

    :goto_3
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_4

    const-wide/16 v1, 0x0

    move-wide/from16 v22, v1

    goto :goto_4

    :cond_4
    move-wide/from16 v22, p19

    :goto_4
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    move/from16 v24, v3

    move-object/from16 v4, p1

    move-wide/from16 v5, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move/from16 v16, p13

    move/from16 v17, p14

    move-object/from16 v3, p0

    goto :goto_5

    :cond_5
    move/from16 v24, p21

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-wide/from16 v5, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move/from16 v16, p13

    move/from16 v17, p14

    .line 21
    :goto_5
    invoke-direct/range {v3 .. v24}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILjava/lang/Object;)Lcom/friday/common/entity/FileEntity;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lcom/friday/common/entity/FileEntity;->accountId:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/friday/common/entity/FileEntity;->state:I

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lcom/friday/common/entity/FileEntity;->isSync:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/friday/common/entity/FileEntity;->version:I

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-boolean v15, v0, Lcom/friday/common/entity/FileEntity;->isShared:Z

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p15

    :goto_d
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    goto :goto_e

    :cond_e
    move/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p22, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lcom/friday/common/entity/FileEntity;->cached:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p22, v16

    move/from16 p5, v1

    move/from16 p4, v2

    if-eqz v16, :cond_11

    iget-wide v1, v0, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    goto :goto_11

    :cond_11
    move-wide/from16 v1, p19

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p22, v16

    if-eqz v16, :cond_12

    move-wide/from16 p6, v1

    iget-boolean v1, v0, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    move-wide/from16 p20, p6

    move/from16 p22, v1

    :goto_12
    move-object/from16 p16, p2

    move-object/from16 p18, p3

    move/from16 p17, p4

    move/from16 p19, p5

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move/from16 p22, p21

    move-wide/from16 p20, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p22}, Lcom/friday/common/entity/FileEntity;->copy(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)Lcom/friday/common/entity/FileEntity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/FileEntity;->state:I

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->isSync:Z

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/FileEntity;->version:I

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->isShared:Z

    return v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    return v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->cached:Z

    return v0
.end method

.method public final component18()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    return-wide v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/FileEntity;->accountId:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)Lcom/friday/common/entity/FileEntity;
    .locals 23

    const-string v0, "fileId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ossFileUrl"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localFileUrl"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentId"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createTime"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/FileEntity;

    move-wide/from16 v3, p2

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p18

    move-wide/from16 v20, p19

    move/from16 v22, p21

    invoke-direct/range {v1 .. v22}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/FileEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/friday/common/entity/FileEntity;->accountId:J

    iget-wide v5, p1, Lcom/friday/common/entity/FileEntity;->accountId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/friday/common/entity/FileEntity;->state:I

    iget v3, p1, Lcom/friday/common/entity/FileEntity;->state:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->isSync:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/FileEntity;->isSync:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/friday/common/entity/FileEntity;->version:I

    iget v3, p1, Lcom/friday/common/entity/FileEntity;->version:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->isShared:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/FileEntity;->isShared:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    iget v3, p1, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->cached:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/FileEntity;->cached:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-wide v3, p0, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    iget-wide v5, p1, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    iget-boolean p1, p1, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    if-eq v1, p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAccountId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/FileEntity;->accountId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCached()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->cached:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCreateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDepth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/FileEntity;->depth:I

    .line 2
    .line 3
    return v0
.end method

.method public final getErrorTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExpiredTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getFileId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLocalFileUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMd5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMicroClassCoverUrl()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/entity/FileEntity;->isMicroClass()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

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

.method public final getOfficePath()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "."

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public final getOssFileUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPreFileId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

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

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/FileEntity;->state:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSyncStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/FileEntity;->syncStatus:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTxtFilePath()Ljava/lang/String;
    .locals 5

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
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, ".txt"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "txt"

    .line 35
    .line 36
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v2, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method

.method public final getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/FileEntity;->version:I

    .line 2
    .line 3
    return v0
.end method

.method public final getZipFilePath()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v0, ".zip"

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/FileEntity;->accountId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/FileEntity;->state:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->isSync:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/FileEntity;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->isShared:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->cached:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isFailedState()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/friday/common/entity/FileEntity;->state:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 18
    return v0
.end method

.method public final isFolder()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "0"

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

.method public final isMicroClass()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

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

.method public final isOfficeAndPdfFile()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

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
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "5"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    return v0

    .line 44
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 45
    return v0
.end method

.method public final isOfficeFile()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

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

.method public final isRecycled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isShared()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->isShared:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSync()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/FileEntity;->isSync:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setDepth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/FileEntity;->depth:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSyncStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/FileEntity;->syncStatus:I

    .line 2
    .line 3
    return-void
.end method

.method public final syncUncompleted()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/FileEntity;->state:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/friday/common/entity/FileEntity;->fileId:Ljava/lang/String;

    iget-wide v2, v0, Lcom/friday/common/entity/FileEntity;->accountId:J

    iget-object v4, v0, Lcom/friday/common/entity/FileEntity;->fileName:Ljava/lang/String;

    iget-object v5, v0, Lcom/friday/common/entity/FileEntity;->ossFileUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/friday/common/entity/FileEntity;->localFileUrl:Ljava/lang/String;

    iget-object v7, v0, Lcom/friday/common/entity/FileEntity;->fileType:Ljava/lang/String;

    iget-object v8, v0, Lcom/friday/common/entity/FileEntity;->parentId:Ljava/lang/String;

    iget-object v9, v0, Lcom/friday/common/entity/FileEntity;->createTime:Ljava/lang/String;

    iget-object v10, v0, Lcom/friday/common/entity/FileEntity;->updateTime:Ljava/lang/String;

    iget v11, v0, Lcom/friday/common/entity/FileEntity;->state:I

    iget-boolean v12, v0, Lcom/friday/common/entity/FileEntity;->isSync:Z

    iget v13, v0, Lcom/friday/common/entity/FileEntity;->version:I

    iget-boolean v14, v0, Lcom/friday/common/entity/FileEntity;->isShared:Z

    iget-object v15, v0, Lcom/friday/common/entity/FileEntity;->preFileId:Ljava/lang/String;

    move-object/from16 v16, v15

    iget v15, v0, Lcom/friday/common/entity/FileEntity;->errorTimes:I

    move/from16 v17, v15

    iget-object v15, v0, Lcom/friday/common/entity/FileEntity;->md5:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-boolean v15, v0, Lcom/friday/common/entity/FileEntity;->cached:Z

    move/from16 v19, v14

    move/from16 v20, v15

    iget-wide v14, v0, Lcom/friday/common/entity/FileEntity;->expiredTime:J

    move-wide/from16 v21, v14

    iget-boolean v14, v0, Lcom/friday/common/entity/FileEntity;->isRecycled:Z

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "FileEntity(fileId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", accountId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", fileName="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ossFileUrl="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", localFileUrl="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileType="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", parentId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createTime="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updateTime="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isSync="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isShared="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v19

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", preFileId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", errorTimes="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", md5="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cached="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", expiredTime="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v0, v21

    invoke-virtual {v15, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", isRecycled="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
