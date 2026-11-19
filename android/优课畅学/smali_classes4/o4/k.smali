.class public interface abstract Lo4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/String;IILm7/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lfa/t;
            value = "packageName"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lfa/t;
            value = "version"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lfa/t;
            value = "appType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lm7/c<",
            "-",
            "Lcom/zykj/lib/ota/bean/VersionInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lfa/f;
        value = "api/services/app/AppStore/CheckUpdateAsync"
    .end annotation
.end method
