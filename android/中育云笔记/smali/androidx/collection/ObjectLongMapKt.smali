.class public final Landroidx/collection/ObjectLongMapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EmptyObjectLongMap:Landroidx/collection/MutableObjectLongMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectLongMap<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/collection/MutableObjectLongMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/collection/ObjectLongMapKt;->EmptyObjectLongMap:Landroidx/collection/MutableObjectLongMap;

    .line 8
    .line 9
    return-void
.end method

.method public static final buildObjectLongMap(ILhd/l;)Landroidx/collection/ObjectLongMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(I",
            "Lhd/l;",
            ")",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    invoke-direct {v0, p0}, Landroidx/collection/MutableObjectLongMap;-><init>(I)V

    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final buildObjectLongMap(Lhd/l;)Landroidx/collection/ObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/l;",
            ")",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-interface {p0, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static final emptyObjectLongMap()Landroidx/collection/ObjectLongMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/collection/ObjectLongMapKt;->EmptyObjectLongMap:Landroidx/collection/MutableObjectLongMap;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final mutableObjectLongMapOf()Landroidx/collection/MutableObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/collection/MutableObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    return-object v0
.end method

.method public static final mutableObjectLongMapOf(Ljava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;J)",
            "Landroidx/collection/MutableObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final mutableObjectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;J)",
            "Landroidx/collection/MutableObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 3
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 5
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final mutableObjectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;JTK;J)",
            "Landroidx/collection/MutableObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 6
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 7
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 8
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 9
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final mutableObjectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;JTK;JTK;J)",
            "Landroidx/collection/MutableObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 11
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 12
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 13
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 14
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final mutableObjectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;JTK;JTK;JTK;J)",
            "Landroidx/collection/MutableObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 15
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 16
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 17
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 18
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 19
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    move-object/from16 p0, p12

    move-wide/from16 p1, p13

    .line 20
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final objectLongMap()Landroidx/collection/ObjectLongMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/collection/ObjectLongMapKt;->EmptyObjectLongMap:Landroidx/collection/MutableObjectLongMap;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final objectLongMapOf(Ljava/lang/Object;J)Landroidx/collection/ObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;J)",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final objectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;J)",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 3
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 4
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final objectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;JTK;J)",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 5
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 6
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 7
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 8
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final objectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;JTK;JTK;J)",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 9
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 10
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 11
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 12
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 13
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method public static final objectLongMapOf(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;JTK;JTK;JTK;JTK;J)",
            "Landroidx/collection/ObjectLongMap<",
            "TK;>;"
        }
    .end annotation

    .line 14
    new-instance v0, Landroidx/collection/MutableObjectLongMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectLongMap;-><init>(IILkotlin/jvm/internal/n;)V

    .line 15
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 16
    invoke-virtual {v0, p3, p4, p5}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 17
    invoke-virtual {v0, p6, p7, p8}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    .line 18
    invoke-virtual {v0, p9, p10, p11}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    move-object/from16 p0, p12

    move-wide/from16 p1, p13

    .line 19
    invoke-virtual {v0, p0, p1, p2}, Landroidx/collection/MutableObjectLongMap;->set(Ljava/lang/Object;J)V

    return-object v0
.end method
