.class public Lcom/xuexiang/xui/utils/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/utils/e$a;
    }
.end annotation


# static fields
.field public static g:Ljava/util/HashMap;


# instance fields
.field public c:Lcom/xuexiang/xui/utils/e$a;

.field public d:Landroid/view/View;

.field public e:Ljava/lang/Boolean;

.field public f:F


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
    sput-object v0, Lcom/xuexiang/xui/utils/e;->g:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Lcom/xuexiang/xui/utils/e$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/utils/e;->e:Ljava/lang/Boolean;

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v0, p0, Lcom/xuexiang/xui/utils/e;->f:F

    .line 10
    .line 11
    iput-object p2, p0, Lcom/xuexiang/xui/utils/e;->c:Lcom/xuexiang/xui/utils/e$a;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/utils/e;->d:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 31
    .line 32
    iput p1, p0, Lcom/xuexiang/xui/utils/e;->f:F

    .line 33
    .line 34
    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Lcom/xuexiang/xui/utils/e$a;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/xuexiang/xui/utils/e;->e(Lcom/xuexiang/xui/utils/e$a;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/xuexiang/xui/utils/e;->g:Ljava/util/HashMap;

    .line 5
    .line 6
    new-instance v1, Lcom/xuexiang/xui/utils/e;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/utils/e;-><init>(Landroid/view/ViewGroup;Lcom/xuexiang/xui/utils/e$a;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static b(Landroid/view/MotionEvent;Landroid/app/Dialog;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Dialog;->getCurrentFocus()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, p0}, Lcom/xuexiang/xui/utils/e;->d(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lcom/xuexiang/xui/utils/e;->c(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static c(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Ly7/b;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "input_method"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static d(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    instance-of v1, p0, Landroid/widget/EditText;

    .line 5
    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    filled-new-array {v0, v0}, [I

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 13
    .line 14
    .line 15
    aget v2, v1, v0

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aget v1, v1, v3

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    add-int/2addr v4, v1

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/2addr p0, v2

    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    int-to-float v2, v2

    .line 35
    cmpl-float v2, v5, v2

    .line 36
    .line 37
    if-lez v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-float p0, p0

    .line 44
    cmpg-float p0, v2, p0

    .line 45
    .line 46
    if-gez p0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    int-to-float v1, v1

    .line 53
    cmpl-float p0, p0, v1

    .line 54
    .line 55
    if-lez p0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-float p1, v4

    .line 62
    cmpg-float p0, p0, p1

    .line 63
    .line 64
    if-ltz p0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return v0

    .line 68
    :cond_1
    :goto_0
    return v3

    .line 69
    :cond_2
    return v0
.end method

.method public static e(Lcom/xuexiang/xui/utils/e$a;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/utils/e;->g:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lcom/xuexiang/xui/utils/e;->g:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/xuexiang/xui/utils/e;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/xuexiang/xui/utils/e;->f()V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/utils/e;->g:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method


# virtual methods
.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/utils/e;->c:Lcom/xuexiang/xui/utils/e$a;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/utils/e;->d:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onGlobalLayout()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/utils/e;->d:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/utils/e;->d:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 22
    .line 23
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 24
    .line 25
    sub-int/2addr v2, v0

    .line 26
    sub-int/2addr v1, v2

    .line 27
    int-to-float v0, v1

    .line 28
    iget v1, p0, Lcom/xuexiang/xui/utils/e;->f:F

    .line 29
    .line 30
    div-float/2addr v0, v1

    .line 31
    const/high16 v1, 0x43480000    # 200.0f

    .line 32
    .line 33
    cmpl-float v0, v0, v1

    .line 34
    .line 35
    if-lez v0, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/utils/e;->c:Lcom/xuexiang/xui/utils/e$a;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object v1, p0, Lcom/xuexiang/xui/utils/e;->e:Ljava/lang/Boolean;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eq v0, v1, :cond_2

    .line 53
    .line 54
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, Lcom/xuexiang/xui/utils/e;->e:Ljava/lang/Boolean;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/xuexiang/xui/utils/e;->c:Lcom/xuexiang/xui/utils/e$a;

    .line 61
    .line 62
    invoke-interface {v1, v0}, Lcom/xuexiang/xui/utils/e$a;->a(Z)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method
