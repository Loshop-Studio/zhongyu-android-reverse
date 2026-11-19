.class public interface abstract Lcom/zykj/sketch/core/record/GraphOperation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/record/GraphOperation$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract addImage(Landroid/graphics/Bitmap;IILx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "II",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addImage(Landroid/graphics/Bitmap;Ljava/lang/String;IILx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "II",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addImage(Ljava/lang/String;IILx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addImage(Ljava/lang/String;Ljava/lang/String;IILx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addPPT(Ljava/lang/String;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract clear()V
.end method

.method public abstract getConfig()Lcom/zykj/sketch/core/config/SketchConfig;
.end method

.method public abstract getDrawArea()Landroid/graphics/RectF;
.end method

.method public abstract getRecordPath(Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getResList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract initConfig(Lcom/zykj/sketch/core/config/SketchConfig;ZLx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/config/SketchConfig;",
            "Z",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract isTouch()Z
.end method

.method public abstract limitThumbnail()Lcom/zykj/sketch/core/data/ThumbnailBean;
.end method

.method public abstract loadData(Ljava/lang/String;Lx7/l;Lx7/l;Lx7/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/l;",
            "Lx7/l;",
            "Lx7/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract next()V
.end method

.method public abstract prev()V
.end method

.method public abstract reset(Z)V
.end method

.method public abstract resetMatrix()V
.end method

.method public abstract save()V
.end method

.method public abstract setActionChangeListener(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V
.end method

.method public abstract setDrawArea(Landroid/graphics/RectF;)V
.end method

.method public abstract setGraphConfig(Lcom/zykj/sketch/core/config/GraphConfig;)V
.end method

.method public abstract setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V
.end method

.method public abstract setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V
.end method

.method public abstract setMode(Lcom/zykj/sketch/core/data/Mode;)V
.end method

.method public abstract setNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V
.end method

.method public abstract setSketchBackground(I)V
.end method

.method public abstract thumbnail()Landroid/graphics/Bitmap;
.end method

.method public abstract tranlation(Ljava/lang/Float;Ljava/lang/Float;Z)Z
.end method

.method public abstract zoom(FFFFZ)Z
.end method

.method public abstract zoomIn()Z
.end method

.method public abstract zoomOut()Z
.end method
