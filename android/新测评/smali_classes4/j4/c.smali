.class public final Lj4/c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

.field public final b:Ll4/e;

.field public final c:Ll4/b;

.field public final d:Ll4/i;

.field public e:Lcom/zykj/blackboard/core/play/PlayControl;

.field public f:Ljava/util/Map;


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
    iput-object v0, p0, Lj4/c;->f:Ljava/util/Map;

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
    iput-object v1, p0, Lj4/c;->a:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

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
    iput-object p1, p0, Lj4/c;->b:Ll4/e;

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
    iput-object p2, p0, Lj4/c;->c:Ll4/b;

    .line 48
    .line 49
    new-instance v7, Ll4/i;

    .line 50
    .line 51
    invoke-direct/range {v7 .. v12}, Ll4/i;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    .line 54
    iput-object v7, p0, Lj4/c;->d:Ll4/i;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static synthetic a(Lj4/c;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/c;->c(Lj4/c;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final c(Lj4/c;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Le5/c;->a:Le5/c;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "context"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Le5/c;->c(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/core/play/PlayControl;

    .line 26
    .line 27
    new-instance v1, Ll4/j;

    .line 28
    .line 29
    iget-object v2, p0, Lj4/c;->a:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 30
    .line 31
    iget-object v3, p0, Lj4/c;->b:Ll4/e;

    .line 32
    .line 33
    iget-object v4, p0, Lj4/c;->c:Ll4/b;

    .line 34
    .line 35
    iget-object v5, p0, Lj4/c;->d:Ll4/i;

    .line 36
    .line 37
    invoke-direct {v1, v2, v3, v4, v5}, Ll4/j;-><init>(Ll4/c;Ll4/d;Ll4/a;Ll4/f;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;-><init>(Ll4/j;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lj4/c;->e:Lcom/zykj/blackboard/core/play/PlayControl;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final b(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj4/c;->b:Ll4/e;

    .line 7
    .line 8
    new-instance v1, Lj4/b;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lj4/b;-><init>(Lj4/c;Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj4/c;->e:Lcom/zykj/blackboard/core/play/PlayControl;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/PlayControl;->n()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lj4/c;->e:Lcom/zykj/blackboard/core/play/PlayControl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/PlayControl;->a()Lw4/m;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lw4/m;->a(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method
