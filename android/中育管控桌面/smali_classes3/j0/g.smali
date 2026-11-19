.class public Lj0/g;
.super Lb1/g;
.source "SourceFile"

# interfaces
.implements Lj0/h;


# instance fields
.field public e:Lj0/h$a;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lb1/g;-><init>(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lb1/g;->b()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/16 v0, 0x14

    .line 10
    .line 11
    if-ge p1, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0xf

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return-void

    .line 19
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lb1/g;->h()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x2

    .line 24
    .line 25
    div-long/2addr v0, v2

    .line 26
    invoke-virtual {p0, v0, v1}, Lb1/g;->m(J)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public bridge synthetic c(Lf0/b;)Lh0/j;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb1/g;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lh0/j;

    .line 6
    .line 7
    return-object p1
.end method

.method public d(Lj0/h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj0/g;->e:Lj0/h$a;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic e(Lf0/b;Lh0/j;)Lh0/j;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb1/g;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lh0/j;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lh0/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lj0/g;->n(Lh0/j;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lf0/b;

    .line 2
    .line 3
    check-cast p2, Lh0/j;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lj0/g;->o(Lf0/b;Lh0/j;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n(Lh0/j;)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Lb1/g;->i(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-interface {p1}, Lh0/j;->getSize()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public o(Lf0/b;Lh0/j;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lj0/g;->e:Lj0/h$a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p2}, Lj0/h$a;->a(Lh0/j;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
