.class public final Lx0/p$a;
.super Lx0/y$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx0/y$a<",
        "Lx0/p$a;",
        "Lx0/p;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lx0/y$a;-><init>(Ljava/lang/Class;)V

    .line 2
    iget-object p1, p0, Lx0/y$a;->c:Lf1/r;

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lf1/r;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method bridge synthetic c()Lx0/y;
    .locals 1

    invoke-virtual {p0}, Lx0/p$a;->f()Lx0/p;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic d()Lx0/y$a;
    .locals 1

    invoke-virtual {p0}, Lx0/p$a;->g()Lx0/p$a;

    move-result-object v0

    return-object v0
.end method

.method f()Lx0/p;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lx0/y$a;->a:Z

    const/16 v1, 0x17

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lx0/y$a;->c:Lf1/r;

    iget-object v0, v0, Lf1/r;->j:Lx0/c;

    .line 2
    invoke-virtual {v0}, Lx0/c;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lx0/y$a;->c:Lf1/r;

    iget-boolean v2, v0, Lf1/r;->q:Z

    if-eqz v2, :cond_3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_3

    iget-object v0, v0, Lf1/r;->j:Lx0/c;

    .line 5
    invoke-virtual {v0}, Lx0/c;->h()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot run in foreground with an idle mode constraint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_3
    :goto_1
    new-instance v0, Lx0/p;

    invoke-direct {v0, p0}, Lx0/p;-><init>(Lx0/p$a;)V

    return-object v0
.end method

.method g()Lx0/p$a;
    .locals 0

    return-object p0
.end method
