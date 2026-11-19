.class public final Lcom/xuexiang/xui/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# static fields
.field public static final e:Ljava/util/HashMap;


# instance fields
.field public a:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

.field public b:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

.field public c:Ljava/lang/Boolean;

.field public d:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/xuexiang/xui/utils/b;->e:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/utils/b;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/xuexiang/xui/utils/b;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-object v2, v1, Lcom/xuexiang/xui/utils/b;->a:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    .line 19
    .line 20
    iget-object v2, v1, Lcom/xuexiang/xui/utils/b;->b:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/utils/b;->b:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 20
    .line 21
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    sub-int/2addr v2, v0

    .line 24
    sub-int/2addr v1, v2

    .line 25
    int-to-float v0, v1

    .line 26
    iget v1, p0, Lcom/xuexiang/xui/utils/b;->d:F

    .line 27
    .line 28
    div-float/2addr v0, v1

    .line 29
    const/high16 v1, 0x43480000    # 200.0f

    .line 30
    .line 31
    cmpl-float v0, v0, v1

    .line 32
    .line 33
    if-lez v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/utils/b;->a:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Lcom/xuexiang/xui/utils/b;->c:Ljava/lang/Boolean;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eq v0, v1, :cond_3

    .line 51
    .line 52
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v1, p0, Lcom/xuexiang/xui/utils/b;->c:Ljava/lang/Boolean;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/xuexiang/xui/utils/b;->a:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    new-instance v0, Lv1/a;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, v2}, Lv1/a;-><init>(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;I)V

    .line 69
    .line 70
    .line 71
    iget v2, v1, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->c:I

    .line 72
    .line 73
    int-to-long v2, v2

    .line 74
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    new-instance v0, Lv1/a;

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-direct {v0, v1, v2}, Lv1/a;-><init>(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;I)V

    .line 82
    .line 83
    .line 84
    iget v2, v1, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->c:I

    .line 85
    .line 86
    int-to-long v2, v2

    .line 87
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 88
    .line 89
    .line 90
    :cond_3
    return-void
.end method
