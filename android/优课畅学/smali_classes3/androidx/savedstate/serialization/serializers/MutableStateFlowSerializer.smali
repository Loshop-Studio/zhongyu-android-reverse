.class public final Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ls8/b;"
    }
.end annotation


# instance fields
.field private final descriptor:Lu8/f;

.field private final valueSerializer:Ls8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls8/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls8/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/b;",
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
    iput-object p1, p0, Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;->valueSerializer:Ls8/b;

    .line 10
    .line 11
    invoke-interface {p1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lu8/f;->getKind()Lu8/n;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Lu8/e;

    .line 20
    .line 21
    const-string v2, "kotlinx.coroutines.flow.MutableStateFlow"

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Lu8/e;

    .line 26
    .line 27
    invoke-static {v2, v0}, Lu8/m;->c(Ljava/lang/String;Lu8/e;)Lu8/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {v2, p1}, Lu8/m;->d(Ljava/lang/String;Lu8/f;)Lu8/f;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    iput-object p1, p0, Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;->descriptor:Lu8/f;

    .line 41
    .line 42
    return-void
.end method

.method public static synthetic getDescriptor$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic deserialize(Lv8/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;->deserialize(Lv8/e;)Ll8/h;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(Lv8/e;)Ll8/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/e;",
            ")",
            "Ll8/h;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;->valueSerializer:Ls8/b;

    check-cast v0, Ls8/a;

    invoke-interface {p1, v0}, Lv8/e;->decodeSerializableValue(Ls8/a;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lu8/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;->descriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lv8/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ll8/h;

    invoke-virtual {p0, p1, p2}, Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;->serialize(Lv8/f;Ll8/h;)V

    return-void
.end method

.method public serialize(Lv8/f;Ll8/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/f;",
            "Ll8/h;",
            ")V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;->valueSerializer:Ls8/b;

    check-cast v0, Ls8/i;

    invoke-interface {p2}, Ll8/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lv8/f;->encodeSerializableValue(Ls8/i;Ljava/lang/Object;)V

    return-void
.end method
