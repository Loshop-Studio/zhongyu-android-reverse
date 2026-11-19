.class public final Lq2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/g;
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Lq2/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final b:Lq2/g$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq2/g;Lq2/g$b;)V
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "left"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq2/c;->a:Lq2/g;

    .line 3
    iput-object p2, p0, Lq2/c;->b:Lq2/g$b;

    return-void
.end method

.method private final c(Lq2/g$b;)Z
    .locals 1

    invoke-interface {p1}, Lq2/g$b;->getKey()Lq2/g$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq2/c;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final e(Lq2/c;)Z
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p1, Lq2/c;->b:Lq2/g$b;

    invoke-direct {p0, v0}, Lq2/c;->c(Lq2/g$b;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object p1, p1, Lq2/c;->a:Lq2/g;

    .line 3
    instance-of v0, p1, Lq2/c;

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Lq2/c;

    goto :goto_0

    .line 5
    :cond_1
    check-cast p1, Lq2/g$b;

    invoke-direct {p0, p1}, Lq2/c;->c(Lq2/g$b;)Z

    move-result p1

    return p1
.end method

.method private final f()I
    .locals 3

    const/4 v0, 0x2

    move-object v1, p0

    :goto_0
    iget-object v1, v1, Lq2/c;->a:Lq2/g;

    instance-of v2, v1, Lq2/c;

    if-eqz v2, :cond_0

    check-cast v1, Lq2/c;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lq2/c;

    if-eqz v0, :cond_0

    check-cast p1, Lq2/c;

    invoke-direct {p1}, Lq2/c;->f()I

    move-result v0

    invoke-direct {p0}, Lq2/c;->f()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-direct {p1, p0}, Lq2/c;->e(Lq2/c;)Z

    move-result p1

    if-eqz p1, :cond_0

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

.method public fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lx2/p<",
            "-TR;-",
            "Lq2/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/c;->a:Lq2/g;

    invoke-interface {v0, p1, p2}, Lq2/g;->fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lq2/c;->b:Lq2/g$b;

    invoke-interface {p2, p1, v0}, Lx2/p;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lq2/g$c;)Lq2/g$b;
    .locals 2
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq2/g$b;",
            ">(",
            "Lq2/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    .line 1
    :goto_0
    iget-object v1, v0, Lq2/c;->b:Lq2/g$b;

    invoke-interface {v1, p1}, Lq2/g$b;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v1

    if-nez v1, :cond_1

    .line 2
    iget-object v0, v0, Lq2/c;->a:Lq2/g;

    .line 3
    instance-of v1, v0, Lq2/c;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lq2/c;

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {v0, p1}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lq2/c;->a:Lq2/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lq2/c;->b:Lq2/g$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public minusKey(Lq2/g$c;)Lq2/g;
    .locals 2
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/g$c<",
            "*>;)",
            "Lq2/g;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    .line 1
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/c;->b:Lq2/g$b;

    invoke-interface {v0, p1}, Lq2/g$b;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v0

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Lq2/c;->a:Lq2/g;

    invoke-interface {v0, p1}, Lq2/g;->minusKey(Lq2/g$c;)Lq2/g;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lq2/c;->a:Lq2/g;

    if-ne p1, v0, :cond_0

    move-object p1, p0

    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lq2/h;->a:Lq2/h;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lq2/c;->b:Lq2/g$b;

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Lq2/c;

    iget-object v1, p0, Lq2/c;->b:Lq2/g$b;

    invoke-direct {v0, p1, v1}, Lq2/c;-><init>(Lq2/g;Lq2/g$b;)V

    move-object p1, v0

    :goto_0
    return-object p1

    .line 6
    :cond_2
    iget-object p1, p0, Lq2/c;->a:Lq2/g;

    return-object p1
.end method

.method public plus(Lq2/g;)Lq2/g;
    .locals 0
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1}, Lq2/g$a;->a(Lq2/g;Lq2/g;)Lq2/g;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v1, Lq2/c$a;->a:Lq2/c$a;

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Lq2/c;->fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
