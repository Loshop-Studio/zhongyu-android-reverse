.class Ld3/h;
.super Ld3/g;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/Iterator;)Ld3/d;
    .locals 1
    .param p0    # Ljava/util/Iterator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Ld3/d<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld3/h$a;

    invoke-direct {v0, p0}, Ld3/h$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Ld3/h;->b(Ld3/d;)Ld3/d;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ld3/d;)Ld3/d;
    .locals 1
    .param p0    # Ld3/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ld3/d<",
            "+TT;>;)",
            "Ld3/d<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ld3/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ld3/a;

    invoke-direct {v0, p0}, Ld3/a;-><init>(Ld3/d;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
