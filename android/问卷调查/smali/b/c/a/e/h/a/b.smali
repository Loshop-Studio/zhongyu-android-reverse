.class public abstract Lb/c/a/e/h/a/b;
.super Landroid/graphics/drawable/Drawable;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/a/e/h/a/b$b;
    }
.end annotation


# instance fields
.field public b:I

.field public c:Landroid/graphics/ColorFilter;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/graphics/PorterDuff$Mode;

.field public f:Landroid/graphics/PorterDuffColorFilter;

.field public g:Lb/c/a/e/h/a/b$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v0, 0xff

    iput v0, p0, Lb/c/a/e/h/a/b;->b:I

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lb/c/a/e/h/a/b;->e:Landroid/graphics/PorterDuff$Mode;

    new-instance v0, Lb/c/a/e/h/a/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb/c/a/e/h/a/b$b;-><init>(Lb/c/a/e/h/a/b;Lb/c/a/e/h/a/b$a;)V

    iput-object v0, p0, Lb/c/a/e/h/a/b;->g:Lb/c/a/e/h/a/b$b;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    iget v2, v0, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iget v3, v0, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    move-object v3, p0

    check-cast v3, Lb/c/a/e/h/a/d;

    .line 1
    iget-object v4, v3, Lb/c/a/e/h/a/d;->h:Landroid/graphics/Paint;

    if-nez v4, :cond_1

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, v3, Lb/c/a/e/h/a/d;->h:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v4, v3, Lb/c/a/e/h/a/d;->h:Landroid/graphics/Paint;

    const/high16 v5, -0x1000000

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v3, Lb/c/a/e/h/a/d;->h:Landroid/graphics/Paint;

    invoke-virtual {v3, v4}, Lb/c/a/e/h/a/d;->g(Landroid/graphics/Paint;)V

    :cond_1
    iget-object v4, v3, Lb/c/a/e/h/a/d;->h:Landroid/graphics/Paint;

    iget v5, v3, Lb/c/a/e/h/a/b;->b:I

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v4, v3, Lb/c/a/e/h/a/d;->h:Landroid/graphics/Paint;

    .line 2
    iget-object v5, v3, Lb/c/a/e/h/a/b;->c:Landroid/graphics/ColorFilter;

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    iget-object v5, v3, Lb/c/a/e/h/a/b;->f:Landroid/graphics/PorterDuffColorFilter;

    .line 3
    :goto_0
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v4, v3, Lb/c/a/e/h/a/d;->h:Landroid/graphics/Paint;

    invoke-virtual {v3, p1, v2, v0, v4}, Lb/c/a/e/h/a/d;->f(Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V

    .line 4
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final e()Z
    .locals 4

    iget-object v0, p0, Lb/c/a/e/h/a/b;->d:Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v3, p0, Lb/c/a/e/h/a/b;->e:Landroid/graphics/PorterDuff$Mode;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    iget-object v3, p0, Lb/c/a/e/h/a/b;->e:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v2, p0, Lb/c/a/e/h/a/b;->f:Landroid/graphics/PorterDuffColorFilter;

    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lb/c/a/e/h/a/b;->f:Landroid/graphics/PorterDuffColorFilter;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lb/c/a/e/h/a/b;->f:Landroid/graphics/PorterDuffColorFilter;

    return v1
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, Lb/c/a/e/h/a/b;->b:I

    return v0
.end method

.method public getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/b;->c:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/b;->g:Lb/c/a/e/h/a/b$b;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public isStateful()Z
    .locals 1

    iget-object v0, p0, Lb/c/a/e/h/a/b;->d:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onStateChange([I)Z
    .locals 0

    invoke-virtual {p0}, Lb/c/a/e/h/a/b;->e()Z

    move-result p1

    return p1
.end method

.method public setAlpha(I)V
    .locals 1

    iget v0, p0, Lb/c/a/e/h/a/b;->b:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lb/c/a/e/h/a/b;->b:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/h/a/b;->c:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setTint(I)V
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb/c/a/e/h/a/b;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/h/a/b;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lb/c/a/e/h/a/b;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/h/a/b;->e:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Lb/c/a/e/h/a/b;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method
