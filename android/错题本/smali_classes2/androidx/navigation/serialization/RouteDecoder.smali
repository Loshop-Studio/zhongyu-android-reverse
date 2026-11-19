.class public final Landroidx/navigation/serialization/RouteDecoder;
.super Ll7/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B-\u0008\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0016\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nB)\u0008\u0016\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0016\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0010J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010%\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010 2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00000!H\u0000\u00a2\u0006\u0004\u0008#\u0010$J#\u0010&\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010 2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00000!H\u0016\u00a2\u0006\u0004\u0008&\u0010$R\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R \u0010/\u001a\u00020.8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u0012\u0004\u00083\u00104\u001a\u0004\u00081\u00102\u00a8\u00065"
    }
    d2 = {
        "Landroidx/navigation/serialization/RouteDecoder;",
        "Ll7/a;",
        "Landroid/os/Bundle;",
        "Landroidx/savedstate/SavedState;",
        "bundle",
        "",
        "",
        "Landroidx/navigation/NavType;",
        "typeMap",
        "<init>",
        "(Landroid/os/Bundle;Ljava/util/Map;)V",
        "Landroidx/lifecycle/SavedStateHandle;",
        "handle",
        "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V",
        "",
        "internalDecodeValue",
        "()Ljava/lang/Object;",
        "Lk7/g;",
        "descriptor",
        "",
        "decodeElementIndex",
        "(Lk7/g;)I",
        "decodeValue",
        "",
        "decodeNull",
        "()Ljava/lang/Void;",
        "",
        "decodeNotNullMark",
        "()Z",
        "Ll7/e;",
        "decodeInline",
        "(Lk7/g;)Ll7/e;",
        "T",
        "Li7/a;",
        "deserializer",
        "decodeRouteWithArgs$navigation_common_release",
        "(Li7/a;)Ljava/lang/Object;",
        "decodeRouteWithArgs",
        "decodeSerializableValue",
        "Landroidx/navigation/serialization/ArgStore;",
        "store",
        "Landroidx/navigation/serialization/ArgStore;",
        "elementIndex",
        "I",
        "elementName",
        "Ljava/lang/String;",
        "Lo7/e;",
        "serializersModule",
        "Lo7/e;",
        "getSerializersModule",
        "()Lo7/e;",
        "getSerializersModule$annotations",
        "()V",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/RouteDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"
    }
.end annotation


# instance fields
.field private elementIndex:I

.field private elementName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final serializersModule:Lo7/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final store:Landroidx/navigation/serialization/ArgStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Ljava/util/Map;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Landroidx/navigation/NavType<",
            "*>;>;)V"
        }
    .end annotation

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "typeMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Landroidx/navigation/serialization/RouteDecoder;->elementIndex:I

    .line 3
    const-string v0, ""

    iput-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->elementName:Ljava/lang/String;

    .line 4
    sget-object v0, Lo7/g;->a:Lo7/d;

    .line 5
    iput-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->serializersModule:Lo7/e;

    .line 6
    new-instance v0, Landroidx/navigation/serialization/SavedStateArgStore;

    invoke-direct {v0, p1, p2}, Landroidx/navigation/serialization/SavedStateArgStore;-><init>(Landroid/os/Bundle;Ljava/util/Map;)V

    iput-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->store:Landroidx/navigation/serialization/ArgStore;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/SavedStateHandle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Landroidx/navigation/NavType<",
            "*>;>;)V"
        }
    .end annotation

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "typeMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Landroidx/navigation/serialization/RouteDecoder;->elementIndex:I

    .line 9
    const-string v0, ""

    iput-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->elementName:Ljava/lang/String;

    .line 10
    sget-object v0, Lo7/g;->a:Lo7/d;

    .line 11
    iput-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->serializersModule:Lo7/e;

    .line 12
    new-instance v0, Landroidx/navigation/serialization/SavedStateHandleArgStore;

    invoke-direct {v0, p1, p2}, Landroidx/navigation/serialization/SavedStateHandleArgStore;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V

    iput-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->store:Landroidx/navigation/serialization/ArgStore;

    return-void
.end method

.method public static synthetic getSerializersModule$annotations()V
    .locals 0

    return-void
.end method

.method private final internalDecodeValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->store:Landroidx/navigation/serialization/ArgStore;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/navigation/serialization/RouteDecoder;->elementName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/navigation/serialization/ArgStore;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Unexpected null value for non-nullable argument "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/navigation/serialization/RouteDecoder;->elementName:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method


# virtual methods
.method public bridge synthetic decodeCollectionSize(Lk7/g;)I
    .locals 0
    .param p1    # Lk7/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Ll7/c;->decodeCollectionSize(Lk7/g;)I

    const/4 p1, -0x1

    return p1
.end method

.method public decodeElementIndex(Lk7/g;)I
    .locals 3
    .param p1    # Lk7/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/navigation/serialization/RouteDecoder;->elementIndex:I

    .line 7
    .line 8
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-interface {p1}, Lk7/g;->d()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    const/4 p1, -0x1

    .line 17
    return p1

    .line 18
    :cond_1
    invoke-interface {p1, v0}, Lk7/g;->e(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Landroidx/navigation/serialization/RouteDecoder;->store:Landroidx/navigation/serialization/ArgStore;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Landroidx/navigation/serialization/ArgStore;->contains(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iput v0, p0, Landroidx/navigation/serialization/RouteDecoder;->elementIndex:I

    .line 31
    .line 32
    iput-object v1, p0, Landroidx/navigation/serialization/RouteDecoder;->elementName:Ljava/lang/String;

    .line 33
    .line 34
    return v0
.end method

.method public decodeInline(Lk7/g;)Ll7/e;
    .locals 2
    .param p1    # Lk7/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/navigation/serialization/RouteSerializerKt;->isValueClass(Lk7/g;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-interface {p1, v0}, Lk7/g;->e(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Landroidx/navigation/serialization/RouteDecoder;->elementName:Ljava/lang/String;

    .line 18
    .line 19
    iput v0, p0, Landroidx/navigation/serialization/RouteDecoder;->elementIndex:I

    .line 20
    .line 21
    :cond_0
    invoke-super {p0, p1}, Ll7/a;->decodeInline(Lk7/g;)Ll7/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public decodeNotNullMark()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->store:Landroidx/navigation/serialization/ArgStore;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/navigation/serialization/RouteDecoder;->elementName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/navigation/serialization/ArgStore;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public decodeNull()Ljava/lang/Void;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic decodeNullableSerializableValue(Li7/a;)Ljava/lang/Object;
    .locals 0
    .param p1    # Li7/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlinx/serialization/ExperimentalSerializationApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-super {p0, p1}, Ll7/e;->decodeNullableSerializableValue(Li7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final decodeRouteWithArgs$navigation_common_release(Li7/a;)Ljava/lang/Object;
    .locals 1
    .param p1    # Li7/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li7/a;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Li7/a;->deserialize(Ll7/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public bridge synthetic decodeSequentially()Z
    .locals 1
    .annotation runtime Lkotlinx/serialization/ExperimentalSerializationApi;
    .end annotation

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public decodeSerializableValue(Li7/a;)Ljava/lang/Object;
    .locals 1
    .param p1    # Li7/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li7/a;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/navigation/serialization/RouteDecoder;->internalDecodeValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public decodeValue()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/navigation/serialization/RouteDecoder;->internalDecodeValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getSerializersModule()Lo7/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/serialization/RouteDecoder;->serializersModule:Lo7/e;

    .line 2
    .line 3
    return-object v0
.end method
