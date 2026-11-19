.class public final Lb/b/a/a/m/r;
.super Lb/b/a/a/m/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lb/b/a/a/m/x<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public W:Lb/b/a/a/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/a/a/m/d<",
            "TS;>;"
        }
    .end annotation
.end field

.field public X:Lb/b/a/a/m/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/b/a/a/m/x;-><init>()V

    return-void
.end method


# virtual methods
.method public M(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, La/k/b/m;->M(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, La/k/b/m;->h:Landroid/os/Bundle;

    :cond_0
    const-string v0, "DATE_SELECTOR_KEY"

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lb/b/a/a/m/d;

    iput-object v0, p0, Lb/b/a/a/m/r;->W:Lb/b/a/a/m/d;

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lb/b/a/a/m/a;

    iput-object p1, p0, Lb/b/a/a/m/r;->X:Lb/b/a/a/m/a;

    return-void
.end method

.method public P(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    iget-object v0, p0, Lb/b/a/a/m/r;->W:Lb/b/a/a/m/d;

    iget-object v4, p0, Lb/b/a/a/m/r;->X:Lb/b/a/a/m/a;

    new-instance v5, Lb/b/a/a/m/r$a;

    invoke-direct {v5, p0}, Lb/b/a/a/m/r$a;-><init>(Lb/b/a/a/m/r;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-interface/range {v0 .. v5}, Lb/b/a/a/m/d;->g(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Lb/b/a/a/m/a;Lb/b/a/a/m/w;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b0(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lb/b/a/a/m/r;->W:Lb/b/a/a/m/d;

    const-string v1, "DATE_SELECTOR_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lb/b/a/a/m/r;->X:Lb/b/a/a/m/a;

    const-string v1, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method
