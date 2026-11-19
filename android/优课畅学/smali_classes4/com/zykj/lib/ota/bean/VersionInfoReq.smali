.class public final Lcom/zykj/lib/ota/bean/VersionInfoReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final appType:Lcom/zykj/lib/ota/bean/AppType;

.field private final packageName:Ljava/lang/String;

.field private final version:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;)V
    .locals 1

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appType"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/lib/ota/bean/VersionInfoReq;Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;ILjava/lang/Object;)Lcom/zykj/lib/ota/bean/VersionInfoReq;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/lib/ota/bean/VersionInfoReq;->copy(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;)Lcom/zykj/lib/ota/bean/VersionInfoReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    return v0
.end method

.method public final component3()Lcom/zykj/lib/ota/bean/AppType;
    .locals 1

    iget-object v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;)Lcom/zykj/lib/ota/bean/VersionInfoReq;
    .locals 1

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/lib/ota/bean/VersionInfoReq;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/lib/ota/bean/VersionInfoReq;-><init>(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/lib/ota/bean/VersionInfoReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/lib/ota/bean/VersionInfoReq;

    iget-object v1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    iget v3, p1, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    iget-object p1, p1, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAppType()Lcom/zykj/lib/ota/bean/AppType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->packageName:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->version:I

    iget-object v2, p0, Lcom/zykj/lib/ota/bean/VersionInfoReq;->appType:Lcom/zykj/lib/ota/bean/AppType;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "VersionInfoReq(packageName="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", appType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
