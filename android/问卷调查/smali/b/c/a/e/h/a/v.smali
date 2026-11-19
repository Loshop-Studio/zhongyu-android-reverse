.class public Lb/c/a/e/h/a/v;
.super Lb/c/a/e/h/a/f;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/u;


# instance fields
.field public final m:F

.field public n:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lb/c/a/e/h/a/f;-><init>()V

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/high16 p1, 0x43b40000    # 360.0f

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid value for style"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lb/c/a/e/h/a/v;->m:F

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/v;->n:Z

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/v;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb/c/a/e/h/a/v;->n:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public i(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    int-to-float v0, v0

    const v1, 0x461c4000    # 10000.0f

    div-float/2addr v0, v1

    iget v1, p0, Lb/c/a/e/h/a/v;->m:F

    mul-float/2addr v1, v0

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float/2addr v0, v2

    invoke-virtual {p0, p1, p2, v1, v0}, Lb/c/a/e/h/a/f;->h(Landroid/graphics/Canvas;Landroid/graphics/Paint;FF)V

    iget-boolean v2, p0, Lb/c/a/e/h/a/v;->n:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, p2, v1, v0}, Lb/c/a/e/h/a/f;->h(Landroid/graphics/Canvas;Landroid/graphics/Paint;FF)V

    :cond_1
    return-void
.end method

.method public onLevelChange(I)Z
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 p1, 0x1

    return p1
.end method
