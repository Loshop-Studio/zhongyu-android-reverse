.class public final Landroidx/navigation/compose/NavBackStackEntryProviderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final LocalOwnersProvider(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 5
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavBackStackEntry;",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0xdf2283d

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    const-string v3, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:49)"

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_8
    sget-object v0, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 86
    .line 87
    invoke-virtual {v0, p0}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->provides(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/compose/runtime/ProvidedValue;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {}, Landroidx/lifecycle/compose/LocalLifecycleOwnerKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {}, Landroidx/savedstate/compose/LocalSavedStateRegistryOwnerKt;->getLocalSavedStateRegistryOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2, p0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    filled-new-array {v0, v1, v2}, [Landroidx/compose/runtime/ProvidedValue;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    new-instance v1, Landroidx/navigation/compose/NavBackStackEntryProviderKt$LocalOwnersProvider$1;

    .line 112
    .line 113
    invoke-direct {v1, p1, p2}, Landroidx/navigation/compose/NavBackStackEntryProviderKt$LocalOwnersProvider$1;-><init>(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;)V

    .line 114
    .line 115
    .line 116
    const/16 v2, 0x36

    .line 117
    .line 118
    const v3, 0x6bd29b7d

    .line 119
    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    invoke-static {v3, v4, v1, p3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 127
    .line 128
    or-int/lit8 v2, v2, 0x30

    .line 129
    .line 130
    invoke-static {v0, v1, p3, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 140
    .line 141
    .line 142
    :cond_9
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    if-eqz p3, :cond_a

    .line 147
    .line 148
    new-instance v0, Landroidx/navigation/compose/i;

    .line 149
    .line 150
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/navigation/compose/i;-><init>(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 154
    .line 155
    .line 156
    :cond_a
    return-void
.end method

.method private static final LocalOwnersProvider$lambda$0(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-static {p0, p1, p2, p4, p3}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->LocalOwnersProvider(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final SaveableStateProvider(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0x31a55716

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    and-int/lit8 p2, p3, 0x6

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x2

    .line 21
    :goto_0
    or-int/2addr p2, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p2, p3

    .line 24
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v6, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p2, v1

    .line 40
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 41
    .line 42
    const/16 v2, 0x12

    .line 43
    .line 44
    if-ne v1, v2, :cond_5

    .line 45
    .line 46
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    const/4 v1, -0x1

    .line 65
    const-string v2, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:60)"

    .line 66
    .line 67
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-ne v0, v1, :cond_7

    .line 81
    .line 82
    new-instance v0, Landroidx/navigation/compose/g;

    .line 83
    .line 84
    invoke-direct {v0}, Landroidx/navigation/compose/g;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_7
    check-cast v0, Lhd/l;

    .line 91
    .line 92
    sget-object v1, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 93
    .line 94
    const/4 v9, 0x6

    .line 95
    invoke-virtual {v1, v6, v9}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-eqz v2, :cond_b

    .line 100
    .line 101
    const-class v1, Landroidx/navigation/compose/BackStackEntryIdViewModel;

    .line 102
    .line 103
    move-object v3, v1

    .line 104
    invoke-static {v3}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v4, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    .line 109
    .line 110
    invoke-direct {v4}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {v3}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v4, v3, v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lod/c;Lhd/l;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    instance-of v0, v2, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 125
    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    move-object v0, v2

    .line 129
    check-cast v0, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 130
    .line 131
    invoke-interface {v0}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_4
    move-object v5, v0

    .line 136
    goto :goto_5

    .line 137
    :cond_8
    sget-object v0, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :goto_5
    const/4 v7, 0x0

    .line 141
    const/4 v8, 0x0

    .line 142
    const/4 v3, 0x0

    .line 143
    invoke-static/range {v1 .. v8}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Lod/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Landroidx/navigation/compose/BackStackEntryIdViewModel;

    .line 148
    .line 149
    new-instance v1, Landroidx/navigation/compose/internal/WeakReference;

    .line 150
    .line 151
    invoke-direct {v1, p0}, Landroidx/navigation/compose/internal/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroidx/navigation/compose/BackStackEntryIdViewModel;->setSaveableStateHolderRef(Landroidx/navigation/compose/internal/WeakReference;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/navigation/compose/BackStackEntryIdViewModel;->getId()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    and-int/lit8 v1, p2, 0x70

    .line 162
    .line 163
    shl-int/2addr p2, v9

    .line 164
    and-int/lit16 p2, p2, 0x380

    .line 165
    .line 166
    or-int/2addr p2, v1

    .line 167
    invoke-interface {p0, v0, p1, v6, p2}, Landroidx/compose/runtime/saveable/SaveableStateHolder;->SaveableStateProvider(Ljava/lang/Object;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 168
    .line 169
    .line 170
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-eqz p2, :cond_9

    .line 175
    .line 176
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 177
    .line 178
    .line 179
    :cond_9
    :goto_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    if-eqz p2, :cond_a

    .line 184
    .line 185
    new-instance v0, Landroidx/navigation/compose/h;

    .line 186
    .line 187
    invoke-direct {v0, p0, p1, p3}, Landroidx/navigation/compose/h;-><init>(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    return-void

    .line 194
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 195
    .line 196
    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 197
    .line 198
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p0
.end method

.method private static final SaveableStateProvider$lambda$2$lambda$1(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/navigation/compose/BackStackEntryIdViewModel;
    .locals 1

    .line 1
    new-instance v0, Landroidx/navigation/compose/BackStackEntryIdViewModel;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Landroidx/navigation/compose/BackStackEntryIdViewModel;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final SaveableStateProvider$lambda$3(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p3, p2}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->SaveableStateProvider(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic a(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/navigation/compose/BackStackEntryIdViewModel;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->SaveableStateProvider$lambda$2$lambda$1(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/navigation/compose/BackStackEntryIdViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$SaveableStateProvider(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->SaveableStateProvider(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->SaveableStateProvider$lambda$3(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->LocalOwnersProvider$lambda$0(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lhd/p;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method
