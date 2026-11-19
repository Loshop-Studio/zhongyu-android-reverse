.class public final Lk5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk5/u;


# instance fields
.field public final a:Lk5/q;


# direct methods
.method public constructor <init>(Lk5/q;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lk5/l;->a:Lk5/q;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Lf5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/l;->a:Lk5/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/q;->a()Lf5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Lkotlin/collections/ArrayDeque;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/l;->a:Lk5/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/q;->b()Lkotlin/collections/ArrayDeque;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()Lk5/u$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/l;->a:Lk5/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/q;->h()Lk5/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e(Lf5/w;)Z
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/l;->a:Lk5/q;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lk5/q;->e(Lf5/w;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public f(Lk5/o;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/l;->a:Lk5/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk5/q;->f(Lk5/o;)Z

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
    iget-object v0, p0, Lk5/l;->a:Lk5/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/q;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
