.class public La/k/b/p$a;
.super La/k/b/z;
.source ""

# interfaces
.implements La/m/u;
.implements La/a/c;
.implements La/a/e/e;
.implements La/k/b/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/k/b/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/k/b/z<",
        "La/k/b/p;",
        ">;",
        "La/m/u;",
        "La/a/c;",
        "La/a/e/e;",
        "La/k/b/g0;"
    }
.end annotation


# instance fields
.field public final synthetic f:La/k/b/p;


# direct methods
.method public constructor <init>(La/k/b/p;)V
    .locals 0

    iput-object p1, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-direct {p0, p1}, La/k/b/z;-><init>(La/k/b/p;)V

    return-void
.end method


# virtual methods
.method public a()La/m/d;
    .locals 1

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    iget-object v0, v0, La/k/b/p;->j:La/m/h;

    return-object v0
.end method

.method public b(La/k/b/c0;La/k/b/m;)V
    .locals 0

    iget-object p1, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {p1}, La/k/b/p;->o()V

    return-void
.end method

.method public c()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    .line 1
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->g:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public e()La/m/t;
    .locals 1

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->e()La/m/t;

    move-result-object v0

    return-object v0
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g()La/a/e/d;
    .locals 1

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    .line 1
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->h:La/a/e/d;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    return-object v0
.end method

.method public j()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public k(La/k/b/m;)Z
    .locals 0

    iget-object p1, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, La/k/b/p$a;->f:La/k/b/p;

    invoke-virtual {v0}, La/k/b/p;->p()V

    return-void
.end method
