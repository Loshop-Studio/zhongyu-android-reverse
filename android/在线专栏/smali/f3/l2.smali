.class final Lf3/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/g$b;
.implements Lq2/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq2/g$b;",
        "Lq2/g$c<",
        "Lf3/l2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lf3/l2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/l2;

    invoke-direct {v0}, Lf3/l2;-><init>()V

    sput-object v0, Lf3/l2;->a:Lf3/l2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq2/g$c<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
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
