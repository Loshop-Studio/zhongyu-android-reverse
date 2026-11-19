.class public final Lb/b/b/a0/z/b$a;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a0/z/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lb/b/b/x<",
        "Ljava/util/Collection<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field public final a:Lb/b/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/x<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final b:Lb/b/b/a0/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/a0/t<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb/b/b/i;Ljava/lang/reflect/Type;Lb/b/b/x;Lb/b/b/a0/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/i;",
            "Ljava/lang/reflect/Type;",
            "Lb/b/b/x<",
            "TE;>;",
            "Lb/b/b/a0/t<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    new-instance v0, Lb/b/b/a0/z/n;

    invoke-direct {v0, p1, p3, p2}, Lb/b/b/a0/z/n;-><init>(Lb/b/b/i;Lb/b/b/x;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lb/b/b/a0/z/b$a;->a:Lb/b/b/x;

    iput-object p4, p0, Lb/b/b/a0/z/b$a;->b:Lb/b/b/a0/t;

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v0

    sget-object v1, Lb/b/b/c0/b;->j:Lb/b/b/c0/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->r()V

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lb/b/b/a0/z/b$a;->b:Lb/b/b/a0/t;

    invoke-interface {v0}, Lb/b/b/a0/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lb/b/b/c0/a;->a()V

    :goto_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb/b/b/a0/z/b$a;->a:Lb/b/b/x;

    invoke-virtual {v1, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lb/b/b/c0/a;->e()V

    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ljava/util/Collection;

    if-nez p2, :cond_0

    .line 1
    invoke-virtual {p1}, Lb/b/b/c0/c;->h()Lb/b/b/c0/c;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lb/b/b/c0/c;->b()Lb/b/b/c0/c;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lb/b/b/a0/z/b$a;->a:Lb/b/b/x;

    invoke-virtual {v1, p1, v0}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lb/b/b/c0/c;->e()Lb/b/b/c0/c;

    :goto_1
    return-void
.end method
