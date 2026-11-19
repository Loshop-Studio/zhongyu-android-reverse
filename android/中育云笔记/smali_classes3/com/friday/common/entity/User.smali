.class public final Lcom/friday/common/entity/User;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation build Landroidx/room/Entity;
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final accountId:J
    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = false
    .end annotation
.end field

.field private final accountName:Ljava/lang/String;

.field private final albumPermission:Z

.field private final cameraPermission:Z

.field private final headPhotoUrl:Ljava/lang/String;

.field private final screenshotsPermission:Z

.field private final unit:Ljava/lang/String;

.field private final userName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 1

    const-string v0, "accountName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headPhotoUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/friday/common/entity/User;->accountId:J

    .line 3
    iput-object p3, p0, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    .line 7
    iput-boolean p7, p0, Lcom/friday/common/entity/User;->cameraPermission:Z

    .line 8
    iput-boolean p8, p0, Lcom/friday/common/entity/User;->albumPermission:Z

    .line 9
    iput-boolean p9, p0, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p11, p10, 0x20

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p7, v0

    :cond_0
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_1

    move p8, v0

    :cond_1
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_2

    move p10, v0

    :goto_0
    move p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move p10, p9

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/friday/common/entity/User;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/User;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILjava/lang/Object;)Lcom/friday/common/entity/User;
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/friday/common/entity/User;->accountId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    move-object v6, p1

    goto :goto_0

    :cond_4
    move-object/from16 v6, p6

    :goto_0
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-boolean p1, p0, Lcom/friday/common/entity/User;->cameraPermission:Z

    move v7, p1

    goto :goto_1

    :cond_5
    move/from16 v7, p7

    :goto_1
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Lcom/friday/common/entity/User;->albumPermission:Z

    move v8, p1

    goto :goto_2

    :cond_6
    move/from16 v8, p8

    :goto_2
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    move v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_7
    move/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/friday/common/entity/User;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/friday/common/entity/User;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/User;->accountId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/User;->cameraPermission:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/User;->albumPermission:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    return v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/friday/common/entity/User;
    .locals 11

    const-string v0, "accountName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headPhotoUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/User;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/friday/common/entity/User;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/User;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/User;

    iget-wide v3, p0, Lcom/friday/common/entity/User;->accountId:J

    iget-wide v5, p1, Lcom/friday/common/entity/User;->accountId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/common/entity/User;->cameraPermission:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/User;->cameraPermission:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/friday/common/entity/User;->albumPermission:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/User;->albumPermission:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    iget-boolean p1, p1, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAccountId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/User;->accountId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getAccountName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAlbumPermission()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/User;->albumPermission:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCameraPermission()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/User;->cameraPermission:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHeadPhotoUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScreenshotsPermission()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getUnit()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/User;->accountId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/User;->cameraPermission:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/User;->albumPermission:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lcom/friday/common/entity/User;->accountId:J

    iget-object v2, p0, Lcom/friday/common/entity/User;->accountName:Ljava/lang/String;

    iget-object v3, p0, Lcom/friday/common/entity/User;->headPhotoUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/friday/common/entity/User;->userName:Ljava/lang/String;

    iget-object v5, p0, Lcom/friday/common/entity/User;->unit:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/friday/common/entity/User;->cameraPermission:Z

    iget-boolean v7, p0, Lcom/friday/common/entity/User;->albumPermission:Z

    iget-boolean v8, p0, Lcom/friday/common/entity/User;->screenshotsPermission:Z

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "User(accountId="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", accountName="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", headPhotoUrl="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userName="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unit="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cameraPermission="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", albumPermission="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", screenshotsPermission="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
