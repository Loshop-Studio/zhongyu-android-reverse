.class public final Lx0/p;
.super Lx0/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/p$a;
    }
.end annotation


# direct methods
.method constructor <init>(Lx0/p$a;)V
    .locals 2

    iget-object v0, p1, Lx0/y$a;->b:Ljava/util/UUID;

    iget-object v1, p1, Lx0/y$a;->c:Lf1/r;

    iget-object p1, p1, Lx0/y$a;->d:Ljava/util/Set;

    invoke-direct {p0, v0, v1, p1}, Lx0/y;-><init>(Ljava/util/UUID;Lf1/r;Ljava/util/Set;)V

    return-void
.end method

.method public static e(Ljava/lang/Class;)Lx0/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)",
            "Lx0/p;"
        }
    .end annotation

    new-instance v0, Lx0/p$a;

    invoke-direct {v0, p0}, Lx0/p$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lx0/y$a;->b()Lx0/y;

    move-result-object p0

    check-cast p0, Lx0/p;

    return-object p0
.end method
