.class public final Lcom/zykj/huiwei/launcher/bean/req/LoginReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/bean/req/LoginReq;",
        "",
        "schoolName",
        "",
        "username",
        "password",
        "deviceNumber",
        "clientType",
        "",
        "role",
        "im",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V",
        "getSchoolName",
        "()Ljava/lang/String;",
        "getUsername",
        "getPassword",
        "getDeviceNumber",
        "getClientType",
        "()I",
        "getRole",
        "getIm",
        "()Z",
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
.field private final clientType:I

.field private final deviceNumber:Ljava/lang/String;

.field private final im:Z

.field private final password:Ljava/lang/String;

.field private final role:I

.field private final schoolName:Ljava/lang/String;

.field private final username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 1

    const-string v0, "schoolName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceNumber"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->schoolName:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->username:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->password:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->deviceNumber:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->clientType:I

    .line 7
    iput p6, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->role:I

    .line 8
    iput-boolean p7, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->im:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    const/4 p5, 0x2

    :cond_0
    move v5, p5

    and-int/lit8 p5, p8, 0x20

    if-eqz p5, :cond_1

    const/4 p6, 0x1

    :cond_1
    move v6, p6

    and-int/lit8 p5, p8, 0x40

    if-eqz p5, :cond_2

    const/4 p5, 0x0

    move v7, p5

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    goto :goto_1

    :cond_2
    move v7, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {v0 .. v7}, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method


# virtual methods
.method public final getClientType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->clientType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getDeviceNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->deviceNumber:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getIm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->im:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getPassword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->password:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRole()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->role:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSchoolName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->schoolName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
