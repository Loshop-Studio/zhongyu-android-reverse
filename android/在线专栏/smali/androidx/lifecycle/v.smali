.class public final Landroidx/lifecycle/v;
.super Lf3/e0;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/lifecycle/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf3/e0;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/c;

    invoke-direct {v0}, Landroidx/lifecycle/c;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/v;->b:Landroidx/lifecycle/c;

    return-void
.end method


# virtual methods
.method public J(Lq2/g;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/v;->b:Landroidx/lifecycle/c;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/c;->c(Lq2/g;Ljava/lang/Runnable;)V

    return-void
.end method

.method public K(Lq2/g;)Z
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lf3/v0;->c()Lf3/x1;

    move-result-object v0

    invoke-virtual {v0}, Lf3/x1;->L()Lf3/x1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf3/e0;->K(Lq2/g;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object p1, p0, Landroidx/lifecycle/v;->b:Landroidx/lifecycle/c;

    invoke-virtual {p1}, Landroidx/lifecycle/c;->b()Z

    move-result p1

    xor-int/2addr p1, v0

    return p1
.end method
