.class public final Lr2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lt2/a;

.field public b:I

.field public c:I

.field public final synthetic d:Lr2/k;


# direct methods
.method public constructor <init>(Lr2/k;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr2/e;->d:Lr2/k;

    .line 5
    .line 6
    new-instance p1, Lt2/a;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lt2/a;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lr2/e;->a:Lt2/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lr2/e;->a:Lt2/a;

    .line 2
    .line 3
    iget-object v1, v0, Lt2/a;->b:Landroid/widget/OverScroller;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lr2/e;->d:Lr2/k;

    .line 13
    .line 14
    invoke-virtual {v1}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v3, v0, Lt2/a;->b:Landroid/widget/OverScroller;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-object v3, v0, Lt2/a;->b:Landroid/widget/OverScroller;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-object v0, v0, Lt2/a;->b:Landroid/widget/OverScroller;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sget-boolean v4, Lr2/k;->z:Z

    .line 41
    .line 42
    iget v4, p0, Lr2/e;->b:I

    .line 43
    .line 44
    iget v5, p0, Lr2/e;->c:I

    .line 45
    .line 46
    iget-object v6, v1, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 47
    .line 48
    sub-int/2addr v4, v3

    .line 49
    int-to-float v4, v4

    .line 50
    sub-int/2addr v5, v0

    .line 51
    int-to-float v5, v5

    .line 52
    invoke-virtual {v6, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lr2/k;->f()Landroid/graphics/Matrix;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v4}, Lr2/k;->m(Landroid/graphics/Matrix;)V

    .line 60
    .line 61
    .line 62
    iput v3, p0, Lr2/e;->b:I

    .line 63
    .line 64
    iput v0, p0, Lr2/e;->c:I

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    return-void
.end method
