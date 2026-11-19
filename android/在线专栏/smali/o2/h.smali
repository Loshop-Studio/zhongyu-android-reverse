.class Lo2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx2/a;)Lo2/f;
    .locals 3
    .param p0    # Lx2/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lx2/a<",
            "+TT;>;)",
            "Lo2/f<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo2/n;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lo2/n;-><init>(Lx2/a;Ljava/lang/Object;ILkotlin/jvm/internal/g;)V

    return-object v0
.end method
