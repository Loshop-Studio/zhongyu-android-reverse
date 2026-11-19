.class public interface abstract Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEventOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TouchEventOrBuilder"
.end annotation


# virtual methods
.method public abstract getAction()I
.end method

.method public abstract getEventTime()J
.end method

.method public abstract getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;
.end method

.method public abstract getPointerCoordsCount()I
.end method

.method public abstract getPointerCoordsList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPointerCoordsOrBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;
.end method

.method public abstract getPointerCoordsOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPointerCount()I
.end method

.method public abstract getPointerProperties(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;
.end method

.method public abstract getPointerPropertiesCount()I
.end method

.method public abstract getPointerPropertiesList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPointerPropertiesOrBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;
.end method

.method public abstract getPointerPropertiesOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getX()F
.end method

.method public abstract getY()F
.end method
