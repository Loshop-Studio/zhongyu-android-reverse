.class public final Lcom/zykj/view/simpleBoard/SimpleBoardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lx5/d;


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Lv5/c;

.field public c:Lv5/b;

.field public d:Lv5/a;

.field public final e:Lx5/c;

.field public final f:Lx5/b;

.field public final g:Lx5/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
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

    .line 3
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->a:Landroid/graphics/Matrix;

    .line 5
    new-instance v4, Lv5/c;

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

    invoke-direct/range {v4 .. v15}, Lv5/c;-><init>(ZZFFFIZFIILkotlin/jvm/internal/n;)V

    iput-object v4, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->b:Lv5/c;

    .line 6
    new-instance v2, Lv5/b;

    invoke-direct {v2, v4, v1, v0}, Lv5/b;-><init>(Lv5/c;Landroid/graphics/Matrix;Lx5/d;)V

    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    .line 7
    new-instance v5, Lv5/a;

    invoke-direct {v5, v4, v1, v2}, Lv5/a;-><init>(Lv5/c;Landroid/graphics/Matrix;Lv5/b;)V

    iput-object v5, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lv5/a;

    .line 8
    new-instance v2, Lx5/c;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-direct/range {v2 .. v7}, Lx5/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    move-object v1, v2

    .line 9
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    invoke-virtual {v1, v2}, Lx5/c;->setMDrawControl(Lv5/b;)V

    .line 10
    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lx5/c;

    .line 11
    new-instance v2, Lx5/b;

    invoke-direct/range {v2 .. v7}, Lx5/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    move-object v8, v2

    .line 12
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    invoke-virtual {v8, v2}, Lx5/b;->setMDrawControl(Lv5/b;)V

    .line 13
    iput-object v8, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Lx5/b;

    .line 14
    new-instance v2, Lx5/a;

    invoke-direct/range {v2 .. v7}, Lx5/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 15
    iget-object v3, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    invoke-virtual {v2, v3}, Lx5/a;->setMDrawControl(Lv5/b;)V

    .line 16
    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lx5/a;

    .line 17
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 18
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
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

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lx5/a;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lx5/c;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Lx5/b;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv5/b;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getImageBackground()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv5/b;->g()Landroid/graphics/Bitmap;

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

.method public final getSimpleBoardConfig()Lv5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->b:Lv5/c;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

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
    invoke-virtual {p1, p2, v0}, Lv5/b;->r(II)V

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lv5/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv5/a;->a(Landroid/view/MotionEvent;)V

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lv5/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv5/a;->b(I)V

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv5/b;->p(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lx5/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setOnActionListener(Lx7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lv5/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv5/b;->q(Lx7/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
