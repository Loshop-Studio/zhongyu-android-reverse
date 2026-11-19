.class public abstract Le5/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/graphics/Rect;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    iget v1, p0, Landroid/graphics/Rect;->left:I

    .line 9
    .line 10
    int-to-float v1, v1

    .line 11
    iget v2, p0, Landroid/graphics/Rect;->top:I

    .line 12
    .line 13
    int-to-float v2, v2

    .line 14
    iget v3, p0, Landroid/graphics/Rect;->right:I

    .line 15
    .line 16
    int-to-float v3, v3

    .line 17
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 18
    .line 19
    int-to-float p0, p0

    .line 20
    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
