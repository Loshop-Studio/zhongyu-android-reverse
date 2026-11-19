.class public interface abstract Ld2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Lcom/friday/common/entity/OssTokenReq;Lvc/c;)Ljava/lang/Object;
    .param p1    # Lcom/friday/common/entity/OssTokenReq;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/friday/common/entity/OssTokenReq;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/entity/OssTokenResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "api/services/app/ObjectStorage/GenerateTokenV2Async"
    .end annotation
.end method

.method public abstract b(Lcom/friday/common/entity/MonitorRequest;Lvc/c;)Ljava/lang/Object;
    .param p1    # Lcom/friday/common/entity/MonitorRequest;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/friday/common/entity/MonitorRequest;",
            "Lvc/c<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "/api/services/app/StoreAppControl/RecordPicturesAsync"
    .end annotation
.end method

.method public abstract c(Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .param p1    # Lcom/friday/common/entity/EzyLoginRequest;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lgf/i;
            value = "AppName"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lgf/i;
            value = "AppVersion"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lgf/i;
            value = "ClientCode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/friday/common/entity/EzyLoginRequest;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/entity/TokenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "api/TokenAuth/Login"
    .end annotation
.end method

.method public abstract d(Lcom/friday/common/entity/SendSmsBean;Lvc/c;)Ljava/lang/Object;
    .param p1    # Lcom/friday/common/entity/SendSmsBean;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/friday/common/entity/SendSmsBean;",
            "Lvc/c<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "/api/TokenAuth/NewSendSmsCode"
    .end annotation
.end method
