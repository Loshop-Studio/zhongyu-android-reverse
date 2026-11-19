.class public Lb/c/a/e/h/a/e;
.super Landroid/graphics/drawable/LayerDrawable;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/s;
.implements Lb/c/a/e/h/a/t;
.implements Lb/c/a/e/h/a/u;
.implements Lb/c/a/e/h/a/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ProgressDrawableType::",
        "Lb/c/a/e/h/a/s;",
        ":",
        "Lb/c/a/e/h/a/u;",
        ":",
        "Lb/c/a/e/h/a/x;",
        "BackgroundDrawableType::",
        "Lb/c/a/e/h/a/s;",
        ":",
        "Lb/c/a/e/h/a/u;",
        ":",
        "Lb/c/a/e/h/a/x;",
        ">",
        "Landroid/graphics/drawable/LayerDrawable;",
        "Lb/c/a/e/h/a/s;",
        "Lb/c/a/e/h/a/t;",
        "Lb/c/a/e/h/a/u;",
        "Lb/c/a/e/h/a/x;"
    }
.end annotation


# instance fields
.field public b:F

.field public c:Lb/c/a/e/h/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TBackgroundDrawableType;"
        }
    .end annotation
.end field

.field public d:Lb/c/a/e/h/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TProgressDrawableType;"
        }
    .end annotation
.end field

.field public e:Lb/c/a/e/h/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TProgressDrawableType;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const p1, 0x1010033

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lb/c/a/a;->D(Landroid/content/Context;IF)F

    move-result p1

    iput p1, p0, Lb/c/a/e/h/a/e;->b:F

    const/4 p1, 0x0

    const/high16 v0, 0x1020000

    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lb/c/a/e/h/a/s;

    iput-object p1, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    const/4 p1, 0x1

    const v0, 0x102000f

    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lb/c/a/e/h/a/s;

    iput-object p1, p0, Lb/c/a/e/h/a/e;->d:Lb/c/a/e/h/a/s;

    const/4 p1, 0x2

    const v0, 0x102000d

    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lb/c/a/e/h/a/s;

    iput-object p1, p0, Lb/c/a/e/h/a/e;->e:Lb/c/a/e/h/a/s;

    const p1, 0x7f04015f

    const/high16 v0, -0x1000000

    invoke-static {p1, v0, p2}, Lb/c/a/a;->l(IILandroid/content/Context;)I

    move-result p1

    invoke-virtual {p0, p1}, Lb/c/a/e/h/a/e;->setTint(I)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/u;

    invoke-interface {v0}, Lb/c/a/e/h/a/u;->a()Z

    move-result v0

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/u;

    invoke-interface {v0}, Lb/c/a/e/h/a/u;->a()Z

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/u;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/u;->b(Z)V

    iget-object v0, p0, Lb/c/a/e/h/a/e;->d:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/u;

    xor-int/lit8 p1, p1, 0x1

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/u;->b(Z)V

    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/s;->c(Z)V

    iget-object v0, p0, Lb/c/a/e/h/a/e;->d:Lb/c/a/e/h/a/s;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/s;->c(Z)V

    iget-object v0, p0, Lb/c/a/e/h/a/e;->e:Lb/c/a/e/h/a/s;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/s;->c(Z)V

    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    invoke-interface {v0}, Lb/c/a/e/h/a/s;->d()Z

    move-result v0

    return v0
.end method

.method public setTint(I)V
    .locals 2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lb/c/a/e/h/a/e;->b:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p1, v0}, La/h/d/a;->c(II)I

    move-result v0

    iget-object v1, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    check-cast v1, Lb/c/a/e/h/a/x;

    invoke-interface {v1, v0}, Lb/c/a/e/h/a/x;->setTint(I)V

    iget-object v1, p0, Lb/c/a/e/h/a/e;->d:Lb/c/a/e/h/a/s;

    check-cast v1, Lb/c/a/e/h/a/x;

    invoke-interface {v1, v0}, Lb/c/a/e/h/a/x;->setTint(I)V

    iget-object v0, p0, Lb/c/a/e/h/a/e;->e:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/x;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/x;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->isOpaque()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/high16 v0, 0x437f0000    # 255.0f

    iget v1, p0, Lb/c/a/e/h/a/e;->b:F

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    check-cast v1, Lb/c/a/e/h/a/x;

    invoke-interface {v1, v0}, Lb/c/a/e/h/a/x;->setTintList(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, Lb/c/a/e/h/a/e;->d:Lb/c/a/e/h/a/s;

    check-cast v1, Lb/c/a/e/h/a/x;

    invoke-interface {v1, v0}, Lb/c/a/e/h/a/x;->setTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lb/c/a/e/h/a/e;->e:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/x;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/x;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/e;->c:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/x;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/x;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lb/c/a/e/h/a/e;->d:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/x;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/x;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lb/c/a/e/h/a/e;->e:Lb/c/a/e/h/a/s;

    check-cast v0, Lb/c/a/e/h/a/x;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/x;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method
