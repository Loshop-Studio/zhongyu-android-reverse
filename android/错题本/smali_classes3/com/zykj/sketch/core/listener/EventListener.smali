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
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J/\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0008\u0002\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00040\u0015H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u0015H&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020$H&\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\'H&\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010!\u001a\u00020*H&\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010!\u001a\u00020-H&\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u0010!\u001a\u000200H&\u00a2\u0006\u0004\u00082\u00103J\u0017\u00105\u001a\u0002012\u0006\u0010!\u001a\u000204H&\u00a2\u0006\u0004\u00085\u00106J\u0017\u00108\u001a\u00020\u00042\u0006\u0010!\u001a\u000207H&\u00a2\u0006\u0004\u00088\u00109J!\u0010=\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0008\u0008\u0002\u0010<\u001a\u000201H&\u00a2\u0006\u0004\u0008=\u0010>J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H&\u00a2\u0006\u0004\u0008=\u0010AJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020BH&\u00a2\u0006\u0004\u0008D\u0010EJ\u000f\u0010F\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008F\u0010GJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010I\u001a\u00020HH&\u00a2\u0006\u0004\u0008J\u0010K\u00a8\u0006L"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/EventListener;",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "event",
        "Ld6/s;",
        "onTouchEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;",
        "modeConfig",
        "onActionModeEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;",
        "graphConfig",
        "onGraphConfigEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;",
        "config",
        "onDrawConfigEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
        "imageConfig",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/graph/ImageGraph;",
        "callBack",
        "onAddImageEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
        "webViewConfig",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "viewBack",
        "onAddPPTEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;",
        "action",
        "onPrevActionEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;",
        "onNextActionEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;",
        "onClearBoardEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;",
        "onAudioStartRecord",
        "(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;",
        "onAudioStopRecord",
        "(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;",
        "",
        "onZoom",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;",
        "onTranslation",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;",
        "resetMatrix",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "actionContent",
        "updateMode",
        "graphSnapShot",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "graphSnapshot",
        "(Lcom/zykj/sketch/GraphSnapshot$GraphData;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
        "resetData",
        "initConfig",
        "(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V",
        "reset",
        "()V",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "viewControl",
        "addViewControl",
        "(Lcom/zykj/sketch/core/listener/ViewControl;)V",
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
    .param p1    # Lcom/zykj/sketch/core/listener/ViewControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract graphSnapShot(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract graphSnapShot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)V
    .param p1    # Lcom/zykj/sketch/GraphSnapshot$GraphData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract initConfig(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onActionModeEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onAddImageEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onAudioStartRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onAudioStopRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onClearBoardEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onDrawConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onGraphConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onNextActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onPrevActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onTouchEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onTranslation(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onZoom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract reset()V
.end method

.method public abstract resetMatrix(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
