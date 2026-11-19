.class public final Lcom/zykj/blackboard/core/canvas/view/ActiveView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lw9/a;


# instance fields
.field public c:Landroid/graphics/Bitmap;

.field public final d:Landroid/graphics/Matrix;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/Paint;

.field public g:Ljava/util/Map;


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

    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/ActiveView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/ActiveView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->g:Ljava/util/Map;

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->d:Landroid/graphics/Matrix;

    .line 6
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->e:Landroid/graphics/Path;

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->f:Landroid/graphics/Paint;

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

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/view/ActiveView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->e:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->c:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->d:Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    new-instance p1, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {p1, p2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->d:Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    const-string p1, "DrawView"

    .line 38
    .line 39
    const-string p2, "Active-> drawBitmap()"

    .line 40
    .line 41
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public b(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    new-instance v1, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-direct {v1, p3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, p1

    .line 26
    :goto_0
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->c:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->e:Landroid/graphics/Path;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 31
    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->e:Landroid/graphics/Path;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->f:Landroid/graphics/Paint;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "DrawView"

    .line 46
    .line 47
    const-string p2, "Active-> drawPath()"

    .line 48
    .line 49
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public clear()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->e:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->c:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    const-string v0, "DrawView"

    .line 10
    .line 11
    const-string v1, "Active-> clear()"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "Active -> onDraw s"

    .line 5
    .line 6
    const-string v1, "DrawView"

    .line 7
    .line 8
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->c:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v2, Lna/e;->a:Lna/e;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->d:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v2, p1, v0, v3}, Lna/e;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->e:Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->e:Landroid/graphics/Path;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/view/ActiveView;->f:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const-string p1, "Active -> onDraw e"

    .line 40
    .line 41
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    return-void
.end method
