.class public final Lcom/zykj/blackboard/core/canvas/SketchRecorderView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0017\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJI\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100\u00a8\u00062"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/canvas/SketchRecorderView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "",
        "dirPath",
        "Lkotlin/Function3;",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "",
        "",
        "success",
        "Lkotlin/Function1;",
        "",
        "error",
        "b",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V",
        "onDetachedFromWindow",
        "()V",
        "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;",
        "a",
        "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;",
        "backgroundLayer",
        "Ll4/e;",
        "Ll4/e;",
        "fixLayer",
        "Ll4/b;",
        "c",
        "Ll4/b;",
        "activeLayer",
        "Ll4/i;",
        "d",
        "Ll4/i;",
        "maskLayer",
        "Ll4/j;",
        "e",
        "Ll4/j;",
        "renderLayer",
        "Lcom/zykj/blackboard/core/edit/BoardControl;",
        "f",
        "Lcom/zykj/blackboard/core/edit/BoardControl;",
        "boardControl",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

.field public final b:Ll4/e;

.field public final c:Ll4/b;

.field public final d:Ll4/i;

.field public final e:Ll4/j;

.field public f:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public g:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->g:Ljava/util/Map;

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
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    .line 25
    .line 26
    move-object v8, v2

    .line 27
    move-object v9, v3

    .line 28
    iput-object v1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->a:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 29
    .line 30
    new-instance v7, Ll4/e;

    .line 31
    .line 32
    const/4 v11, 0x4

    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-direct/range {v7 .. v12}, Ll4/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    move-object p1, v7

    .line 39
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->b:Ll4/e;

    .line 40
    .line 41
    new-instance v7, Ll4/b;

    .line 42
    .line 43
    invoke-direct/range {v7 .. v12}, Ll4/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    .line 46
    move-object p2, v7

    .line 47
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->c:Ll4/b;

    .line 48
    .line 49
    new-instance v7, Ll4/i;

    .line 50
    .line 51
    invoke-direct/range {v7 .. v12}, Ll4/i;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    .line 54
    iput-object v7, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->d:Ll4/i;

    .line 55
    .line 56
    new-instance v0, Ll4/j;

    .line 57
    .line 58
    invoke-direct {v0, v1, p1, p2, v7}, Ll4/j;-><init>(Ll4/c;Ll4/d;Ll4/a;Ll4/f;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->e:Ll4/j;

    .line 62
    .line 63
    sget-object v0, Le5/c;->a:Le5/c;

    .line 64
    .line 65
    invoke-virtual {v0, v8}, Le5/c;->c(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Le5/a;->a:Le5/a;

    .line 69
    .line 70
    invoke-virtual {v0, v8}, Le5/a;->a(Landroid/content/Context;)V

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

.method public static synthetic a(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->c(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final c(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$dirPath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$success"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$error"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->e:Ll4/j;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;-><init>(IILl4/j;)V

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, Le5/g;

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
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v2, v3}, Le5/g;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setTextEditView(Ld5/c;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;

    .line 106
    .line 107
    invoke-direct {v1, p0, p2, v0}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 108
    .line 109
    .line 110
    new-instance p2, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$2;

    .line 111
    .line 112
    invoke-direct {p2, p0, p3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$2;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lkotlin/jvm/functions/Function1;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p1, v1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->f:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "success"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->b:Ll4/e;

    .line 17
    .line 18
    new-instance v1, Lj4/d;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p2, p3}, Lj4/d;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->f:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->p()V

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Le5/h;->a:Le5/h;

    .line 12
    .line 13
    invoke-virtual {v0}, Le5/h;->a()V

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->f:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->a()Ln4/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ln4/i;->a(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method
