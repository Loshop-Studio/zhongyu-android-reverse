.class public Lb/c/a/e/h/a/h;
.super Lb/c/a/e/h/a/f;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/u;


# instance fields
.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/c/a/e/h/a/f;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/c/a/e/h/a/h;->m:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/h;->m:Z

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/h;->m:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb/c/a/e/h/a/h;->m:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/h;->m:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lb/c/a/e/h/a/b;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public i(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x43b40000    # 360.0f

    invoke-virtual {p0, p1, p2, v0, v1}, Lb/c/a/e/h/a/f;->h(Landroid/graphics/Canvas;Landroid/graphics/Paint;FF)V

    return-void
.end method
