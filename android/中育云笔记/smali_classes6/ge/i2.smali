.class public abstract Lge/i2;
.super Lge/w;
.source "SourceFile"


# instance fields
.field public final b:Lee/f;


# direct methods
.method public constructor <init>(Lce/b;)V
    .locals 1

    .line 1
    const-string v0, "primitiveSerializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lge/w;-><init>(Lce/b;Lkotlin/jvm/internal/n;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lge/h2;

    .line 11
    .line 12
    invoke-interface {p1}, Lce/b;->getDescriptor()Lee/f;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Lge/h2;-><init>(Lee/f;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lge/i2;->b:Lee/f;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lge/i2;->o()Lge/g2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lge/g2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lge/i2;->p(Lge/g2;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, Lge/g2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lge/i2;->q(Lge/g2;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This method lead to boxing and must not be used, use writeContents instead"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, Lge/a;->f(Lfe/e;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lge/i2;->b:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lge/g2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lge/i2;->t(Lge/g2;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic n(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lge/g2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lge/i2;->s(Lge/g2;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o()Lge/g2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lge/i2;->r()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lge/a;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lge/g2;

    .line 10
    .line 11
    return-object v0
.end method

.method public final p(Lge/g2;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lge/g2;->d()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final q(Lge/g2;I)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lge/g2;->b(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public abstract r()Ljava/lang/Object;
.end method

.method public final s(Lge/g2;ILjava/lang/Object;)V
    .locals 0

    .line 1
    const-string p2, "<this>"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string p2, "This method lead to boxing and must not be used, use Builder.append instead"

    .line 9
    .line 10
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public final serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lge/a;->e(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lge/i2;->b:Lee/f;

    .line 11
    .line 12
    invoke-interface {p1, v1, v0}, Lfe/f;->beginCollection(Lee/f;I)Lfe/d;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1, p2, v0}, Lge/i2;->u(Lfe/d;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v1}, Lfe/d;->endStructure(Lee/f;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final t(Lge/g2;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lge/g2;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public abstract u(Lfe/d;Ljava/lang/Object;I)V
.end method
