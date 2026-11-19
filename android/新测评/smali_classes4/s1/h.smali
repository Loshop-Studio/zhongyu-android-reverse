.class public Ls1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/i;


# instance fields
.field public final a:Ls1/e;

.field public final b:Ls1/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls1/e;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {v0, p1}, Ls1/e;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ls1/h;->a:Ls1/e;

    .line 14
    .line 15
    new-instance p1, Ls1/g;

    .line 16
    .line 17
    invoke-virtual {v0}, Ls1/e;->h()Landroid/util/SparseArray;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Ls1/e;->f()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0}, Ls1/e;->g()Ljava/util/HashMap;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v1, v2, v0}, Ls1/g;-><init>(Landroid/util/SparseArray;Ljava/util/List;Ljava/util/HashMap;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ls1/h;->b:Ls1/g;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a(Ls1/c;IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ls1/g;->a(Ls1/c;IJ)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Ls1/c;->c(I)Ls1/a;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-virtual {p3}, Ls1/a;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide p3

    .line 14
    iget-object v0, p0, Ls1/h;->a:Ls1/e;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, p3, p4}, Ls1/e;->o(Ls1/c;IJ)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public b(Ls1/c;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->b(Ls1/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Ls1/h;->a:Ls1/e;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ls1/e;->q(Ls1/c;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ls1/c;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "update "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "BreakpointStoreOnSQLite"

    .line 34
    .line 35
    invoke-static {v3, v2}, Lr1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ls1/c;->o()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    iget-object v2, p0, Ls1/h;->a:Ls1/e;

    .line 47
    .line 48
    invoke-virtual {p1}, Ls1/c;->l()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v2, p1, v1}, Ls1/e;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return v0
.end method

.method public c(Lcom/liulishuo/okdownload/a;)Ls1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->c(Lcom/liulishuo/okdownload/a;)Ls1/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Ls1/h;->a:Ls1/e;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ls1/e;->a(Ls1/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public d(Lcom/liulishuo/okdownload/a;Ls1/c;)Ls1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ls1/g;->d(Lcom/liulishuo/okdownload/a;Ls1/c;)Ls1/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->e(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public f(Lcom/liulishuo/okdownload/a;)I
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->f(Lcom/liulishuo/okdownload/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->g(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public get(I)Ls1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->get(I)Ls1/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public h(ILcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ls1/g;->h(ILcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    sget-object p3, Lcom/liulishuo/okdownload/core/cause/EndCause;->a:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 7
    .line 8
    if-ne p2, p3, :cond_0

    .line 9
    .line 10
    iget-object p2, p0, Ls1/h;->a:Ls1/e;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Ls1/e;->l(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public i(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public j(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->j(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ls1/h;->a:Ls1/e;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ls1/e;->j(I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public k(I)Ls1/c;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public l()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public m(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->m(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ls1/h;->a:Ls1/e;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ls1/e;->i(I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public remove(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/h;->b:Ls1/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls1/g;->remove(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls1/h;->a:Ls1/e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ls1/e;->l(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
