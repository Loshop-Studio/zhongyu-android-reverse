.class Lf3/d2;
.super Lf3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf3/a<",
        "Lo2/r;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lq2/g;Z)V
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lf3/a;-><init>(Lq2/g;ZZ)V

    return-void
.end method


# virtual methods
.method protected P(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lf3/a;->getContext()Lq2/g;

    move-result-object v0

    invoke-static {v0, p1}, Lf3/g0;->a(Lq2/g;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
