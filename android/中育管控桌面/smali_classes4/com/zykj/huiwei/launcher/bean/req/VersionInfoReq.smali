.class public final Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;",
        "",
        "packageName",
        "",
        "version",
        "",
        "appType",
        "Lcom/zykj/huiwei/launcher/bean/AppType;",
        "<init>",
        "(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;)V",
        "getPackageName",
        "()Ljava/lang/String;",
        "getVersion",
        "()I",
        "getAppType",
        "()Lcom/zykj/huiwei/launcher/bean/AppType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final appType:Lcom/zykj/huiwei/launcher/bean/AppType;

.field private final packageName:Ljava/lang/String;

.field private final version:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;)V
    .locals 1

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appType"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->copy(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;)Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    return v0
.end method

.method public final component3()Lcom/zykj/huiwei/launcher/bean/AppType;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;)Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;
    .locals 1

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;-><init>(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    iget v3, p1, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

    iget-object p1, p1, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAppType()Lcom/zykj/huiwei/launcher/bean/AppType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->packageName:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->version:I

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;->appType:Lcom/zykj/huiwei/launcher/bean/AppType;

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
