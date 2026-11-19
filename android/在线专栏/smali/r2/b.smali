.class public final Lr2/b;
.super Lr2/d;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Lx2/p;Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 0
    .param p0    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1, p2}, Lr2/c;->a(Lx2/p;Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(Lq2/d;)Lq2/d;
    .locals 0
    .param p0    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lr2/c;->b(Lq2/d;)Lq2/d;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lr2/d;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
