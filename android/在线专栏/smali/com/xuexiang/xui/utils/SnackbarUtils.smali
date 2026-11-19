.class public Lcom/xuexiang/xui/utils/SnackbarUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "SnackbarUtils"

.field private static mSnackbarWeakRef:Ljava/lang/ref/WeakReference; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/material/snackbar/Snackbar;",
            ">;"
        }
    .end annotation
.end field

.field private static sColorConfirm:I = -0xb34fb2

.field private static sColorDanger:I = -0xbbcca

.field private static sColorInfo:I = -0xd6611d

.field private static sColorWarning:I = -0x13ffb


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/material/snackbar/Snackbar;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object p1, Lcom/xuexiang/xui/utils/SnackbarUtils;->mSnackbarWeakRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static Custom(Landroid/view/View;Ljava/lang/String;I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/utils/SnackbarUtils;

    new-instance v1, Ljava/lang/ref/WeakReference;

    const/4 v2, -0x1

    invoke-static {p0, p1, v2}, Lcom/google/android/material/snackbar/Snackbar;->make(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->setDuration(I)Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/utils/SnackbarUtils;-><init>(Ljava/lang/ref/WeakReference;)V

    const p0, -0xcdcdce

    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->backColor(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p0

    return-object p0
.end method

.method public static Indefinite(Landroid/view/View;Ljava/lang/String;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/utils/SnackbarUtils;

    new-instance v1, Ljava/lang/ref/WeakReference;

    const/4 v2, -0x2

    invoke-static {p0, p1, v2}, Lcom/google/android/material/snackbar/Snackbar;->make(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/utils/SnackbarUtils;-><init>(Ljava/lang/ref/WeakReference;)V

    const p0, -0xcdcdce

    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->backColor(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p0

    return-object p0
.end method

.method public static Long(Landroid/view/View;Ljava/lang/String;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/utils/SnackbarUtils;

    new-instance v1, Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    invoke-static {p0, p1, v2}, Lcom/google/android/material/snackbar/Snackbar;->make(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/utils/SnackbarUtils;-><init>(Ljava/lang/ref/WeakReference;)V

    const p0, -0xcdcdce

    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->backColor(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p0

    return-object p0
.end method

.method public static Short(Landroid/view/View;Ljava/lang/String;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/utils/SnackbarUtils;

    new-instance v1, Ljava/lang/ref/WeakReference;

    const/4 v2, -0x1

    invoke-static {p0, p1, v2}, Lcom/google/android/material/snackbar/Snackbar;->make(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/utils/SnackbarUtils;-><init>(Ljava/lang/ref/WeakReference;)V

    const p0, -0xcdcdce

    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->backColor(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p0

    return-object p0
.end method

.method private calculateSnackBarHeight()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41e00000    # 28.0f

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41600000    # 14.0f

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->sp2px(Landroid/content/Context;F)I

    move-result v1

    add-int/2addr v0, v1

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u76f4\u63a5\u83b7\u53d6MessageView\u9ad8\u5ea6:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$id;->snackbar_text:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SnackbarUtils"

    invoke-static {v2, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method private getRadiusDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroid/graphics/drawable/GradientDrawable;

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p1

    .line 5
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 6
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static setColorConfirm(I)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorConfirm:I

    return-void
.end method

.method public static setColorDanger(I)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorDanger:I

    return-void
.end method

.method public static setColorInfo(I)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorInfo:I

    return-void
.end method

.method public static setColorWarning(I)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorWarning:I

    return-void
.end method


# virtual methods
.method public above(Landroid/view/View;III)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 3
    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 4
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8ddd\u79bb\u5c4f\u5e55\u5de6\u4fa7:"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v2, v1, v0

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "==\u8ddd\u79bb\u5c4f\u5e55\u9876\u90e8:"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    aget v3, v1, v2

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "SnackbarUtils"

    invoke-static {v3, p1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->calculateSnackBarHeight()I

    move-result p1

    .line 7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Snackbar\u9ad8\u5ea6:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    aget v3, v1, v2

    add-int/2addr p2, p1

    if-lt v3, p2, :cond_0

    const/16 p1, 0x50

    .line 8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/utils/SnackbarUtils;->gravityFrameLayout(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 10
    move-object p2, p1

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    aget v1, v1, v2

    sub-int/2addr v3, v1

    invoke-virtual {p2, p3, v0, p4, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public aboveCoordinatorLayout(Landroid/view/View;III)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 3
    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 4
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8ddd\u79bb\u5c4f\u5e55\u5de6\u4fa7:"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v2, v1, v0

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "==\u8ddd\u79bb\u5c4f\u5e55\u9876\u90e8:"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    aget v3, v1, v2

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "SnackbarUtils"

    invoke-static {v3, p1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->calculateSnackBarHeight()I

    move-result p1

    .line 7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Snackbar\u9ad8\u5ea6:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    aget v3, v1, v2

    add-int/2addr p2, p1

    if-lt v3, p2, :cond_0

    const/16 p1, 0x50

    .line 8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/utils/SnackbarUtils;->gravityCoordinatorLayout(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 10
    move-object p2, p1

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    aget v1, v1, v2

    sub-int/2addr v3, v1

    invoke-virtual {p2, p3, v0, p4, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public actionColor(I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$id;->snackbar_action:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public addView(II)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/utils/SnackbarUtils;->addView(Landroid/view/View;I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public addView(Landroid/view/View;I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x10

    .line 6
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/snackbar/Snackbar$SnackbarLayout;

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 10
    invoke-virtual {v0, p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    :cond_0
    return-object p0
.end method

.method public alpha(F)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    return-object p0
.end method

.method public backColor(I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-object p0
.end method

.method public bellow(Landroid/view/View;III)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 3
    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 4
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->calculateSnackBarHeight()I

    move-result v3

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/xuexiang/xui/utils/Utils;->getScreenHeight(Landroid/content/Context;)I

    move-result v4

    const/4 v5, 0x1

    aget v6, v2, v5

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v7

    add-int/2addr v6, v7

    if-lt v6, p2, :cond_0

    aget p2, v2, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr p2, v6

    add-int/2addr p2, v3

    add-int/2addr p2, v1

    if-gt p2, v4, :cond_0

    const/16 p2, 0x50

    .line 8
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/utils/SnackbarUtils;->gravityFrameLayout(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 10
    move-object v6, p2

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    aget v2, v2, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v2, p1

    add-int/2addr v2, v3

    add-int/2addr v2, v1

    sub-int/2addr v4, v2

    invoke-virtual {v6, p3, v0, p4, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public bellowCoordinatorLayout(Landroid/view/View;III)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 3
    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 4
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->calculateSnackBarHeight()I

    move-result v3

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/xuexiang/xui/utils/Utils;->getScreenHeight(Landroid/content/Context;)I

    move-result v4

    const/4 v5, 0x1

    aget v6, v2, v5

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v7

    add-int/2addr v6, v7

    if-lt v6, p2, :cond_0

    aget p2, v2, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr p2, v6

    add-int/2addr p2, v3

    add-int/2addr p2, v1

    if-gt p2, v4, :cond_0

    const/16 p2, 0x50

    .line 8
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/utils/SnackbarUtils;->gravityCoordinatorLayout(I)Lcom/xuexiang/xui/utils/SnackbarUtils;

    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 10
    move-object v6, p2

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    aget v2, v2, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v2, p1

    add-int/2addr v2, v3

    add-int/2addr v2, v1

    sub-int/2addr v4, v2

    invoke-virtual {v6, p3, v0, p4, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public colors(III)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$id;->snackbar_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    sget p2, Lcom/xuexiang/xui/R$id;->snackbar_action:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public confirm()Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorConfirm:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-object p0
.end method

.method public danger()Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorDanger:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-object p0
.end method

.method public getSnackbar()Lcom/google/android/material/snackbar/Snackbar;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/utils/SnackbarUtils;->mSnackbarWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/xuexiang/xui/utils/SnackbarUtils;->mSnackbarWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/snackbar/Snackbar;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public gravityCoordinatorLayout(I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v0, v1, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;-><init>(II)V

    .line 3
    iput p1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public gravityFrameLayout(I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 3
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public info()Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorInfo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-object p0
.end method

.method public leftAndRightDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 5

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$id;->snackbar_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 7
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v4, 0x0

    invoke-direct {v2, v3, v1, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 9
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 11
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v1

    float-to-int v1, v1

    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "textSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SnackbarUtils"

    invoke-static {v3, v2}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1, v2, v2, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    if-eqz p2, :cond_1

    .line 14
    invoke-virtual {p2, v2, v2, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_1
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, p1, v1, p2, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 16
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, -0x2

    invoke-direct {p1, v0, v0, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/snackbar/Snackbar$SnackbarLayout;

    new-instance v0, Landroid/widget/Space;

    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-object p0
.end method

.method public leftAndRightDrawable(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p2, :cond_1

    .line 3
    :try_start_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 4
    :catch_1
    :cond_1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->leftAndRightDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p1

    return-object p1

    :cond_2
    return-object p0
.end method

.method public margins(I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/xuexiang/xui/utils/SnackbarUtils;->margins(IIII)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public margins(IIII)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 5
    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public messageCenter()Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$id;->snackbar_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextAlignment(I)V

    const/16 v1, 0x11

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    :cond_0
    return-object p0
.end method

.method public messageColor(I)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$id;->snackbar_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public messageRight()Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$id;->snackbar_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextAlignment(I)V

    const/16 v1, 0x15

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    :cond_0
    return-object p0
.end method

.method public radius(F)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getRadiusDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_0

    const/high16 p1, 0x41400000    # 12.0f

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-object p0
.end method

.method public radius(III)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 3

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getRadiusDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    if-eqz v0, :cond_3

    if-gtz p1, :cond_0

    const/16 p1, 0xc

    :cond_0
    if-gtz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$id;->snackbar_text:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    if-lt p2, v1, :cond_2

    const/4 p2, 0x2

    :cond_2
    :goto_0
    int-to-float p1, p1

    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 9
    invoke-virtual {v0, p2, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 10
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return-object p0
.end method

.method public setAction(ILandroid/view/View$OnClickListener;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/utils/SnackbarUtils;->setAction(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/utils/SnackbarUtils;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public setAction(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/material/snackbar/Snackbar;->setAction(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    :cond_0
    return-object p0
.end method

.method public setCallback(Lcom/google/android/material/snackbar/Snackbar$Callback;)Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/snackbar/Snackbar;->setCallback(Lcom/google/android/material/snackbar/Snackbar$Callback;)Lcom/google/android/material/snackbar/Snackbar;

    :cond_0
    return-object p0
.end method

.method public show()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/Snackbar;->show()V

    goto :goto_0

    :cond_0
    const-string v0, "SnackbarUtils"

    const-string v1, "\u5df2\u7ecf\u88ab\u56de\u6536"

    .line 3
    invoke-static {v0, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public warning()Lcom/xuexiang/xui/utils/SnackbarUtils;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/SnackbarUtils;->getSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/utils/SnackbarUtils;->sColorWarning:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-object p0
.end method
