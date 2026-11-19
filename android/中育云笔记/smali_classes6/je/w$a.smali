.class public Lje/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lje/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lje/r;

.field public b:Ljava/lang/String;

.field public c:Lje/q$a;

.field public d:Lje/x;

.field public e:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 3
    const-string v0, "GET"

    iput-object v0, p0, Lje/w$a;->b:Ljava/lang/String;

    .line 4
    new-instance v0, Lje/q$a;

    invoke-direct {v0}, Lje/q$a;-><init>()V

    iput-object v0, p0, Lje/w$a;->c:Lje/q$a;

    return-void
.end method

.method public constructor <init>(Lje/w;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 7
    invoke-virtual {p1}, Lje/w;->j()Lje/r;

    move-result-object v0

    iput-object v0, p0, Lje/w$a;->a:Lje/r;

    .line 8
    invoke-virtual {p1}, Lje/w;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lje/w$a;->b:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lje/w;->a()Lje/x;

    move-result-object v0

    iput-object v0, p0, Lje/w$a;->d:Lje/x;

    .line 10
    invoke-virtual {p1}, Lje/w;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lje/w;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/a;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 13
    :goto_0
    iput-object v0, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 14
    invoke-virtual {p1}, Lje/w;->e()Lje/q;

    move-result-object p1

    invoke-virtual {p1}, Lje/q;->c()Lje/q$a;

    move-result-object p1

    iput-object p1, p0, Lje/w$a;->c:Lje/q$a;

    return-void
.end method

.method public static synthetic e(Lje/w$a;Lje/x;ILjava/lang/Object;)Lje/w$a;
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    sget-object p1, Lke/d;->d:Lje/x;

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lje/w$a;->d(Lje/x;)Lje/w$a;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: delete"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lje/w$a;->c:Lje/q$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lje/q$a;->a(Ljava/lang/String;Ljava/lang/String;)Lje/q$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public b()Lje/w;
    .locals 6

    .line 1
    iget-object v1, p0, Lje/w$a;->a:Lje/r;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    iget-object v2, p0, Lje/w$a;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Lje/w$a;->c:Lje/q$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lje/q$a;->f()Lje/q;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lje/w$a;->d:Lje/x;

    .line 14
    .line 15
    iget-object v0, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 16
    .line 17
    invoke-static {v0}, Lke/d;->T(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    new-instance v0, Lje/w;

    .line 22
    .line 23
    invoke-direct/range {v0 .. v5}, Lje/w;-><init>(Lje/r;Ljava/lang/String;Lje/q;Lje/x;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "url == null"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public final c()Lje/w$a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lje/w$a;->e(Lje/w$a;Lje/x;ILjava/lang/Object;)Lje/w$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d(Lje/x;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "DELETE"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lje/w$a;->j(Ljava/lang/String;Lje/x;)Lje/w$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f()Lje/w$a;
    .locals 2

    .line 1
    const-string v0, "GET"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lje/w$a;->j(Ljava/lang/String;Lje/x;)Lje/w$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public g()Lje/w$a;
    .locals 2

    .line 1
    const-string v0, "HEAD"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lje/w$a;->j(Ljava/lang/String;Lje/x;)Lje/w$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lje/w$a;->c:Lje/q$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lje/q$a;->i(Ljava/lang/String;Ljava/lang/String;)Lje/q$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public i(Lje/q;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lje/q;->c()Lje/q$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lje/w$a;->c:Lje/q$a;

    .line 11
    .line 12
    return-object p0
.end method

.method public j(Ljava/lang/String;Lje/x;)Lje/w$a;
    .locals 2

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_3

    .line 11
    .line 12
    const-string v0, "method "

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Lpe/f;->d(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, " must have a request body."

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p2

    .line 53
    :cond_1
    invoke-static {p1}, Lpe/f;->a(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    :goto_0
    iput-object p1, p0, Lje/w$a;->b:Ljava/lang/String;

    .line 60
    .line 61
    iput-object p2, p0, Lje/w$a;->d:Lje/x;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p1, " must not have a request body."

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p2

    .line 94
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    const-string p2, "method.isEmpty() == true"

    .line 97
    .line 98
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1
.end method

.method public k(Lje/x;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "POST"

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Lje/w$a;->j(Ljava/lang/String;Lje/x;)Lje/w$a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public l(Lje/x;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "PUT"

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Lje/w$a;->j(Ljava/lang/String;Lje/x;)Lje/w$a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public m(Ljava/lang/String;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lje/w$a;->c:Lje/q$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lje/q$a;->h(Ljava/lang/String;)Lje/q$a;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public n(Ljava/lang/Class;Ljava/lang/Object;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lje/w$a;->e:Ljava/util/Map;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method public o(Ljava/lang/Object;)Lje/w$a;
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lje/w$a;->n(Ljava/lang/Class;Ljava/lang/Object;)Lje/w$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public p(Ljava/lang/String;)Lje/w$a;
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ws:"

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {p1, v0, v1}, Lqd/z;->M(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v2, "this as java.lang.String).substring(startIndex)"

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "http:"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string v0, "wss:"

    .line 44
    .line 45
    invoke-static {p1, v0, v1}, Lqd/z;->M(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v1, "https:"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x4

    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_1
    :goto_0
    sget-object v0, Lje/r;->k:Lje/r$b;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lje/r$b;->d(Ljava/lang/String;)Lje/r;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Lje/w$a;->q(Lje/r;)Lje/w$a;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1
.end method

.method public q(Lje/r;)Lje/w$a;
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lje/w$a;->a:Lje/r;

    .line 7
    .line 8
    return-object p0
.end method
