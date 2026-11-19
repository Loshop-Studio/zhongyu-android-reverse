.class public interface abstract Lo4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Lcom/zykj/study/bean/SmsReq;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/SmsReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lfa/i;
            value = "Authorization"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/SmsReq;",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "api/TokenAuth/SendNewDeviceSmsVerificationCode"
    .end annotation
.end method

.method public abstract b(Lm7/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/UserResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "SelfStudy/api/Account/Info"
    .end annotation
.end method

.method public abstract c(Lcom/zykj/study/bean/UpdatePwdReq;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/UpdatePwdReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/UpdatePwdReq;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/UpdatePwdResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "api/services/app/User/ChangePasswordAsync"
    .end annotation
.end method

.method public abstract d(Lcom/zykj/study/bean/TokenReq;Ljava/lang/String;ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/study/bean/TokenReq;
        .annotation runtime Lfa/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lfa/i;
            value = "AppName"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lfa/i;
            value = "AppVersion"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lfa/i;
            value = "ClientCode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/TokenReq;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/bean/TokenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
        value = "api/TokenAuth/Login"
    .end annotation
.end method
