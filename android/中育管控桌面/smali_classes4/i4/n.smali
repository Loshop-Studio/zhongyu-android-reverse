.class public Li4/n;
.super Lcom/bumptech/glide/i;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/c;Lu0/j;Lu0/p;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/i;-><init>(Lcom/bumptech/glide/c;Lu0/j;Lu0/p;Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Class;)Li4/m;
    .locals 3

    .line 1
    new-instance v0, Li4/m;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/i;->a:Lcom/bumptech/glide/c;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/i;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1, v2}, Li4/m;-><init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/i;Ljava/lang/Class;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public D()Li4/m;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bumptech/glide/i;->k()Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Li4/m;

    .line 6
    .line 7
    return-object v0
.end method

.method public E()Li4/m;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bumptech/glide/i;->l()Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Li4/m;

    .line 6
    .line 7
    return-object v0
.end method

.method public F()Li4/m;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bumptech/glide/i;->m()Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Li4/m;

    .line 6
    .line 7
    return-object v0
.end method

.method public G(Ljava/lang/Object;)Li4/m;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/bumptech/glide/i;->s(Ljava/lang/Object;)Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Li4/m;

    .line 6
    .line 7
    return-object p1
.end method

.method public H(Ljava/lang/String;)Li4/m;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/bumptech/glide/i;->t(Ljava/lang/String;)Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Li4/m;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Class;)Lcom/bumptech/glide/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/n;->C(Ljava/lang/Class;)Li4/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic k()Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li4/n;->D()Li4/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic l()Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li4/n;->E()Li4/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic m()Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li4/n;->F()Li4/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;)Lcom/bumptech/glide/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/n;->G(Ljava/lang/Object;)Li4/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic t(Ljava/lang/String;)Lcom/bumptech/glide/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/n;->H(Ljava/lang/String;)Li4/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public y(Lx0/d;)V
    .locals 1

    .line 1
    instance-of v0, p1, Li4/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/bumptech/glide/i;->y(Lx0/d;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Li4/l;

    .line 10
    .line 11
    invoke-direct {v0}, Li4/l;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Li4/l;->p0(Lx0/a;)Li4/l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-super {p0, p1}, Lcom/bumptech/glide/i;->y(Lx0/d;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
