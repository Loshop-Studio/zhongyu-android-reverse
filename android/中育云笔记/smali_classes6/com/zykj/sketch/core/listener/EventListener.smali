.class public interface abstract Lcom/zykj/sketch/core/listener/EventListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/listener/EventListener$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract addViewControl(Lcom/zykj/sketch/core/listener/ViewControl;)V
.end method

.method public abstract graphSnapShot(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V
.end method

.method public abstract graphSnapShot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)V
.end method

.method public abstract initConfig(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V
.end method

.method public abstract onActionModeEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V
.end method

.method public abstract onAddImageEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lhd/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
            "Lhd/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lhd/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
            "Lhd/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onAudioStartRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V
.end method

.method public abstract onAudioStopRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V
.end method

.method public abstract onClearBoardEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V
.end method

.method public abstract onDrawConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V
.end method

.method public abstract onGraphConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V
.end method

.method public abstract onNextActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V
.end method

.method public abstract onPrevActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V
.end method

.method public abstract onTouchEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
.end method

.method public abstract onTranslation(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z
.end method

.method public abstract onZoom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z
.end method

.method public abstract reset()V
.end method

.method public abstract resetMatrix(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V
.end method
