.class Le2/c$a;
.super Lp0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/c;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp0/g<",
        "Le2/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Le2/c;


# direct methods
.method constructor <init>(Le2/c;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Le2/c$a;->d:Le2/c;

    invoke-direct {p0, p2}, Lp0/g;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `previewInfo` (`path`,`pageIndex`,`pageOffset`) VALUES (?,?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Le2/a;

    invoke-virtual {p0, p1, p2}, Le2/c$a;->j(Ls0/f;Le2/a;)V

    return-void
.end method

.method public j(Ls0/f;Le2/a;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Le2/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p2}, Le2/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x2

    .line 4
    invoke-virtual {p2}, Le2/a;->a()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/4 v0, 0x3

    .line 5
    invoke-virtual {p2}, Le2/a;->b()F

    move-result p2

    float-to-double v1, p2

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->l(ID)V

    return-void
.end method
