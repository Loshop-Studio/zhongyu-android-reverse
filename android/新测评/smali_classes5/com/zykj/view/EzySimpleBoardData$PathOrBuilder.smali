.class public interface abstract Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageLiteOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PathOrBuilder"
.end annotation


# virtual methods
.method public abstract getPaint()Lcom/zykj/view/EzySimpleBoardData$Paint;
.end method

.method public abstract getPoint(I)Lcom/zykj/view/EzySimpleBoardData$PointF;
.end method

.method public abstract getPointCount()I
.end method

.method public abstract getPointList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/EzySimpleBoardData$PointF;",
            ">;"
        }
    .end annotation
.end method

.method public abstract hasPaint()Z
.end method
