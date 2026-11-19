.class public final synthetic Landroidx/camera/core/processing/concurrent/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    check-cast p1, Landroidx/camera/core/DynamicRange;

    check-cast p2, Landroidx/camera/core/LayoutSettings;

    check-cast p3, Landroidx/camera/core/LayoutSettings;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;-><init>(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/LayoutSettings;)V

    return-object v0
.end method
