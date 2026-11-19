.class public interface abstract Lcom/zykj/paint/Actions$NewPolylineDataOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/Actions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "NewPolylineDataOrBuilder"
.end annotation


# virtual methods
.method public abstract getColor()Lcom/zykj/paint/Actions$EzyColor;
.end method

.method public abstract getColorOrBuilder()Lcom/zykj/paint/Actions$EzyColorOrBuilder;
.end method

.method public abstract getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;
.end method

.method public abstract getPointsCount()I
.end method

.method public abstract getPointsList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPointsOrBuilder(I)Lcom/zykj/paint/Actions$EzyPointOrBuilder;
.end method

.method public abstract getPointsOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/paint/Actions$EzyPointOrBuilder;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStickyGraphId()I
.end method

.method public abstract getWidth()D
.end method

.method public abstract hasColor()Z
.end method
