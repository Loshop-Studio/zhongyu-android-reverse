.class public Lcom/gyf/immersionbar/BarParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public autoNavigationBarDarkModeAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field public autoNavigationBarDarkModeEnable:Z

.field public autoStatusBarDarkModeAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field public autoStatusBarDarkModeEnable:Z

.field public barEnable:Z

.field public barHide:Lcom/gyf/immersionbar/BarHide;

.field public contentAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field public contentColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public contentColorTransform:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public defaultNavigationBarColor:I

.field public fits:Z

.field public fitsLayoutOverlapEnable:Z

.field public flymeOSStatusBarFontColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public flymeOSStatusBarFontTempColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public fullScreen:Z

.field public hideNavigationBar:Z

.field public isSupportActionBar:Z

.field public keyboardEnable:Z

.field public keyboardMode:I

.field public navigationBarAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field public navigationBarColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public navigationBarColorTransform:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public navigationBarDarkIcon:Z

.field public navigationBarEnable:Z

.field public navigationBarTempAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field public navigationBarWithEMUI3Enable:Z

.field public navigationBarWithKitkatEnable:Z

.field onBarListener:Lcom/gyf/immersionbar/OnBarListener;

.field onKeyboardListener:Lcom/gyf/immersionbar/OnKeyboardListener;

.field onNavigationBarListener:Lcom/gyf/immersionbar/OnNavigationBarListener;

.field public statusBarAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field public statusBarColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public statusBarColorEnabled:Z

.field public statusBarColorTransform:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public statusBarDarkFont:Z

.field public statusBarTempAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field public statusBarView:Landroid/view/View;

.field public titleBarView:Landroid/view/View;

.field public viewAlpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field viewMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/gyf/immersionbar/BarParams;->statusBarColor:I

    .line 6
    .line 7
    const/high16 v1, -0x1000000

    .line 8
    .line 9
    iput v1, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarColor:I

    .line 10
    .line 11
    iput v1, p0, Lcom/gyf/immersionbar/BarParams;->defaultNavigationBarColor:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->statusBarAlpha:F

    .line 15
    .line 16
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->statusBarTempAlpha:F

    .line 17
    .line 18
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarAlpha:F

    .line 19
    .line 20
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarTempAlpha:F

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->fullScreen:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->hideNavigationBar:Z

    .line 25
    .line 26
    sget-object v3, Lcom/gyf/immersionbar/BarHide;->FLAG_SHOW_BAR:Lcom/gyf/immersionbar/BarHide;

    .line 27
    .line 28
    iput-object v3, p0, Lcom/gyf/immersionbar/BarParams;->barHide:Lcom/gyf/immersionbar/BarHide;

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->statusBarDarkFont:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarDarkIcon:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->autoStatusBarDarkModeEnable:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->autoNavigationBarDarkModeEnable:Z

    .line 37
    .line 38
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->autoStatusBarDarkModeAlpha:F

    .line 39
    .line 40
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->autoNavigationBarDarkModeAlpha:F

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    iput-boolean v3, p0, Lcom/gyf/immersionbar/BarParams;->statusBarColorEnabled:Z

    .line 44
    .line 45
    iput v1, p0, Lcom/gyf/immersionbar/BarParams;->statusBarColorTransform:I

    .line 46
    .line 47
    iput v1, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarColorTransform:I

    .line 48
    .line 49
    new-instance v4, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v4, p0, Lcom/gyf/immersionbar/BarParams;->viewMap:Ljava/util/Map;

    .line 55
    .line 56
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->viewAlpha:F

    .line 57
    .line 58
    iput v0, p0, Lcom/gyf/immersionbar/BarParams;->contentColor:I

    .line 59
    .line 60
    iput v1, p0, Lcom/gyf/immersionbar/BarParams;->contentColorTransform:I

    .line 61
    .line 62
    iput v2, p0, Lcom/gyf/immersionbar/BarParams;->contentAlpha:F

    .line 63
    .line 64
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->fits:Z

    .line 65
    .line 66
    iput-boolean v3, p0, Lcom/gyf/immersionbar/BarParams;->fitsLayoutOverlapEnable:Z

    .line 67
    .line 68
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->isSupportActionBar:Z

    .line 69
    .line 70
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarParams;->keyboardEnable:Z

    .line 71
    .line 72
    const/16 v0, 0x12

    .line 73
    .line 74
    iput v0, p0, Lcom/gyf/immersionbar/BarParams;->keyboardMode:I

    .line 75
    .line 76
    iput-boolean v3, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarEnable:Z

    .line 77
    .line 78
    iput-boolean v3, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarWithKitkatEnable:Z

    .line 79
    .line 80
    iput-boolean v3, p0, Lcom/gyf/immersionbar/BarParams;->navigationBarWithEMUI3Enable:Z

    .line 81
    .line 82
    iput-boolean v3, p0, Lcom/gyf/immersionbar/BarParams;->barEnable:Z

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public clone()Lcom/gyf/immersionbar/BarParams;
    .locals 1

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/gyf/immersionbar/BarParams;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/gyf/immersionbar/BarParams;->clone()Lcom/gyf/immersionbar/BarParams;

    move-result-object v0

    return-object v0
.end method
