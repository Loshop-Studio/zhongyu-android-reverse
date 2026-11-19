.class public Lcom/huawei/hms/framework/network/grs/GrsClient;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EMPTY_STRING:Ljava/lang/String; = ""


# instance fields
.field private final grsClientGlobal:Lh5/c;

.field private queryTimeout:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, Lh5/d;->a(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)Lh5/c;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->grsClientGlobal:Lh5/c;

    invoke-virtual {p2}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getQueryTimeout()I

    move-result p1

    iput p1, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->queryTimeout:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "invalid init params for context is null or GrsBaseInfo instance is null Object."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public ayncGetGrsUrl(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->grsClientGlobal:Lh5/c;

    if-nez v0, :cond_0

    const/4 p1, -0x8

    invoke-interface {p3, p1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackFail(I)V

    return-void

    :cond_0
    iget v1, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->queryTimeout:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lh5/c;->m(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;I)V

    return-void
.end method

.method public ayncGetGrsUrls(Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->grsClientGlobal:Lh5/c;

    if-nez v0, :cond_0

    const/4 p1, -0x8

    invoke-interface {p2, p1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackFail(I)V

    return-void

    :cond_0
    iget v1, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->queryTimeout:I

    invoke-virtual {v0, p1, p2, v1}, Lh5/c;->l(Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;I)V

    return-void
.end method

.method public clearSp()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->grsClientGlobal:Lh5/c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lh5/c;->i()V

    return-void
.end method

.method public forceExpire()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->grsClientGlobal:Lh5/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lh5/c;->r()Z

    move-result v0

    return v0
.end method

.method public synGetGrsUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->grsClientGlobal:Lh5/c;

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget v1, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->queryTimeout:I

    invoke-virtual {v0, p1, p2, v1}, Lh5/c;->e(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synGetGrsUrls(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->grsClientGlobal:Lh5/c;

    if-nez v0, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    :cond_0
    iget v1, p0, Lcom/huawei/hms/framework/network/grs/GrsClient;->queryTimeout:I

    invoke-virtual {v0, p1, v1}, Lh5/c;->f(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
