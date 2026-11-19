# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/utils/ProtoFileUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "convertToProtoPaint",
        "Lcom/zykj/view/EzySimpleBoardData$Paint;",
        "Landroid/graphics/Paint;",
        "convertToProtoPath",
        "Lcom/zykj/view/utils/ProtoPath;",
        "Lcom/zykj/view/EzySimpleBoardData$Path;",
        "view_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nProtoFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoFileUtils.kt\ncom/zykj/view/utils/ProtoFileUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1563#2:160\n1634#2,3:161\n1563#2:164\n1634#2,3:165\n*S KotlinDebug\n*F\n+ 1 ProtoFileUtils.kt\ncom/zykj/view/utils/ProtoFileUtilsKt\n*L\n68#1:160\n68#1:161,3\n85#1:164\n85#1:165,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final convertToProtoPaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)Landroid/graphics/Paint;
    .locals 3
    .param p0    # Lcom/zykj/view/EzySimpleBoardData$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 9
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 10
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getWidth()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getIsDashed()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 16
    new-instance p0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-object v0

    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public static final convertToProtoPaint(Landroid/graphics/Paint;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 2
    .param p0    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Paint;->newBuilder()Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;->setColor(I)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;->setWidth(F)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Landroid/graphics/Paint;->getPathEffect()Landroid/graphics/PathEffect;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;->setIsDashed(Z)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    const-string v0, "build(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    return-object p0
.end method

.method public static final convertToProtoPath(Lcom/zykj/view/utils/ProtoPath;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 5
    .param p0    # Lcom/zykj/view/utils/ProtoPath;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Path;->newBuilder()Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lcom/zykj/view/utils/ProtoPath;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    invoke-static {v1}, Lcom/zykj/view/utils/ProtoFileUtilsKt;->convertToProtoPaint(Landroid/graphics/Paint;)Lcom/zykj/view/EzySimpleBoardData$Paint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;->setPaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    move-result-object v0

    .line 27
    invoke-virtual {p0}, Lcom/zykj/view/utils/ProtoPath;->getPointList()Ljava/util/List;

    move-result-object p0

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 30
    check-cast v2, Landroid/graphics/PointF;

    .line 31
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$PointF;->newBuilder()Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;

    move-result-object v3

    .line 32
    iget v4, v2, Landroid/graphics/PointF;->x:F

    invoke-virtual {v3, v4}, Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;->addValue(F)Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;

    move-result-object v3

    .line 33
    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-virtual {v3, v2}, Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;->addValue(F)Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;

    move-result-object v2

    .line 34
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v2

    check-cast v2, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 35
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;->addAllPoint(Ljava/lang/Iterable;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    move-result-object p0

    .line 37
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    const-string v0, "build(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static final convertToProtoPath(Lcom/zykj/view/EzySimpleBoardData$Path;)Lcom/zykj/view/utils/ProtoPath;
    .locals 7
    .param p0    # Lcom/zykj/view/EzySimpleBoardData$Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->hasPaint()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPaint()Lcom/zykj/view/EzySimpleBoardData$Paint;

    move-result-object v0

    const-string v2, "getPaint(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/zykj/view/utils/ProtoFileUtilsKt;->convertToProtoPaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)Landroid/graphics/Paint;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 6
    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 7
    sget-object v2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 v2, -0x1000000

    .line 10
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v2, 0x40400000    # 3.0f

    .line 11
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 13
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPointList()Ljava/util/List;

    move-result-object p0

    const-string v3, "getPointList(...)"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p0, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 17
    check-cast v4, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 18
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    .line 19
    invoke-virtual {v4, v6}, Lcom/zykj/view/EzySimpleBoardData$PointF;->getValue(I)F

    move-result v6

    .line 20
    invoke-virtual {v4, v1}, Lcom/zykj/view/EzySimpleBoardData$PointF;->getValue(I)F

    move-result v4

    .line 21
    invoke-direct {v5, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 22
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 24
    new-instance p0, Lcom/zykj/view/utils/ProtoPath;

    invoke-direct {p0, v0, v2}, Lcom/zykj/view/utils/ProtoPath;-><init>(Landroid/graphics/Paint;Ljava/util/List;)V

    return-object p0
.end method
