.class public interface abstract Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEventOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ActionTouchEventOrBuilder"
.end annotation


# virtual methods
.method public abstract getEndTime()J
.end method

.method public abstract getStartTime()J
.end method

.method public abstract getTouchEvent(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
.end method

.method public abstract getTouchEventCount()I
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

.method public abstract getTouchEventOrBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEventOrBuilder;
.end method

.method public abstract getTouchEventOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEventOrBuilder;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getType()I
.end method
