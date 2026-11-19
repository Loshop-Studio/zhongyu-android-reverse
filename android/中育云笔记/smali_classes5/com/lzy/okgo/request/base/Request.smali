.class public abstract Lcom/lzy/okgo/request/base/Request;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Lcom/lzy/okgo/request/base/Request;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public transient e:Lje/v;

.field public transient f:Ljava/lang/Object;

.field public g:I

.field public h:Lcom/lzy/okgo/cache/CacheMode;

.field public i:J

.field public j:Lcom/lzy/okgo/model/HttpParams;

.field public k:Lcom/lzy/okgo/model/HttpHeaders;

.field public transient l:Lje/w;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lzy/okgo/model/HttpParams;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/lzy/okgo/model/HttpParams;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lzy/okgo/request/base/Request;->j:Lcom/lzy/okgo/model/HttpParams;

    .line 10
    .line 11
    new-instance v0, Lcom/lzy/okgo/model/HttpHeaders;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/lzy/okgo/model/HttpHeaders;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lzy/okgo/request/base/Request;->k:Lcom/lzy/okgo/model/HttpHeaders;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/lzy/okgo/request/base/Request;->c:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/lzy/okgo/request/base/Request;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {}, Lb7/a;->h()Lb7/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {}, Lcom/lzy/okgo/model/HttpHeaders;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    const-string v1, "Accept-Language"

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0}, Lcom/lzy/okgo/request/base/Request;->k(Ljava/lang/String;Ljava/lang/String;)Lcom/lzy/okgo/request/base/Request;

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {}, Lcom/lzy/okgo/model/HttpHeaders;->c()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const-string v1, "User-Agent"

    .line 52
    .line 53
    invoke-virtual {p0, v1, v0}, Lcom/lzy/okgo/request/base/Request;->k(Ljava/lang/String;Ljava/lang/String;)Lcom/lzy/okgo/request/base/Request;

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1}, Lb7/a;->e()Lcom/lzy/okgo/model/HttpParams;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Lb7/a;->e()Lcom/lzy/okgo/model/HttpParams;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/request/base/Request;->m(Lcom/lzy/okgo/model/HttpParams;)Lcom/lzy/okgo/request/base/Request;

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p1}, Lb7/a;->d()Lcom/lzy/okgo/model/HttpHeaders;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-virtual {p1}, Lb7/a;->d()Lcom/lzy/okgo/model/HttpHeaders;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/request/base/Request;->g(Lcom/lzy/okgo/model/HttpHeaders;)Lcom/lzy/okgo/request/base/Request;

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p1}, Lb7/a;->j()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, p0, Lcom/lzy/okgo/request/base/Request;->g:I

    .line 87
    .line 88
    invoke-virtual {p1}, Lb7/a;->b()Lcom/lzy/okgo/cache/CacheMode;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/lzy/okgo/request/base/Request;->h:Lcom/lzy/okgo/cache/CacheMode;

    .line 93
    .line 94
    invoke-virtual {p1}, Lb7/a;->c()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    iput-wide v0, p0, Lcom/lzy/okgo/request/base/Request;->i:J

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public a()Lje/y;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lzy/okgo/request/base/Request;->f()Lje/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lje/e;->execute()Lje/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public abstract c(Lje/x;)Lje/w;
.end method

.method public abstract d()Lje/x;
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lje/e;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/lzy/okgo/request/base/Request;->d()Lje/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v2, Lcom/lzy/okgo/request/base/a;

    .line 9
    .line 10
    invoke-direct {v2, v0, v1}, Lcom/lzy/okgo/request/base/a;-><init>(Lje/x;Lc7/a;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Lcom/lzy/okgo/request/base/a;->e(Lcom/lzy/okgo/request/base/a$c;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lcom/lzy/okgo/request/base/Request;->c(Lje/x;)Lje/w;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/lzy/okgo/request/base/Request;->l:Lje/w;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, v1}, Lcom/lzy/okgo/request/base/Request;->c(Lje/x;)Lje/w;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/lzy/okgo/request/base/Request;->l:Lje/w;

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->e:Lje/v;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lb7/a;->h()Lb7/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lb7/a;->i()Lje/v;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/lzy/okgo/request/base/Request;->e:Lje/v;

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->e:Lje/v;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/lzy/okgo/request/base/Request;->l:Lje/w;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lje/v;->b(Lje/w;)Lje/e;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public g(Lcom/lzy/okgo/model/HttpHeaders;)Lcom/lzy/okgo/request/base/Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->k:Lcom/lzy/okgo/model/HttpHeaders;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/lzy/okgo/model/HttpHeaders;->e(Lcom/lzy/okgo/model/HttpHeaders;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)Lcom/lzy/okgo/request/base/Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->k:Lcom/lzy/okgo/model/HttpHeaders;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/lzy/okgo/model/HttpHeaders;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public m(Lcom/lzy/okgo/model/HttpParams;)Lcom/lzy/okgo/request/base/Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/request/base/Request;->j:Lcom/lzy/okgo/model/HttpParams;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/lzy/okgo/model/HttpParams;->c(Lcom/lzy/okgo/model/HttpParams;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
