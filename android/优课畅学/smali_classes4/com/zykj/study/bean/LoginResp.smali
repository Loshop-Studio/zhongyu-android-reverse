.class public final Lcom/zykj/study/bean/LoginResp;
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
            "Lcom/zykj/study/bean/LoginResp;",
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

.field private final passwordStrength:I

.field private refreshExpireInSeconds:I

.field private refreshToken:Ljava/lang/String;

.field private roleType:I

.field private final rongCloudToken:Ljava/lang/String;

.field private userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/LoginResp$Creator;

    invoke-direct {v0}, Lcom/zykj/study/bean/LoginResp$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/LoginResp;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/bean/LoginResp;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    .line 4
    iput-object p3, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    .line 5
    iput p4, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    .line 6
    iput-object p5, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    .line 7
    iput-wide p6, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    .line 8
    iput p8, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    .line 9
    iput-object p9, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    .line 10
    iput-boolean p10, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    .line 11
    iput-boolean p11, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    .line 12
    iput-object p12, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    .line 13
    iput p13, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;IILkotlin/jvm/internal/n;)V
    .locals 17

    move/from16 v0, p14

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
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move v14, v2

    goto :goto_3

    :cond_3
    move/from16 v14, p11

    :goto_3
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    move/from16 v16, v0

    :goto_4
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v12, p9

    move-object/from16 v15, p12

    goto :goto_5

    :cond_4
    move/from16 v16, p13

    goto :goto_4

    .line 14
    :goto_5
    invoke-direct/range {v3 .. v16}, Lcom/zykj/study/bean/LoginResp;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/LoginResp;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;IILjava/lang/Object;)Lcom/zykj/study/bean/LoginResp;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    goto :goto_0

    :cond_1
    move v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget v3, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    goto :goto_2

    :cond_3
    move/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-wide v5, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    goto :goto_4

    :cond_5
    move-wide/from16 v5, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget v7, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    goto :goto_5

    :cond_6
    move/from16 v7, p8

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v8, p9

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-boolean v9, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    goto :goto_7

    :cond_8
    move/from16 v9, p10

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-boolean v10, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    goto :goto_8

    :cond_9
    move/from16 v10, p11

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v11, p12

    :goto_9
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    move/from16 p15, v0

    :goto_a
    move-object p2, p0

    move-object p3, p1

    move/from16 p4, v1

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-wide/from16 p8, v5

    move/from16 p10, v7

    move-object/from16 p11, v8

    move/from16 p12, v9

    move/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_b

    :cond_b
    move/from16 p15, p13

    goto :goto_a

    :goto_b
    invoke-virtual/range {p2 .. p15}, Lcom/zykj/study/bean/LoginResp;->copy(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;I)Lcom/zykj/study/bean/LoginResp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    return-wide v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;I)Lcom/zykj/study/bean/LoginResp;
    .locals 14

    new-instance v0, Lcom/zykj/study/bean/LoginResp;

    move-object v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/zykj/study/bean/LoginResp;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;I)V

    return-object v0
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
    instance-of v1, p1, Lcom/zykj/study/bean/LoginResp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/LoginResp;

    iget-object v1, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    iget v3, p1, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    iget v3, p1, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    iget-wide v5, p1, Lcom/zykj/study/bean/LoginResp;->userId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    iget v3, p1, Lcom/zykj/study/bean/LoginResp;->roleType:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    iget p1, p1, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getClientCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExpireInSeconds()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNeedChangePwd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedSmsVerification()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getPasswordStrength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRefreshExpireInSeconds()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRoleType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRongCloudToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setExpireInSeconds(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRefreshExpireInSeconds(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRefreshToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setRoleType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    .line 2
    .line 3
    return-void
.end method

.method public final setUserId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    iget-object v2, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    iget v3, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    iget-object v4, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    iget-wide v5, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    iget v7, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    iget-object v8, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    iget-boolean v10, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    iget-object v11, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    iget v12, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "LoginResp(accessToken="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expireInSeconds="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", refreshToken="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", refreshExpireInSeconds="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", rongCloudToken="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", roleType="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mobile="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", needChangePwd="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needSmsVerification="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", clientCode="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", passwordStrength="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    iget-object p2, p0, Lcom/zykj/study/bean/LoginResp;->accessToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/study/bean/LoginResp;->expireInSeconds:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/study/bean/LoginResp;->refreshToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/study/bean/LoginResp;->refreshExpireInSeconds:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/study/bean/LoginResp;->rongCloudToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/zykj/study/bean/LoginResp;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/zykj/study/bean/LoginResp;->roleType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/study/bean/LoginResp;->mobile:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/zykj/study/bean/LoginResp;->needChangePwd:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/study/bean/LoginResp;->needSmsVerification:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/study/bean/LoginResp;->clientCode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/study/bean/LoginResp;->passwordStrength:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
