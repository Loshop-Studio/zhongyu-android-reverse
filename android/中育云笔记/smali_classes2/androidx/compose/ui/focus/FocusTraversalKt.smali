.class public final Landroidx/compose/ui/focus/FocusTraversalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusTraversalKt$WhenMappings;
    }
.end annotation


# direct methods
.method public static final customFocusSearch--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getNext()Landroidx/compose/ui/focus/FocusRequester;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getPrevious-dhqQ-8s()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getPrevious()Landroidx/compose/ui/focus/FocusRequester;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getUp-dhqQ-8s()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getUp()Landroidx/compose/ui/focus/FocusRequester;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getDown-dhqQ-8s()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getDown()Landroidx/compose/ui/focus/FocusRequester;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getLeft-dhqQ-8s()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const/4 v3, 0x2

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x1

    .line 78
    if-eqz v2, :cond_8

    .line 79
    .line 80
    sget-object p0, Landroidx/compose/ui/focus/FocusTraversalKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    aget p0, p0, p1

    .line 87
    .line 88
    if-eq p0, v5, :cond_5

    .line 89
    .line 90
    if-ne p0, v3, :cond_4

    .line 91
    .line 92
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getEnd()Landroidx/compose/ui/focus/FocusRequester;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 98
    .line 99
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_5
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getStart()Landroidx/compose/ui/focus/FocusRequester;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_0
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p0, p1, :cond_6

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    move-object v4, p0

    .line 117
    :goto_1
    if-nez v4, :cond_7

    .line 118
    .line 119
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getLeft()Landroidx/compose/ui/focus/FocusRequester;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_7
    return-object v4

    .line 125
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getRight-dhqQ-8s()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    invoke-static {p1, v2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_d

    .line 134
    .line 135
    sget-object p0, Landroidx/compose/ui/focus/FocusTraversalKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    aget p0, p0, p1

    .line 142
    .line 143
    if-eq p0, v5, :cond_a

    .line 144
    .line 145
    if-ne p0, v3, :cond_9

    .line 146
    .line 147
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getStart()Landroidx/compose/ui/focus/FocusRequester;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    goto :goto_2

    .line 152
    :cond_9
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 153
    .line 154
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 155
    .line 156
    .line 157
    throw p0

    .line 158
    :cond_a
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getEnd()Landroidx/compose/ui/focus/FocusRequester;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    :goto_2
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p0, p1, :cond_b

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_b
    move-object v4, p0

    .line 172
    :goto_3
    if-nez v4, :cond_c

    .line 173
    .line 174
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getRight()Landroidx/compose/ui/focus/FocusRequester;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :cond_c
    return-object v4

    .line 180
    :cond_d
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    invoke-static {p1, p2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_e

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_e
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getExit-dhqQ-8s()I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    invoke-static {p1, p2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    :goto_4
    if-eqz v5, :cond_15

    .line 200
    .line 201
    new-instance p2, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;

    .line 202
    .line 203
    invoke-direct {p2, p1, v4}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;-><init>(ILkotlin/jvm/internal/n;)V

    .line 204
    .line 205
    .line 206
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->getFocusTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/4 v3, 0x0

    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    goto :goto_5

    .line 218
    :cond_f
    move v4, v3

    .line 219
    :goto_5
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-interface {p0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-interface {p0}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-eqz p1, :cond_10

    .line 240
    .line 241
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getOnEnter()Lhd/l;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-interface {p1, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_10
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getOnExit()Lhd/l;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-interface {p1, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    :goto_6
    if-eqz v2, :cond_11

    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    :cond_11
    invoke-virtual {p2}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;->isCanceled()Z

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    if-eqz p1, :cond_12

    .line 267
    .line 268
    sget-object p0, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 269
    .line 270
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    return-object p0

    .line 275
    :cond_12
    if-ne v4, v3, :cond_14

    .line 276
    .line 277
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 278
    .line 279
    if-eqz p1, :cond_13

    .line 280
    .line 281
    invoke-interface {p0}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    if-eq v5, p0, :cond_13

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_13
    sget-object p0, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 289
    .line 290
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :cond_14
    :goto_7
    sget-object p0, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 296
    .line 297
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    return-object p0

    .line 302
    :cond_15
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    const-string p1, "invalid FocusDirection"

    .line 305
    .line 306
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw p0
.end method

.method public static final findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 10

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v1

    .line 28
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v2, Landroidx/compose/ui/focus/FocusTraversalKt$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    aget v0, v2, v0

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    if-eq v0, v2, :cond_11

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    if-eq v0, v3, :cond_3

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    if-eq v0, v2, :cond_11

    .line 48
    .line 49
    const/4 p0, 0x4

    .line 50
    if-ne v0, p0, :cond_2

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 54
    .line 55
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_3
    const/16 v0, 0x400

    .line 60
    .line 61
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_4

    .line 74
    .line 75
    const-string/jumbo v3, "visitChildren called on an unattached node"

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 82
    .line 83
    const/16 v4, 0x10

    .line 84
    .line 85
    new-array v5, v4, [Landroidx/compose/ui/Modifier$Node;

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    invoke-direct {v3, v5, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    if-nez v5, :cond_5

    .line 100
    .line 101
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {v3, p0, v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    invoke-virtual {v3, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :cond_6
    :goto_0
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_10

    .line 117
    .line 118
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    sub-int/2addr p0, v2

    .line 123
    invoke-virtual {v3, p0}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Landroidx/compose/ui/Modifier$Node;

    .line 128
    .line 129
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    and-int/2addr v5, v0

    .line 134
    if-nez v5, :cond_7

    .line 135
    .line 136
    invoke-static {v3, p0, v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_7
    :goto_1
    if-eqz p0, :cond_6

    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    and-int/2addr v5, v0

    .line 147
    if-eqz v5, :cond_f

    .line 148
    .line 149
    move-object v5, v1

    .line 150
    :goto_2
    if-eqz p0, :cond_6

    .line 151
    .line 152
    instance-of v7, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 153
    .line 154
    if-eqz v7, :cond_8

    .line 155
    .line 156
    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 157
    .line 158
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    if-eqz p0, :cond_e

    .line 163
    .line 164
    return-object p0

    .line 165
    :cond_8
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    and-int/2addr v7, v0

    .line 170
    if-eqz v7, :cond_e

    .line 171
    .line 172
    instance-of v7, p0, Landroidx/compose/ui/node/DelegatingNode;

    .line 173
    .line 174
    if-eqz v7, :cond_e

    .line 175
    .line 176
    move-object v7, p0

    .line 177
    check-cast v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 178
    .line 179
    invoke-virtual {v7}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    move v8, v6

    .line 184
    :goto_3
    if-eqz v7, :cond_d

    .line 185
    .line 186
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    and-int/2addr v9, v0

    .line 191
    if-eqz v9, :cond_c

    .line 192
    .line 193
    add-int/lit8 v8, v8, 0x1

    .line 194
    .line 195
    if-ne v8, v2, :cond_9

    .line 196
    .line 197
    move-object p0, v7

    .line 198
    goto :goto_4

    .line 199
    :cond_9
    if-nez v5, :cond_a

    .line 200
    .line 201
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    .line 202
    .line 203
    new-array v9, v4, [Landroidx/compose/ui/Modifier$Node;

    .line 204
    .line 205
    invoke-direct {v5, v9, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    :cond_a
    if-eqz p0, :cond_b

    .line 209
    .line 210
    invoke-virtual {v5, p0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-object p0, v1

    .line 214
    :cond_b
    invoke-virtual {v5, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    :cond_c
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    goto :goto_3

    .line 222
    :cond_d
    if-ne v8, v2, :cond_e

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_e
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    goto :goto_2

    .line 230
    :cond_f
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    goto :goto_1

    .line 235
    :cond_10
    return-object v1

    .line 236
    :cond_11
    return-object p0
.end method

.method private static final findNonDeactivatedParent(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 10

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string/jumbo v1, "visitAncestors called on an unattached node"

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    const/4 v2, 0x0

    .line 36
    if-eqz p0, :cond_b

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    and-int/2addr v3, v0

    .line 51
    if-eqz v3, :cond_9

    .line 52
    .line 53
    :goto_1
    if-eqz v1, :cond_9

    .line 54
    .line 55
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    and-int/2addr v3, v0

    .line 60
    if-eqz v3, :cond_8

    .line 61
    .line 62
    move-object v3, v1

    .line 63
    move-object v4, v2

    .line 64
    :goto_2
    if-eqz v3, :cond_8

    .line 65
    .line 66
    instance-of v5, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 67
    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    check-cast v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 71
    .line 72
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v5}, Landroidx/compose/ui/focus/FocusProperties;->getCanFocus()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_7

    .line 81
    .line 82
    return-object v3

    .line 83
    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    and-int/2addr v5, v0

    .line 88
    if-eqz v5, :cond_7

    .line 89
    .line 90
    instance-of v5, v3, Landroidx/compose/ui/node/DelegatingNode;

    .line 91
    .line 92
    if-eqz v5, :cond_7

    .line 93
    .line 94
    move-object v5, v3

    .line 95
    check-cast v5, Landroidx/compose/ui/node/DelegatingNode;

    .line 96
    .line 97
    invoke-virtual {v5}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const/4 v6, 0x0

    .line 102
    move v7, v6

    .line 103
    :goto_3
    const/4 v8, 0x1

    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    and-int/2addr v9, v0

    .line 111
    if-eqz v9, :cond_5

    .line 112
    .line 113
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    if-ne v7, v8, :cond_2

    .line 116
    .line 117
    move-object v3, v5

    .line 118
    goto :goto_4

    .line 119
    :cond_2
    if-nez v4, :cond_3

    .line 120
    .line 121
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 122
    .line 123
    const/16 v8, 0x10

    .line 124
    .line 125
    new-array v8, v8, [Landroidx/compose/ui/Modifier$Node;

    .line 126
    .line 127
    invoke-direct {v4, v8, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 128
    .line 129
    .line 130
    :cond_3
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-object v3, v2

    .line 136
    :cond_4
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    goto :goto_3

    .line 144
    :cond_6
    if-ne v7, v8, :cond_7

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    goto :goto_2

    .line 152
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    goto :goto_1

    .line 157
    :cond_9
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_a

    .line 162
    .line 163
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_a

    .line 168
    .line 169
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_a
    move-object v1, v2

    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_b
    return-object v2
.end method

.method public static final focusRect(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, p0, v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->localBoundingBoxOf(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object p0

    .line 20
    :cond_1
    :goto_0
    sget-object p0, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect$Companion;->getZero()Landroidx/compose/ui/geometry/Rect;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final focusSearch-0X8WOeE(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lhd/l;)Ljava/lang/Boolean;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            "I",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lhd/l;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getPrevious-dhqQ-8s()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    :goto_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-static {p0, p1, p4}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->oneDimensionalFocusSearch--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILhd/l;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getLeft-dhqQ-8s()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    move v1, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getRight-dhqQ-8s()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_1
    if-eqz v1, :cond_3

    .line 56
    .line 57
    move v1, v2

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getUp-dhqQ-8s()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    :goto_2
    if-eqz v1, :cond_4

    .line 68
    .line 69
    move v1, v2

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getDown-dhqQ-8s()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    :goto_3
    if-eqz v1, :cond_5

    .line 80
    .line 81
    invoke-static {p0, p1, p3, p4}, Landroidx/compose/ui/focus/TwoDimensionalFocusSearchKt;->twoDimensionalFocusSearch-sMXa3k8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lhd/l;)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_5
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v3, 0x0

    .line 95
    if-eqz v1, :cond_9

    .line 96
    .line 97
    sget-object p1, Landroidx/compose/ui/focus/FocusTraversalKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    aget p1, p1, p2

    .line 104
    .line 105
    if-eq p1, v2, :cond_7

    .line 106
    .line 107
    const/4 p2, 0x2

    .line 108
    if-ne p1, p2, :cond_6

    .line 109
    .line 110
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getLeft-dhqQ-8s()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 116
    .line 117
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_7
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getRight-dhqQ-8s()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    :goto_4
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    if-eqz p0, :cond_8

    .line 130
    .line 131
    invoke-static {p0, p1, p3, p4}, Landroidx/compose/ui/focus/TwoDimensionalFocusSearchKt;->twoDimensionalFocusSearch-sMXa3k8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lhd/l;)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :cond_8
    return-object v3

    .line 137
    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getExit-dhqQ-8s()I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    invoke-static {p1, p2}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-eqz p2, :cond_d

    .line 146
    .line 147
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-eqz p1, :cond_a

    .line 152
    .line 153
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusTraversalKt;->findNonDeactivatedParent(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    :cond_a
    if-eqz v3, :cond_c

    .line 158
    .line 159
    invoke-static {v3, p0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-eqz p0, :cond_b

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_b
    invoke-interface {p4, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    goto :goto_6

    .line 177
    :cond_c
    :goto_5
    const/4 p0, 0x0

    .line 178
    :goto_6
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0

    .line 183
    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    new-instance p2, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const-string p3, "Focus search invoked with invalid FocusDirection "

    .line 191
    .line 192
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->toString-impl(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p0
.end method

.method public static final getActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    const/16 v0, 0x400

    .line 14
    .line 15
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    const-string/jumbo v2, "visitChildren called on an unattached node"

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 36
    .line 37
    const/16 v3, 0x10

    .line 38
    .line 39
    new-array v4, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-direct {v2, v4, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {v2, p0, v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_0
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_e

    .line 71
    .line 72
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    const/4 v4, 0x1

    .line 77
    sub-int/2addr p0, v4

    .line 78
    invoke-virtual {v2, p0}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Landroidx/compose/ui/Modifier$Node;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    and-int/2addr v6, v0

    .line 89
    if-nez v6, :cond_4

    .line 90
    .line 91
    invoke-static {v2, p0, v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    :goto_1
    if-eqz p0, :cond_3

    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    and-int/2addr v6, v0

    .line 102
    if-eqz v6, :cond_d

    .line 103
    .line 104
    move-object v6, v1

    .line 105
    :goto_2
    if-eqz p0, :cond_3

    .line 106
    .line 107
    instance-of v7, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 108
    .line 109
    if-eqz v7, :cond_6

    .line 110
    .line 111
    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_c

    .line 122
    .line 123
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    sget-object v8, Landroidx/compose/ui/focus/FocusTraversalKt$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    aget v7, v8, v7

    .line 134
    .line 135
    if-eq v7, v4, :cond_5

    .line 136
    .line 137
    const/4 v8, 0x2

    .line 138
    if-eq v7, v8, :cond_5

    .line 139
    .line 140
    const/4 v8, 0x3

    .line 141
    if-eq v7, v8, :cond_5

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_5
    return-object p0

    .line 145
    :cond_6
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    and-int/2addr v7, v0

    .line 150
    if-eqz v7, :cond_c

    .line 151
    .line 152
    instance-of v7, p0, Landroidx/compose/ui/node/DelegatingNode;

    .line 153
    .line 154
    if-eqz v7, :cond_c

    .line 155
    .line 156
    move-object v7, p0

    .line 157
    check-cast v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 158
    .line 159
    invoke-virtual {v7}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    move v8, v5

    .line 164
    :goto_3
    if-eqz v7, :cond_b

    .line 165
    .line 166
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    and-int/2addr v9, v0

    .line 171
    if-eqz v9, :cond_a

    .line 172
    .line 173
    add-int/lit8 v8, v8, 0x1

    .line 174
    .line 175
    if-ne v8, v4, :cond_7

    .line 176
    .line 177
    move-object p0, v7

    .line 178
    goto :goto_4

    .line 179
    :cond_7
    if-nez v6, :cond_8

    .line 180
    .line 181
    new-instance v6, Landroidx/compose/runtime/collection/MutableVector;

    .line 182
    .line 183
    new-array v9, v3, [Landroidx/compose/ui/Modifier$Node;

    .line 184
    .line 185
    invoke-direct {v6, v9, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 186
    .line 187
    .line 188
    :cond_8
    if-eqz p0, :cond_9

    .line 189
    .line 190
    invoke-virtual {v6, p0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-object p0, v1

    .line 194
    :cond_9
    invoke-virtual {v6, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :cond_a
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    goto :goto_3

    .line 202
    :cond_b
    if-ne v8, v4, :cond_c

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_c
    :goto_5
    invoke-static {v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    goto :goto_2

    .line 210
    :cond_d
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    goto :goto_1

    .line 215
    :cond_e
    return-object v1
.end method

.method public static final isEligibleForFocusSearch(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->isPlaced()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->isAttached()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-ne p0, v1, :cond_0

    .line 37
    .line 38
    return v1

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method
