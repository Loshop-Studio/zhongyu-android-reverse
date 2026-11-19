.class public interface abstract Lcom/zykj/sketch/core/listener/IAction;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
.end method

.method public abstract getTouchEventList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTouchStartTime()J
.end method

.method public abstract isRecord()Z
.end method

.method public abstract onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
.end method

.method public abstract onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
.end method

.method public abstract onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
.end method

.method public abstract onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
.end method

.method public abstract onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
.end method

.method public abstract setRecord(Z)V
.end method
