.class public final Lcom/zykj/view/simpleBoard/SimpleBoardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lsb/a;


# instance fields
.field public final c:Landroid/graphics/Matrix;

.field public final d:Lqb/c;

.field public e:Lqb/b;

.field public f:Lqb/a;

.field public final g:Lcom/zykj/view/simpleBoard/view/BoardTempPathView;

.field public final h:Lcom/zykj/view/simpleBoard/view/BoardPathView;

.field public final i:Lcom/zykj/view/simpleBoard/view/BoardImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Landroid/graphics/Matrix;

    .line 6
    new-instance v4, Lqb/c;

    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v15}, Lqb/c;-><init>(ZZFFFIZFIILkotlin/jvm/internal/n;)V

    iput-object v4, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lqb/c;

    .line 7
    new-instance v2, Lqb/b;

    invoke-direct {v2, v4, v1, v0}, Lqb/b;-><init>(Lqb/c;Landroid/graphics/Matrix;Lsb/a;)V

    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    .line 8
    new-instance v5, Lqb/a;

    invoke-direct {v5, v4, v1, v2}, Lqb/a;-><init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V

    iput-object v5, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Lqb/a;

    .line 9
    new-instance v2, Lcom/zykj/view/simpleBoard/view/BoardTempPathView;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-direct/range {v2 .. v7}, Lcom/zykj/view/simpleBoard/view/BoardTempPathView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    move-object v1, v2

    .line 10
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    invoke-virtual {v1, v2}, Lcom/zykj/view/simpleBoard/view/BoardTempPathView;->setMDrawControl(Lqb/b;)V

    .line 11
    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lcom/zykj/view/simpleBoard/view/BoardTempPathView;

    .line 12
    new-instance v2, Lcom/zykj/view/simpleBoard/view/BoardPathView;

    invoke-direct/range {v2 .. v7}, Lcom/zykj/view/simpleBoard/view/BoardPathView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    move-object v8, v2

    .line 13
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    invoke-virtual {v8, v2}, Lcom/zykj/view/simpleBoard/view/BoardPathView;->setMDrawControl(Lqb/b;)V

    .line 14
    iput-object v8, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->h:Lcom/zykj/view/simpleBoard/view/BoardPathView;

    .line 15
    new-instance v2, Lcom/zykj/view/simpleBoard/view/BoardImageView;

    invoke-direct/range {v2 .. v7}, Lcom/zykj/view/simpleBoard/view/BoardImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 16
    iget-object v3, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    invoke-virtual {v2, v3}, Lcom/zykj/view/simpleBoard/view/BoardImageView;->setMDrawControl(Lqb/b;)V

    .line 17
    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->i:Lcom/zykj/view/simpleBoard/view/BoardImageView;

    .line 18
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->i:Lcom/zykj/view/simpleBoard/view/BoardImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lcom/zykj/view/simpleBoard/view/BoardTempPathView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->h:Lcom/zykj/view/simpleBoard/view/BoardPathView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqb/b;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getImageBackground()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqb/b;->g()Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final getSimpleBoardConfig()Lqb/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lqb/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1, p2, v0}, Lqb/b;->r(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Lqb/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqb/a;->a(Landroid/view/MotionEvent;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public final setActonMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Lqb/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqb/a;->b(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setImageBackground(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqb/b;->p(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->i:Lcom/zykj/view/simpleBoard/view/BoardImageView;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setOnActionListener(Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lqb/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqb/b;->q(Lhd/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
