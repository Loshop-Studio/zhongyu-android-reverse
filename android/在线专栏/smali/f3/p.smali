.class public final Lf3/p;
.super Lf3/o1;
.source "SourceFile"


# instance fields
.field public final e:Lf3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf3/m<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf3/m;)V
    .locals 0
    .param p1    # Lf3/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/m<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lf3/o1;-><init>()V

    .line 2
    iput-object p1, p0, Lf3/p;->e:Lf3/m;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lf3/p;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p1, p0, Lf3/p;->e:Lf3/m;

    invoke-virtual {p0}, Lf3/s1;->t()Lf3/t1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf3/m;->r(Lf3/m1;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf3/m;->C(Ljava/lang/Throwable;)V

    return-void
.end method
