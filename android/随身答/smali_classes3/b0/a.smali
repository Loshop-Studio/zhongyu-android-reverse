.class public final Lb0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/b;


# instance fields
.field public final a:Lcom/caverock/androidsvg/SVG;

.field public b:Lcom/caverock/androidsvg/a;


# direct methods
.method public constructor <init>(Lcom/caverock/androidsvg/SVG;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/caverock/androidsvg/SVG;->t(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ly/m;)V
    .locals 1

    .line 1
    invoke-static {p1}, La0/b;->a(Ly/m;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/caverock/androidsvg/a;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/caverock/androidsvg/a;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/caverock/androidsvg/a;->a(Ljava/lang/String;)Lcom/caverock/androidsvg/a;

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lb0/a;->b:Lcom/caverock/androidsvg/a;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/caverock/androidsvg/SVG;->r(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d([F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v1, p1, v1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aget v2, p1, v2

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    aget v3, p1, v3

    .line 11
    .line 12
    sub-float/2addr v3, v1

    .line 13
    const/4 v4, 0x3

    .line 14
    aget p1, p1, v4

    .line 15
    .line 16
    sub-float/2addr p1, v2

    .line 17
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/caverock/androidsvg/SVG;->s(FFFF)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public e()[F
    .locals 4

    .line 1
    iget-object v0, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/caverock/androidsvg/SVG;->g()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    new-array v1, v1, [F

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    aput v3, v1, v2

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 19
    .line 20
    aput v3, v1, v2

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 24
    .line 25
    aput v3, v1, v2

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 29
    .line 30
    aput v0, v1, v2

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return-object v0
.end method

.method public f(II)Lk/j;
    .locals 3

    .line 1
    new-instance v0, La0/e;

    .line 2
    .line 3
    iget-object v1, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 4
    .line 5
    iget-object v2, p0, Lb0/a;->b:Lcom/caverock/androidsvg/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1, p2}, La0/e;-><init>(Lcom/caverock/androidsvg/SVG;Lcom/caverock/androidsvg/a;II)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public getHeight()F
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/caverock/androidsvg/SVG;->f()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getWidth()F
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/a;->a:Lcom/caverock/androidsvg/SVG;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/caverock/androidsvg/SVG;->h()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
