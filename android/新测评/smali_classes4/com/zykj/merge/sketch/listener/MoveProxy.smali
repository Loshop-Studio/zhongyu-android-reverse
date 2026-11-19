.class public interface abstract Lcom/zykj/merge/sketch/listener/MoveProxy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/merge/sketch/listener/MoveProxy$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000c\u001a\u00020\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u000e\u001a\u00020\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/merge/sketch/listener/MoveProxy;",
        "",
        "Lc5/d;",
        "listener",
        "",
        "setAreaMoveListener",
        "(Lc5/d;)V",
        "areaMoveStart",
        "()V",
        "",
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
        "getCurrentScreenBitmap",
        "()Landroid/graphics/Bitmap;",
        "merge_release"
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

.method public abstract setAreaMoveListener(Lc5/d;)V
.end method

.method public abstract setScaleEnable(Z)V
.end method

.method public abstract setTranslateEnable(Z)V
.end method
