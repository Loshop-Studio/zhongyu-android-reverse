.class public Lcom/tendcloud/tenddata/au;
.super Lcom/tendcloud/tenddata/at;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/at;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/as$b;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/tendcloud/tenddata/at;->b(Lcom/tendcloud/tenddata/bo;)I

    move-result p1

    const/16 v0, 0xd

    if-ne p1, v0, :cond_0

    .line 2
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 3
    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bk;)Lcom/tendcloud/tenddata/bk;
    .locals 2

    .line 4
    invoke-super {p0, p1}, Lcom/tendcloud/tenddata/at;->a(Lcom/tendcloud/tenddata/bk;)Lcom/tendcloud/tenddata/bk;

    .line 5
    const-string v0, "Sec-WebSocket-Version"

    const-string v1, "13"

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lcom/tendcloud/tenddata/as;
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/au;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/tenddata/au;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
