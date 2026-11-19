.class public final Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;
.super Lcom/zykj/base/bean/toast/ToastMessage;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
