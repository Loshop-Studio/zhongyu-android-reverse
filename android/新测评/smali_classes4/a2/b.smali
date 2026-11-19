.class public La2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/a$a;
.implements La2/c$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La2/b$a;,
        La2/b$b;
    }
.end annotation


# instance fields
.field public a:La2/b$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/liulishuo/okdownload/a;ILa2/a$c;)Z
    .locals 2

    .line 1
    move-object v0, p3

    .line 2
    check-cast v0, La2/b$b;

    .line 3
    .line 4
    iget-object v1, v0, La2/b$b;->f:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lq1/f;

    .line 11
    .line 12
    invoke-virtual {v1}, Lq1/f;->b()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La2/b;->a:La2/b$a;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object p3, p3, La2/a$c;->b:Ls1/c;

    .line 20
    .line 21
    invoke-virtual {p3, p2}, Ls1/c;->c(I)Ls1/a;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {v0, p2}, La2/b$b;->b(I)Lq1/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v1, p1, p2, p3, v0}, La2/b$a;->i(Lcom/liulishuo/okdownload/a;ILs1/a;Lq1/f;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p1, 0x1

    .line 33
    return p1
.end method

.method public bridge synthetic b(I)La2/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La2/b;->f(I)La2/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;La2/a$c;)Z
    .locals 1

    .line 1
    check-cast p4, La2/b$b;

    .line 2
    .line 3
    iget-object p4, p4, La2/b$b;->e:Lq1/f;

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    invoke-virtual {p4}, Lq1/f;->b()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p4, Lq1/f;

    .line 12
    .line 13
    invoke-direct {p4}, Lq1/f;-><init>()V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, La2/b;->a:La2/b$a;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, p1, p2, p3, p4}, La2/b$a;->j(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;Lq1/f;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 p1, 0x1

    .line 24
    return p1
.end method

.method public d(Lcom/liulishuo/okdownload/a;IJLa2/a$c;)Z
    .locals 8

    .line 1
    move-object v0, p5

    .line 2
    check-cast v0, La2/b$b;

    .line 3
    .line 4
    iget-object v1, v0, La2/b$b;->f:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lq1/f;

    .line 11
    .line 12
    invoke-virtual {v1, p3, p4}, Lq1/f;->a(J)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, La2/b$b;->e:Lq1/f;

    .line 16
    .line 17
    invoke-virtual {v1, p3, p4}, Lq1/f;->a(J)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La2/b;->a:La2/b$a;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object p3, p5, La2/a$c;->d:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, Ljava/lang/Long;

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    invoke-virtual {v0, p2}, La2/b$b;->b(I)Lq1/f;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    move-object v3, p1

    .line 41
    move v4, p2

    .line 42
    invoke-interface/range {v2 .. v7}, La2/b$a;->a(Lcom/liulishuo/okdownload/a;IJLq1/f;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La2/b;->a:La2/b$a;

    .line 46
    .line 47
    iget-wide p2, p5, La2/a$c;->c:J

    .line 48
    .line 49
    iget-object p4, v0, La2/b$b;->e:Lq1/f;

    .line 50
    .line 51
    invoke-interface {p1, v3, p2, p3, p4}, La2/b$a;->c(Lcom/liulishuo/okdownload/a;JLq1/f;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    const/4 p1, 0x1

    .line 55
    return p1
.end method

.method public e(Lcom/liulishuo/okdownload/a;Ls1/c;ZLa2/a$c;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La2/b;->a:La2/b$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p4, La2/b$b;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3, p4}, La2/b$a;->l(Lcom/liulishuo/okdownload/a;Ls1/c;ZLa2/b$b;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p1, 0x1

    .line 11
    return p1
.end method

.method public f(I)La2/b$b;
    .locals 1

    .line 1
    new-instance v0, La2/b$b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La2/b$b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public g(La2/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, La2/b;->a:La2/b$a;

    .line 2
    .line 3
    return-void
.end method
