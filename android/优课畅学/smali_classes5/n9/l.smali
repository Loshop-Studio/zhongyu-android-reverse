.class public final Ln9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/u;


# instance fields
.field public final a:Ln9/q;


# direct methods
.method public constructor <init>(Ln9/q;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ln9/l;->a:Ln9/q;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Li9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/l;->a:Ln9/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/q;->a()Li9/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(Li9/w;)Z
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln9/l;->a:Ln9/q;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ln9/q;->b(Li9/w;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public c()Li7/m;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/l;->a:Ln9/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/q;->c()Li7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Ln9/u$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/l;->a:Ln9/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/q;->h()Ln9/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e(Ln9/o;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/l;->a:Ln9/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln9/q;->e(Ln9/o;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/l;->a:Ln9/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/q;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
