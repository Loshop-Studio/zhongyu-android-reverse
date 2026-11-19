.class final Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/saveable/SaveableStateHolder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;

.field private static final Saver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private final canBeSaved:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private parentSaveableStateRegistry:Landroidx/compose/runtime/saveable/SaveableStateRegistry;

.field private final registries:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/runtime/saveable/SaveableStateRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->Companion:Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion$Saver$1;->INSTANCE:Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion$Saver$1;

    .line 10
    .line 11
    sget-object v1, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion$Saver$2;->INSTANCE:Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion$Saver$2;

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lhd/p;Lhd/l;)Landroidx/compose/runtime/saveable/Saver;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->Saver:Landroidx/compose/runtime/saveable/Saver;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->savedStates:Ljava/util/Map;

    .line 4
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->registries:Landroidx/collection/MutableScatterMap;

    .line 5
    new-instance p1, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$canBeSaved$1;

    invoke-direct {p1, p0}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$canBeSaved$1;-><init>(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;)V

    iput-object p1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->canBeSaved:Lhd/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic access$getRegistries$p(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;)Landroidx/collection/MutableScatterMap;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->registries:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSavedStates$p(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->savedStates:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSaver$cp()Landroidx/compose/runtime/saveable/Saver;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->Saver:Landroidx/compose/runtime/saveable/Saver;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$saveAll(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->saveAll()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$saveTo(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->saveTo(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final saveAll()Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->savedStates:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->registries:Landroidx/collection/MutableScatterMap;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v2, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, v2, Landroidx/collection/ScatterMap;->metadata:[J

    .line 12
    .line 13
    array-length v5, v2

    .line 14
    add-int/lit8 v5, v5, -0x2

    .line 15
    .line 16
    if-ltz v5, :cond_3

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    move v7, v6

    .line 20
    :goto_0
    aget-wide v8, v2, v7

    .line 21
    .line 22
    not-long v10, v8

    .line 23
    const/4 v12, 0x7

    .line 24
    shl-long/2addr v10, v12

    .line 25
    and-long/2addr v10, v8

    .line 26
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v10, v12

    .line 32
    cmp-long v10, v10, v12

    .line 33
    .line 34
    if-eqz v10, :cond_2

    .line 35
    .line 36
    sub-int v10, v7, v5

    .line 37
    .line 38
    not-int v10, v10

    .line 39
    ushr-int/lit8 v10, v10, 0x1f

    .line 40
    .line 41
    const/16 v11, 0x8

    .line 42
    .line 43
    rsub-int/lit8 v10, v10, 0x8

    .line 44
    .line 45
    move v12, v6

    .line 46
    :goto_1
    if-ge v12, v10, :cond_1

    .line 47
    .line 48
    const-wide/16 v13, 0xff

    .line 49
    .line 50
    and-long/2addr v13, v8

    .line 51
    const-wide/16 v15, 0x80

    .line 52
    .line 53
    cmp-long v13, v13, v15

    .line 54
    .line 55
    if-gez v13, :cond_0

    .line 56
    .line 57
    shl-int/lit8 v13, v7, 0x3

    .line 58
    .line 59
    add-int/2addr v13, v12

    .line 60
    aget-object v14, v3, v13

    .line 61
    .line 62
    aget-object v13, v4, v13

    .line 63
    .line 64
    check-cast v13, Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 65
    .line 66
    invoke-direct {v0, v13, v1, v14}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->saveTo(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    shr-long/2addr v8, v11

    .line 70
    add-int/lit8 v12, v12, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    if-ne v10, v11, :cond_3

    .line 74
    .line 75
    :cond_2
    if-eq v7, v5, :cond_3

    .line 76
    .line 77
    add-int/lit8 v7, v7, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    :cond_4
    return-object v1
.end method

.method private final saveTo(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/saveable/SaveableStateRegistry;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/runtime/saveable/SaveableStateRegistry;->performSave()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public SaveableStateProvider(Ljava/lang/Object;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, -0x47703d6d

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:69)"

    .line 15
    .line 16
    invoke-static {v0, p4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/16 v0, 0xcf

    .line 20
    .line 21
    invoke-interface {p3, v0, p1}, Landroidx/compose/runtime/Composer;->startReusableGroup(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-ne v0, v2, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->canBeSaved:Lhd/l;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->savedStates:Ljava/util/Map;

    .line 51
    .line 52
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/util/Map;

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->canBeSaved:Lhd/l;

    .line 59
    .line 60
    invoke-static {v0, v2}, Landroidx/compose/runtime/saveable/SaveableStateRegistryKt;->SaveableStateRegistry(Ljava/util/Map;Lhd/l;)Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string p3, "Type of the key "

    .line 74
    .line 75
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    .line 82
    .line 83
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p2

    .line 100
    :cond_2
    :goto_0
    check-cast v0, Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/saveable/SaveableStateRegistryKt;->getLocalSaveableStateRegistry()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2, v0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    sget v3, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 111
    .line 112
    and-int/lit8 p4, p4, 0x70

    .line 113
    .line 114
    or-int/2addr p4, v3

    .line 115
    invoke-static {v2, p2, p3, p4}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 116
    .line 117
    .line 118
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 119
    .line 120
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p4

    .line 124
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    or-int/2addr p4, v2

    .line 129
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    or-int/2addr p4, v2

    .line 134
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-nez p4, :cond_3

    .line 139
    .line 140
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    if-ne v2, p4, :cond_4

    .line 145
    .line 146
    :cond_3
    new-instance v2, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1;

    .line 147
    .line 148
    invoke-direct {v2, p0, p1, v0}, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1;-><init>(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_4
    check-cast v2, Lhd/l;

    .line 155
    .line 156
    const/4 p1, 0x6

    .line 157
    invoke-static {p2, v2, p3, p1}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lhd/l;Landroidx/compose/runtime/Composer;I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReusableGroup()V

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_5

    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public final getParentSaveableStateRegistry()Landroidx/compose/runtime/saveable/SaveableStateRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->parentSaveableStateRegistry:Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 2
    .line 3
    return-object v0
.end method

.method public removeState(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->registries:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->savedStates:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setParentSaveableStateRegistry(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;->parentSaveableStateRegistry:Landroidx/compose/runtime/saveable/SaveableStateRegistry;

    .line 2
    .line 3
    return-void
.end method
