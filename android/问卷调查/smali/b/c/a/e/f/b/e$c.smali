.class public Lb/c/a/e/f/b/e$c;
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
    name = "c"
.end annotation


# instance fields
.field public final b:Lb/c/a/e/f/b/g/c;

.field public c:I

.field public d:I

.field public final synthetic e:Lb/c/a/e/f/b/e;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/b/e;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/b/e$c;->e:Lb/c/a/e/f/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    new-instance p1, Lb/c/a/e/f/b/g/b;

    invoke-direct {p1, p2}, Lb/c/a/e/f/b/g/b;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lb/c/a/e/f/b/e$c;->b:Lb/c/a/e/f/b/g/c;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lb/c/a/e/f/b/e$c;->b:Lb/c/a/e/f/b/g/c;

    check-cast v0, Lb/c/a/e/f/b/g/a;

    .line 1
    iget-object v0, v0, Lb/c/a/e/f/b/g/a;->a:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lb/c/a/e/f/b/e$c;->e:Lb/c/a/e/f/b/e;

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lb/c/a/e/f/b/e$c;->b:Lb/c/a/e/f/b/g/c;

    invoke-virtual {v1}, Lb/c/a/e/f/b/g/c;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb/c/a/e/f/b/e$c;->b:Lb/c/a/e/f/b/g/c;

    check-cast v1, Lb/c/a/e/f/b/g/a;

    .line 3
    iget-object v1, v1, Lb/c/a/e/f/b/g/a;->a:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    .line 4
    iget-object v2, p0, Lb/c/a/e/f/b/e$c;->b:Lb/c/a/e/f/b/g/c;

    check-cast v2, Lb/c/a/e/f/b/g/a;

    .line 5
    iget-object v2, v2, Lb/c/a/e/f/b/g/a;->a:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    .line 6
    sget-boolean v3, Lb/c/a/e/f/b/e;->E:Z

    .line 7
    iget-object v3, p0, Lb/c/a/e/f/b/e$c;->e:Lb/c/a/e/f/b/e;

    .line 8
    iget-object v3, v3, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    .line 9
    iget v4, p0, Lb/c/a/e/f/b/e$c;->c:I

    sub-int/2addr v4, v1

    int-to-float v4, v4

    iget v5, p0, Lb/c/a/e/f/b/e$c;->d:I

    sub-int/2addr v5, v2

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v3, p0, Lb/c/a/e/f/b/e$c;->e:Lb/c/a/e/f/b/e;

    .line 10
    invoke-virtual {v3}, Lb/c/a/e/f/b/e;->h()Landroid/graphics/Matrix;

    move-result-object v4

    .line 11
    invoke-virtual {v3, v4}, Lb/c/a/e/f/b/e;->o(Landroid/graphics/Matrix;)V

    .line 12
    iput v1, p0, Lb/c/a/e/f/b/e$c;->c:I

    iput v2, p0, Lb/c/a/e/f/b/e$c;->d:I

    .line 13
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
