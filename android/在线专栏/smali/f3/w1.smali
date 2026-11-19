.class final Lf3/w1;
.super Lf3/d2;
.source "SourceFile"


# instance fields
.field private final c:Lq2/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq2/g;Lx2/p;)V
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/g;",
            "Lx2/p<",
            "-",
            "Lf3/h0;",
            "-",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lf3/d2;-><init>(Lq2/g;Z)V

    .line 2
    invoke-static {p2, p0, p0}, Lr2/b;->a(Lx2/p;Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    iput-object p1, p0, Lf3/w1;->c:Lq2/d;

    return-void
.end method


# virtual methods
.method protected e0()V
    .locals 1

    iget-object v0, p0, Lf3/w1;->c:Lq2/d;

    invoke-static {v0, p0}, Lk3/a;->c(Lq2/d;Lq2/d;)V

    return-void
.end method
