.class final Lf3/t1$a;
.super Lf3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf3/m<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final i:Lf3/t1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq2/d;Lf3/t1;)V
    .locals 1
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lf3/t1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-TT;>;",
            "Lf3/t1;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lf3/m;-><init>(Lq2/d;I)V

    .line 2
    iput-object p2, p0, Lf3/t1$a;->i:Lf3/t1;

    return-void
.end method


# virtual methods
.method protected B()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public r(Lf3/m1;)Ljava/lang/Throwable;
    .locals 2
    .param p1    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lf3/t1$a;->i:Lf3/t1;

    invoke-virtual {v0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/t1$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lf3/t1$c;

    invoke-virtual {v1}, Lf3/t1$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    .line 3
    :cond_1
    :goto_0
    instance-of v1, v0, Lf3/y;

    if-eqz v1, :cond_2

    check-cast v0, Lf3/y;

    iget-object p1, v0, Lf3/y;->a:Ljava/lang/Throwable;

    return-object p1

    .line 4
    :cond_2
    invoke-interface {p1}, Lf3/m1;->u()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
