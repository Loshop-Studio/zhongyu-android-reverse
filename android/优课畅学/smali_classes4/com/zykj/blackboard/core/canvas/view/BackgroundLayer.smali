.class public interface abstract Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
.end method

.method public abstract getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
.end method

.method public abstract getMyBackgroundColor()I
.end method

.method public abstract refresh()V
.end method

.method public abstract setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
.end method

.method public abstract setMatrix(Landroid/graphics/Matrix;)V
.end method

.method public abstract setMyBackgroundColor(I)V
.end method
