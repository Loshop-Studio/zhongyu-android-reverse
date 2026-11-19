.class public Ls1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/a;
.implements Ls1/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/b$a;
    }
.end annotation


# instance fields
.field public final a:Ll8/v;

.field public final b:Ll8/w$a;

.field public c:Ll8/w;

.field public d:Ll8/y;


# direct methods
.method public constructor <init>(Ll8/v;Ljava/lang/String;)V
    .locals 1

    .line 4
    new-instance v0, Ll8/w$a;

    invoke-direct {v0}, Ll8/w$a;-><init>()V

    invoke-virtual {v0, p2}, Ll8/w$a;->n(Ljava/lang/String;)Ll8/w$a;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ls1/b;-><init>(Ll8/v;Ll8/w$a;)V

    return-void
.end method

.method public constructor <init>(Ll8/v;Ll8/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls1/b;->a:Ll8/v;

    .line 3
    iput-object p2, p0, Ls1/b;->b:Ll8/w$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/y;->t()Ll8/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Ls1/b;->d:Ll8/y;

    .line 10
    .line 11
    invoke-virtual {v1}, Ll8/y;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ll8/y;->i()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Lp1/e;->b(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 28
    .line 29
    invoke-virtual {v0}, Ll8/y;->w()Ll8/w;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ll8/w;->j()Ll8/r;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ll8/r;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/b;->b:Ll8/w$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ll8/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Ll8/w$a;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Ll8/y;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/b;->b:Ll8/w$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Ll8/w$a;->j(Ljava/lang/String;Ll8/x;)Ll8/w$a;

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1
.end method

.method public e()Ljava/io/InputStream;
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ll8/y;->a()Ll8/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ll8/z;->byteStream()Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 17
    .line 18
    const-string v1, "no body found on response!"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 25
    .line 26
    const-string v1, "Please invoke execute first!"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public execute()Ls1/a$a;
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/b;->b:Ll8/w$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/w$a;->b()Ll8/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Ls1/b;->c:Ll8/w;

    .line 8
    .line 9
    iget-object v1, p0, Ls1/b;->a:Ll8/v;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ll8/v;->b(Ll8/w;)Ll8/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ll8/e;->execute()Ll8/y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 20
    .line 21
    return-object p0
.end method

.method public f()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/b;->c:Ll8/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ll8/w;->e()Ll8/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ll8/q;->e()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Ls1/b;->b:Ll8/w$a;

    .line 15
    .line 16
    invoke-virtual {v0}, Ll8/w$a;->b()Ll8/w;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ll8/w;->e()Ll8/q;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ll8/q;->e()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public g()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ll8/y;->o()Ll8/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ll8/q;->e()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public h()I
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ll8/y;->i()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 11
    .line 12
    const-string v1, "Please invoke execute first!"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ls1/b;->c:Ll8/w;

    .line 3
    .line 4
    iget-object v1, p0, Ls1/b;->d:Ll8/y;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ll8/y;->close()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object v0, p0, Ls1/b;->d:Ll8/y;

    .line 12
    .line 13
    return-void
.end method
