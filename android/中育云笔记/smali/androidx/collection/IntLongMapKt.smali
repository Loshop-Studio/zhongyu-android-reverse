.class public final Landroidx/collection/IntLongMapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EmptyIntLongMap:Landroidx/collection/MutableIntLongMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/collection/MutableIntLongMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/collection/IntLongMapKt;->EmptyIntLongMap:Landroidx/collection/MutableIntLongMap;

    .line 8
    .line 9
    return-void
.end method

.method public static final buildIntLongMap(ILhd/l;)Landroidx/collection/IntLongMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")",
            "Landroidx/collection/IntLongMap;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    invoke-direct {v0, p0}, Landroidx/collection/MutableIntLongMap;-><init>(I)V

    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final buildIntLongMap(Lhd/l;)Landroidx/collection/IntLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Landroidx/collection/IntLongMap;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-interface {p0, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final emptyIntLongMap()Landroidx/collection/IntLongMap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/collection/IntLongMapKt;->EmptyIntLongMap:Landroidx/collection/MutableIntLongMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final intLongMapOf()Landroidx/collection/IntLongMap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/collection/IntLongMapKt;->EmptyIntLongMap:Landroidx/collection/MutableIntLongMap;

    return-object v0
.end method

.method public static final intLongMapOf(IJ)Landroidx/collection/IntLongMap;
    .locals 4

    .line 2
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final intLongMapOf(IJIJ)Landroidx/collection/IntLongMap;
    .locals 4

    .line 3
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 5
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final intLongMapOf(IJIJIJ)Landroidx/collection/IntLongMap;
    .locals 4

    .line 6
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 7
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 8
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 9
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final intLongMapOf(IJIJIJIJ)Landroidx/collection/IntLongMap;
    .locals 4

    .line 10
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 11
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 12
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 13
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 14
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final intLongMapOf(IJIJIJIJIJ)Landroidx/collection/IntLongMap;
    .locals 4

    .line 15
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 16
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 17
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 18
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 19
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    move/from16 p0, p12

    move-wide/from16 p1, p13

    .line 20
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final mutableIntLongMapOf()Landroidx/collection/MutableIntLongMap;
    .locals 4

    .line 1
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    return-object v0
.end method

.method public static final mutableIntLongMapOf(IJ)Landroidx/collection/MutableIntLongMap;
    .locals 4

    .line 2
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final mutableIntLongMapOf(IJIJ)Landroidx/collection/MutableIntLongMap;
    .locals 4

    .line 3
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 5
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final mutableIntLongMapOf(IJIJIJ)Landroidx/collection/MutableIntLongMap;
    .locals 4

    .line 6
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 7
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 8
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 9
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final mutableIntLongMapOf(IJIJIJIJ)Landroidx/collection/MutableIntLongMap;
    .locals 4

    .line 10
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 11
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 12
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 13
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 14
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method

.method public static final mutableIntLongMapOf(IJIJIJIJIJ)Landroidx/collection/MutableIntLongMap;
    .locals 4

    .line 15
    new-instance v0, Landroidx/collection/MutableIntLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableIntLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 16
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 17
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 18
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    .line 19
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    move/from16 p0, p12

    move-wide/from16 p1, p13

    .line 20
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableIntLongMap;->set(IJ)V

    return-object v0
.end method
