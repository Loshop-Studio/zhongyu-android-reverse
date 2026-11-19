.class public La/k/b/l$e;
.super La/k/b/v;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/k/b/l;->b()La/k/b/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/k/b/v;

.field public final synthetic b:La/k/b/l;


# direct methods
.method public constructor <init>(La/k/b/l;La/k/b/v;)V
    .locals 0

    iput-object p1, p0, La/k/b/l$e;->b:La/k/b/l;

    iput-object p2, p0, La/k/b/l$e;->a:La/k/b/v;

    invoke-direct {p0}, La/k/b/v;-><init>()V

    return-void
.end method


# virtual methods
.method public f(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, La/k/b/l$e;->a:La/k/b/v;

    invoke-virtual {v0}, La/k/b/v;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/k/b/l$e;->a:La/k/b/v;

    invoke-virtual {v0, p1}, La/k/b/v;->f(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, La/k/b/l$e;->b:La/k/b/l;

    .line 1
    iget-object v0, v0, La/k/b/l;->g0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, La/k/b/l$e;->a:La/k/b/v;

    invoke-virtual {v0}, La/k/b/v;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/k/b/l$e;->b:La/k/b/l;

    .line 1
    iget-boolean v0, v0, La/k/b/l;->j0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
