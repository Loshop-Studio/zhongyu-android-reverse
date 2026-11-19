.class public La/b/h/r;
.super La/b/h/e0;
.source ""


# instance fields
.field public final synthetic k:La/b/h/s$d;

.field public final synthetic l:La/b/h/s;


# direct methods
.method public constructor <init>(La/b/h/s;Landroid/view/View;La/b/h/s$d;)V
    .locals 0

    iput-object p1, p0, La/b/h/r;->l:La/b/h/s;

    iput-object p3, p0, La/b/h/r;->k:La/b/h/s$d;

    invoke-direct {p0, p2}, La/b/h/e0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()La/b/g/i/p;
    .locals 1

    iget-object v0, p0, La/b/h/r;->k:La/b/h/s$d;

    return-object v0
.end method

.method public c()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, La/b/h/r;->l:La/b/h/s;

    invoke-virtual {v0}, La/b/h/s;->getInternalPopup()La/b/h/s$f;

    move-result-object v0

    invoke-interface {v0}, La/b/h/s$f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La/b/h/r;->l:La/b/h/s;

    invoke-virtual {v0}, La/b/h/s;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
