.class public final Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;
.super Lcom/zykj/base/bean/toast/ToastMessage;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;",
        "Lcom/zykj/base/bean/toast/ToastMessage;",
        "errorInfo",
        "Lcom/zykj/lib/error/code/ErrorCodeInfo;",
        "(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V",
        "getErrorInfo",
        "()Lcom/zykj/lib/error/code/ErrorCodeInfo;",
        "base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final errorInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V
    .locals 2

    .line 1
    const-string v0, "errorInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {p0, v0, v1}, Lcom/zykj/base/bean/toast/ToastMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;->errorInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final getErrorInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;->errorInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 2
    .line 3
    return-object v0
.end method
