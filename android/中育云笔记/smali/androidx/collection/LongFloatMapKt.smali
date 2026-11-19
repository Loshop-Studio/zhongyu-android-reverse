.class public final Landroidx/collection/LongFloatMapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EmptyLongFloatMap:Landroidx/collection/MutableLongFloatMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/collection/MutableLongFloatMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/collection/LongFloatMapKt;->EmptyLongFloatMap:Landroidx/collection/MutableLongFloatMap;

    .line 8
    .line 9
    return-void
.end method

.method public static final buildLongFloatMap(ILhd/l;)Landroidx/collection/LongFloatMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")",
            "Landroidx/collection/LongFloatMap;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    invoke-direct {v0, p0}, Landroidx/collection/MutableLongFloatMap;-><init>(I)V

    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final buildLongFloatMap(Lhd/l;)Landroidx/collection/LongFloatMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Landroidx/collection/LongFloatMap;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-interface {p0, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final emptyLongFloatMap()Landroidx/collection/LongFloatMap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/collection/LongFloatMapKt;->EmptyLongFloatMap:Landroidx/collection/MutableLongFloatMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final longFloatMapOf()Landroidx/collection/LongFloatMap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/collection/LongFloatMapKt;->EmptyLongFloatMap:Landroidx/collection/MutableLongFloatMap;

    return-object v0
.end method

.method public static final longFloatMapOf(JF)Landroidx/collection/LongFloatMap;
    .locals 4

    .line 2
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final longFloatMapOf(JFJF)Landroidx/collection/LongFloatMap;
    .locals 4

    .line 3
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 5
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final longFloatMapOf(JFJFJF)Landroidx/collection/LongFloatMap;
    .locals 4

    .line 6
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 7
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 8
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 9
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final longFloatMapOf(JFJFJFJF)Landroidx/collection/LongFloatMap;
    .locals 4

    .line 10
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 11
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 12
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 13
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 14
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final longFloatMapOf(JFJFJFJFJF)Landroidx/collection/LongFloatMap;
    .locals 4

    .line 15
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 16
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 17
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 18
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 19
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    move-wide/from16 p0, p12

    move/from16 p2, p14

    .line 20
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final mutableLongFloatMapOf()Landroidx/collection/MutableLongFloatMap;
    .locals 4

    .line 1
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    return-object v0
.end method

.method public static final mutableLongFloatMapOf(JF)Landroidx/collection/MutableLongFloatMap;
    .locals 4

    .line 2
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final mutableLongFloatMapOf(JFJF)Landroidx/collection/MutableLongFloatMap;
    .locals 4

    .line 3
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 5
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final mutableLongFloatMapOf(JFJFJF)Landroidx/collection/MutableLongFloatMap;
    .locals 4

    .line 6
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 7
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 8
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 9
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final mutableLongFloatMapOf(JFJFJFJF)Landroidx/collection/MutableLongFloatMap;
    .locals 4

    .line 10
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 11
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 12
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 13
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 14
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method

.method public static final mutableLongFloatMapOf(JFJFJFJFJF)Landroidx/collection/MutableLongFloatMap;
    .locals 4

    .line 15
    new-instance v0, Landroidx/collection/MutableLongFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableLongFloatMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 16
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 17
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 18
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    .line 19
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    move-wide/from16 p0, p12

    move/from16 p2, p14

    .line 20
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableLongFloatMap;->set(JF)V

    return-object v0
.end method
