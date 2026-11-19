.class public final Landroidx/fragment/app/DefaultSpecialEffectsController;
.super Landroidx/fragment/app/SpecialEffectsController;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;,
        Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;,
        Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;,
        Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;,
        Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;,
        Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;,
        Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;,
        Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/fragment/app/SpecialEffectsController;-><init>(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic c(Landroidx/fragment/app/DefaultSpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$Operation;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/DefaultSpecialEffectsController;->collectEffects$lambda$2(Landroidx/fragment/app/DefaultSpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    return-void
.end method

.method private final collectAnimEffects(Ljava/util/List;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "PrereleaseSdkCoreDependency"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v2, v3}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 v2, 0x0

    .line 53
    move v3, v2

    .line 54
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/4 v5, 0x2

    .line 59
    if-eqz v4, :cond_6

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/fragment/app/SpecialEffectsController;->getContainer()Landroid/view/ViewGroup;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v4}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    const-string v8, "context"

    .line 80
    .line 81
    invoke-static {v6, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v6}, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;->getAnimation(Landroid/content/Context;)Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    if-nez v6, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget-object v6, v6, Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;->animator:Landroid/animation/AnimatorSet;

    .line 92
    .line 93
    if-nez v6, :cond_3

    .line 94
    .line 95
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {v7}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v7}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, Ljava/util/Collection;

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-nez v8, :cond_4

    .line 114
    .line 115
    invoke-static {v5}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_1

    .line 120
    .line 121
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {v7}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    sget-object v5, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->GONE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 130
    .line 131
    if-ne v3, v5, :cond_5

    .line 132
    .line 133
    invoke-virtual {v7, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->setAwaitingContainerChanges(Z)V

    .line 134
    .line 135
    .line 136
    :cond_5
    new-instance v3, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;

    .line 137
    .line 138
    invoke-direct {v3, v4}, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;-><init>(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->addEffect(Landroidx/fragment/app/SpecialEffectsController$Effect;)V

    .line 142
    .line 143
    .line 144
    const/4 v3, 0x1

    .line 145
    goto :goto_1

    .line 146
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    :cond_7
    :goto_2
    if-ge v2, p1, :cond_a

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    add-int/lit8 v2, v2, 0x1

    .line 157
    .line 158
    check-cast v4, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;

    .line 159
    .line 160
    invoke-virtual {v4}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v6}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    if-nez v1, :cond_8

    .line 169
    .line 170
    invoke-static {v5}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_7

    .line 175
    .line 176
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_8
    if-eqz v3, :cond_9

    .line 181
    .line 182
    invoke-static {v5}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_7

    .line 187
    .line 188
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_9
    new-instance v7, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;

    .line 193
    .line 194
    invoke-direct {v7, v4}, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;-><init>(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v7}, Landroidx/fragment/app/SpecialEffectsController$Operation;->addEffect(Landroidx/fragment/app/SpecialEffectsController$Effect;)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_a
    return-void
.end method

.method private static final collectEffects$lambda$2(Landroidx/fragment/app/DefaultSpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$Operation;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$operation"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/fragment/app/SpecialEffectsController;->applyContainerChangesToOperation$fragment_release(Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final createTransitionEffect(Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;",
            ">;Z",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p3

    .line 4
    .line 5
    move-object/from16 v4, p4

    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    move-object v6, v5

    .line 31
    check-cast v6, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 32
    .line 33
    invoke-virtual {v6}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->isVisibilityUnchanged()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-nez v6, :cond_0

    .line 38
    .line 39
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v6, 0x0

    .line 53
    :cond_2
    :goto_1
    if-ge v6, v5, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    add-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    move-object v8, v7

    .line 62
    check-cast v8, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 63
    .line 64
    invoke-virtual {v8}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;->getHandlingImpl()Landroidx/fragment/app/FragmentTransitionImpl;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    if-eqz v8, :cond_2

    .line 69
    .line 70
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    const/4 v5, 0x0

    .line 79
    move-object v7, v5

    .line 80
    const/4 v6, 0x0

    .line 81
    :goto_2
    if-ge v6, v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    check-cast v8, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 90
    .line 91
    invoke-virtual {v8}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;->getHandlingImpl()Landroidx/fragment/app/FragmentTransitionImpl;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    if-ne v9, v5, :cond_4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v2, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v2, " returned Transition "

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;->getTransition()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v2, " which uses a different Transition type than other Fragments."

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v2

    .line 152
    :cond_5
    :goto_3
    move-object v5, v9

    .line 153
    goto :goto_2

    .line 154
    :cond_6
    if-nez v5, :cond_7

    .line 155
    .line 156
    goto/16 :goto_13

    .line 157
    .line 158
    :cond_7
    move-object v2, v7

    .line 159
    new-instance v7, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    new-instance v8, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v9, Landroidx/collection/ArrayMap;

    .line 170
    .line 171
    invoke-direct {v9}, Landroidx/collection/ArrayMap;-><init>()V

    .line 172
    .line 173
    .line 174
    new-instance v6, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    new-instance v10, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    new-instance v12, Landroidx/collection/ArrayMap;

    .line 185
    .line 186
    invoke-direct {v12}, Landroidx/collection/ArrayMap;-><init>()V

    .line 187
    .line 188
    .line 189
    new-instance v13, Landroidx/collection/ArrayMap;

    .line 190
    .line 191
    invoke-direct {v13}, Landroidx/collection/ArrayMap;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    move-object v14, v10

    .line 199
    move-object v10, v6

    .line 200
    move-object v6, v14

    .line 201
    move-object v14, v2

    .line 202
    const/4 v2, 0x0

    .line 203
    :goto_4
    if-ge v2, v11, :cond_1d

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v16

    .line 209
    add-int/lit8 v2, v2, 0x1

    .line 210
    .line 211
    check-cast v16, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 212
    .line 213
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;->hasSharedElementTransition()Z

    .line 214
    .line 215
    .line 216
    move-result v17

    .line 217
    if-eqz v17, :cond_1c

    .line 218
    .line 219
    if-eqz v3, :cond_1c

    .line 220
    .line 221
    if-eqz v4, :cond_1c

    .line 222
    .line 223
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;->getSharedElementTransition()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-virtual {v5, v6}, Landroidx/fragment/app/FragmentTransitionImpl;->cloneTransition(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {v5, v6}, Landroidx/fragment/app/FragmentTransitionImpl;->wrapTransitionInSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    const-string v10, "lastIn.fragment.sharedElementSourceNames"

    .line 244
    .line 245
    invoke-static {v6, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    const-string v15, "firstOut.fragment.sharedElementSourceNames"

    .line 257
    .line 258
    invoke-static {v10, v15}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 262
    .line 263
    .line 264
    move-result-object v15

    .line 265
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    move/from16 v17, v2

    .line 270
    .line 271
    const-string v2, "firstOut.fragment.sharedElementTargetNames"

    .line 272
    .line 273
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    move-object/from16 v18, v5

    .line 281
    .line 282
    move-object/from16 v19, v7

    .line 283
    .line 284
    const/4 v5, 0x0

    .line 285
    :goto_5
    const/4 v7, -0x1

    .line 286
    if-ge v5, v2, :cond_9

    .line 287
    .line 288
    move/from16 v20, v2

    .line 289
    .line 290
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-eq v2, v7, :cond_8

    .line 299
    .line 300
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-virtual {v6, v2, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 308
    .line 309
    move/from16 v2, v20

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_9
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    const-string v2, "lastIn.fragment.sharedElementTargetNames"

    .line 321
    .line 322
    invoke-static {v10, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    if-nez p2, :cond_a

    .line 326
    .line 327
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Landroidx/core/app/SharedElementCallback;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Landroidx/core/app/SharedElementCallback;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-static {v2, v5}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    goto :goto_6

    .line 348
    :cond_a
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Landroidx/core/app/SharedElementCallback;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Landroidx/core/app/SharedElementCallback;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-static {v2, v5}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    :goto_6
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    check-cast v5, Landroidx/core/app/SharedElementCallback;

    .line 373
    .line 374
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Landroidx/core/app/SharedElementCallback;

    .line 379
    .line 380
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 381
    .line 382
    .line 383
    move-result v15

    .line 384
    move/from16 v20, v7

    .line 385
    .line 386
    move-object/from16 v21, v8

    .line 387
    .line 388
    const/4 v7, 0x0

    .line 389
    :goto_7
    const-string v8, "enteringNames[i]"

    .line 390
    .line 391
    move/from16 v22, v11

    .line 392
    .line 393
    const-string v11, "exitingNames[i]"

    .line 394
    .line 395
    if-ge v7, v15, :cond_b

    .line 396
    .line 397
    move/from16 v23, v15

    .line 398
    .line 399
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v15

    .line 403
    invoke-static {v15, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    check-cast v15, Ljava/lang/String;

    .line 407
    .line 408
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v11

    .line 412
    invoke-static {v11, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    check-cast v11, Ljava/lang/String;

    .line 416
    .line 417
    invoke-interface {v9, v15, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    add-int/lit8 v7, v7, 0x1

    .line 421
    .line 422
    move/from16 v11, v22

    .line 423
    .line 424
    move/from16 v15, v23

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_b
    const/4 v7, 0x2

    .line 428
    invoke-static {v7}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 429
    .line 430
    .line 431
    move-result v15

    .line 432
    if-eqz v15, :cond_d

    .line 433
    .line 434
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 435
    .line 436
    .line 437
    move-result v15

    .line 438
    move/from16 v23, v7

    .line 439
    .line 440
    const/4 v7, 0x0

    .line 441
    :goto_8
    if-ge v7, v15, :cond_c

    .line 442
    .line 443
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v24

    .line 447
    add-int/lit8 v7, v7, 0x1

    .line 448
    .line 449
    check-cast v24, Ljava/lang/String;

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 453
    .line 454
    .line 455
    move-result v7

    .line 456
    const/4 v15, 0x0

    .line 457
    :goto_9
    if-ge v15, v7, :cond_e

    .line 458
    .line 459
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v24

    .line 463
    add-int/lit8 v15, v15, 0x1

    .line 464
    .line 465
    check-cast v24, Ljava/lang/String;

    .line 466
    .line 467
    goto :goto_9

    .line 468
    :cond_d
    move/from16 v23, v7

    .line 469
    .line 470
    :cond_e
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    iget-object v7, v7, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 475
    .line 476
    const-string v15, "firstOut.fragment.mView"

    .line 477
    .line 478
    invoke-static {v7, v15}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-direct {v0, v12, v7}, Landroidx/fragment/app/DefaultSpecialEffectsController;->findNamedViews(Ljava/util/Map;Landroid/view/View;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v6}, Landroidx/collection/ArrayMap;->retainAll(Ljava/util/Collection;)Z

    .line 485
    .line 486
    .line 487
    if-eqz v5, :cond_14

    .line 488
    .line 489
    invoke-static/range {v23 .. v23}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    if-eqz v7, :cond_f

    .line 494
    .line 495
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    :cond_f
    invoke-virtual {v5, v6, v12}, Landroidx/core/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 502
    .line 503
    .line 504
    move-result v5

    .line 505
    add-int/lit8 v5, v5, -0x1

    .line 506
    .line 507
    if-ltz v5, :cond_13

    .line 508
    .line 509
    :goto_a
    add-int/lit8 v7, v5, -0x1

    .line 510
    .line 511
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    invoke-static {v5, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    check-cast v5, Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v12, v5}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v15

    .line 524
    check-cast v15, Landroid/view/View;

    .line 525
    .line 526
    if-nez v15, :cond_10

    .line 527
    .line 528
    invoke-virtual {v9, v5}, Landroidx/collection/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-object/from16 v24, v6

    .line 532
    .line 533
    goto :goto_b

    .line 534
    :cond_10
    move-object/from16 v24, v6

    .line 535
    .line 536
    invoke-static {v15}, Landroidx/core/view/ViewCompat;->getTransitionName(Landroid/view/View;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    if-nez v6, :cond_11

    .line 545
    .line 546
    invoke-virtual {v9, v5}, Landroidx/collection/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    check-cast v5, Ljava/lang/String;

    .line 551
    .line 552
    invoke-static {v15}, Landroidx/core/view/ViewCompat;->getTransitionName(Landroid/view/View;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v6

    .line 556
    invoke-interface {v9, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    :cond_11
    :goto_b
    if-gez v7, :cond_12

    .line 560
    .line 561
    goto :goto_c

    .line 562
    :cond_12
    move v5, v7

    .line 563
    move-object/from16 v6, v24

    .line 564
    .line 565
    goto :goto_a

    .line 566
    :cond_13
    move-object/from16 v24, v6

    .line 567
    .line 568
    goto :goto_c

    .line 569
    :cond_14
    move-object/from16 v24, v6

    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/collection/ArrayMap;->keySet()Ljava/util/Set;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    check-cast v5, Ljava/util/Collection;

    .line 576
    .line 577
    invoke-virtual {v9, v5}, Landroidx/collection/ArrayMap;->retainAll(Ljava/util/Collection;)Z

    .line 578
    .line 579
    .line 580
    :goto_c
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 585
    .line 586
    const-string v6, "lastIn.fragment.mView"

    .line 587
    .line 588
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-direct {v0, v13, v5}, Landroidx/fragment/app/DefaultSpecialEffectsController;->findNamedViews(Ljava/util/Map;Landroid/view/View;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v13, v10}, Landroidx/collection/ArrayMap;->retainAll(Ljava/util/Collection;)Z

    .line 595
    .line 596
    .line 597
    invoke-virtual {v9}, Landroidx/collection/ArrayMap;->values()Ljava/util/Collection;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    invoke-virtual {v13, v5}, Landroidx/collection/ArrayMap;->retainAll(Ljava/util/Collection;)Z

    .line 602
    .line 603
    .line 604
    if-eqz v2, :cond_19

    .line 605
    .line 606
    invoke-static/range {v23 .. v23}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 607
    .line 608
    .line 609
    move-result v5

    .line 610
    if-eqz v5, :cond_15

    .line 611
    .line 612
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    :cond_15
    invoke-virtual {v2, v10, v13}, Landroidx/core/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    add-int/lit8 v2, v2, -0x1

    .line 623
    .line 624
    if-ltz v2, :cond_1a

    .line 625
    .line 626
    :goto_d
    add-int/lit8 v5, v2, -0x1

    .line 627
    .line 628
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-static {v2, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    check-cast v2, Ljava/lang/String;

    .line 636
    .line 637
    invoke-virtual {v13, v2}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v6

    .line 641
    check-cast v6, Landroid/view/View;

    .line 642
    .line 643
    if-nez v6, :cond_16

    .line 644
    .line 645
    invoke-static {v9, v2}, Landroidx/fragment/app/FragmentTransition;->findKeyForValue(Landroidx/collection/ArrayMap;Ljava/lang/String;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    if-eqz v2, :cond_17

    .line 650
    .line 651
    invoke-virtual {v9, v2}, Landroidx/collection/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    goto :goto_e

    .line 655
    :cond_16
    invoke-static {v6}, Landroidx/core/view/ViewCompat;->getTransitionName(Landroid/view/View;)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    invoke-static {v2, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    if-nez v7, :cond_17

    .line 664
    .line 665
    invoke-static {v9, v2}, Landroidx/fragment/app/FragmentTransition;->findKeyForValue(Landroidx/collection/ArrayMap;Ljava/lang/String;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    if-eqz v2, :cond_17

    .line 670
    .line 671
    invoke-static {v6}, Landroidx/core/view/ViewCompat;->getTransitionName(Landroid/view/View;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v6

    .line 675
    invoke-interface {v9, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    :cond_17
    :goto_e
    if-gez v5, :cond_18

    .line 679
    .line 680
    goto :goto_f

    .line 681
    :cond_18
    move v2, v5

    .line 682
    goto :goto_d

    .line 683
    :cond_19
    invoke-static {v9, v13}, Landroidx/fragment/app/FragmentTransition;->retainValues(Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;)V

    .line 684
    .line 685
    .line 686
    :cond_1a
    :goto_f
    invoke-virtual {v9}, Landroidx/collection/ArrayMap;->keySet()Ljava/util/Set;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    const-string/jumbo v5, "sharedElementNameMapping.keys"

    .line 691
    .line 692
    .line 693
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    check-cast v2, Ljava/util/Collection;

    .line 697
    .line 698
    invoke-direct {v0, v12, v2}, Landroidx/fragment/app/DefaultSpecialEffectsController;->retainMatchingViews(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v9}, Landroidx/collection/ArrayMap;->values()Ljava/util/Collection;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    const-string/jumbo v5, "sharedElementNameMapping.values"

    .line 706
    .line 707
    .line 708
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    invoke-direct {v0, v13, v2}, Landroidx/fragment/app/DefaultSpecialEffectsController;->retainMatchingViews(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v9}, Landroidx/collection/SimpleArrayMap;->isEmpty()Z

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    if-eqz v2, :cond_1b

    .line 719
    .line 720
    new-instance v2, Ljava/lang/StringBuilder;

    .line 721
    .line 722
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 723
    .line 724
    .line 725
    const-string v5, "Ignoring shared elements transition "

    .line 726
    .line 727
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    const-string v5, " between "

    .line 734
    .line 735
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    const-string v5, " and "

    .line 742
    .line 743
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    const-string v5, " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."

    .line 750
    .line 751
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    const-string v5, "FragmentManager"

    .line 759
    .line 760
    invoke-static {v5, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->clear()V

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->clear()V

    .line 767
    .line 768
    .line 769
    move/from16 v2, v17

    .line 770
    .line 771
    move-object/from16 v5, v18

    .line 772
    .line 773
    move-object/from16 v7, v19

    .line 774
    .line 775
    move-object/from16 v8, v21

    .line 776
    .line 777
    move/from16 v11, v22

    .line 778
    .line 779
    move-object/from16 v6, v24

    .line 780
    .line 781
    const/4 v14, 0x0

    .line 782
    goto/16 :goto_4

    .line 783
    .line 784
    :cond_1b
    move/from16 v2, v17

    .line 785
    .line 786
    move-object/from16 v5, v18

    .line 787
    .line 788
    move-object/from16 v7, v19

    .line 789
    .line 790
    move-object/from16 v8, v21

    .line 791
    .line 792
    move/from16 v11, v22

    .line 793
    .line 794
    move-object/from16 v6, v24

    .line 795
    .line 796
    goto/16 :goto_4

    .line 797
    .line 798
    :cond_1c
    move/from16 v17, v2

    .line 799
    .line 800
    move-object/from16 v18, v5

    .line 801
    .line 802
    move-object/from16 v19, v7

    .line 803
    .line 804
    move-object/from16 v21, v8

    .line 805
    .line 806
    move/from16 v22, v11

    .line 807
    .line 808
    move/from16 v2, v17

    .line 809
    .line 810
    move-object/from16 v5, v18

    .line 811
    .line 812
    move-object/from16 v7, v19

    .line 813
    .line 814
    move-object/from16 v8, v21

    .line 815
    .line 816
    move/from16 v11, v22

    .line 817
    .line 818
    goto/16 :goto_4

    .line 819
    .line 820
    :cond_1d
    move-object/from16 v18, v5

    .line 821
    .line 822
    move-object/from16 v19, v7

    .line 823
    .line 824
    move-object/from16 v21, v8

    .line 825
    .line 826
    if-nez v14, :cond_1f

    .line 827
    .line 828
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    if-eqz v2, :cond_1e

    .line 833
    .line 834
    return-void

    .line 835
    :cond_1e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    const/4 v5, 0x0

    .line 840
    :goto_10
    if-ge v5, v2, :cond_20

    .line 841
    .line 842
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v7

    .line 846
    add-int/lit8 v5, v5, 0x1

    .line 847
    .line 848
    check-cast v7, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 849
    .line 850
    invoke-virtual {v7}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;->getTransition()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v7

    .line 854
    if-nez v7, :cond_1f

    .line 855
    .line 856
    goto :goto_10

    .line 857
    :cond_1f
    move-object v2, v1

    .line 858
    goto :goto_11

    .line 859
    :cond_20
    return-void

    .line 860
    :goto_11
    new-instance v1, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    .line 861
    .line 862
    move-object v11, v6

    .line 863
    move-object v6, v14

    .line 864
    move-object/from16 v5, v18

    .line 865
    .line 866
    move-object/from16 v7, v19

    .line 867
    .line 868
    move-object/from16 v8, v21

    .line 869
    .line 870
    move/from16 v14, p2

    .line 871
    .line 872
    invoke-direct/range {v1 .. v14}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;-><init>(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 876
    .line 877
    .line 878
    move-result v3

    .line 879
    const/4 v15, 0x0

    .line 880
    :goto_12
    if-ge v15, v3, :cond_21

    .line 881
    .line 882
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v4

    .line 886
    add-int/lit8 v15, v15, 0x1

    .line 887
    .line 888
    check-cast v4, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 889
    .line 890
    invoke-virtual {v4}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    invoke-virtual {v4, v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->addEffect(Landroidx/fragment/app/SpecialEffectsController$Effect;)V

    .line 895
    .line 896
    .line 897
    goto :goto_12

    .line 898
    :cond_21
    :goto_13
    return-void
.end method

.method private final findNamedViews(Ljava/util/Map;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Landroidx/core/view/ViewCompat;->getTransitionName(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    check-cast p2, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    const-string v3, "child"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, v2}, Landroidx/fragment/app/DefaultSpecialEffectsController;->findNamedViews(Ljava/util/Map;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method private final retainMatchingViews(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ArrayMap<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/collection/ArrayMap;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "entries"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v0, Landroidx/fragment/app/DefaultSpecialEffectsController$retainMatchingViews$1;

    .line 13
    .line 14
    invoke-direct {v0, p2}, Landroidx/fragment/app/DefaultSpecialEffectsController$retainMatchingViews$1;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lrc/b0;->Q(Ljava/lang/Iterable;Lhd/l;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final syncAnimations(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 32
    .line 33
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 34
    .line 35
    iget v3, v3, Landroidx/fragment/app/Fragment$AnimationInfo;->mEnterAnim:I

    .line 36
    .line 37
    iput v3, v2, Landroidx/fragment/app/Fragment$AnimationInfo;->mEnterAnim:I

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 44
    .line 45
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 46
    .line 47
    iget v3, v3, Landroidx/fragment/app/Fragment$AnimationInfo;->mExitAnim:I

    .line 48
    .line 49
    iput v3, v2, Landroidx/fragment/app/Fragment$AnimationInfo;->mExitAnim:I

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 56
    .line 57
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 58
    .line 59
    iget v3, v3, Landroidx/fragment/app/Fragment$AnimationInfo;->mPopEnterAnim:I

    .line 60
    .line 61
    iput v3, v2, Landroidx/fragment/app/Fragment$AnimationInfo;->mPopEnterAnim:I

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 68
    .line 69
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$AnimationInfo;

    .line 70
    .line 71
    iget v2, v2, Landroidx/fragment/app/Fragment$AnimationInfo;->mPopExitAnim:I

    .line 72
    .line 73
    iput v2, v1, Landroidx/fragment/app/Fragment$AnimationInfo;->mPopExitAnim:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void
.end method


# virtual methods
.method public collectEffects(Ljava/util/List;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "operations"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 9
    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const-string/jumbo v4, "operation.fragment.mView"

    .line 24
    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v5, v2

    .line 33
    check-cast v5, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 34
    .line 35
    sget-object v6, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

    .line 36
    .line 37
    invoke-virtual {v5}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    iget-object v7, v7, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 42
    .line 43
    invoke-static {v7, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v7}, Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;->asOperationState(Landroid/view/View;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    sget-object v7, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 51
    .line 52
    if-ne v6, v7, :cond_0

    .line 53
    .line 54
    invoke-virtual {v5}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    if-eq v5, v7, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object v2, v3

    .line 62
    :goto_0
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :cond_2
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    move-object v6, v5

    .line 83
    check-cast v6, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 84
    .line 85
    sget-object v7, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

    .line 86
    .line 87
    invoke-virtual {v6}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    iget-object v8, v8, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 92
    .line 93
    invoke-static {v8, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, v8}, Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;->asOperationState(Landroid/view/View;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    sget-object v8, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 101
    .line 102
    if-eq v7, v8, :cond_2

    .line 103
    .line 104
    invoke-virtual {v6}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-ne v6, v8, :cond_2

    .line 109
    .line 110
    move-object v3, v5

    .line 111
    :cond_3
    check-cast v3, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 112
    .line 113
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v1, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-direct {p0, p1}, Landroidx/fragment/app/DefaultSpecialEffectsController;->syncAnimations(Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_7

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    check-cast v4, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 153
    .line 154
    new-instance v5, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;

    .line 155
    .line 156
    invoke-direct {v5, v4, p2}, Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;-><init>(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    new-instance v5, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 163
    .line 164
    const/4 v6, 0x0

    .line 165
    const/4 v7, 0x1

    .line 166
    if-eqz p2, :cond_5

    .line 167
    .line 168
    if-ne v4, v2, :cond_6

    .line 169
    .line 170
    :goto_2
    move v6, v7

    .line 171
    goto :goto_3

    .line 172
    :cond_5
    if-ne v4, v3, :cond_6

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_6
    :goto_3
    invoke-direct {v5, v4, p2, v6}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;-><init>(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    new-instance v5, Landroidx/fragment/app/a;

    .line 182
    .line 183
    invoke-direct {v5, p0, v4}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/DefaultSpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v5}, Landroidx/fragment/app/SpecialEffectsController$Operation;->addCompletionListener(Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_7
    invoke-direct {p0, v1, p2, v2, v3}, Landroidx/fragment/app/DefaultSpecialEffectsController;->createTransitionEffect(Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    .line 191
    .line 192
    .line 193
    invoke-direct {p0, v0}, Landroidx/fragment/app/DefaultSpecialEffectsController;->collectAnimEffects(Ljava/util/List;)V

    .line 194
    .line 195
    .line 196
    return-void
.end method
