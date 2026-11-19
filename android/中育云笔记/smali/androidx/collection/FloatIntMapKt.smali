.class public final Landroidx/collection/FloatIntMapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EmptyFloatIntMap:Landroidx/collection/MutableFloatIntMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/collection/MutableFloatIntMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/collection/FloatIntMapKt;->EmptyFloatIntMap:Landroidx/collection/MutableFloatIntMap;

    .line 8
    .line 9
    return-void
.end method

.method public static final buildFloatIntMap(ILhd/l;)Landroidx/collection/FloatIntMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")",
            "Landroidx/collection/FloatIntMap;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    invoke-direct {v0, p0}, Landroidx/collection/MutableFloatIntMap;-><init>(I)V

    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final buildFloatIntMap(Lhd/l;)Landroidx/collection/FloatIntMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Landroidx/collection/FloatIntMap;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-interface {p0, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final emptyFloatIntMap()Landroidx/collection/FloatIntMap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/collection/FloatIntMapKt;->EmptyFloatIntMap:Landroidx/collection/MutableFloatIntMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final floatIntMapOf()Landroidx/collection/FloatIntMap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/collection/FloatIntMapKt;->EmptyFloatIntMap:Landroidx/collection/MutableFloatIntMap;

    return-object v0
.end method

.method public static final floatIntMapOf(FI)Landroidx/collection/FloatIntMap;
    .locals 4

    .line 2
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final floatIntMapOf(FIFI)Landroidx/collection/FloatIntMap;
    .locals 4

    .line 3
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 5
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final floatIntMapOf(FIFIFI)Landroidx/collection/FloatIntMap;
    .locals 4

    .line 6
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 7
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 8
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 9
    invoke-virtual {v0, p4, p5}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final floatIntMapOf(FIFIFIFI)Landroidx/collection/FloatIntMap;
    .locals 4

    .line 10
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 11
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 12
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 13
    invoke-virtual {v0, p4, p5}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 14
    invoke-virtual {v0, p6, p7}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final floatIntMapOf(FIFIFIFIFI)Landroidx/collection/FloatIntMap;
    .locals 4

    .line 15
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 16
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 17
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 18
    invoke-virtual {v0, p4, p5}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 19
    invoke-virtual {v0, p6, p7}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 20
    invoke-virtual {v0, p8, p9}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final mutableFloatIntMapOf()Landroidx/collection/MutableFloatIntMap;
    .locals 4

    .line 1
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    return-object v0
.end method

.method public static final mutableFloatIntMapOf(FI)Landroidx/collection/MutableFloatIntMap;
    .locals 4

    .line 2
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final mutableFloatIntMapOf(FIFI)Landroidx/collection/MutableFloatIntMap;
    .locals 4

    .line 3
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 5
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final mutableFloatIntMapOf(FIFIFI)Landroidx/collection/MutableFloatIntMap;
    .locals 4

    .line 6
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 7
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 8
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 9
    invoke-virtual {v0, p4, p5}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final mutableFloatIntMapOf(FIFIFIFI)Landroidx/collection/MutableFloatIntMap;
    .locals 4

    .line 10
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 11
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 12
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 13
    invoke-virtual {v0, p4, p5}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 14
    invoke-virtual {v0, p6, p7}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method

.method public static final mutableFloatIntMapOf(FIFIFIFIFI)Landroidx/collection/MutableFloatIntMap;
    .locals 4

    .line 15
    new-instance v0, Landroidx/collection/MutableFloatIntMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableFloatIntMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 16
    invoke-virtual {v0, p0, p1}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 17
    invoke-virtual {v0, p2, p3}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 18
    invoke-virtual {v0, p4, p5}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 19
    invoke-virtual {v0, p6, p7}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    .line 20
    invoke-virtual {v0, p8, p9}, Landroidx/collection/MutableFloatIntMap;->set(FI)V

    return-object v0
.end method
