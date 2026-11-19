.class public abstract Lq2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Lq2/g$b;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "Lq2/g$c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final a:Lx2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/l<",
            "Lq2/g$b;",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final b:Lq2/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq2/g$c<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq2/g$c;Lx2/l;)V
    .locals 1
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/g$c<",
            "TB;>;",
            "Lx2/l<",
            "-",
            "Lq2/g$b;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lq2/b;->a:Lx2/l;

    .line 3
    instance-of p2, p1, Lq2/b;

    if-eqz p2, :cond_0

    check-cast p1, Lq2/b;

    iget-object p1, p1, Lq2/b;->b:Lq2/g$c;

    :cond_0
    iput-object p1, p0, Lq2/b;->b:Lq2/g$c;

    return-void
.end method


# virtual methods
.method public final a(Lq2/g$c;)Z
    .locals 1
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/g$c<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    iget-object v0, p0, Lq2/b;->b:Lq2/g$c;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b(Lq2/g$b;)Lq2/g$b;
    .locals 1
    .param p1    # Lq2/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/g$b;",
            ")TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/b;->a:Lx2/l;

    invoke-interface {v0, p1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq2/g$b;

    return-object p1
.end method
