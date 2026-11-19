.class public interface abstract Landroidx/compose/ui/graphics/drawscope/DrawContext;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public getCanvas()Landroidx/compose/ui/graphics/Canvas;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/EmptyCanvas;->INSTANCE:Landroidx/compose/ui/graphics/drawscope/EmptyCanvas;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDensity()Landroidx/compose/ui/unit/Density;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/graphics/drawscope/DrawContextKt;->getDefaultDensity()Landroidx/compose/ui/unit/Density;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getGraphicsLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getSize-NH-jbRc()J
.end method

.method public abstract getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;
.end method

.method public setCanvas(Landroidx/compose/ui/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public setDensity(Landroidx/compose/ui/unit/Density;)V
    .locals 0

    return-void
.end method

.method public setGraphicsLayer(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 0

    return-void
.end method

.method public setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V
    .locals 0

    return-void
.end method

.method public abstract setSize-uvyYCjk(J)V
.end method
