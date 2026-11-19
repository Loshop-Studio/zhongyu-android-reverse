.class public Lcom/zykj/mistake/network/ApiResp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/mistake/network/ApiResp$ErrorInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0017\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007\"\u0004\u0008\u000c\u0010\tR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/mistake/network/ApiResp;",
        "",
        "<init>",
        "()V",
        "success",
        "",
        "getSuccess",
        "()Z",
        "setSuccess",
        "(Z)V",
        "unAuthorizedRequest",
        "getUnAuthorizedRequest",
        "setUnAuthorizedRequest",
        "error",
        "Lcom/zykj/mistake/network/ApiResp$ErrorInfo;",
        "errorMessage",
        "",
        "getErrorMessage",
        "()Ljava/lang/String;",
        "errorCode",
        "",
        "getErrorCode",
        "()I",
        "ErrorInfo",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final error:Lcom/zykj/mistake/network/ApiResp$ErrorInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private success:Z

.field private unAuthorizedRequest:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getErrorCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/network/ApiResp;->error:Lcom/zykj/mistake/network/ApiResp$ErrorInfo;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/zykj/mistake/network/ApiResp$ErrorInfo;->getCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/network/ApiResp;->error:Lcom/zykj/mistake/network/ApiResp$ErrorInfo;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/mistake/network/ApiResp$ErrorInfo;->getCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_1
    return v1
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/network/ApiResp;->error:Lcom/zykj/mistake/network/ApiResp$ErrorInfo;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/mistake/network/ApiResp$ErrorInfo;->getMessage()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/network/ApiResp;->error:Lcom/zykj/mistake/network/ApiResp$ErrorInfo;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/mistake/network/ApiResp$ErrorInfo;->getMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    return-object v1
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/network/ApiResp;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getUnAuthorizedRequest()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/network/ApiResp;->unAuthorizedRequest:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setSuccess(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/network/ApiResp;->success:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setUnAuthorizedRequest(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/network/ApiResp;->unAuthorizedRequest:Z

    .line 2
    .line 3
    return-void
.end method
