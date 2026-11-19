.class public interface abstract Lcom/zykj/sketch/core/listener/IDraw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/listener/IDraw$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract onDraw(Landroid/graphics/Canvas;)V
.end method

.method public abstract onDrawComplete(Landroid/graphics/Canvas;Lhd/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Lhd/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract render(Landroid/graphics/Canvas;)V
.end method
