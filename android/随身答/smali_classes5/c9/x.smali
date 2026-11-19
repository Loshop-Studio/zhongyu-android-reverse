.class public final Lc9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll8/y;

.field public final b:Ljava/lang/Object;

.field public final c:Ll8/z;


# direct methods
.method public constructor <init>(Ll8/y;Ljava/lang/Object;Ll8/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/x;->a:Ll8/y;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/x;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lc9/x;->c:Ll8/z;

    .line 9
    .line 10
    return-void
.end method

.method public static c(Ll8/z;Ll8/y;)Lc9/x;
    .locals 2

    .line 1
    const-string v0, "body == null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "rawResponse == null"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ll8/y;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lc9/x;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p1, v1, p0}, Lc9/x;-><init>(Ll8/y;Ljava/lang/Object;Ll8/z;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p1, "rawResponse should not be successful response"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public static h(Ljava/lang/Object;)Lc9/x;
    .locals 3

    .line 1
    new-instance v0, Ll8/y$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ll8/y$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xc8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ll8/y$a;->g(I)Ll8/y$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "OK"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ll8/y$a;->m(Ljava/lang/String;)Ll8/y$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ll8/y$a;->p(Lokhttp3/Protocol;)Ll8/y$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Ll8/w$a;

    .line 25
    .line 26
    invoke-direct {v1}, Ll8/w$a;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "http://localhost/"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ll8/w$a;->n(Ljava/lang/String;)Ll8/w$a;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ll8/w$a;->b()Ll8/w;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ll8/y$a;->r(Ll8/w;)Ll8/y$a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ll8/y$a;->c()Ll8/y;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p0, v0}, Lc9/x;->i(Ljava/lang/Object;Ll8/y;)Lc9/x;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static i(Ljava/lang/Object;Ll8/y;)Lc9/x;
    .locals 2

    .line 1
    const-string v0, "rawResponse == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ll8/y;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lc9/x;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p1, p0, v1}, Lc9/x;-><init>(Ll8/y;Ljava/lang/Object;Ll8/z;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string p1, "rawResponse must be successful response"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/x;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/x;->a:Ll8/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/y;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d()Ll8/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/x;->c:Ll8/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/x;->a:Ll8/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/y;->o()Ll8/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/x;->a:Ll8/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/y;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/x;->a:Ll8/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/y;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/x;->a:Ll8/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/y;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
