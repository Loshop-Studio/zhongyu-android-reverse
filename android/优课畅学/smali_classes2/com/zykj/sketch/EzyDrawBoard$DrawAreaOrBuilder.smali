.class public interface abstract Lcom/zykj/sketch/EzyDrawBoard$DrawAreaOrBuilder;
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
    name = "DrawAreaOrBuilder"
.end annotation


# virtual methods
.method public abstract getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;
.end method

.method public abstract getLeftTopPointOrBuilder()Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;
.end method

.method public abstract getMatrix(I)F
.end method

.method public abstract getMatrixCount()I
.end method

.method public abstract getMatrixList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;
.end method

.method public abstract getRightBottomPointOrBuilder()Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;
.end method

.method public abstract hasLeftTopPoint()Z
.end method

.method public abstract hasRightBottomPoint()Z
.end method
