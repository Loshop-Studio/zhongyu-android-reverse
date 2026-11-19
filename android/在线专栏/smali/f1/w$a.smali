.class Lf1/w$a;
.super Lp0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/w;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp0/g<",
        "Lf1/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lf1/w;


# direct methods
.method constructor <init>(Lf1/w;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Lf1/w$a;->d:Lf1/w;

    invoke-direct {p0, p2}, Lp0/g;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lf1/u;

    invoke-virtual {p0, p1, p2}, Lf1/w$a;->j(Ls0/f;Lf1/u;)V

    return-void
.end method

.method public j(Ls0/f;Lf1/u;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lf1/u;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    .line 4
    :goto_0
    iget-object p2, p2, Lf1/u;->b:Ljava/lang/String;

    const/4 v0, 0x2

    if-nez p2, :cond_1

    .line 5
    invoke-interface {p1, v0}, Ls0/d;->k(I)V

    goto :goto_1

    .line 6
    :cond_1
    invoke-interface {p1, v0, p2}, Ls0/d;->c(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
