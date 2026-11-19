.class public final Lcom/zykj/mistake/update/network/UpdateResp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;,
        Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/mistake/update/network/UpdateResp;",
        "",
        "<init>",
        "()V",
        "success",
        "",
        "getSuccess",
        "()Z",
        "setSuccess",
        "(Z)V",
        "error",
        "Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;",
        "getError",
        "()Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;",
        "setError",
        "(Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;)V",
        "result",
        "Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;",
        "getResult",
        "()Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;",
        "setResult",
        "(Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;)V",
        "ErrorInfo",
        "UpdateInfo",
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
.field private error:Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private result:Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private success:Z


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
.method public final getError()Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/update/network/UpdateResp;->error:Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/update/network/UpdateResp;->result:Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/update/network/UpdateResp;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setError(Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;)V
    .locals 0
    .param p1    # Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/update/network/UpdateResp;->error:Lcom/zykj/mistake/update/network/UpdateResp$ErrorInfo;

    .line 2
    .line 3
    return-void
.end method

.method public final setResult(Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;)V
    .locals 0
    .param p1    # Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/update/network/UpdateResp;->result:Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;

    .line 2
    .line 3
    return-void
.end method

.method public final setSuccess(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/update/network/UpdateResp;->success:Z

    .line 2
    .line 3
    return-void
.end method
