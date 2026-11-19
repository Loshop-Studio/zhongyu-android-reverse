.class public interface abstract Landroidx/compose/ui/layout/MeasureResult;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getAlignmentLines()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getHeight()I
.end method

.method public getRulers()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public abstract getWidth()I
.end method

.method public abstract placeChildren()V
.end method
