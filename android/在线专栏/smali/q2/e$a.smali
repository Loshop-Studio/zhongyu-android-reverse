.class public final Lq2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lq2/e;Lq2/g$c;)Lq2/g$b;
    .locals 2
    .param p0    # Lq2/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq2/g$b;",
            ">(",
            "Lq2/e;",
            "Lq2/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p1, Lq2/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lq2/b;

    invoke-interface {p0}, Lq2/g$b;->getKey()Lq2/g$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq2/b;->a(Lq2/g$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lq2/b;->b(Lq2/g$b;)Lq2/g$b;

    move-result-object p0

    instance-of p1, p0, Lq2/g$b;

    if-eqz p1, :cond_0

    move-object v1, p0

    :cond_0
    return-object v1

    .line 3
    :cond_1
    sget-object v0, Lq2/e;->R:Lq2/e$b;

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lq2/e;Lq2/g$c;)Lq2/g;
    .locals 1
    .param p0    # Lq2/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/e;",
            "Lq2/g$c<",
            "*>;)",
            "Lq2/g;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p1, Lq2/b;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lq2/b;

    invoke-interface {p0}, Lq2/g$b;->getKey()Lq2/g$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq2/b;->a(Lq2/g$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lq2/b;->b(Lq2/g$b;)Lq2/g$b;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p0, Lq2/h;->a:Lq2/h;

    :cond_0
    return-object p0

    .line 3
    :cond_1
    sget-object v0, Lq2/e;->R:Lq2/e$b;

    if-ne v0, p1, :cond_2

    sget-object p0, Lq2/h;->a:Lq2/h;

    :cond_2
    return-object p0
.end method
