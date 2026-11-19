.class public abstract Lb7/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lh5/a;)Lb7/c1;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb7/c1;

    .line 7
    .line 8
    iget-boolean v1, p0, Lh5/a;->a:Z

    .line 9
    .line 10
    iget-object v2, p0, Lh5/a;->c:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    const-string v3, "srcBitmap"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lh5/a;->e:[Landroid/graphics/Point;

    .line 18
    .line 19
    const-string v3, "points"

    .line 20
    .line 21
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, v1, v2, p0}, Lb7/c1;-><init>(ZLandroid/graphics/Bitmap;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public static final b(Lh5/a;)Lb7/c1;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb7/c1;

    .line 7
    .line 8
    iget-boolean v1, p0, Lh5/a;->a:Z

    .line 9
    .line 10
    iget-object v2, p0, Lh5/a;->d:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    const-string v3, "bitmap"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lh5/a;->e:[Landroid/graphics/Point;

    .line 18
    .line 19
    const-string v3, "points"

    .line 20
    .line 21
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, v1, v2, p0}, Lb7/c1;-><init>(ZLandroid/graphics/Bitmap;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method
