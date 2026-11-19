.class final Lf3/l1;
.super Lf3/s1;
.source "SourceFile"


# instance fields
.field private final e:Lx2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/l<",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx2/l;)V
    .locals 0
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lf3/s1;-><init>()V

    .line 2
    iput-object p1, p0, Lf3/l1;->e:Lx2/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lf3/l1;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lf3/l1;->e:Lx2/l;

    invoke-interface {v0, p1}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
