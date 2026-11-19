.class public abstract Lcom/lzy/okgo/request/base/NoBodyRequest;
.super Lcom/lzy/okgo/request/base/Request;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Lcom/lzy/okgo/request/base/NoBodyRequest;",
        ">",
        "Lcom/lzy/okgo/request/base/Request<",
        "TT;TR;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lzy/okgo/request/base/Request;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d()Lje/x;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public n(Lje/x;)Lje/w$a;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/lzy/okgo/request/base/Request;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->j:Lcom/lzy/okgo/model/HttpParams;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/lzy/okgo/model/HttpParams;->c:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lf7/a;->c(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/lzy/okgo/request/base/Request;->c:Ljava/lang/String;

    .line 12
    .line 13
    new-instance p1, Lje/w$a;

    .line 14
    .line 15
    invoke-direct {p1}, Lje/w$a;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->k:Lcom/lzy/okgo/model/HttpHeaders;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lf7/a;->a(Lje/w$a;Lcom/lzy/okgo/model/HttpHeaders;)Lje/w$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method
