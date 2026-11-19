.class public final Landroidx/compose/ui/focus/FocusRequester;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusRequester$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Cancel:Landroidx/compose/ui/focus/FocusRequester;

.field public static final Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

.field private static final Default:Landroidx/compose/ui/focus/FocusRequester;

.field private static final Redirect:Landroidx/compose/ui/focus/FocusRequester;


# instance fields
.field private final focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Default:Landroidx/compose/ui/focus/FocusRequester;

    .line 15
    .line 16
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    .line 17
    .line 18
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Cancel:Landroidx/compose/ui/focus/FocusRequester;

    .line 22
    .line 23
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    .line 24
    .line 25
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Redirect:Landroidx/compose/ui/focus/FocusRequester;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic access$getCancel$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Cancel:Landroidx/compose/ui/focus/FocusRequester;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDefault$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Default:Landroidx/compose/ui/focus/FocusRequester;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getRedirect$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Redirect:Landroidx/compose/ui/focus/FocusRequester;

    .line 2
    .line 3
    return-object v0
.end method

.method private final findFocusTarget(Lhd/l;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 10
    .line 11
    if-eq v0, v2, :cond_10

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eq v0, v1, :cond_f

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_e

    .line 26
    .line 27
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v3, 0x0

    .line 36
    move v4, v3

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v4, v1, :cond_d

    .line 39
    .line 40
    aget-object v6, v2, v4

    .line 41
    .line 42
    check-cast v6, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 43
    .line 44
    const/16 v7, 0x400

    .line 45
    .line 46
    invoke-static {v7}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-nez v8, :cond_0

    .line 59
    .line 60
    const-string/jumbo v8, "visitChildren called on an unattached node"

    .line 61
    .line 62
    .line 63
    invoke-static {v8}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    new-instance v8, Landroidx/compose/runtime/collection/MutableVector;

    .line 67
    .line 68
    const/16 v9, 0x10

    .line 69
    .line 70
    new-array v10, v9, [Landroidx/compose/ui/Modifier$Node;

    .line 71
    .line 72
    invoke-direct {v8, v10, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    if-nez v10, :cond_1

    .line 84
    .line 85
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v8, v6, v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :goto_1
    invoke-virtual {v8}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_c

    .line 101
    .line 102
    invoke-virtual {v8}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    const/4 v10, 0x1

    .line 107
    sub-int/2addr v6, v10

    .line 108
    invoke-virtual {v8, v6}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, Landroidx/compose/ui/Modifier$Node;

    .line 113
    .line 114
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    and-int/2addr v11, v7

    .line 119
    if-nez v11, :cond_2

    .line 120
    .line 121
    invoke-static {v8, v6, v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    :goto_2
    if-eqz v6, :cond_a

    .line 126
    .line 127
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    and-int/2addr v11, v7

    .line 132
    if-eqz v11, :cond_b

    .line 133
    .line 134
    const/4 v12, 0x0

    .line 135
    :goto_3
    if-eqz v6, :cond_a

    .line 136
    .line 137
    instance-of v13, v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 138
    .line 139
    if-eqz v13, :cond_3

    .line 140
    .line 141
    check-cast v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 142
    .line 143
    move-object/from16 v13, p1

    .line 144
    .line 145
    invoke-interface {v13, v6}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    check-cast v6, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-eqz v6, :cond_9

    .line 156
    .line 157
    move v5, v10

    .line 158
    goto :goto_6

    .line 159
    :cond_3
    move-object/from16 v13, p1

    .line 160
    .line 161
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    and-int/2addr v14, v7

    .line 166
    if-eqz v14, :cond_9

    .line 167
    .line 168
    instance-of v14, v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 169
    .line 170
    if-eqz v14, :cond_9

    .line 171
    .line 172
    move-object v14, v6

    .line 173
    check-cast v14, Landroidx/compose/ui/node/DelegatingNode;

    .line 174
    .line 175
    invoke-virtual {v14}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    move v15, v3

    .line 180
    :goto_4
    if-eqz v14, :cond_8

    .line 181
    .line 182
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 183
    .line 184
    .line 185
    move-result v16

    .line 186
    and-int v16, v16, v7

    .line 187
    .line 188
    if-eqz v16, :cond_7

    .line 189
    .line 190
    add-int/lit8 v15, v15, 0x1

    .line 191
    .line 192
    if-ne v15, v10, :cond_4

    .line 193
    .line 194
    move-object v6, v14

    .line 195
    goto :goto_5

    .line 196
    :cond_4
    if-nez v12, :cond_5

    .line 197
    .line 198
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 199
    .line 200
    new-array v11, v9, [Landroidx/compose/ui/Modifier$Node;

    .line 201
    .line 202
    invoke-direct {v12, v11, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    :cond_5
    if-eqz v6, :cond_6

    .line 206
    .line 207
    invoke-virtual {v12, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    const/4 v6, 0x0

    .line 211
    :cond_6
    invoke-virtual {v12, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_5
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    goto :goto_4

    .line 219
    :cond_8
    if-ne v15, v10, :cond_9

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_9
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    goto :goto_3

    .line 227
    :cond_a
    move-object/from16 v13, p1

    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :cond_b
    move-object/from16 v13, p1

    .line 232
    .line 233
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    goto :goto_2

    .line 238
    :cond_c
    move-object/from16 v13, p1

    .line 239
    .line 240
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_d
    return v5

    .line 245
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    const-string v2, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 248
    .line 249
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v1

    .line 253
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 254
    .line 255
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v1

    .line 259
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 260
    .line 261
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v1
.end method

.method public static synthetic requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8(I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method


# virtual methods
.method public final captureFocus()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    iget-object v1, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v0, :cond_1

    .line 20
    .line 21
    aget-object v4, v1, v3

    .line 22
    .line 23
    check-cast v4, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 24
    .line 25
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->captureFocus(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v2

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public final findFocusTargetNode$ui_release(Lhd/l;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 12
    .line 13
    if-eq v0, v3, :cond_13

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eq v0, v2, :cond_12

    .line 20
    .line 21
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_11

    .line 28
    .line 29
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 30
    .line 31
    iget-object v3, v2, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v4, 0x0

    .line 38
    move v5, v4

    .line 39
    move v6, v5

    .line 40
    :goto_0
    if-ge v5, v2, :cond_10

    .line 41
    .line 42
    aget-object v7, v3, v5

    .line 43
    .line 44
    check-cast v7, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 45
    .line 46
    const/16 v8, 0x400

    .line 47
    .line 48
    invoke-static {v8}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    invoke-interface {v7}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-nez v9, :cond_0

    .line 61
    .line 62
    const-string/jumbo v9, "visitChildren called on an unattached node"

    .line 63
    .line 64
    .line 65
    invoke-static {v9}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    new-instance v9, Landroidx/compose/runtime/collection/MutableVector;

    .line 69
    .line 70
    const/16 v10, 0x10

    .line 71
    .line 72
    new-array v11, v10, [Landroidx/compose/ui/Modifier$Node;

    .line 73
    .line 74
    invoke-direct {v9, v11, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v7}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    if-nez v11, :cond_1

    .line 86
    .line 87
    invoke-interface {v7}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v9, v7, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v9, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_1
    invoke-virtual {v9}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_f

    .line 103
    .line 104
    invoke-virtual {v9}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    const/4 v11, 0x1

    .line 109
    sub-int/2addr v7, v11

    .line 110
    invoke-virtual {v9, v7}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, Landroidx/compose/ui/Modifier$Node;

    .line 115
    .line 116
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    and-int/2addr v12, v8

    .line 121
    if-nez v12, :cond_3

    .line 122
    .line 123
    invoke-static {v9, v7, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    :goto_2
    if-eqz v7, :cond_2

    .line 128
    .line 129
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    and-int/2addr v12, v8

    .line 134
    if-eqz v12, :cond_e

    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    :goto_3
    if-eqz v7, :cond_2

    .line 138
    .line 139
    instance-of v14, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 140
    .line 141
    if-eqz v14, :cond_5

    .line 142
    .line 143
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 144
    .line 145
    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    invoke-interface {v14}, Landroidx/compose/ui/focus/FocusProperties;->getCanFocus()Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-eqz v14, :cond_4

    .line 154
    .line 155
    invoke-interface {v1, v7}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    check-cast v7, Ljava/lang/Boolean;

    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    goto :goto_4

    .line 166
    :cond_4
    sget-object v14, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 167
    .line 168
    invoke-virtual {v14}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    invoke-static {v7, v14, v1}, Landroidx/compose/ui/focus/TwoDimensionalFocusSearchKt;->findChildCorrespondingToFocusEnter--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILhd/l;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    :goto_4
    if-eqz v7, :cond_d

    .line 177
    .line 178
    move v6, v11

    .line 179
    goto :goto_9

    .line 180
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    and-int/2addr v14, v8

    .line 185
    if-eqz v14, :cond_6

    .line 186
    .line 187
    move v14, v11

    .line 188
    goto :goto_5

    .line 189
    :cond_6
    move v14, v4

    .line 190
    :goto_5
    if-eqz v14, :cond_d

    .line 191
    .line 192
    instance-of v14, v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 193
    .line 194
    if-eqz v14, :cond_d

    .line 195
    .line 196
    move-object v14, v7

    .line 197
    check-cast v14, Landroidx/compose/ui/node/DelegatingNode;

    .line 198
    .line 199
    invoke-virtual {v14}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 200
    .line 201
    .line 202
    move-result-object v14

    .line 203
    move v15, v4

    .line 204
    :goto_6
    if-eqz v14, :cond_c

    .line 205
    .line 206
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 207
    .line 208
    .line 209
    move-result v16

    .line 210
    and-int v16, v16, v8

    .line 211
    .line 212
    if-eqz v16, :cond_7

    .line 213
    .line 214
    move/from16 v16, v11

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_7
    move/from16 v16, v4

    .line 218
    .line 219
    :goto_7
    if-eqz v16, :cond_b

    .line 220
    .line 221
    add-int/lit8 v15, v15, 0x1

    .line 222
    .line 223
    if-ne v15, v11, :cond_8

    .line 224
    .line 225
    move-object v7, v14

    .line 226
    goto :goto_8

    .line 227
    :cond_8
    if-nez v13, :cond_9

    .line 228
    .line 229
    new-instance v13, Landroidx/compose/runtime/collection/MutableVector;

    .line 230
    .line 231
    new-array v12, v10, [Landroidx/compose/ui/Modifier$Node;

    .line 232
    .line 233
    invoke-direct {v13, v12, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 234
    .line 235
    .line 236
    :cond_9
    if-eqz v7, :cond_a

    .line 237
    .line 238
    invoke-virtual {v13, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    const/4 v7, 0x0

    .line 242
    :cond_a
    invoke-virtual {v13, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :cond_b
    :goto_8
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 246
    .line 247
    .line 248
    move-result-object v14

    .line 249
    goto :goto_6

    .line 250
    :cond_c
    if-ne v15, v11, :cond_d

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_d
    invoke-static {v13}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    goto :goto_3

    .line 258
    :cond_e
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :cond_f
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :cond_10
    return v6

    .line 269
    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 270
    .line 271
    const-string v2, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 272
    .line 273
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v1

    .line 277
    :cond_12
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 278
    .line 279
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v1

    .line 283
    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 284
    .line 285
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v1
.end method

.method public final freeFocus()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    iget-object v1, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v0, :cond_1

    .line 20
    .line 21
    aget-object v4, v1, v3

    .line 22
    .line 23
    check-cast v4, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 24
    .line 25
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->freeFocus(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v2

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public final getFocusRequesterNodes$ui_release()Landroidx/compose/runtime/collection/MutableVector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic requestFocus()V
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8(I)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final requestFocus-3ESFkO8(I)Z
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester$requestFocus$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusRequester$requestFocus$1;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusRequester;->findFocusTargetNode$ui_release(Lhd/l;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final restoreFocusedChild()Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    iget-object v1, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v3, v0, :cond_2

    .line 21
    .line 22
    aget-object v5, v1, v3

    .line 23
    .line 24
    check-cast v5, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 25
    .line 26
    invoke-static {v5}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->restoreFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v4, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    const/4 v4, 0x1

    .line 38
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v4

    .line 42
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public final saveFocusedChild()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    iget-object v1, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v0, :cond_1

    .line 20
    .line 21
    aget-object v4, v1, v3

    .line 22
    .line 23
    check-cast v4, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .line 24
    .line 25
    invoke-static {v4}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->saveFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v2

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method
