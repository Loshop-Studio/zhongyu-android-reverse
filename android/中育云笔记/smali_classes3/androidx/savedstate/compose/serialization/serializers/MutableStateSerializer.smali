.class public final Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;
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
.field private final descriptor:Lee/f;

.field private final valueSerializer:Lce/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lce/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "valueSerializer"

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
    iput-object p1, p0, Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;->valueSerializer:Lce/b;

    .line 10
    .line 11
    invoke-interface {p1}, Lce/b;->getDescriptor()Lee/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lee/f;->getKind()Lee/n;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Lee/e;

    .line 20
    .line 21
    const-string v2, "androidx.compose.runtime.MutableState"

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Lee/e;

    .line 26
    .line 27
    invoke-static {v2, v0}, Lee/m;->c(Ljava/lang/String;Lee/e;)Lee/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p1}, Lce/b;->getDescriptor()Lee/f;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {v2, p1}, Lee/m;->d(Ljava/lang/String;Lee/f;)Lee/f;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    iput-object p1, p0, Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;->descriptor:Lee/f;

    .line 41
    .line 42
    return-void
.end method

.method public static synthetic getDescriptor$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public deserialize(Lfe/e;)Landroidx/compose/runtime/MutableState;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/e;",
            ")",
            "Landroidx/compose/runtime/MutableState<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;->valueSerializer:Lce/b;

    check-cast v0, Lce/a;

    invoke-interface {p1, v0}, Lfe/e;->decodeSerializableValue(Lce/a;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;->deserialize(Lfe/e;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;->descriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(Lfe/f;Landroidx/compose/runtime/MutableState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/f;",
            "Landroidx/compose/runtime/MutableState<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;->valueSerializer:Lce/b;

    check-cast v0, Lce/i;

    invoke-interface {p2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lfe/f;->encodeSerializableValue(Lce/i;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroidx/compose/runtime/MutableState;

    invoke-virtual {p0, p1, p2}, Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;->serialize(Lfe/f;Landroidx/compose/runtime/MutableState;)V

    return-void
.end method
