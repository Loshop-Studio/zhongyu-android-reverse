.class public interface abstract Lcom/zykj/merge/sketch/listener/MoveProxy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/merge/sketch/listener/MoveProxy$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
.end method

.method public abstract areaMoveStart()V
.end method

.method public abstract areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
.end method

.method public abstract getCurrentScreenBitmap()Landroid/graphics/Bitmap;
.end method

.method public abstract getMoveHorizontalProgress()F
.end method

.method public abstract getMoveMaxHeightTimes()I
.end method

.method public abstract getMoveMaxWidthTimes()I
.end method

.method public abstract getMoveVerticalProgress()F
.end method

.method public abstract setAreaMoveListener(Lma/d;)V
.end method

.method public abstract setScaleEnable(Z)V
.end method

.method public abstract setTranslateEnable(Z)V
.end method
