.class public final Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/satisfaction/update/UpdateResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UpdateInfo"
.end annotation


# instance fields
.field private description:Ljava/lang/String;

.field private fileUrl:Ljava/lang/String;

.field private forceUpdate:Z

.field private versionCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->fileUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->description:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getForceUpdate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->forceUpdate:Z

    return v0
.end method

.method public final getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->versionCode:I

    return v0
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->description:Ljava/lang/String;

    return-void
.end method

.method public final setFileUrl(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->fileUrl:Ljava/lang/String;

    return-void
.end method

.method public final setForceUpdate(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->forceUpdate:Z

    return-void
.end method

.method public final setVersionCode(I)V
    .locals 0

    iput p1, p0, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->versionCode:I

    return-void
.end method
