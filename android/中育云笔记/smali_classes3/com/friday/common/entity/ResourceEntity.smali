.class public final Lcom/friday/common/entity/ResourceEntity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Entity;
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/friday/common/entity/ResourceEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final createTimeStamp:Ljava/lang/String;

.field private final fileId:Ljava/lang/String;

.field private final id:Ljava/lang/String;
    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = false
    .end annotation
.end field

.field private final md5:Ljava/lang/String;

.field private final ossImageUrl:Ljava/lang/String;

.field private final pageIndex:I

.field private final pageName:Ljava/lang/String;

.field private final resourceType:I

.field private final toBeUploaded:Z

.field private final updateTimeStamp:Ljava/lang/String;

.field private final userId:J

.field private final wasDeleted:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/entity/ResourceEntity$Creator;

    invoke-direct {v0}, Lcom/friday/common/entity/ResourceEntity$Creator;-><init>()V

    sput-object v0, Lcom/friday/common/entity/ResourceEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/entity/ResourceEntity;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "id"

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
    const-string v0, "pageName"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ossImageUrl"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "md5"

    .line 22
    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    .line 34
    .line 35
    iput p4, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    .line 36
    .line 37
    iput-object p5, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p6, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    .line 40
    .line 41
    iput-wide p7, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    .line 42
    .line 43
    iput p9, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    .line 44
    .line 45
    iput-boolean p10, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    .line 46
    .line 47
    iput-boolean p11, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    .line 48
    .line 49
    iput-object p12, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    .line 50
    .line 51
    iput-object p13, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    .line 52
    .line 53
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/ResourceEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/friday/common/entity/ResourceEntity;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget v3, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    goto :goto_2

    :cond_3
    move/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-wide v6, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    goto :goto_5

    :cond_6
    move-wide/from16 v6, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget v8, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    goto :goto_6

    :cond_7
    move/from16 v8, p9

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-boolean v9, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    goto :goto_7

    :cond_8
    move/from16 v9, p10

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-boolean v10, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    goto :goto_8

    :cond_9
    move/from16 v10, p11

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v11, p12

    :goto_9
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_a
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-wide/from16 p9, v6

    move/from16 p11, v8

    move/from16 p12, v9

    move/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_b

    :cond_b
    move-object/from16 p15, p13

    goto :goto_a

    :goto_b
    invoke-virtual/range {p2 .. p15}, Lcom/friday/common/entity/ResourceEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)Lcom/friday/common/entity/ResourceEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    return-wide v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)Lcom/friday/common/entity/ResourceEntity;
    .locals 15

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ossImageUrl"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "md5"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/ResourceEntity;

    move/from16 v5, p4

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/ResourceEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    iget v3, p1, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    iget-wide v5, p1, Lcom/friday/common/entity/ResourceEntity;->userId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    iget v3, p1, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCreateTimeStamp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMd5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOssImageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPageIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResourceType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getToBeUploaded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getUpdateTimeStamp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getWasDeleted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final mapSelf(Ljava/lang/String;)Lcom/friday/common/entity/ResourceEntity;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "newId"

    .line 4
    .line 5
    move-object/from16 v3, p1

    .line 6
    .line 7
    invoke-static {v3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lcom/friday/common/entity/ResourceEntity;

    .line 11
    .line 12
    iget-object v4, v0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    .line 15
    .line 16
    iget v6, v0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    .line 17
    .line 18
    iget-object v7, v0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v8, v0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    .line 21
    .line 22
    iget-wide v9, v0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    .line 23
    .line 24
    iget v11, v0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    .line 25
    .line 26
    iget-boolean v12, v0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    .line 27
    .line 28
    iget-boolean v13, v0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    .line 29
    .line 30
    iget-object v14, v0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v15, v0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct/range {v2 .. v15}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    iget-object v2, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    iget v3, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    iget-object v4, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    iget-wide v6, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    iget v8, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    iget-boolean v9, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    iget-boolean v10, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    iget-object v11, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    iget-object v12, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "ResourceEntity(id="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileId="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pageName="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pageIndex="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ossImageUrl="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", md5="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", resourceType="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", toBeUploaded="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", wasDeleted="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", createTimeStamp="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updateTimeStamp="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->id:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->fileId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->pageName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/friday/common/entity/ResourceEntity;->pageIndex:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->ossImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->md5:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/friday/common/entity/ResourceEntity;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/friday/common/entity/ResourceEntity;->resourceType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/friday/common/entity/ResourceEntity;->toBeUploaded:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/friday/common/entity/ResourceEntity;->wasDeleted:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->createTimeStamp:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/friday/common/entity/ResourceEntity;->updateTimeStamp:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
