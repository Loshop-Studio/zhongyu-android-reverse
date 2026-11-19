.class public abstract Landroidx/lifecycle/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf3/h0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract i()Landroidx/lifecycle/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final j(Lx2/p;)Lf3/m1;
    .locals 7
    .param p1    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/p<",
            "-",
            "Lf3/h0;",
            "-",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lf3/m1;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Landroidx/lifecycle/g$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Landroidx/lifecycle/g$a;-><init>(Landroidx/lifecycle/g;Lx2/p;Lq2/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lx2/p;)Lf3/m1;
    .locals 7
    .param p1    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/p<",
            "-",
            "Lf3/h0;",
            "-",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lf3/m1;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Landroidx/lifecycle/g$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Landroidx/lifecycle/g$b;-><init>(Landroidx/lifecycle/g;Lx2/p;Lq2/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    move-result-object p1

    return-object p1
.end method
