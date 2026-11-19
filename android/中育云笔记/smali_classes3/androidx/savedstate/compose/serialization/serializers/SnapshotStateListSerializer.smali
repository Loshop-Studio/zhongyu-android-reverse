.class public final Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
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

.field private final elementSerializer:Lce/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lce/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "elementSerializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->elementSerializer:Lce/b;

    .line 10
    .line 11
    invoke-static {p1}, Lde/a;->h(Lce/b;)Lce/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->base:Lce/b;

    .line 16
    .line 17
    const-string v0, "androidx.compose.runtime.SnapshotStateList"

    .line 18
    .line 19
    invoke-interface {p1}, Lce/b;->getDescriptor()Lee/f;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v0, p1}, Lee/m;->d(Ljava/lang/String;Lee/f;)Lee/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->descriptor:Lee/f;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic getDescriptor$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public deserialize(Lfe/e;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/e;",
            ")",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->base:Lce/b;

    check-cast v0, Lce/a;

    invoke-interface {p1, v0}, Lfe/e;->decodeSerializableValue(Lce/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 3
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->deserialize(Lfe/e;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->descriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(Lfe/f;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/f;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->base:Lce/b;

    check-cast v0, Lce/i;

    invoke-interface {p1, v0, p2}, Lfe/f;->encodeSerializableValue(Lce/i;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {p0, p1, p2}, Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;->serialize(Lfe/f;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V

    return-void
.end method
