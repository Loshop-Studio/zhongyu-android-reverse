.class public Lb/b/b/a0/z/o$u;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a0/z/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/x<",
        "Lb/b/b/n;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/o$u;->c(Lb/b/b/c0/a;)Lb/b/b/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lb/b/b/n;

    invoke-virtual {p0, p1, p2}, Lb/b/b/a0/z/o$u;->d(Lb/b/b/c0/c;Lb/b/b/n;)V

    return-void
.end method

.method public c(Lb/b/b/c0/a;)Lb/b/b/n;
    .locals 4

    sget-object v0, Lb/b/b/p;->a:Lb/b/b/p;

    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x5

    if-eq v1, v2, :cond_3

    const/4 v2, 0x6

    if-eq v1, v2, :cond_2

    const/4 v2, 0x7

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->r()V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lb/b/b/s;

    invoke-virtual {p1}, Lb/b/b/c0/a;->l()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lb/b/b/s;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :cond_2
    invoke-virtual {p1}, Lb/b/b/c0/a;->t()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lb/b/b/s;

    new-instance v1, Lb/b/b/a0/r;

    invoke-direct {v1, p1}, Lb/b/b/a0/r;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lb/b/b/s;-><init>(Ljava/lang/Number;)V

    return-object v0

    :cond_3
    new-instance v0, Lb/b/b/s;

    invoke-virtual {p1}, Lb/b/b/c0/a;->t()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lb/b/b/s;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v0, Lb/b/b/q;

    invoke-direct {v0}, Lb/b/b/q;-><init>()V

    invoke-virtual {p1}, Lb/b/b/c0/a;->b()V

    :goto_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->i()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lb/b/b/c0/a;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/o$u;->c(Lb/b/b/c0/a;)Lb/b/b/n;

    move-result-object v2

    .line 1
    iget-object v3, v0, Lb/b/b/q;->a:Lb/b/b/a0/s;

    invoke-virtual {v3, v1, v2}, Lb/b/b/a0/s;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 2
    :cond_5
    invoke-virtual {p1}, Lb/b/b/c0/a;->f()V

    return-object v0

    :cond_6
    new-instance v0, Lb/b/b/k;

    invoke-direct {v0}, Lb/b/b/k;-><init>()V

    invoke-virtual {p1}, Lb/b/b/c0/a;->a()V

    :goto_1
    invoke-virtual {p1}, Lb/b/b/c0/a;->i()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/o$u;->c(Lb/b/b/c0/a;)Lb/b/b/n;

    move-result-object v1

    .line 3
    iget-object v2, v0, Lb/b/b/k;->b:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 4
    :cond_7
    invoke-virtual {p1}, Lb/b/b/c0/a;->e()V

    return-object v0
.end method

.method public d(Lb/b/b/c0/c;Lb/b/b/n;)V
    .locals 4

    if-eqz p2, :cond_d

    .line 1
    instance-of v0, p2, Lb/b/b/p;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    instance-of v0, p2, Lb/b/b/s;

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {p2}, Lb/b/b/n;->a()Lb/b/b/s;

    move-result-object p2

    .line 4
    iget-object v0, p2, Lb/b/b/s;->a:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p2}, Lb/b/b/s;->c()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb/b/b/c0/c;->o(Ljava/lang/Number;)Lb/b/b/c0/c;

    goto/16 :goto_4

    .line 6
    :cond_1
    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p2}, Lb/b/b/s;->b()Z

    move-result p2

    invoke-virtual {p1, p2}, Lb/b/b/c0/c;->q(Z)Lb/b/b/c0/c;

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p2}, Lb/b/b/s;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb/b/b/c0/c;->p(Ljava/lang/String;)Lb/b/b/c0/c;

    goto/16 :goto_4

    .line 8
    :cond_3
    instance-of v0, p2, Lb/b/b/k;

    if-eqz v0, :cond_6

    .line 9
    invoke-virtual {p1}, Lb/b/b/c0/c;->b()Lb/b/b/c0/c;

    if-eqz v0, :cond_5

    .line 10
    check-cast p2, Lb/b/b/k;

    .line 11
    invoke-virtual {p2}, Lb/b/b/k;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/b/b/n;

    invoke-virtual {p0, p1, v0}, Lb/b/b/a0/z/o$u;->d(Lb/b/b/c0/c;Lb/b/b/n;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lb/b/b/c0/c;->e()Lb/b/b/c0/c;

    goto/16 :goto_4

    .line 12
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not a JSON Array: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_6
    instance-of v0, p2, Lb/b/b/q;

    if-eqz v0, :cond_c

    .line 14
    invoke-virtual {p1}, Lb/b/b/c0/c;->c()Lb/b/b/c0/c;

    if-eqz v0, :cond_b

    .line 15
    check-cast p2, Lb/b/b/q;

    .line 16
    iget-object p2, p2, Lb/b/b/q;->a:Lb/b/b/a0/s;

    invoke-virtual {p2}, Lb/b/b/a0/s;->entrySet()Ljava/util/Set;

    move-result-object p2

    .line 17
    check-cast p2, Lb/b/b/a0/s$b;

    .line 18
    iget-object p2, p2, Lb/b/b/a0/s$b;->b:Lb/b/b/a0/s;

    .line 19
    iget-object v0, p2, Lb/b/b/a0/s;->f:Lb/b/b/a0/s$e;

    iget-object v0, v0, Lb/b/b/a0/s$e;->e:Lb/b/b/a0/s$e;

    iget v1, p2, Lb/b/b/a0/s;->e:I

    .line 20
    :goto_1
    iget-object v2, p2, Lb/b/b/a0/s;->f:Lb/b/b/a0/s$e;

    if-eq v0, v2, :cond_7

    const/4 v3, 0x1

    goto :goto_2

    :cond_7
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_a

    if-eq v0, v2, :cond_9

    .line 21
    iget v2, p2, Lb/b/b/a0/s;->e:I

    if-ne v2, v1, :cond_8

    iget-object v2, v0, Lb/b/b/a0/s$e;->e:Lb/b/b/a0/s$e;

    .line 22
    iget-object v3, v0, Lb/b/b/a0/s$e;->g:Ljava/lang/Object;

    .line 23
    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Lb/b/b/c0/c;->g(Ljava/lang/String;)Lb/b/b/c0/c;

    .line 24
    iget-object v0, v0, Lb/b/b/a0/s$e;->h:Ljava/lang/Object;

    .line 25
    check-cast v0, Lb/b/b/n;

    invoke-virtual {p0, p1, v0}, Lb/b/b/a0/z/o$u;->d(Lb/b/b/c0/c;Lb/b/b/n;)V

    move-object v0, v2

    goto :goto_1

    .line 26
    :cond_8
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    .line 27
    :cond_a
    invoke-virtual {p1}, Lb/b/b/c0/c;->f()Lb/b/b/c0/c;

    goto :goto_4

    .line 28
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not a JSON Object: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Couldn\'t write "

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    :goto_3
    invoke-virtual {p1}, Lb/b/b/c0/c;->h()Lb/b/b/c0/c;

    :goto_4
    return-void
.end method
