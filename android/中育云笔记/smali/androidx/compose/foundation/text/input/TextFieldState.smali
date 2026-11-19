.class public final Landroidx/compose/foundation/text/input/TextFieldState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;,
        Landroidx/compose/foundation/text/input/TextFieldState$Saver;,
        Landroidx/compose/foundation/text/input/TextFieldState$WhenMappings;
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final isEditing$delegate:Landroidx/compose/runtime/MutableState;

.field private mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

.field private final notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;",
            ">;"
        }
    .end annotation
.end field

.field private final textUndoManager:Landroidx/compose/foundation/text/input/TextUndoManager;

.field private final undoState:Landroidx/compose/foundation/text/input/UndoState;

.field private final value$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;J)V
    .locals 6

    .line 18
    new-instance v4, Landroidx/compose/foundation/text/input/TextUndoManager;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {v4, v0, v0, v1, v0}, Landroidx/compose/foundation/text/input/TextUndoManager;-><init>(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text/input/internal/undo/UndoManager;ILkotlin/jvm/internal/n;)V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text/input/TextFieldState;-><init>(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;Lkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 15
    const-string p1, ""

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide p2

    :cond_1
    const/4 p4, 0x0

    .line 17
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/input/TextFieldState;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/n;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;)V
    .locals 21

    move-object/from16 v0, p0

    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p4

    .line 4
    iput-object v1, v0, Landroidx/compose/foundation/text/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text/input/TextUndoManager;

    .line 5
    new-instance v1, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 6
    new-instance v2, Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v11, 0x0

    move-wide/from16 v14, p2

    invoke-static {v14, v15, v11, v3}, Landroidx/compose/ui/text/TextRangeKt;->coerceIn-8ffj60Q(JII)J

    move-result-wide v4

    const/16 v9, 0x1c

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, p1

    .line 8
    invoke-direct/range {v2 .. v10}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;-><init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;ILkotlin/jvm/internal/n;)V

    const/16 v6, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 9
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/text/input/TextFieldBuffer;-><init>(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;ILkotlin/jvm/internal/n;)V

    iput-object v1, v0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Landroidx/compose/foundation/text/input/TextFieldState;->isEditing$delegate:Landroidx/compose/runtime/MutableState;

    .line 11
    new-instance v12, Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    const/16 v19, 0x1c

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v13, p1

    invoke-direct/range {v12 .. v20}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;-><init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;ILkotlin/jvm/internal/n;)V

    invoke-static {v12, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Landroidx/compose/foundation/text/input/TextFieldState;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 12
    new-instance v1, Landroidx/compose/foundation/text/input/UndoState;

    invoke-direct {v1, v0}, Landroidx/compose/foundation/text/input/UndoState;-><init>(Landroidx/compose/foundation/text/input/TextFieldState;)V

    iput-object v1, v0, Landroidx/compose/foundation/text/input/TextFieldState;->undoState:Landroidx/compose/foundation/text/input/UndoState;

    .line 13
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    const/16 v2, 0x10

    new-array v2, v2, [Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;

    invoke-direct {v1, v2, v11}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 14
    iput-object v1, v0, Landroidx/compose/foundation/text/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/input/TextFieldState;-><init>(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLkotlin/jvm/internal/n;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/TextFieldState;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public static final synthetic access$commitEditAsUser(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/TextFieldState;->commitEditAsUser(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/TextFieldState;->updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final commitEditAsUser(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->getChangeCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object v2, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 38
    .line 39
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposition-MzsxiRA$foundation_release()Landroidx/compose/ui/text/TextRange;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getHighlight()Lkotlin/Pair;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 54
    .line 55
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getHighlight$foundation_release()Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getComposingAnnotations()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 70
    .line 71
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposingAnnotations$foundation_release()Landroidx/compose/runtime/collection/MutableVector;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    return-void

    .line 83
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v0, Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 88
    .line 89
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 90
    .line 91
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 96
    .line 97
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 102
    .line 103
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposition-MzsxiRA$foundation_release()Landroidx/compose/ui/text/TextRange;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 108
    .line 109
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getHighlight$foundation_release()Lkotlin/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iget-object p3, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 114
    .line 115
    invoke-virtual {p3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposition-MzsxiRA$foundation_release()Landroidx/compose/ui/text/TextRange;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    iget-object v6, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 120
    .line 121
    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposingAnnotations$foundation_release()Landroidx/compose/runtime/collection/MutableVector;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-static {p3, v6}, Landroidx/compose/foundation/text/input/TextFieldStateKt;->access$finalizeComposingAnnotations-itr0ztk(Landroidx/compose/ui/text/TextRange;Landroidx/compose/runtime/collection/MutableVector;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const/4 v7, 0x0

    .line 130
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;-><init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;Lkotlin/jvm/internal/n;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, p1, v0, p2}, Landroidx/compose/foundation/text/input/TextFieldState;->updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->getChangeCount()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const/4 v1, 0x0

    .line 148
    const/4 v2, 0x1

    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    move v0, v2

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    move v0, v1

    .line 154
    :goto_1
    new-instance v4, Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 155
    .line 156
    iget-object v5, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 157
    .line 158
    invoke-virtual {v5}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    iget-object v6, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 163
    .line 164
    invoke-virtual {v6}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 165
    .line 166
    .line 167
    move-result-wide v6

    .line 168
    iget-object v8, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 169
    .line 170
    invoke-virtual {v8}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposition-MzsxiRA$foundation_release()Landroidx/compose/ui/text/TextRange;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    iget-object v9, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 175
    .line 176
    invoke-virtual {v9}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getHighlight$foundation_release()Lkotlin/Pair;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    iget-object v10, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 181
    .line 182
    invoke-virtual {v10}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposition-MzsxiRA$foundation_release()Landroidx/compose/ui/text/TextRange;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    iget-object v11, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 187
    .line 188
    invoke-virtual {v11}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposingAnnotations$foundation_release()Landroidx/compose/runtime/collection/MutableVector;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    invoke-static {v10, v11}, Landroidx/compose/foundation/text/input/TextFieldStateKt;->access$finalizeComposingAnnotations-itr0ztk(Landroidx/compose/ui/text/TextRange;Landroidx/compose/runtime/collection/MutableVector;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    const/4 v11, 0x0

    .line 197
    invoke-direct/range {v4 .. v11}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;-><init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;Lkotlin/jvm/internal/n;)V

    .line 198
    .line 199
    .line 200
    if-nez p1, :cond_5

    .line 201
    .line 202
    if-eqz v0, :cond_4

    .line 203
    .line 204
    if-eqz p2, :cond_4

    .line 205
    .line 206
    move v1, v2

    .line 207
    :cond_4
    invoke-direct {p0, v3, v4, v1}, Landroidx/compose/foundation/text/input/TextFieldState;->updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 211
    .line 212
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-direct {p0, v3, v4, p1, p3}, Landroidx/compose/foundation/text/input/TextFieldState;->recordEditForUndo(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_5
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 221
    .line 222
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    new-instance v0, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 227
    .line 228
    const/16 v5, 0x8

    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    move-object v1, v4

    .line 232
    const/4 v4, 0x0

    .line 233
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text/input/TextFieldBuffer;-><init>(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;ILkotlin/jvm/internal/n;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p1, v0}, Landroidx/compose/foundation/text/input/InputTransformation;->transformInput(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->asCharSequence()Ljava/lang/CharSequence;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1, v1}, Lqd/z;->w(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    xor-int/lit8 v2, p1, 0x1

    .line 248
    .line 249
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 250
    .line 251
    .line 252
    move-result-wide v4

    .line 253
    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    .line 254
    .line 255
    .line 256
    move-result-wide v6

    .line 257
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    xor-int/lit8 v5, v4, 0x1

    .line 262
    .line 263
    if-eqz p1, :cond_7

    .line 264
    .line 265
    if-nez v4, :cond_6

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_6
    invoke-virtual {v1}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    const/4 v10, 0x5

    .line 273
    const/4 v11, 0x0

    .line 274
    const-wide/16 v6, 0x0

    .line 275
    .line 276
    const/4 v9, 0x0

    .line 277
    move-object v5, v0

    .line 278
    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->toTextFieldCharSequence-I88jaVs$foundation_release$default(Landroidx/compose/foundation/text/input/TextFieldBuffer;JLandroidx/compose/ui/text/TextRange;Ljava/util/List;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-direct {p0, v3, p1, p2}, Landroidx/compose/foundation/text/input/TextFieldState;->updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V

    .line 283
    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_7
    :goto_2
    invoke-virtual {p0, v0, v2, v5}, Landroidx/compose/foundation/text/input/TextFieldState;->syncMainBufferToTemporaryBuffer$foundation_release(Landroidx/compose/foundation/text/input/TextFieldBuffer;ZZ)V

    .line 287
    .line 288
    .line 289
    :goto_3
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChanges()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    invoke-direct {p0, v3, p1, p2, p3}, Landroidx/compose/foundation/text/input/TextFieldState;->recordEditForUndo(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 298
    .line 299
    .line 300
    return-void
.end method

.method public static synthetic commitEditAsUser$default(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    sget-object p3, Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;

    .line 11
    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/TextFieldState;->commitEditAsUser(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic editAsUser$foundation_release$default(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Lhd/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    sget-object p3, Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p5

    .line 16
    invoke-virtual {p5}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    invoke-virtual {p5}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->clearChanges()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object p5

    .line 27
    invoke-interface {p4, p5}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static synthetic getMainBuffer$foundation_release$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method public static synthetic getUndoState$annotations()V
    .locals 0
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    return-void
.end method

.method private final isEditing()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->isEditing$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final recordEditForUndo(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/input/TextFieldState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    aget p4, v0, p4

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p4, v0, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p4, v1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p4, v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p4, p0, Landroidx/compose/foundation/text/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text/input/TextUndoManager;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p4, p1, p2, p3, v0}, Landroidx/compose/foundation/text/input/TextUndoManagerKt;->recordChanges(Landroidx/compose/foundation/text/input/TextUndoManager;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object p4, p0, Landroidx/compose/foundation/text/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text/input/TextUndoManager;

    .line 27
    .line 28
    invoke-static {p4, p1, p2, p3, v0}, Landroidx/compose/foundation/text/input/TextUndoManagerKt;->recordChanges(Landroidx/compose/foundation/text/input/TextUndoManager;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/text/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text/input/TextUndoManager;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextUndoManager;->clearHistory()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final setEditing(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->isEditing$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final setValue(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V
    .locals 6

    .line 1
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text/input/TextFieldState;->setValue(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->finishEditing()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    .line 8
    .line 9
    iget-object v1, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v3, v0, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    check-cast v4, Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;

    .line 22
    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v5, v2

    .line 40
    :goto_1
    invoke-interface {v4, p1, p2, v5}, Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;->onChange(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method


# virtual methods
.method public final addNotifyImeListener$foundation_release(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final commitEdit(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChanges()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;->getChangeCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object v4, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 20
    .line 21
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    xor-int/2addr v1, v2

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/compose/foundation/text/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text/input/TextUndoManager;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/TextUndoManager;->clearHistory()V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/text/input/TextFieldState;->syncMainBufferToTemporaryBuffer$foundation_release(Landroidx/compose/foundation/text/input/TextFieldBuffer;ZZ)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final edit(Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->startEdit()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/TextFieldState;->commitEdit(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lkotlin/jvm/internal/s;->b(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->finishEditing()V

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/s;->a(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/s;->b(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->finishEditing()V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/jvm/internal/s;->a(I)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public final editAsUser$foundation_release(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/InputTransformation;",
            "Z",
            "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->clearChanges()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p4, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final editWithNoSideEffects$foundation_release(Lhd/l;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->clearChanges()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v6, 0x7

    .line 24
    const/4 v7, 0x0

    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->toTextFieldCharSequence-I88jaVs$foundation_release$default(Landroidx/compose/foundation/text/input/TextFieldBuffer;JLandroidx/compose/ui/text/TextRange;Ljava/util/List;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-static {p0, v0, p1, v1}, Landroidx/compose/foundation/text/input/TextFieldState;->access$updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final finishEditing()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/input/TextFieldState;->setEditing(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelection-d9O1mEE()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getTextUndoManager$foundation_release()Landroidx/compose/foundation/text/input/TextUndoManager;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text/input/TextUndoManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUndoState()Landroidx/compose/foundation/text/input/UndoState;
    .locals 1
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->undoState:Landroidx/compose/foundation/text/input/UndoState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 8
    .line 9
    return-object v0
.end method

.method public final removeNotifyImeListener$foundation_release(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/collection/MutableVector;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setMainBuffer$foundation_release(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 2
    .line 3
    return-void
.end method

.method public final startEdit()Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .locals 8

    .line 1
    sget-object v1, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lhd/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    move-object v3, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->isEditing()Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-virtual {v1, v2, v4, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lhd/l;)V

    .line 26
    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string v0, "TextFieldState does not support concurrent or nested editing."

    .line 31
    .line 32
    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 v0, 0x1

    .line 36
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/input/TextFieldState;->setEditing(Z)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getValue$foundation_release()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/16 v6, 0xe

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/text/input/TextFieldBuffer;-><init>(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;ILkotlin/jvm/internal/n;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    invoke-virtual {v1, v2, v4, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lhd/l;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public final syncMainBufferToTemporaryBuffer$foundation_release(Landroidx/compose/foundation/text/input/TextFieldBuffer;ZZ)V
    .locals 11
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 2
    .line 3
    const/4 v5, 0x7

    .line 4
    const/4 v6, 0x0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->toTextFieldCharSequence-I88jaVs$foundation_release$default(Landroidx/compose/foundation/text/input/TextFieldBuffer;JLandroidx/compose/ui/text/TextRange;Ljava/util/List;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance v1, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 16
    .line 17
    new-instance v2, Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const/16 v9, 0x1c

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    invoke-direct/range {v2 .. v10}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;-><init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;ILkotlin/jvm/internal/n;)V

    .line 34
    .line 35
    .line 36
    const/16 v6, 0xe

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/text/input/TextFieldBuffer;-><init>(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;ILkotlin/jvm/internal/n;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    if-eqz p3, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    invoke-virtual {v1, v2, v3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->setSelection-5zc-tL8(J)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 75
    .line 76
    if-nez p3, :cond_2

    .line 77
    .line 78
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposition-MzsxiRA$foundation_release()Landroidx/compose/ui/text/TextRange;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_3

    .line 91
    .line 92
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->commitComposition$foundation_release()V

    .line 95
    .line 96
    .line 97
    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/text/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 98
    .line 99
    const/4 v6, 0x7

    .line 100
    const/4 v7, 0x0

    .line 101
    const-wide/16 v2, 0x0

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    const/4 v5, 0x0

    .line 105
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->toTextFieldCharSequence-I88jaVs$foundation_release$default(Landroidx/compose/foundation/text/input/TextFieldBuffer;JLandroidx/compose/ui/text/TextRange;Ljava/util/List;ILjava/lang/Object;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const/4 p2, 0x1

    .line 110
    invoke-direct {p0, v0, p1, p2}, Landroidx/compose/foundation/text/input/TextFieldState;->updateValueAndNotifyListeners(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lhd/l;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v5, "TextFieldState(selection="

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getSelection-d9O1mEE()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->toString-impl(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v5, ", text=\""

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/TextFieldState;->getText()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v5, "\")"

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lhd/l;)V

    .line 62
    .line 63
    .line 64
    return-object v4

    .line 65
    :catchall_0
    move-exception v4

    .line 66
    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lhd/l;)V

    .line 67
    .line 68
    .line 69
    throw v4
.end method
