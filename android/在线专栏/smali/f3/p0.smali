.class Lf3/p0;
.super Lf3/a;
.source "SourceFile"

# interfaces
.implements Lf3/o0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf3/a<",
        "TT;>;",
        "Lf3/o0<",
        "TT;>;"
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

.method static synthetic x0(Lf3/p0;Lq2/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf3/t1;->p(Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public n(Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lf3/p0;->x0(Lf3/p0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
