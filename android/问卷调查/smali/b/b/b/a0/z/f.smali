.class public final Lb/b/b/a0/z/f;
.super Lb/b/b/c0/c;
.source ""


# static fields
.field public static final n:Ljava/io/Writer;

.field public static final o:Lb/b/b/s;


# instance fields
.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb/b/b/n;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/lang/String;

.field public m:Lb/b/b/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb/b/b/a0/z/f$a;

    invoke-direct {v0}, Lb/b/b/a0/z/f$a;-><init>()V

    sput-object v0, Lb/b/b/a0/z/f;->n:Ljava/io/Writer;

    new-instance v0, Lb/b/b/s;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Lb/b/b/s;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/b/b/a0/z/f;->o:Lb/b/b/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lb/b/b/a0/z/f;->n:Ljava/io/Writer;

    invoke-direct {p0, v0}, Lb/b/b/c0/c;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    sget-object v0, Lb/b/b/p;->a:Lb/b/b/p;

    iput-object v0, p0, Lb/b/b/a0/z/f;->m:Lb/b/b/n;

    return-void
.end method


# virtual methods
.method public b()Lb/b/b/c0/c;
    .locals 2

    new-instance v0, Lb/b/b/k;

    invoke-direct {v0}, Lb/b/b/k;-><init>()V

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    iget-object v1, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()Lb/b/b/c0/c;
    .locals 2

    new-instance v0, Lb/b/b/q;

    invoke-direct {v0}, Lb/b/b/q;-><init>()V

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    iget-object v1, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    sget-object v1, Lb/b/b/a0/z/f;->o:Lb/b/b/s;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lb/b/b/c0/c;
    .locals 2

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lb/b/b/a0/z/f;->l:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lb/b/b/a0/z/f;->s()Lb/b/b/n;

    move-result-object v0

    instance-of v0, v0, Lb/b/b/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public f()Lb/b/b/c0/c;
    .locals 2

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lb/b/b/a0/z/f;->l:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lb/b/b/a0/z/f;->s()Lb/b/b/n;

    move-result-object v0

    instance-of v0, v0, Lb/b/b/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public g(Ljava/lang/String;)Lb/b/b/c0/c;
    .locals 1

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lb/b/b/a0/z/f;->l:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lb/b/b/a0/z/f;->s()Lb/b/b/n;

    move-result-object v0

    instance-of v0, v0, Lb/b/b/q;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lb/b/b/a0/z/f;->l:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public h()Lb/b/b/c0/c;
    .locals 1

    sget-object v0, Lb/b/b/p;->a:Lb/b/b/p;

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0
.end method

.method public m(J)Lb/b/b/c0/c;
    .locals 1

    new-instance v0, Lb/b/b/s;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, p1}, Lb/b/b/s;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0
.end method

.method public n(Ljava/lang/Boolean;)Lb/b/b/c0/c;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    sget-object p1, Lb/b/b/p;->a:Lb/b/b/p;

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lb/b/b/s;

    invoke-direct {v0, p1}, Lb/b/b/s;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0
.end method

.method public o(Ljava/lang/Number;)Lb/b/b/c0/c;
    .locals 3

    if-nez p1, :cond_0

    .line 1
    sget-object p1, Lb/b/b/p;->a:Lb/b/b/p;

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lb/b/b/c0/c;->f:Z

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    new-instance v0, Lb/b/b/s;

    invoke-direct {v0, p1}, Lb/b/b/s;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lb/b/b/c0/c;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    sget-object p1, Lb/b/b/p;->a:Lb/b/b/p;

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lb/b/b/s;

    invoke-direct {v0, p1}, Lb/b/b/s;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0
.end method

.method public q(Z)Lb/b/b/c0/c;
    .locals 1

    new-instance v0, Lb/b/b/s;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lb/b/b/s;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lb/b/b/a0/z/f;->t(Lb/b/b/n;)V

    return-object p0
.end method

.method public final s()Lb/b/b/n;
    .locals 2

    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/b/b/n;

    return-object v0
.end method

.method public final t(Lb/b/b/n;)V
    .locals 2

    iget-object v0, p0, Lb/b/b/a0/z/f;->l:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 1
    instance-of v0, p1, Lb/b/b/p;

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, p0, Lb/b/b/c0/c;->h:Z

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lb/b/b/a0/z/f;->s()Lb/b/b/n;

    move-result-object v0

    check-cast v0, Lb/b/b/q;

    iget-object v1, p0, Lb/b/b/a0/z/f;->l:Ljava/lang/String;

    .line 4
    iget-object v0, v0, Lb/b/b/q;->a:Lb/b/b/a0/s;

    invoke-virtual {v0, v1, p1}, Lb/b/b/a0/s;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lb/b/b/a0/z/f;->l:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lb/b/b/a0/z/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lb/b/b/a0/z/f;->m:Lb/b/b/n;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lb/b/b/a0/z/f;->s()Lb/b/b/n;

    move-result-object v0

    instance-of v1, v0, Lb/b/b/k;

    if-eqz v1, :cond_4

    check-cast v0, Lb/b/b/k;

    .line 6
    iget-object v0, v0, Lb/b/b/k;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    .line 7
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
