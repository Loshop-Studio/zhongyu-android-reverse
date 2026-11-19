.class Lf1/k$a;
.super Lp0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/k;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp0/g<",
        "Lf1/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lf1/k;


# direct methods
.method constructor <init>(Lf1/k;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Lf1/k$a;->d:Lf1/k;

    invoke-direct {p0, p2}, Lp0/g;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lf1/i;

    invoke-virtual {p0, p1, p2}, Lf1/k$a;->j(Ls0/f;Lf1/i;)V

    return-void
.end method

.method public j(Ls0/f;Lf1/i;)V
    .locals 3

    .line 1
    iget-object v0, p2, Lf1/i;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x2

    .line 4
    iget p2, p2, Lf1/i;->b:I

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    return-void
.end method
