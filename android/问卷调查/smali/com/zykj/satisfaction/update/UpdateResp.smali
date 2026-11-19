.class public final Lcom/zykj/satisfaction/update/UpdateResp;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;,
        Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;
    }
.end annotation


# instance fields
.field private error:Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;

.field private result:Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

.field private success:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getError()Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;
    .locals 1

    iget-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp;->error:Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;

    return-object v0
.end method

.method public final getResult()Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;
    .locals 1

    iget-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp;->result:Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/satisfaction/update/UpdateResp;->success:Z

    return v0
.end method

.method public final setError(Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/satisfaction/update/UpdateResp;->error:Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;

    return-void
.end method

.method public final setResult(Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/satisfaction/update/UpdateResp;->result:Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

    return-void
.end method

.method public final setSuccess(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zykj/satisfaction/update/UpdateResp;->success:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const-string v0, "UpdateResp(success="

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/zykj/satisfaction/update/UpdateResp;->success:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/satisfaction/update/UpdateResp;->error:Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/satisfaction/update/UpdateResp;->result:Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
