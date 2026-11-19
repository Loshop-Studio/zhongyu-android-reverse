.class public final Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$a;,
        Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;
    }
.end annotation


# static fields
.field public static final q:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$a;

.field public static final r:I


# instance fields
.field public final c:Z

.field public d:Lcom/friday/lecture/adapter/PaintColorAdapter;

.field public e:Z

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/ImageView;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/widget/ImageView;

.field public j:Lcom/friday/lecture/widget/GlobalCanvasView;

.field public k:Landroid/view/View;

.field public l:Lcom/github/chrisbanes/photoview/PhotoView;

.field public m:Landroid/widget/ImageView;

.field public n:Landroid/widget/ImageView;

.field public o:Landroid/widget/ImageView;

.field public p:Lhd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->q:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->r:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 3
    iput-boolean p2, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->c:Z

    .line 4
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ZILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;-><init>(Landroid/content/Context;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->w(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->t(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->u(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->v(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->x(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->y(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method private final getGcvPaintEntity()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;
    .locals 7

    .line 1
    const-string v0, "SimpleCanvasFingerMode"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/CacheMemoryStaticUtils;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;

    .line 8
    .line 9
    if-nez v0, :cond_6

    .line 10
    .line 11
    new-instance v1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->h:Landroid/widget/ImageView;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-string v0, "ivFinger"

    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v2

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 29
    .line 30
    const-string v4, "gcvPaint"

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object v3, v2

    .line 38
    :cond_1
    invoke-virtual {v3}, Lcom/friday/lecture/widget/GlobalCanvasView;->getPaintSize()F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object v5, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 43
    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v5, v2

    .line 50
    :cond_2
    invoke-virtual {v5}, Lcom/friday/lecture/widget/GlobalCanvasView;->getPaintColor()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget-object v6, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v6, v2

    .line 62
    :cond_3
    invoke-virtual {v6}, Lcom/friday/lecture/widget/GlobalCanvasView;->getMode()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v6, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 67
    .line 68
    if-nez v6, :cond_4

    .line 69
    .line 70
    const-string v6, "llDetail"

    .line 71
    .line 72
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    move-object v2, v6

    .line 77
    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    :goto_1
    move v6, v5

    .line 85
    move v5, v4

    .line 86
    move v4, v6

    .line 87
    move v6, v2

    .line 88
    move v2, v0

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    const/4 v2, 0x0

    .line 91
    goto :goto_1

    .line 92
    :goto_2
    invoke-direct/range {v1 .. v6}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;-><init>(ZFIIZ)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_6
    return-object v0
.end method

.method public static synthetic h(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->r(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic i(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->p(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->z(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->s(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->q(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic m(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)Lcom/github/chrisbanes/photoview/PhotoView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->l:Lcom/github/chrisbanes/photoview/PhotoView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final o(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 2
    .line 3
    const-string v0, "gcvPaint"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v1

    .line 12
    :cond_0
    const/4 v2, 0x2

    .line 13
    invoke-virtual {p1, v2}, Lcom/friday/lecture/widget/GlobalCanvasView;->setMode(I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const-string p1, "ivPencil"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v1

    .line 26
    :cond_1
    const/4 v2, 0x0

    .line 27
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    const-string p1, "ivEraser"

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v1

    .line 40
    :cond_2
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 44
    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    const-string p1, "ivScale"

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object p1, v1

    .line 53
    :cond_3
    const/4 v2, 0x1

    .line 54
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    const-string p1, "llDetail"

    .line 62
    .line 63
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object p1, v1

    .line 67
    :cond_4
    const/16 v3, 0x8

    .line 68
    .line 69
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 73
    .line 74
    if-nez p0, :cond_5

    .line 75
    .line 76
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    move-object v1, p0

    .line 81
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public static final p(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V
    .locals 0

    .line 1
    const/16 p2, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Lcom/friday/common/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final q(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->e:Z

    .line 15
    .line 16
    sget p1, Lcom/friday/lecture/R$id;->fm_view:I

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/friday/common/widget/TouchSwitchView;

    .line 23
    .line 24
    iget-boolean p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->e:Z

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lcom/friday/common/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final r(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 4

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 10
    .line 11
    const-string p2, "paintColorAdapter"

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/friday/lecture/model/PaintColorEntity;

    .line 29
    .line 30
    iget-object p3, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 31
    .line 32
    if-nez p3, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object p3, v0

    .line 38
    :cond_1
    invoke-virtual {p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    check-cast p3, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/friday/lecture/model/PaintColorEntity;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {v1, v2}, Lcom/friday/lecture/model/PaintColorEntity;->setSelected(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/friday/lecture/model/PaintColorEntity;->getColor()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {p1}, Lcom/friday/lecture/model/PaintColorEntity;->getColor()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-ne v2, v3, :cond_2

    .line 73
    .line 74
    const/4 v2, 0x1

    .line 75
    invoke-virtual {v1, v2}, Lcom/friday/lecture/model/PaintColorEntity;->setSelected(Z)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-object p3, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 80
    .line 81
    if-nez p3, :cond_4

    .line 82
    .line 83
    const-string p3, "gcvPaint"

    .line 84
    .line 85
    invoke-static {p3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object p3, v0

    .line 89
    :cond_4
    invoke-virtual {p1}, Lcom/friday/lecture/model/PaintColorEntity;->getColor()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {p3, p1}, Lcom/friday/lecture/widget/GlobalCanvasView;->setPaintColor(I)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 97
    .line 98
    if-nez p0, :cond_5

    .line 99
    .line 100
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    move-object v0, p0

    .line 105
    :goto_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public static final s(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    const-string p3, "gcvPaint"

    .line 7
    .line 8
    invoke-static {p3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_0
    invoke-virtual {p3}, Lcom/friday/lecture/widget/GlobalCanvasView;->a()V

    .line 13
    .line 14
    .line 15
    const/4 p3, 0x1

    .line 16
    invoke-virtual {p1, p3}, Lcom/friday/common/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    const-string p0, "llDetail"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v0, p0

    .line 30
    :goto_0
    const/16 p0, 0x8

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final t(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->p:Lhd/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->A()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final u(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lcom/friday/common/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final v(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 2
    .line 3
    const-string v0, "gcvPaint"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v1

    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    invoke-virtual {p1, v2}, Lcom/friday/lecture/widget/GlobalCanvasView;->setMode(I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const-string p1, "ivPencil"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v1

    .line 26
    :cond_1
    const/4 v3, 0x0

    .line 27
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    const-string p1, "ivEraser"

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v1

    .line 40
    :cond_2
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 44
    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    const-string p1, "llDetail"

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object p1, v1

    .line 53
    :cond_3
    const/16 v4, 0x8

    .line 54
    .line 55
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    const-string p1, "ivScale"

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object p1, v1

    .line 68
    :cond_4
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 72
    .line 73
    if-nez p0, :cond_5

    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    move-object v1, p0

    .line 80
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public static final w(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 2
    .line 3
    const-string v0, "gcvPaint"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v1

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v2}, Lcom/friday/lecture/widget/GlobalCanvasView;->setMode(I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const-string p1, "ivPencil"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v1

    .line 26
    :cond_1
    const/4 v3, 0x1

    .line 27
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    const-string p1, "ivEraser"

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v1

    .line 40
    :cond_2
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 44
    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    const-string p1, "ivScale"

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object p1, v1

    .line 53
    :cond_3
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 57
    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object p1, v1

    .line 64
    :cond_4
    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 68
    .line 69
    const-string v0, "llDetail"

    .line 70
    .line 71
    if-nez p1, :cond_5

    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    move-object p1, v1

    .line 77
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 84
    .line 85
    if-nez p0, :cond_6

    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_6
    move-object v1, p0

    .line 92
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_7
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 97
    .line 98
    if-nez p0, :cond_8

    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_8
    move-object v1, p0

    .line 105
    :goto_1
    const/16 p0, 0x8

    .line 106
    .line 107
    invoke-virtual {v1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public static final x(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "ivLevel2"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o:Landroid/widget/ImageView;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-string p1, "ivLevel3"

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v0

    .line 30
    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 34
    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    const-string p0, "gcvPaint"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v0, p0

    .line 44
    :goto_0
    const/high16 p0, 0x40400000    # 3.0f

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Lcom/friday/lecture/widget/GlobalCanvasView;->setPaintSize(F)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final y(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "ivLevel1"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o:Landroid/widget/ImageView;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-string p1, "ivLevel3"

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v0

    .line 30
    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 34
    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    const-string p0, "gcvPaint"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v0, p0

    .line 44
    :goto_0
    const/high16 p0, 0x41000000    # 8.0f

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Lcom/friday/lecture/widget/GlobalCanvasView;->setPaintSize(F)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final z(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "ivLevel2"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-string p1, "ivLevel1"

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v0

    .line 30
    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 34
    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    const-string p0, "gcvPaint"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v0, p0

    .line 44
    :goto_0
    const/high16 p0, 0x41700000    # 15.0f

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Lcom/friday/lecture/widget/GlobalCanvasView;->setPaintSize(F)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 8

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->h:Landroid/widget/ImageView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "ivFinger"

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object v1, v2

    .line 14
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 19
    .line 20
    const-string v4, "gcvPaint"

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v3, v2

    .line 28
    :cond_1
    invoke-virtual {v3}, Lcom/friday/lecture/widget/GlobalCanvasView;->getPaintSize()F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iget-object v5, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object v5, v2

    .line 40
    :cond_2
    invoke-virtual {v5}, Lcom/friday/lecture/widget/GlobalCanvasView;->getPaintColor()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 45
    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object v6, v2

    .line 52
    :cond_3
    invoke-virtual {v6}, Lcom/friday/lecture/widget/GlobalCanvasView;->getMode()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    iget-object v6, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 57
    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    const-string v6, "llDetail"

    .line 61
    .line 62
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    move-object v2, v6

    .line 67
    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_5

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    :goto_1
    move v7, v5

    .line 75
    move v5, v2

    .line 76
    move v2, v3

    .line 77
    move v3, v7

    .line 78
    goto :goto_2

    .line 79
    :cond_5
    const/4 v2, 0x0

    .line 80
    goto :goto_1

    .line 81
    :goto_2
    invoke-direct/range {v0 .. v5}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;-><init>(ZFIIZ)V

    .line 82
    .line 83
    .line 84
    const-string v1, "SimpleCanvasFingerMode"

    .line 85
    .line 86
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/CacheMemoryStaticUtils;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final B()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->getGcvPaintEntity()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->h:Landroid/widget/ImageView;

    .line 6
    .line 7
    const-string v2, "ivFinger"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v1, v3

    .line 16
    :cond_0
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->h:Landroid/widget/ImageView;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v1, v3

    .line 31
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput-boolean v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->e:Z

    .line 36
    .line 37
    sget v1, Lcom/friday/lecture/R$id;->fm_view:I

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lcom/friday/common/widget/TouchSwitchView;

    .line 44
    .line 45
    iget-boolean v2, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->e:Z

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lcom/friday/common/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/high16 v2, 0x40400000    # 3.0f

    .line 55
    .line 56
    cmpg-float v2, v1, v2

    .line 57
    .line 58
    const-string v4, "ivLevel3"

    .line 59
    .line 60
    const-string v5, "ivLevel2"

    .line 61
    .line 62
    const-string v6, "ivLevel1"

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    const/4 v8, 0x0

    .line 66
    if-nez v2, :cond_5

    .line 67
    .line 68
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 69
    .line 70
    if-nez v1, :cond_2

    .line 71
    .line 72
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    move-object v1, v3

    .line 76
    :cond_2
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n:Landroid/widget/ImageView;

    .line 80
    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    move-object v1, v3

    .line 87
    :cond_3
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o:Landroid/widget/ImageView;

    .line 91
    .line 92
    if-nez v1, :cond_4

    .line 93
    .line 94
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v1, v3

    .line 98
    :cond_4
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    const/high16 v2, 0x41000000    # 8.0f

    .line 103
    .line 104
    cmpg-float v2, v1, v2

    .line 105
    .line 106
    if-nez v2, :cond_9

    .line 107
    .line 108
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n:Landroid/widget/ImageView;

    .line 109
    .line 110
    if-nez v1, :cond_6

    .line 111
    .line 112
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move-object v1, v3

    .line 116
    :cond_6
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 120
    .line 121
    if-nez v1, :cond_7

    .line 122
    .line 123
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object v1, v3

    .line 127
    :cond_7
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 128
    .line 129
    .line 130
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o:Landroid/widget/ImageView;

    .line 131
    .line 132
    if-nez v1, :cond_8

    .line 133
    .line 134
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    move-object v1, v3

    .line 138
    :cond_8
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_9
    const/high16 v2, 0x41700000    # 15.0f

    .line 143
    .line 144
    cmpg-float v1, v1, v2

    .line 145
    .line 146
    if-nez v1, :cond_d

    .line 147
    .line 148
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o:Landroid/widget/ImageView;

    .line 149
    .line 150
    if-nez v1, :cond_a

    .line 151
    .line 152
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    move-object v1, v3

    .line 156
    :cond_a
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n:Landroid/widget/ImageView;

    .line 160
    .line 161
    if-nez v1, :cond_b

    .line 162
    .line 163
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    move-object v1, v3

    .line 167
    :cond_b
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 171
    .line 172
    if-nez v1, :cond_c

    .line 173
    .line 174
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    move-object v1, v3

    .line 178
    :cond_c
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 179
    .line 180
    .line 181
    :cond_d
    :goto_0
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 182
    .line 183
    const-string v2, "gcvPaint"

    .line 184
    .line 185
    if-nez v1, :cond_e

    .line 186
    .line 187
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    move-object v1, v3

    .line 191
    :cond_e
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d()F

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-virtual {v1, v4}, Lcom/friday/lecture/widget/GlobalCanvasView;->setPaintSize(F)V

    .line 196
    .line 197
    .line 198
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 199
    .line 200
    const-string v4, "paintColorAdapter"

    .line 201
    .line 202
    if-nez v1, :cond_f

    .line 203
    .line 204
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    move-object v1, v3

    .line 208
    :cond_f
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Ljava/lang/Iterable;

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :cond_10
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_12

    .line 223
    .line 224
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    check-cast v5, Lcom/friday/lecture/model/PaintColorEntity;

    .line 229
    .line 230
    invoke-virtual {v5, v8}, Lcom/friday/lecture/model/PaintColorEntity;->setSelected(Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Lcom/friday/lecture/model/PaintColorEntity;->getColor()I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c()I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-ne v6, v9, :cond_10

    .line 242
    .line 243
    invoke-virtual {v5, v7}, Lcom/friday/lecture/model/PaintColorEntity;->setSelected(Z)V

    .line 244
    .line 245
    .line 246
    iget-object v5, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 247
    .line 248
    if-nez v5, :cond_11

    .line 249
    .line 250
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    move-object v5, v3

    .line 254
    :cond_11
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c()I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    invoke-virtual {v5, v6}, Lcom/friday/lecture/widget/GlobalCanvasView;->setPaintColor(I)V

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_12
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 263
    .line 264
    if-nez v1, :cond_13

    .line 265
    .line 266
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    move-object v1, v3

    .line 270
    :cond_13
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 271
    .line 272
    .line 273
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 274
    .line 275
    if-nez v1, :cond_14

    .line 276
    .line 277
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    move-object v1, v3

    .line 281
    :cond_14
    invoke-virtual {v1, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->b()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    const-string v4, "ivScale"

    .line 289
    .line 290
    const-string v5, "ivEraser"

    .line 291
    .line 292
    const-string v6, "ivPencil"

    .line 293
    .line 294
    if-eqz v1, :cond_1f

    .line 295
    .line 296
    if-eq v1, v7, :cond_1a

    .line 297
    .line 298
    const/4 v9, 0x2

    .line 299
    if-eq v1, v9, :cond_15

    .line 300
    .line 301
    goto/16 :goto_2

    .line 302
    .line 303
    :cond_15
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 304
    .line 305
    if-nez v1, :cond_16

    .line 306
    .line 307
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    move-object v1, v3

    .line 311
    :cond_16
    invoke-virtual {v1, v9}, Lcom/friday/lecture/widget/GlobalCanvasView;->setMode(I)V

    .line 312
    .line 313
    .line 314
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 315
    .line 316
    if-nez v1, :cond_17

    .line 317
    .line 318
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    move-object v1, v3

    .line 322
    :cond_17
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 323
    .line 324
    .line 325
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 326
    .line 327
    if-nez v1, :cond_18

    .line 328
    .line 329
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    move-object v1, v3

    .line 333
    :cond_18
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 334
    .line 335
    .line 336
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 337
    .line 338
    if-nez v1, :cond_19

    .line 339
    .line 340
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    move-object v1, v3

    .line 344
    :cond_19
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_2

    .line 348
    .line 349
    :cond_1a
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 350
    .line 351
    if-nez v1, :cond_1b

    .line 352
    .line 353
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    move-object v1, v3

    .line 357
    :cond_1b
    invoke-virtual {v1, v7}, Lcom/friday/lecture/widget/GlobalCanvasView;->setMode(I)V

    .line 358
    .line 359
    .line 360
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 361
    .line 362
    if-nez v1, :cond_1c

    .line 363
    .line 364
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    move-object v1, v3

    .line 368
    :cond_1c
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 369
    .line 370
    .line 371
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 372
    .line 373
    if-nez v1, :cond_1d

    .line 374
    .line 375
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    move-object v1, v3

    .line 379
    :cond_1d
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 380
    .line 381
    .line 382
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 383
    .line 384
    if-nez v1, :cond_1e

    .line 385
    .line 386
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    move-object v1, v3

    .line 390
    :cond_1e
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 391
    .line 392
    .line 393
    goto :goto_2

    .line 394
    :cond_1f
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 395
    .line 396
    if-nez v1, :cond_20

    .line 397
    .line 398
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    move-object v1, v3

    .line 402
    :cond_20
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-nez v1, :cond_25

    .line 407
    .line 408
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 409
    .line 410
    if-nez v1, :cond_21

    .line 411
    .line 412
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    move-object v1, v3

    .line 416
    :cond_21
    invoke-virtual {v1, v8}, Lcom/friday/lecture/widget/GlobalCanvasView;->setMode(I)V

    .line 417
    .line 418
    .line 419
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 420
    .line 421
    if-nez v1, :cond_22

    .line 422
    .line 423
    invoke-static {v6}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    move-object v1, v3

    .line 427
    :cond_22
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 428
    .line 429
    .line 430
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 431
    .line 432
    if-nez v1, :cond_23

    .line 433
    .line 434
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    move-object v1, v3

    .line 438
    :cond_23
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 439
    .line 440
    .line 441
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 442
    .line 443
    if-nez v1, :cond_24

    .line 444
    .line 445
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    move-object v1, v3

    .line 449
    :cond_24
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 450
    .line 451
    .line 452
    :cond_25
    :goto_2
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 453
    .line 454
    if-nez v1, :cond_26

    .line 455
    .line 456
    const-string v1, "llDetail"

    .line 457
    .line 458
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    goto :goto_3

    .line 462
    :cond_26
    move-object v3, v1

    .line 463
    :goto_3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->e()Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_27

    .line 468
    .line 469
    goto :goto_4

    .line 470
    :cond_27
    const/16 v8, 0x8

    .line 471
    .line 472
    :goto_4
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 473
    .line 474
    .line 475
    return-void
.end method

.method public final n()V
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/friday/lecture/R$layout;->layout_simple_canvas:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    sget v0, Lcom/friday/lecture/R$id;->iv_picture:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "findViewById(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v0, Lcom/github/chrisbanes/photoview/PhotoView;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->l:Lcom/github/chrisbanes/photoview/PhotoView;

    .line 29
    .line 30
    sget v0, Lcom/friday/lecture/R$id;->gcv_paint:I

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v0, Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->j:Lcom/friday/lecture/widget/GlobalCanvasView;

    .line 42
    .line 43
    sget v0, Lcom/friday/lecture/R$id;->iv_pencil:I

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast v0, Landroid/widget/ImageView;

    .line 53
    .line 54
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 55
    .line 56
    sget v0, Lcom/friday/lecture/R$id;->iv_scale:I

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Landroid/widget/ImageView;

    .line 66
    .line 67
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 68
    .line 69
    sget v0, Lcom/friday/lecture/R$id;->iv_eraser:I

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    check-cast v0, Landroid/widget/ImageView;

    .line 79
    .line 80
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 81
    .line 82
    sget v0, Lcom/friday/lecture/R$id;->iv_delete:I

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Landroid/widget/ImageView;

    .line 89
    .line 90
    sget v3, Lcom/friday/lecture/R$id;->iv_close_simple_canvas:I

    .line 91
    .line 92
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Landroid/widget/ImageView;

    .line 97
    .line 98
    sget v4, Lcom/friday/lecture/R$id;->iv_finger:I

    .line 99
    .line 100
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    check-cast v4, Landroid/widget/ImageView;

    .line 108
    .line 109
    iput-object v4, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->h:Landroid/widget/ImageView;

    .line 110
    .line 111
    sget v4, Lcom/friday/lecture/R$id;->mBtnNegative:I

    .line 112
    .line 113
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Landroid/widget/Button;

    .line 118
    .line 119
    sget v5, Lcom/friday/lecture/R$id;->mBtnPositive:I

    .line 120
    .line 121
    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Landroid/widget/Button;

    .line 126
    .line 127
    sget v6, Lcom/friday/lecture/R$id;->layout_confirm:I

    .line 128
    .line 129
    invoke-virtual {p0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    sget v7, Lcom/friday/lecture/R$id;->cl_content:I

    .line 134
    .line 135
    invoke-virtual {p0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Lcom/friday/common/widget/TouchSwitchView;

    .line 140
    .line 141
    sget v8, Lcom/friday/lecture/R$id;->iv_level1:I

    .line 142
    .line 143
    invoke-virtual {p0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    check-cast v8, Landroid/widget/ImageView;

    .line 151
    .line 152
    iput-object v8, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 153
    .line 154
    sget v8, Lcom/friday/lecture/R$id;->iv_level2:I

    .line 155
    .line 156
    invoke-virtual {p0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    check-cast v8, Landroid/widget/ImageView;

    .line 164
    .line 165
    iput-object v8, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n:Landroid/widget/ImageView;

    .line 166
    .line 167
    sget v8, Lcom/friday/lecture/R$id;->iv_level3:I

    .line 168
    .line 169
    invoke-virtual {p0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    check-cast v8, Landroid/widget/ImageView;

    .line 177
    .line 178
    iput-object v8, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o:Landroid/widget/ImageView;

    .line 179
    .line 180
    sget v8, Lcom/friday/lecture/R$id;->ll_detail:I

    .line 181
    .line 182
    invoke-virtual {p0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iput-object v8, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k:Landroid/view/View;

    .line 190
    .line 191
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 192
    .line 193
    const-string v8, "ivPencil"

    .line 194
    .line 195
    if-nez v1, :cond_0

    .line 196
    .line 197
    invoke-static {v8}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    move-object v1, v2

    .line 201
    :cond_0
    const/4 v9, 0x1

    .line 202
    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 203
    .line 204
    .line 205
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 206
    .line 207
    const-string v10, "ivLevel1"

    .line 208
    .line 209
    if-nez v1, :cond_1

    .line 210
    .line 211
    invoke-static {v10}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    move-object v1, v2

    .line 215
    :cond_1
    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7, v9}, Lcom/friday/common/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 219
    .line 220
    .line 221
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 222
    .line 223
    const-string v11, "ivScale"

    .line 224
    .line 225
    if-nez v1, :cond_2

    .line 226
    .line 227
    invoke-static {v11}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    move-object v1, v2

    .line 231
    :cond_2
    new-instance v12, Le3/c;

    .line 232
    .line 233
    invoke-direct {v12, p0}, Le3/c;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 237
    .line 238
    .line 239
    iget-boolean v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->c:Z

    .line 240
    .line 241
    const/4 v12, 0x0

    .line 242
    if-eqz v1, :cond_4

    .line 243
    .line 244
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 245
    .line 246
    if-nez v1, :cond_3

    .line 247
    .line 248
    invoke-static {v11}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    move-object v1, v2

    .line 252
    :cond_3
    invoke-virtual {v1, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 253
    .line 254
    .line 255
    goto :goto_0

    .line 256
    :cond_4
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i:Landroid/widget/ImageView;

    .line 257
    .line 258
    if-nez v1, :cond_5

    .line 259
    .line 260
    invoke-static {v11}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    move-object v1, v2

    .line 264
    :cond_5
    const/16 v11, 0x8

    .line 265
    .line 266
    invoke-virtual {v1, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 267
    .line 268
    .line 269
    :goto_0
    new-instance v1, Le3/h;

    .line 270
    .line 271
    invoke-direct {v1, v6, v7}, Le3/h;-><init>(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    .line 276
    .line 277
    new-instance v1, Le3/i;

    .line 278
    .line 279
    invoke-direct {v1, p0, v7, v6}, Le3/i;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 283
    .line 284
    .line 285
    new-instance v1, Le3/j;

    .line 286
    .line 287
    invoke-direct {v1, p0}, Le3/j;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    .line 292
    .line 293
    new-instance v1, Le3/k;

    .line 294
    .line 295
    invoke-direct {v1, v6, v7}, Le3/k;-><init>(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 299
    .line 300
    .line 301
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->g:Landroid/widget/ImageView;

    .line 302
    .line 303
    if-nez v0, :cond_6

    .line 304
    .line 305
    const-string v0, "ivEraser"

    .line 306
    .line 307
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    move-object v0, v2

    .line 311
    :cond_6
    new-instance v1, Le3/l;

    .line 312
    .line 313
    invoke-direct {v1, p0}, Le3/l;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 317
    .line 318
    .line 319
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f:Landroid/widget/ImageView;

    .line 320
    .line 321
    if-nez v0, :cond_7

    .line 322
    .line 323
    invoke-static {v8}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    move-object v0, v2

    .line 327
    :cond_7
    new-instance v1, Le3/m;

    .line 328
    .line 329
    invoke-direct {v1, p0}, Le3/m;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->m:Landroid/widget/ImageView;

    .line 336
    .line 337
    if-nez v0, :cond_8

    .line 338
    .line 339
    invoke-static {v10}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    move-object v0, v2

    .line 343
    :cond_8
    new-instance v1, Le3/n;

    .line 344
    .line 345
    invoke-direct {v1, p0}, Le3/n;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 349
    .line 350
    .line 351
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->n:Landroid/widget/ImageView;

    .line 352
    .line 353
    if-nez v0, :cond_9

    .line 354
    .line 355
    const-string v0, "ivLevel2"

    .line 356
    .line 357
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    move-object v0, v2

    .line 361
    :cond_9
    new-instance v1, Le3/d;

    .line 362
    .line 363
    invoke-direct {v1, p0}, Le3/d;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    .line 368
    .line 369
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->o:Landroid/widget/ImageView;

    .line 370
    .line 371
    if-nez v0, :cond_a

    .line 372
    .line 373
    const-string v0, "ivLevel3"

    .line 374
    .line 375
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    move-object v0, v2

    .line 379
    :cond_a
    new-instance v1, Le3/e;

    .line 380
    .line 381
    invoke-direct {v1, p0}, Le3/e;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 385
    .line 386
    .line 387
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->h:Landroid/widget/ImageView;

    .line 388
    .line 389
    if-nez v0, :cond_b

    .line 390
    .line 391
    const-string v0, "ivFinger"

    .line 392
    .line 393
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    move-object v0, v2

    .line 397
    :cond_b
    new-instance v1, Le3/f;

    .line 398
    .line 399
    invoke-direct {v1, p0}, Le3/f;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 403
    .line 404
    .line 405
    sget v0, Lcom/friday/lecture/R$id;->rv_paint_color:I

    .line 406
    .line 407
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 412
    .line 413
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 414
    .line 415
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 423
    .line 424
    .line 425
    new-instance v1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$initView$12$1;

    .line 426
    .line 427
    invoke-direct {v1, v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$initView$12$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 431
    .line 432
    .line 433
    new-instance v1, Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 434
    .line 435
    sget v3, Lcom/friday/lecture/R$layout;->item_paint_color:I

    .line 436
    .line 437
    invoke-direct {v1, v3}, Lcom/friday/lecture/adapter/PaintColorAdapter;-><init>(I)V

    .line 438
    .line 439
    .line 440
    iput-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 441
    .line 442
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 443
    .line 444
    .line 445
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 446
    .line 447
    const-string v1, "paintColorAdapter"

    .line 448
    .line 449
    if-nez v0, :cond_c

    .line 450
    .line 451
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    move-object v0, v2

    .line 455
    :cond_c
    new-instance v3, Le3/g;

    .line 456
    .line 457
    invoke-direct {v3, p0}, Le3/g;-><init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 461
    .line 462
    .line 463
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->d:Lcom/friday/lecture/adapter/PaintColorAdapter;

    .line 464
    .line 465
    if-nez v0, :cond_d

    .line 466
    .line 467
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    move-object v0, v2

    .line 471
    :cond_d
    const-string v1, "#000000"

    .line 472
    .line 473
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    const-string v1, "#FF4931"

    .line 482
    .line 483
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    const-string v5, "#FFB82E"

    .line 492
    .line 493
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    const-string v6, "#40CA00"

    .line 502
    .line 503
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 504
    .line 505
    .line 506
    move-result v6

    .line 507
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    const-string v7, "#6581FF"

    .line 512
    .line 513
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    const-string v8, "#C649FF"

    .line 522
    .line 523
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object v8

    .line 531
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-static {v3}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    new-instance v4, Ljava/util/ArrayList;

    .line 540
    .line 541
    const/16 v5, 0xa

    .line 542
    .line 543
    invoke-static {v3, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 551
    .line 552
    .line 553
    move-result v5

    .line 554
    move v6, v12

    .line 555
    :goto_1
    if-ge v6, v5, :cond_f

    .line 556
    .line 557
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v7

    .line 561
    add-int/lit8 v6, v6, 0x1

    .line 562
    .line 563
    check-cast v7, Ljava/lang/Number;

    .line 564
    .line 565
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 570
    .line 571
    .line 572
    move-result v8

    .line 573
    if-ne v7, v8, :cond_e

    .line 574
    .line 575
    new-instance v8, Lcom/friday/lecture/model/PaintColorEntity;

    .line 576
    .line 577
    invoke-direct {v8, v7, v9}, Lcom/friday/lecture/model/PaintColorEntity;-><init>(IZ)V

    .line 578
    .line 579
    .line 580
    goto :goto_2

    .line 581
    :cond_e
    new-instance v8, Lcom/friday/lecture/model/PaintColorEntity;

    .line 582
    .line 583
    const/4 v10, 0x2

    .line 584
    invoke-direct {v8, v7, v12, v10, v2}, Lcom/friday/lecture/model/PaintColorEntity;-><init>(IZILkotlin/jvm/internal/n;)V

    .line 585
    .line 586
    .line 587
    :goto_2
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    goto :goto_1

    .line 591
    :cond_f
    invoke-static {v4}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    check-cast v1, Ljava/util/Collection;

    .line 596
    .line 597
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 598
    .line 599
    .line 600
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->B()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setImage(Ljava/lang/String;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->l:Lcom/github/chrisbanes/photoview/PhotoView;

    .line 4
    .line 5
    const-string v1, "image"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object v0, v2

    .line 14
    :cond_0
    const/4 v3, -0x1

    .line 15
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->l:Lcom/github/chrisbanes/photoview/PhotoView;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v2, v0

    .line 45
    :goto_0
    invoke-virtual {p1, v2}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-static {}, Lkotlinx/coroutines/d;->b()Lsd/i0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v3, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$setImage$1$1;

    .line 58
    .line 59
    invoke-direct {v3, p1, p0, v2}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$setImage$1$1;-><init>(Ljava/lang/String;Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lvc/c;)V

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x3

    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v1, 0x0

    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public final setOnClose(Lhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->p:Lhd/a;

    .line 2
    .line 3
    return-void
.end method
