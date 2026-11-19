.class public final Lcom/friday/common/entity/LoginResp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/friday/common/entity/LoginResp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private accessToken:Ljava/lang/String;

.field private final clientCode:Ljava/lang/String;

.field private expireInSeconds:I

.field private final mobile:Ljava/lang/String;

.field private final needChangePwd:Z

.field private final needSmsVerification:Z

.field private refreshExpireInSeconds:I

.field private refreshToken:Ljava/lang/String;

.field private roleType:I

.field private final rongCloudToken:Ljava/lang/String;

.field private userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/entity/LoginResp$Creator;

    invoke-direct {v0}, Lcom/friday/common/entity/LoginResp$Creator;-><init>()V

    sput-object v0, Lcom/friday/common/entity/LoginResp;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/entity/LoginResp;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    .line 4
    iput-object p3, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    .line 5
    iput p4, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    .line 6
    iput-object p5, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    .line 7
    iput-wide p6, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    .line 8
    iput p8, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    .line 9
    iput-object p9, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    .line 10
    iput-boolean p10, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    .line 11
    iput-boolean p11, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    .line 12
    iput-object p12, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    move-wide v9, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v9, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move v11, v2

    goto :goto_1

    :cond_1
    move/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move v13, v2

    goto :goto_2

    :cond_2
    move/from16 v13, p10

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    move v14, v2

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v12, p9

    move-object/from16 v15, p12

    goto :goto_4

    :cond_3
    move/from16 v14, p11

    goto :goto_3

    .line 13
    :goto_4
    invoke-direct/range {v3 .. v15}, Lcom/friday/common/entity/LoginResp;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/LoginResp;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/friday/common/entity/LoginResp;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-wide p6, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p8, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p9, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p10, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-boolean p11, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    :cond_9
    and-int/lit16 p13, p13, 0x400

    if-eqz p13, :cond_a

    iget-object p12, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    :cond_a
    move p13, p11

    move-object p14, p12

    move-object p11, p9

    move p12, p10

    move p10, p8

    move-wide p8, p6

    move p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p14}, Lcom/friday/common/entity/LoginResp;->copy(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;)Lcom/friday/common/entity/LoginResp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    return-wide v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;)Lcom/friday/common/entity/LoginResp;
    .locals 14

    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/LoginResp;

    move-object v2, p1

    move/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/friday/common/entity/LoginResp;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;)V

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
    instance-of v1, p1, Lcom/friday/common/entity/LoginResp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/LoginResp;

    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    iget v3, p1, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    iget v3, p1, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    iget-wide v5, p1, Lcom/friday/common/entity/LoginResp;->userId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    iget v3, p1, Lcom/friday/common/entity/LoginResp;->roleType:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getClientCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExpireInSeconds()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNeedChangePwd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedSmsVerification()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRefreshExpireInSeconds()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRoleType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRongCloudToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

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

    iget-wide v3, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final setAccessToken(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setExpireInSeconds(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRefreshExpireInSeconds(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRefreshToken(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setRoleType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    .line 2
    .line 3
    return-void
.end method

.method public final setUserId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    iget v1, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    iget-object v2, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    iget v3, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    iget-object v4, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    iget-wide v5, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    iget v7, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    iget-object v8, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    iget-boolean v10, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    iget-object v11, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "LoginResp(accessToken="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expireInSeconds="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", refreshToken="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", refreshExpireInSeconds="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", rongCloudToken="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", roleType="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mobile="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", needChangePwd="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needSmsVerification="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", clientCode="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/friday/common/entity/LoginResp;->accessToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/friday/common/entity/LoginResp;->expireInSeconds:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/entity/LoginResp;->refreshToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/friday/common/entity/LoginResp;->refreshExpireInSeconds:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/entity/LoginResp;->rongCloudToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/friday/common/entity/LoginResp;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/friday/common/entity/LoginResp;->roleType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/entity/LoginResp;->mobile:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/friday/common/entity/LoginResp;->needChangePwd:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/friday/common/entity/LoginResp;->needSmsVerification:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/entity/LoginResp;->clientCode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
