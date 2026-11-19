.class final Landroidx/compose/ui/graphics/AndroidGraphicsContext;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/graphics/GraphicsContext;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;,
        Landroidx/compose/ui/graphics/AndroidGraphicsContext$UniqueDrawingIdApi29;
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;

.field public static final enableLayerPersistence:Z = false

.field private static isRenderNodeCompatible:Z


# instance fields
.field private final componentCallback:Landroid/content/ComponentCallbacks2;

.field private componentCallbackRegistered:Z

.field private final layerManager:Landroidx/compose/ui/graphics/layer/LayerManager;

.field private final lock:Ljava/lang/Object;

.field private final ownerView:Landroid/view/ViewGroup;

.field private predrawListenerRegistered:Z

.field private viewLayerContainer:Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->Companion:Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sput-boolean v0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->isRenderNodeCompatible:Z

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->ownerView:Landroid/view/ViewGroup;

    .line 5
    .line 6
    new-instance p1, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->layerManager:Landroidx/compose/ui/graphics/layer/LayerManager;

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->componentCallback:Landroid/content/ComponentCallbacks2;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getLayerManager$p(Landroidx/compose/ui/graphics/AndroidGraphicsContext;)Landroidx/compose/ui/graphics/layer/LayerManager;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->layerManager:Landroidx/compose/ui/graphics/layer/LayerManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getOwnerView$p(Landroidx/compose/ui/graphics/AndroidGraphicsContext;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->ownerView:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPredrawListenerRegistered$p(Landroidx/compose/ui/graphics/AndroidGraphicsContext;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->predrawListenerRegistered:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$isRenderNodeCompatible$cp()Z
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->isRenderNodeCompatible:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$registerComponentCallback(Landroidx/compose/ui/graphics/AndroidGraphicsContext;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->registerComponentCallback(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setPredrawListenerRegistered$p(Landroidx/compose/ui/graphics/AndroidGraphicsContext;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->predrawListenerRegistered:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setRenderNodeCompatible$cp(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->isRenderNodeCompatible:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$unregisterComponentCallback(Landroidx/compose/ui/graphics/AndroidGraphicsContext;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->unregisterComponentCallback(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getUniqueDrawingId(Landroid/view/View;)J
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/compose/ui/graphics/AndroidGraphicsContext$UniqueDrawingIdApi29;->getUniqueDrawingId(Landroid/view/View;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    return-wide v0
.end method

.method private final obtainViewLayerContainer(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->viewLayerContainer:Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Landroidx/compose/ui/graphics/layer/view/ViewLayerContainer;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroidx/compose/ui/graphics/layer/view/ViewLayerContainer;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->viewLayerContainer:Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    return-object v0
.end method

.method private final registerComponentCallback(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->componentCallbackRegistered:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->componentCallback:Landroid/content/ComponentCallbacks2;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->componentCallbackRegistered:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private final unregisterComponentCallback(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->componentCallbackRegistered:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->componentCallback:Landroid/content/ComponentCallbacks2;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->componentCallbackRegistered:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public createGraphicsLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .locals 10

    .line 1
    iget-object v1, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->ownerView:Landroid/view/ViewGroup;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->getUniqueDrawingId(Landroid/view/View;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v4

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1d

    .line 13
    .line 14
    if-lt v0, v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Landroidx/compose/ui/graphics/layer/GraphicsLayerV29;

    .line 17
    .line 18
    const/4 v7, 0x6

    .line 19
    const/4 v8, 0x0

    .line 20
    move-wide v3, v4

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-direct/range {v2 .. v8}, Landroidx/compose/ui/graphics/layer/GraphicsLayerV29;-><init>(JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;ILkotlin/jvm/internal/n;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sget-boolean v0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->isRenderNodeCompatible:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :try_start_1
    new-instance v2, Landroidx/compose/ui/graphics/layer/GraphicsLayerV23;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->ownerView:Landroid/view/ViewGroup;

    .line 36
    .line 37
    const/16 v8, 0xc

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-direct/range {v2 .. v9}, Landroidx/compose/ui/graphics/layer/GraphicsLayerV23;-><init>(Landroid/view/View;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;ILkotlin/jvm/internal/n;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    const/4 v0, 0x0

    .line 47
    :try_start_2
    sput-boolean v0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->isRenderNodeCompatible:Z

    .line 48
    .line 49
    new-instance v2, Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;

    .line 50
    .line 51
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->ownerView:Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->obtainViewLayerContainer(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const/16 v8, 0xc

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-direct/range {v2 .. v9}, Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;-><init>(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;ILkotlin/jvm/internal/n;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v2, Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;

    .line 67
    .line 68
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->ownerView:Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->obtainViewLayerContainer(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const/16 v8, 0xc

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-direct/range {v2 .. v9}, Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;-><init>(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;ILkotlin/jvm/internal/n;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    new-instance v0, Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 83
    .line 84
    iget-object v3, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->layerManager:Landroidx/compose/ui/graphics/layer/LayerManager;

    .line 85
    .line 86
    invoke-direct {v0, v2, v3}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;-><init>(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    .line 88
    .line 89
    monitor-exit v1

    .line 90
    return-object v0

    .line 91
    :goto_1
    monitor-exit v1

    .line 92
    throw v0
.end method

.method public final isLayerManagerInitialized()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->layerManager:Landroidx/compose/ui/graphics/layer/LayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/layer/LayerManager;->hasImageReader()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public releaseGraphicsLayer(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidGraphicsContext;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->release$ui_graphics_release()V

    .line 5
    .line 6
    .line 7
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0

    .line 13
    throw p1
.end method
