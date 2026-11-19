.class public Lb/c/a/e/h/a/j;
.super Lb/c/a/e/h/a/g;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/u;


# instance fields
.field public n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/c/a/e/h/a/g;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb/c/a/e/h/a/j;->n:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/j;->n:Z

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/j;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb/c/a/e/h/a/j;->n:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/j;->n:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lb/c/a/e/h/a/b;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method
