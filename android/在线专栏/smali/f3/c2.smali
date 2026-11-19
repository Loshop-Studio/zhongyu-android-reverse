.class final Lf3/c2;
.super Lf3/s1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf3/s1;"
    }
.end annotation


# instance fields
.field private final e:Lf3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf3/m<",
            "TT;>;"
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
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lf3/s1;-><init>()V

    .line 2
    iput-object p1, p0, Lf3/c2;->e:Lf3/m;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lf3/c2;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lf3/s1;->t()Lf3/t1;

    move-result-object p1

    invoke-virtual {p1}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of v0, p1, Lf3/y;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lf3/c2;->e:Lf3/m;

    check-cast p1, Lf3/y;

    iget-object p1, p1, Lf3/y;->a:Ljava/lang/Throwable;

    sget-object v1, Lo2/l;->a:Lo2/l$a;

    invoke-static {p1}, Lo2/m;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lf3/c2;->e:Lf3/m;

    invoke-static {p1}, Lf3/u1;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lo2/l;->a:Lo2/l$a;

    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
