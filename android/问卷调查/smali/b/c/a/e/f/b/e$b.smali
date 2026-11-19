.class public Lb/c/a/e/f/b/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/c/a/e/f/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final b:F

.field public final c:F

.field public final d:J

.field public final e:F

.field public final f:F

.field public final synthetic g:Lb/c/a/e/f/b/e;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/b/e;FFFF)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/b/e$b;->g:Lb/c/a/e/f/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lb/c/a/e/f/b/e$b;->b:F

    iput p5, p0, Lb/c/a/e/f/b/e$b;->c:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iput-wide p4, p0, Lb/c/a/e/f/b/e$b;->d:J

    iput p2, p0, Lb/c/a/e/f/b/e$b;->e:F

    iput p3, p0, Lb/c/a/e/f/b/e$b;->f:F

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lb/c/a/e/f/b/e$b;->g:Lb/c/a/e/f/b/e;

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lb/c/a/e/f/b/e$b;->d:J

    sub-long/2addr v1, v3

    long-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget-object v3, p0, Lb/c/a/e/f/b/e$b;->g:Lb/c/a/e/f/b/e;

    iget v3, v3, Lb/c/a/e/f/b/e;->c:I

    int-to-float v3, v3

    div-float/2addr v1, v3

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v3, p0, Lb/c/a/e/f/b/e$b;->g:Lb/c/a/e/f/b/e;

    .line 2
    iget-object v3, v3, Lb/c/a/e/f/b/e;->b:Landroid/view/animation/Interpolator;

    .line 3
    invoke-interface {v3, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v1

    .line 4
    iget v3, p0, Lb/c/a/e/f/b/e$b;->e:F

    iget v4, p0, Lb/c/a/e/f/b/e$b;->f:F

    invoke-static {v4, v3, v1, v3}, Lb/a/a/a/a;->a(FFFF)F

    move-result v3

    iget-object v4, p0, Lb/c/a/e/f/b/e$b;->g:Lb/c/a/e/f/b/e;

    invoke-virtual {v4}, Lb/c/a/e/f/b/e;->l()F

    move-result v4

    div-float/2addr v3, v4

    iget-object v4, p0, Lb/c/a/e/f/b/e$b;->g:Lb/c/a/e/f/b/e;

    iget v5, p0, Lb/c/a/e/f/b/e$b;->b:F

    iget v6, p0, Lb/c/a/e/f/b/e$b;->c:F

    invoke-virtual {v4, v3, v5, v6}, Lb/c/a/e/f/b/e;->m(FFF)V

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    .line 5
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
