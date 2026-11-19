.class public abstract Lee/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lee/f;)Lod/c;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lee/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lee/c;

    .line 11
    .line 12
    iget-object p0, p0, Lee/c;->b:Lod/c;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    instance-of v0, p0, Lge/m2;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lge/m2;

    .line 20
    .line 21
    invoke-virtual {p0}, Lge/m2;->h()Lee/f;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lee/b;->a(Lee/f;)Lod/c;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static final b(Lee/f;Lod/c;)Lee/f;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lee/c;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lee/c;-><init>(Lee/f;Lod/c;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
