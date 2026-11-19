.class public abstract Lx0/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:",
        "Lx0/y$a<",
        "**>;W:",
        "Lx0/y;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field a:Z

.field b:Ljava/util/UUID;

.field c:Lf1/r;

.field d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 3
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lx0/y$a;->a:Z

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lx0/y$a;->d:Ljava/util/Set;

    .line 4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lx0/y$a;->b:Ljava/util/UUID;

    .line 5
    iput-object p1, p0, Lx0/y$a;->e:Ljava/lang/Class;

    .line 6
    new-instance v0, Lf1/r;

    iget-object v1, p0, Lx0/y$a;->b:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lf1/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lx0/y$a;->c:Lf1/r;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx0/y$a;->a(Ljava/lang/String;)Lx0/y$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lx0/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TB;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx0/y$a;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {p0}, Lx0/y$a;->d()Lx0/y$a;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lx0/y;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TW;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lx0/y$a;->c()Lx0/y;

    move-result-object v0

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    iput-object v1, p0, Lx0/y$a;->b:Ljava/util/UUID;

    .line 3
    new-instance v1, Lf1/r;

    iget-object v2, p0, Lx0/y$a;->c:Lf1/r;

    invoke-direct {v1, v2}, Lf1/r;-><init>(Lf1/r;)V

    iput-object v1, p0, Lx0/y$a;->c:Lf1/r;

    .line 4
    iget-object v2, p0, Lx0/y$a;->b:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lf1/r;->a:Ljava/lang/String;

    return-object v0
.end method

.method abstract c()Lx0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TW;"
        }
    .end annotation
.end method

.method abstract d()Lx0/y$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation
.end method

.method public final e(Landroidx/work/a;)Lx0/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/a;",
            ")TB;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx0/y$a;->c:Lf1/r;

    iput-object p1, v0, Lf1/r;->e:Landroidx/work/a;

    .line 2
    invoke-virtual {p0}, Lx0/y$a;->d()Lx0/y$a;

    move-result-object p1

    return-object p1
.end method
