.class public abstract Lb/c/a/e/h/a/d;
.super Lb/c/a/e/h/a/b;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/s;


# instance fields
.field public h:Landroid/graphics/Paint;

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lb/c/a/e/h/a/b;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    return-void
.end method


# virtual methods
.method public c(Z)V
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb/c/a/e/h/a/d;->i:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    return v0
.end method

.method public abstract f(Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V
.end method

.method public abstract g(Landroid/graphics/Paint;)V
.end method
