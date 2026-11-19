.class final Landroidx/compose/ui/text/android/CanvasCompatR;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1e
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/text/android/CanvasCompatR;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/android/CanvasCompatR;

    invoke-direct {v0}, Landroidx/compose/ui/text/android/CanvasCompatR;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/android/CanvasCompatR;->INSTANCE:Landroidx/compose/ui/text/android/CanvasCompatR;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final quickReject(Landroid/graphics/Canvas;FFFF)Z
    .locals 0

    .line 3
    invoke-static {p1, p2, p3, p4, p5}, Landroidx/compose/ui/text/android/t;->a(Landroid/graphics/Canvas;FFFF)Z

    move-result p1

    return p1
.end method

.method public final quickReject(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
    .locals 0

    .line 2
    invoke-static {p1, p2}, Landroidx/compose/ui/text/android/v;->a(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z

    move-result p1

    return p1
.end method

.method public final quickReject(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/text/android/u;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z

    move-result p1

    return p1
.end method
