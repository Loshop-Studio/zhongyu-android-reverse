.class public final Lcom/zykj/blackboard/core/canvas/SketchRecorderView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final c:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

.field public final d:Lcom/zykj/blackboard/core/canvas/view/FixView;

.field public final e:Lcom/zykj/blackboard/core/canvas/view/ActiveView;

.field public final f:Lcom/zykj/blackboard/core/canvas/view/MaskView;

.field public final g:Lw9/h;

.field public h:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public i:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->i:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 24
    .line 25
    .line 26
    move-object v8, v2

    .line 27
    move-object v9, v3

    .line 28
    iput-object v1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->c:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 29
    .line 30
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 31
    .line 32
    const/4 v11, 0x4

    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/FixView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 36
    .line 37
    .line 38
    move-object p1, v7

    .line 39
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->d:Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 40
    .line 41
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/ActiveView;

    .line 42
    .line 43
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/ActiveView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 44
    .line 45
    .line 46
    move-object p2, v7

    .line 47
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->e:Lcom/zykj/blackboard/core/canvas/view/ActiveView;

    .line 48
    .line 49
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/MaskView;

    .line 50
    .line 51
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/MaskView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 52
    .line 53
    .line 54
    iput-object v7, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->f:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    .line 55
    .line 56
    new-instance v0, Lw9/h;

    .line 57
    .line 58
    invoke-direct {v0, v1, p1, p2, v7}, Lw9/h;-><init>(Lw9/b;Lw9/c;Lw9/a;Lw9/e;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->g:Lw9/h;

    .line 62
    .line 63
    sget-object v0, Lna/d;->a:Lna/d;

    .line 64
    .line 65
    invoke-virtual {v0, v8}, Lna/d;->g(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lna/a;->a:Lna/a;

    .line 69
    .line 70
    invoke-virtual {v0, v8}, Lna/a;->b(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lhd/q;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->c(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lhd/q;Lhd/l;)V

    return-void
.end method

.method public static final c(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lhd/q;Lhd/l;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$dirPath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$success"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$error"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->g:Lw9/h;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;-><init>(IILw9/h;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "[SketchRecorderView]:ready -> dirPath:"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", w:"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, ", h:"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, Lna/h;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v4, "context"

    .line 95
    .line 96
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v2, v3}, Lna/h;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, Lq9/b;->l0(Lma/j;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;

    .line 106
    .line 107
    invoke-direct {v1, p0, p2, v0}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lhd/q;Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 108
    .line 109
    .line 110
    new-instance p2, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$2;

    .line 111
    .line 112
    invoke-direct {p2, p0, p3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$2;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lhd/l;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p1, v1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->t(Ljava/lang/String;Lhd/p;Lhd/l;)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->h:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lhd/q;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "success"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->d:Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 17
    .line 18
    new-instance v1, Lu9/c;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p2, p3}, Lu9/c;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lhd/q;Lhd/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->h:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->x()V

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lna/i;->a:Lna/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Lna/i;->a()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->h:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->b()Ly9/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ly9/n;->a(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method
