.class public interface abstract Lcom/zykj/sketch/core/listener/EventListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/listener/EventListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000cH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J(\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0016\u0008\u0002\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00030\u0017H&J$\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u0017H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\'H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020,H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020.H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H&J\u0010\u00102\u001a\u00020\n2\u0006\u0010\u001f\u001a\u000203H&J\u0010\u00104\u001a\u00020\n2\u0006\u0010\u001f\u001a\u000205H&J\u0008\u00106\u001a\u00020\u0003H&J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u000208H&\u00a8\u00069"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/EventListener;",
        "",
        "addViewControl",
        "",
        "viewControl",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "graphSnapShot",
        "actionContent",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "updateMode",
        "",
        "graphSnapshot",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "initConfig",
        "resetData",
        "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
        "onActionModeEvent",
        "modeConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;",
        "onAddImageEvent",
        "imageConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
        "callBack",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/graph/ImageGraph;",
        "onAddPPTEvent",
        "webViewConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
        "viewBack",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "onAudioStartRecord",
        "action",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;",
        "onAudioStopRecord",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;",
        "onClearBoardEvent",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;",
        "onDrawConfigEvent",
        "config",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;",
        "onGraphConfigEvent",
        "graphConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;",
        "onNextActionEvent",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;",
        "onPrevActionEvent",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;",
        "onTouchEvent",
        "event",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "onTranslation",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;",
        "onZoom",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;",
        "reset",
        "resetMatrix",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;",
        "sketch_release"
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

.method public abstract onAddImageEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/graph/ImageGraph;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/listener/PPTControl;",
            "Lkotlin/Unit;",
            ">;)V"
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
