.class public Lcom/lzy/okgo/request/GetRequest;
.super Lcom/lzy/okgo/request/base/NoBodyRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/lzy/okgo/request/base/NoBodyRequest<",
        "TT;",
        "Lcom/lzy/okgo/request/GetRequest<",
        "TT;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lzy/okgo/request/base/NoBodyRequest;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Lje/x;)Lje/w;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/lzy/okgo/request/base/NoBodyRequest;->n(Lje/x;)Lje/w$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lje/w$a;->f()Lje/w$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->f:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lje/w$a;->o(Ljava/lang/Object;)Lje/w$a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lje/w$a;->b()Lje/w;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
