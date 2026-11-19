.class public abstract Lq2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/g$b;


# instance fields
.field private final key:Lq2/g$c;
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
.method public constructor <init>(Lq2/g$c;)V
    .locals 1
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/g$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq2/a;->key:Lq2/g$c;

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1, p2}, Lq2/g$b$a;->a(Lq2/g$b;Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lq2/g$c;)Lq2/g$b;
    .locals 0
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

    invoke-static {p0, p1}, Lq2/g$b$a;->b(Lq2/g$b;Lq2/g$c;)Lq2/g$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lq2/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq2/g$c<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lq2/a;->key:Lq2/g$c;

    return-object v0
.end method

.method public minusKey(Lq2/g$c;)Lq2/g;
    .locals 0
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

    invoke-static {p0, p1}, Lq2/g$b$a;->c(Lq2/g$b;Lq2/g$c;)Lq2/g;

    move-result-object p1

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

    invoke-static {p0, p1}, Lq2/g$b$a;->d(Lq2/g$b;Lq2/g;)Lq2/g;

    move-result-object p1

    return-object p1
.end method
