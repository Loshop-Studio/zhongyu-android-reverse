.class Lg1/k$a;
.super Lg1/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/k;->a(Ly0/i;Lx0/x;)Lg1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg1/k<",
        "Ljava/util/List<",
        "Lx0/v;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Ly0/i;

.field final synthetic c:Lx0/x;


# direct methods
.method constructor <init>(Ly0/i;Lx0/x;)V
    .locals 0

    iput-object p1, p0, Lg1/k$a;->b:Ly0/i;

    iput-object p2, p0, Lg1/k$a;->c:Lx0/x;

    invoke-direct {p0}, Lg1/k;-><init>()V

    return-void
.end method


# virtual methods
.method bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg1/k$a;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx0/v;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lg1/k$a;->b:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->s()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->I()Lf1/g;

    move-result-object v0

    iget-object v1, p0, Lg1/k$a;->c:Lx0/x;

    .line 3
    invoke-static {v1}, Lg1/h;->b(Lx0/x;)Ls0/e;

    move-result-object v1

    .line 4
    invoke-interface {v0, v1}, Lf1/g;->a(Ls0/e;)Ljava/util/List;

    move-result-object v0

    .line 5
    sget-object v1, Lf1/r;->s:Lj/a;

    invoke-interface {v1, v0}, Lj/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
