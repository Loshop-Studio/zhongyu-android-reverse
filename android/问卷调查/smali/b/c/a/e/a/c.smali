.class public Lb/c/a/e/a/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/a/e/a/a;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:Z

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb/c/a/e/a/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0407a3

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lb/c/a/a;->z(Landroid/content/Context;IZ)Z

    move-result v0

    iput-boolean v0, p0, Lb/c/a/e/a/c;->b:Z

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0407a2

    invoke-static {v0, v1, v2}, Lb/c/a/a;->z(Landroid/content/Context;IZ)Z

    move-result v0

    iput-boolean v0, p0, Lb/c/a/e/a/c;->c:Z

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f04070d

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v0, v1, v2}, Lb/c/a/a;->D(Landroid/content/Context;IF)F

    move-result v0

    iput v0, p0, Lb/c/a/e/a/c;->d:F

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f04070c

    invoke-static {p1, v0, v2}, Lb/c/a/a;->D(Landroid/content/Context;IF)F

    move-result p1

    iput p1, p0, Lb/c/a/e/a/c;->e:F

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Z)V
    .locals 3

    iget-object v0, p0, Lb/c/a/e/a/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, Lb/c/a/e/a/c;->c:Z

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    iget v2, p0, Lb/c/a/e/a/c;->e:F

    :cond_2
    :goto_0
    if-eq p1, v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eq p1, p2, :cond_3

    invoke-virtual {v0, p2}, Landroid/view/View;->setEnabled(Z)V

    :cond_3
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public b(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/a/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lb/c/a/e/a/c;->b:Z

    if-eqz v1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, Lb/c/a/e/a/c;->d:F

    goto :goto_0

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    iget-boolean p1, p0, Lb/c/a/e/a/c;->c:Z

    if-eqz p1, :cond_3

    iget p1, p0, Lb/c/a/e/a/c;->e:F

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_3
    return-void
.end method

.method public c(Z)V
    .locals 1

    iput-boolean p1, p0, Lb/c/a/e/a/c;->c:Z

    iget-object p1, p0, Lb/c/a/e/a/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lb/c/a/e/a/c;->a(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method
