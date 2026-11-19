.class public final Lq2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx2/p;Ljava/lang/Object;Lq2/d;)V
    .locals 1
    .param p0    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lx2/p<",
            "-TR;-",
            "Lq2/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lq2/d<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lr2/b;->a(Lx2/p;Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p0

    invoke-static {p0}, Lr2/b;->b(Lq2/d;)Lq2/d;

    move-result-object p0

    sget-object p1, Lo2/l;->a:Lo2/l$a;

    sget-object p1, Lo2/r;->a:Lo2/r;

    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
