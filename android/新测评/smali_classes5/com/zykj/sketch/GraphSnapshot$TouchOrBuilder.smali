.class public interface abstract Lcom/zykj/sketch/GraphSnapshot$TouchOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/GraphSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TouchOrBuilder"
.end annotation


# virtual methods
.method public abstract getPointF(I)Lcom/zykj/sketch/GraphSnapshot$PointF;
.end method

.method public abstract getPointFCount()I
.end method

.method public abstract getPointFList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/GraphSnapshot$PointF;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPointFOrBuilder(I)Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;
.end method

.method public abstract getPointFOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;",
            ">;"
        }
    .end annotation
.end method
