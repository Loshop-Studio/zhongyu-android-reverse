.class public Lcom/zykj/subscriber/entity/resp/ApiResp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;
    }
.end annotation


# instance fields
.field private error:Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;
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
.method public final getError()Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/entity/resp/ApiResp;->error:Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;

    return-object v0
.end method

.method public final getErrorCode()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/entity/resp/ApiResp;->error:Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/entity/resp/ApiResp;->error:Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/subscriber/entity/resp/ApiResp;->success:Z

    return v0
.end method

.method public final setError(Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;)V
    .locals 0
    .param p1    # Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/zykj/subscriber/entity/resp/ApiResp;->error:Lcom/zykj/subscriber/entity/resp/ApiResp$ErrorInfo;

    return-void
.end method

.method public final setSuccess(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zykj/subscriber/entity/resp/ApiResp;->success:Z

    return-void
.end method
