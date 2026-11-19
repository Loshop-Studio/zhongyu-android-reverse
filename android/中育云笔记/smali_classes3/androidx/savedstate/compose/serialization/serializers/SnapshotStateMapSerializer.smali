.class public final Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lce/b;"
    }
.end annotation


# instance fields
.field private final base:Lce/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/b;"
        }
    .end annotation
.end field

.field private final descriptor:Lee/f;


# direct methods
.method public constructor <init>(Lce/b;Lce/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/b;",
            "Lce/b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "keySerializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "valueSerializer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Lde/a;->k(Lce/b;Lce/b;)Lce/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;->base:Lce/b;

    .line 19
    .line 20
    const-string p2, "androidx.compose.runtime.SnapshotStateMap"

    .line 21
    .line 22
    invoke-interface {p1}, Lce/b;->getDescriptor()Lee/f;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p2, p1}, Lee/m;->d(Ljava/lang/String;Lee/f;)Lee/f;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;->descriptor:Lee/f;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic getDescriptor$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public deserialize(Lfe/e;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/e;",
            ")",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "TK;TV;>;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;->base:Lce/b;

    check-cast v0, Lce/a;

    invoke-interface {p1, v0}, Lfe/e;->decodeSerializableValue(Lce/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 3
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;-><init>()V

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;->deserialize(Lfe/e;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;->descriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(Lfe/f;Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/f;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;->base:Lce/b;

    check-cast v0, Lce/i;

    invoke-interface {p1, v0, p2}, Lfe/f;->encodeSerializableValue(Lce/i;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-virtual {p0, p1, p2}, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;->serialize(Lfe/f;Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V

    return-void
.end method
