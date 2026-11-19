.class public Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation


# static fields
.field private static sSupplier:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/processing/concurrent/j;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/processing/concurrent/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor$Factory;->sSupplier:Lhd/q;

    .line 7
    .line 8
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

.method public static newInstance(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/LayoutSettings;)Landroidx/camera/core/processing/SurfaceProcessorInternal;
    .locals 1
    .param p0    # Landroidx/camera/core/DynamicRange;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/camera/core/LayoutSettings;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/core/LayoutSettings;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor$Factory;->sSupplier:Lhd/q;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1, p2}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/camera/core/processing/SurfaceProcessorInternal;

    .line 8
    .line 9
    return-object p0
.end method

.method public static setSupplier(Lhd/q;)V
    .locals 0
    .param p0    # Lhd/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    sput-object p0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor$Factory;->sSupplier:Lhd/q;

    .line 2
    .line 3
    return-void
.end method
