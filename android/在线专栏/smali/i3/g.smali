.class final Li3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/h;
.implements Li3/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Li3/h<",
        "TT;>;",
        "Li3/a;"
    }
.end annotation


# instance fields
.field private final a:Lf3/m1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final synthetic b:Li3/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li3/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li3/h;Lf3/m1;)V
    .locals 0
    .param p1    # Li3/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/h<",
            "+TT;>;",
            "Lf3/m1;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Li3/g;->a:Lf3/m1;

    .line 3
    iput-object p1, p0, Li3/g;->b:Li3/h;

    return-void
.end method


# virtual methods
.method public c(Li3/b;Lq2/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Li3/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/b<",
            "-TT;>;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Li3/g;->b:Li3/h;

    invoke-interface {v0, p1, p2}, Li3/a;->c(Li3/b;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
