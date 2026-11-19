.class final Landroidx/lifecycle/serialization/SavedStateHandleDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkd/c;"
    }
.end annotation


# instance fields
.field private final configuration:Landroidx/savedstate/serialization/SavedStateConfiguration;

.field private final init:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final key:Ljava/lang/String;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final serializer:Lce/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/b;"
        }
    .end annotation
.end field

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lce/b;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lce/b;",
            "Ljava/lang/String;",
            "Landroidx/savedstate/serialization/SavedStateConfiguration;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "savedStateHandle"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "serializer"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "configuration"

    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "init"

    .line 19
    .line 20
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 27
    .line 28
    iput-object p2, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->serializer:Lce/b;

    .line 29
    .line 30
    iput-object p3, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->key:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p4, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->configuration:Landroidx/savedstate/serialization/SavedStateConfiguration;

    .line 33
    .line 34
    iput-object p5, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->init:Lhd/a;

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/serialization/SavedStateHandleDelegate;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->registerSave$lambda$1(Landroidx/lifecycle/serialization/SavedStateHandleDelegate;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method private final createDefaultKey(Ljava/lang/Object;Lod/l;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lod/l;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Landroidx/lifecycle/internal/CanonicalName_jvmKt;->getCanonicalName(Lod/c;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x2e

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p1, ""

    .line 34
    .line 35
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-interface {p2}, Lod/b;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method private final loadValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/os/Bundle;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->serializer:Lce/b;

    .line 12
    .line 13
    check-cast v0, Lce/a;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->configuration:Landroidx/savedstate/serialization/SavedStateConfiguration;

    .line 16
    .line 17
    invoke-static {v0, p1, v1}, Landroidx/savedstate/serialization/SavedStateDecoderKt;->decodeFromSavedState(Lce/a;Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return-object p1
.end method

.method private final registerSave(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    new-instance v1, Landroidx/lifecycle/serialization/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/lifecycle/serialization/a;-><init>(Landroidx/lifecycle/serialization/SavedStateHandleDelegate;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/SavedStateHandle;->setSavedStateProvider(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final registerSave$lambda$1(Landroidx/lifecycle/serialization/SavedStateHandleDelegate;)Landroid/os/Bundle;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->serializer:Lce/b;

    .line 2
    .line 3
    check-cast v0, Lce/i;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->value:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string/jumbo v1, "value"

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->configuration:Landroidx/savedstate/serialization/SavedStateConfiguration;

    .line 18
    .line 19
    invoke-static {v0, v1, p0}, Landroidx/savedstate/serialization/SavedStateEncoderKt;->encodeToSavedState(Lce/i;Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public getValue(Ljava/lang/Object;Lod/l;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lod/l;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "property"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->value:Ljava/lang/Object;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->key:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->createDefaultKey(Ljava/lang/Object;Lod/l;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-direct {p0, v0}, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->registerSave(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->loadValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->init:Lhd/a;

    .line 29
    .line 30
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    iput-object p1, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->value:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_2
    iget-object p1, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->value:Ljava/lang/Object;

    .line 37
    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    const-string/jumbo p1, "value"

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    :cond_3
    return-object p1
.end method

.method public setValue(Ljava/lang/Object;Lod/l;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lod/l;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "property"

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "value"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->value:Ljava/lang/Object;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->key:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->createDefaultKey(Ljava/lang/Object;Lod/l;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_0
    invoke-direct {p0, v0}, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->registerSave(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iput-object p3, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->value:Ljava/lang/Object;

    .line 29
    .line 30
    return-void
.end method
