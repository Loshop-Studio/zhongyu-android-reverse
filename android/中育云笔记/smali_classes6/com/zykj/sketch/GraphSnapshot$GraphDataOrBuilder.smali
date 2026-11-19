.class public interface abstract Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;
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
    name = "GraphDataOrBuilder"
.end annotation


# virtual methods
.method public abstract getChildExtendMatrix(I)F
.end method

.method public abstract getChildExtendMatrixCount()I
.end method

.method public abstract getChildExtendMatrixList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getChildGraph(I)Lcom/zykj/sketch/GraphSnapshot$GraphData;
.end method

.method public abstract getChildGraphCount()I
.end method

.method public abstract getChildGraphList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getChildGraphOrBuilder(I)Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;
.end method

.method public abstract getChildGraphOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getColor()I
.end method

.method public abstract getExtra()Lcom/google/protobuf/Any;
.end method

.method public abstract getExtraOrBuilder()Lcom/google/protobuf/AnyOrBuilder;
.end method

.method public abstract getGraphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
.end method

.method public abstract getGraphTypeValue()I
.end method

.method public abstract getIsSelect()Z
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

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getNameBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;
.end method

.method public abstract getOutRectOrBuilder()Lcom/zykj/sketch/GraphSnapshot$RectFOrBuilder;
.end method

.method public abstract getShowDelete()Z
.end method

.method public abstract getWidth()F
.end method

.method public abstract hasExtra()Z
.end method

.method public abstract hasOutRect()Z
.end method
