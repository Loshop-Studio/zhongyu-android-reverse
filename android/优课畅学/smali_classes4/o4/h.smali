.class public interface abstract Lo4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lfa/y;
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
            value = "Authorization"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lfa/i;
            value = "RefreshToken"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lfa/i;
            value = "ClientCode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/study/bean/TokenResp;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/o;
    .end annotation
.end method
