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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J9\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00020\u000bH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020 H&\u00a2\u0006\u0004\u0008#\u0010\"J\u000f\u0010$\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008$\u0010%J\u0019\u0010\'\u001a\u00020\u00022\u0008\u0010\u001c\u001a\u0004\u0018\u00010&H&\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008)\u0010\u0004J\'\u0010,\u001a\u00020\u00022\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0013H&\u00a2\u0006\u0004\u0008,\u0010-J\'\u0010.\u001a\u00020\u00022\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0013H&\u00a2\u0006\u0004\u0008.\u0010-J\u000f\u0010/\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00101\u001a\u00020\u0013H&\u00a2\u0006\u0004\u00081\u00100J\u000f\u00103\u001a\u000202H&\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u000202H&\u00a2\u0006\u0004\u00085\u00104J\u0017\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u000206H&\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u000206H&\u00a2\u0006\u0004\u0008:\u00109J\u0011\u0010<\u001a\u0004\u0018\u00010;H&\u00a2\u0006\u0004\u0008<\u0010=\u00a8\u0006>"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "Lcom/zykj/blackboard/core/play/IEditPlayPageControl;",
        "Ld6/s;",
        "start",
        "()V",
        "resume",
        "pause",
        "",
        "skip",
        "Lkotlin/Function0;",
        "onSuccess",
        "Lkotlin/Function1;",
        "",
        "onError",
        "seekTo",
        "(JLr6/a;Lr6/c;)V",
        "Lcom/zykj/blackboard/enums/PlayStatus;",
        "status",
        "()Lcom/zykj/blackboard/enums/PlayStatus;",
        "",
        "rate",
        "setRate",
        "(F)V",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "Lcom/zykj/blackboard/listener/PlayStatusListener;",
        "listener",
        "addPlayActionListener",
        "(Lcom/zykj/blackboard/listener/PlayStatusListener;)V",
        "removePlayActionListener",
        "",
        "getPageDirPath",
        "()Ljava/lang/String;",
        "getPageDirName",
        "getDuration",
        "()J",
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "setAreaMoveListener",
        "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V",
        "areaMoveStart",
        "horizontalProgress",
        "verticalProgress",
        "areaMoving",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "areaMoveEnd",
        "getMoveVerticalProgress",
        "()F",
        "getMoveHorizontalProgress",
        "",
        "getMoveMaxHeightTimes",
        "()I",
        "getMoveMaxWidthTimes",
        "",
        "isEnable",
        "setTranslateEnable",
        "(Z)V",
        "setScaleEnable",
        "Landroid/graphics/Bitmap;",
        "getCurrentScreenShot",
        "()Landroid/graphics/Bitmap;",
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
.method public abstract addPlayActionListener(Lcom/zykj/blackboard/listener/PlayStatusListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/PlayStatusListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract areaMoveStart()V
.end method

.method public abstract areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract getCurrentScreenShot()Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getPageDirPath()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract onTouchEvent(Landroid/view/MotionEvent;)V
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract pause()V
.end method

.method public abstract removePlayActionListener(Lcom/zykj/blackboard/listener/PlayStatusListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/PlayStatusListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract resume()V
.end method

.method public abstract seekTo(JLr6/a;Lr6/c;)V
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lr6/a;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/IAreaMoveListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
