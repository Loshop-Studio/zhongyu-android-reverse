.class public final Lcom/zykj/subscriber/update/UpdateResp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;,
        Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;
    }
.end annotation


# instance fields
.field private error:Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private result:Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private success:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getError()Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/update/UpdateResp;->error:Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;

    return-object v0
.end method

.method public final getResult()Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/update/UpdateResp;->result:Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/subscriber/update/UpdateResp;->success:Z

    return v0
.end method

.method public final setError(Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;)V
    .locals 0
    .param p1    # Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/zykj/subscriber/update/UpdateResp;->error:Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;

    return-void
.end method

.method public final setResult(Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;)V
    .locals 0
    .param p1    # Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/zykj/subscriber/update/UpdateResp;->result:Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    return-void
.end method

.method public final setSuccess(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zykj/subscriber/update/UpdateResp;->success:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UpdateResp(success="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/subscriber/update/UpdateResp;->success:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/subscriber/update/UpdateResp;->error:Lcom/zykj/subscriber/update/UpdateResp$ErrorInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/subscriber/update/UpdateResp;->result:Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
