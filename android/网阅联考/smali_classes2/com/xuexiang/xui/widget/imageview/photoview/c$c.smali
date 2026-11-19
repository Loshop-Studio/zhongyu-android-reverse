.class public Lcom/xuexiang/xui/widget/imageview/photoview/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/photoview/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final a:F

.field public final b:F

.field public final c:J

.field public final d:F

.field public final e:F

.field public final synthetic f:Lcom/xuexiang/xui/widget/imageview/photoview/c;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/photoview/c;FFFF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->f:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p4, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->a:F

    .line 7
    .line 8
    iput p5, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->b:F

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide p4

    .line 14
    iput-wide p4, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->c:J

    .line 15
    .line 16
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->d:F

    .line 17
    .line 18
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->e:F

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->c:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-float v0, v0

    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    mul-float/2addr v0, v1

    .line 12
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->f:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 13
    .line 14
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/photoview/c;->b:I

    .line 15
    .line 16
    int-to-float v2, v2

    .line 17
    div-float/2addr v0, v2

    .line 18
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->f:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->f(Lcom/xuexiang/xui/widget/imageview/photoview/c;)Landroid/view/animation/Interpolator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
.end method

.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->f:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->u()Landroid/widget/ImageView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->a()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->d:F

    .line 15
    .line 16
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->e:F

    .line 17
    .line 18
    sub-float/2addr v3, v2

    .line 19
    mul-float/2addr v3, v1

    .line 20
    add-float/2addr v2, v3

    .line 21
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->f:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->C()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    div-float/2addr v2, v3

    .line 28
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->f:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 29
    .line 30
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->a:F

    .line 31
    .line 32
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$c;->b:F

    .line 33
    .line 34
    invoke-virtual {v3, v2, v4, v5}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->a(FFF)V

    .line 35
    .line 36
    .line 37
    const/high16 v2, 0x3f800000    # 1.0f

    .line 38
    .line 39
    cmpg-float v1, v1, v2

    .line 40
    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    invoke-static {v0, p0}, Lw0/a;->c(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method
