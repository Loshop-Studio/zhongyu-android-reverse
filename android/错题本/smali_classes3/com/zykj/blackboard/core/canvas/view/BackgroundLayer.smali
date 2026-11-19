.class public interface abstract Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;",
        "",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/graphics/Matrix;",
        "matrix",
        "Ld6/s;",
        "drawBackground",
        "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V",
        "refresh",
        "()V",
        "adapterMatrix",
        "setMatrix",
        "(Landroid/graphics/Matrix;)V",
        "",
        "color",
        "setMyBackgroundColor",
        "(I)V",
        "getMyBackgroundColor",
        "()I",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "backgroundLineConfig",
        "setBackgroundLineConfig",
        "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V",
        "getBackgroundLineConfig",
        "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMyBackgroundColor()I
.end method

.method public abstract refresh()V
.end method

.method public abstract setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .param p1    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setMatrix(Landroid/graphics/Matrix;)V
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setMyBackgroundColor(I)V
.end method
