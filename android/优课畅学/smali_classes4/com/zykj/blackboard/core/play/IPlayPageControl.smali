.class public interface abstract Lcom/zykj/blackboard/core/play/IPlayPageControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/play/IEditPlayPageControl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/play/IPlayPageControl$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract addPlayActionListener(Lcom/zykj/blackboard/listener/PlayStatusListener;)V
.end method

.method public abstract areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
.end method

.method public abstract areaMoveStart()V
.end method

.method public abstract areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
.end method

.method public abstract getCurrentScreenShot()Landroid/graphics/Bitmap;
.end method

.method public abstract getDuration()J
.end method

.method public abstract getMoveHorizontalProgress()F
.end method

.method public abstract getMoveMaxHeightTimes()I
.end method

.method public abstract getMoveMaxWidthTimes()I
.end method

.method public abstract getMoveVerticalProgress()F
.end method

.method public abstract getPageDirName()Ljava/lang/String;
.end method

.method public abstract getPageDirPath()Ljava/lang/String;
.end method

.method public abstract onTouchEvent(Landroid/view/MotionEvent;)V
.end method

.method public abstract pause()V
.end method

.method public abstract removePlayActionListener(Lcom/zykj/blackboard/listener/PlayStatusListener;)V
.end method

.method public abstract resume()V
.end method

.method public abstract seekTo(JLx7/a;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lx7/a;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
.end method

.method public abstract setRate(F)V
.end method

.method public abstract setScaleEnable(Z)V
.end method

.method public abstract setTranslateEnable(Z)V
.end method

.method public abstract start()V
.end method

.method public abstract status()Lcom/zykj/blackboard/enums/PlayStatus;
.end method
