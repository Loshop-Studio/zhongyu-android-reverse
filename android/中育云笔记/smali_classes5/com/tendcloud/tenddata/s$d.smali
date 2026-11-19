.class Lcom/tendcloud/tenddata/s$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lcom/tendcloud/tenddata/s$e;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final mCachedBitmap:Lcom/tendcloud/tenddata/s$a;

.field private final mClientDensity:I

.field private final mDisplayMetrics:Landroid/util/DisplayMetrics;

.field private mLiveActivities:Lcom/tendcloud/tenddata/g;

.field private final mRootViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/s$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa0

    .line 5
    .line 6
    iput v0, p0, Lcom/tendcloud/tenddata/s$d;->mClientDensity:I

    .line 7
    .line 8
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mRootViews:Ljava/util/List;

    .line 21
    .line 22
    new-instance v0, Lcom/tendcloud/tenddata/s$a;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/tendcloud/tenddata/s$a;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mCachedBitmap:Lcom/tendcloud/tenddata/s$a;

    .line 28
    .line 29
    return-void
.end method

.method private takeScreenshot(Lcom/tendcloud/tenddata/s$e;)V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/s$e;->rootView:Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    :try_start_1
    const-class v2, Landroid/view/View;

    .line 5
    .line 6
    const-string v3, "createSnapshot"

    .line 7
    .line 8
    const-class v4, Landroid/graphics/Bitmap$Config;

    .line 9
    .line 10
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 26
    .line 27
    const/4 v4, -0x1

    .line 28
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    const/4 v2, 0x0

    .line 46
    :goto_0
    if-nez v2, :cond_0

    .line 47
    .line 48
    :try_start_2
    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/e;->a(Landroid/view/View;Z)Landroid/graphics/Bitmap;

    .line 49
    .line 50
    .line 51
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    :catch_1
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    :try_start_3
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getDensity()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const/high16 v0, 0x43200000    # 160.0f

    .line 63
    .line 64
    int-to-float v1, v1

    .line 65
    div-float/2addr v0, v1

    .line 66
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    int-to-float v4, v4

    .line 79
    mul-float/2addr v4, v0

    .line 80
    float-to-double v4, v4

    .line 81
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    .line 82
    .line 83
    add-double/2addr v4, v6

    .line 84
    double-to-int v4, v4

    .line 85
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    int-to-float v5, v5

    .line 90
    mul-float/2addr v5, v0

    .line 91
    float-to-double v8, v5

    .line 92
    add-double/2addr v8, v6

    .line 93
    double-to-int v5, v8

    .line 94
    if-lez v1, :cond_2

    .line 95
    .line 96
    if-lez v3, :cond_2

    .line 97
    .line 98
    if-lez v4, :cond_2

    .line 99
    .line 100
    if-lez v5, :cond_2

    .line 101
    .line 102
    iget-object v1, p0, Lcom/tendcloud/tenddata/s$d;->mCachedBitmap:Lcom/tendcloud/tenddata/s$a;

    .line 103
    .line 104
    const/16 v3, 0xa0

    .line 105
    .line 106
    invoke-virtual {v1, v4, v5, v3, v2}, Lcom/tendcloud/tenddata/s$a;->recreate(IIILandroid/graphics/Bitmap;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    iput v0, p1, Lcom/tendcloud/tenddata/s$e;->scale:F

    .line 110
    .line 111
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mCachedBitmap:Lcom/tendcloud/tenddata/s$a;

    .line 112
    .line 113
    iput-object v0, p1, Lcom/tendcloud/tenddata/s$e;->screenshot:Lcom/tendcloud/tenddata/s$a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 114
    .line 115
    :catchall_0
    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/s$d;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/s$e;",
            ">;"
        }
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mRootViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mLiveActivities:Lcom/tendcloud/tenddata/g;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/g;->a()Ljava/util/Set;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    .line 8
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    iget-object v4, p0, Lcom/tendcloud/tenddata/s$d;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 9
    invoke-virtual {v1, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 10
    new-instance v1, Lcom/tendcloud/tenddata/s$e;

    invoke-direct {v1, v2, v3}, Lcom/tendcloud/tenddata/s$e;-><init>(Ljava/lang/String;Landroid/view/View;)V

    .line 11
    iget-object v2, p0, Lcom/tendcloud/tenddata/s$d;->mRootViews:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mRootViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    .line 13
    iget-object v2, p0, Lcom/tendcloud/tenddata/s$d;->mRootViews:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tendcloud/tenddata/s$e;

    .line 14
    invoke-direct {p0, v2}, Lcom/tendcloud/tenddata/s$d;->takeScreenshot(Lcom/tendcloud/tenddata/s$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 15
    :catchall_0
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$d;->mRootViews:Ljava/util/List;

    return-object v0
.end method

.method public findInActivities(Lcom/tendcloud/tenddata/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/s$d;->mLiveActivities:Lcom/tendcloud/tenddata/g;

    .line 2
    .line 3
    return-void
.end method
