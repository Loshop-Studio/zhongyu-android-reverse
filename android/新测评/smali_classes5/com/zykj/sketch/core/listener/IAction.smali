.class public interface abstract Lcom/zykj/sketch/core/listener/IAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0008\u0010\u0007\u001a\u00020\u0008H&J\u0008\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\nH&\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/IAction;",
        "",
        "enumType",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "getTouchEventList",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "getTouchStartTime",
        "",
        "isRecord",
        "",
        "onTouchDown",
        "",
        "event",
        "onTouchMove",
        "onTouchPointerDown",
        "onTouchPointerUp",
        "onTouchUp",
        "setRecord",
        "record",
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
