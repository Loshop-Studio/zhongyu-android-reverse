.class public final Landroidx/compose/ui/focus/FocusEventModifierNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusEventModifierNodeKt$WhenMappings;
    }
.end annotation


# direct methods
.method public static final getFocusState(Landroidx/compose/ui/focus/FocusEventModifierNode;)Landroidx/compose/ui/focus/FocusState;
    .locals 12

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
    const/4 v2, 0x0

    .line 12
    move-object v3, v2

    .line 13
    :goto_0
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x2

    .line 15
    const/16 v6, 0x10

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    const/4 v8, 0x0

    .line 19
    if-eqz v1, :cond_8

    .line 20
    .line 21
    instance-of v9, v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 22
    .line 23
    if-eqz v9, :cond_1

    .line 24
    .line 25
    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v6, Landroidx/compose/ui/focus/FocusEventModifierNodeKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    aget v6, v6, v8

    .line 38
    .line 39
    if-eq v6, v7, :cond_0

    .line 40
    .line 41
    if-eq v6, v5, :cond_0

    .line 42
    .line 43
    if-eq v6, v4, :cond_0

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_0
    return-object v1

    .line 47
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    and-int/2addr v4, v0

    .line 52
    if-eqz v4, :cond_7

    .line 53
    .line 54
    instance-of v4, v1, Landroidx/compose/ui/node/DelegatingNode;

    .line 55
    .line 56
    if-eqz v4, :cond_7

    .line 57
    .line 58
    move-object v4, v1

    .line 59
    check-cast v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 60
    .line 61
    invoke-virtual {v4}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    move v5, v8

    .line 66
    :goto_1
    if-eqz v4, :cond_6

    .line 67
    .line 68
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    and-int/2addr v9, v0

    .line 73
    if-eqz v9, :cond_5

    .line 74
    .line 75
    add-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    if-ne v5, v7, :cond_2

    .line 78
    .line 79
    move-object v1, v4

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    if-nez v3, :cond_3

    .line 82
    .line 83
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 84
    .line 85
    new-array v9, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 86
    .line 87
    invoke-direct {v3, v9, v8}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    :cond_3
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-object v1, v2

    .line 96
    :cond_4
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_5
    :goto_2
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    goto :goto_1

    .line 104
    :cond_6
    if-ne v5, v7, :cond_7

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_7
    :goto_3
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    goto :goto_0

    .line 112
    :cond_8
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_9

    .line 121
    .line 122
    const-string/jumbo v1, "visitChildren called on an unattached node"

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_9
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    .line 129
    .line 130
    new-array v3, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 131
    .line 132
    invoke-direct {v1, v3, v8}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-nez v3, :cond_a

    .line 144
    .line 145
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {v1, p0, v8}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_b
    :goto_4
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz p0, :cond_16

    .line 161
    .line 162
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    sub-int/2addr p0, v7

    .line 167
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, Landroidx/compose/ui/Modifier$Node;

    .line 172
    .line 173
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    and-int/2addr v3, v0

    .line 178
    if-nez v3, :cond_c

    .line 179
    .line 180
    invoke-static {v1, p0, v8}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_c
    :goto_5
    if-eqz p0, :cond_b

    .line 185
    .line 186
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    and-int/2addr v3, v0

    .line 191
    if-eqz v3, :cond_15

    .line 192
    .line 193
    move-object v3, v2

    .line 194
    :goto_6
    if-eqz p0, :cond_b

    .line 195
    .line 196
    instance-of v9, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 197
    .line 198
    if-eqz v9, :cond_e

    .line 199
    .line 200
    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 201
    .line 202
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    sget-object v9, Landroidx/compose/ui/focus/FocusEventModifierNodeKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 207
    .line 208
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    aget v9, v9, v10

    .line 213
    .line 214
    if-eq v9, v7, :cond_d

    .line 215
    .line 216
    if-eq v9, v5, :cond_d

    .line 217
    .line 218
    if-eq v9, v4, :cond_d

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_d
    return-object p0

    .line 222
    :cond_e
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    and-int/2addr v9, v0

    .line 227
    if-eqz v9, :cond_14

    .line 228
    .line 229
    instance-of v9, p0, Landroidx/compose/ui/node/DelegatingNode;

    .line 230
    .line 231
    if-eqz v9, :cond_14

    .line 232
    .line 233
    move-object v9, p0

    .line 234
    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 235
    .line 236
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    move v10, v8

    .line 241
    :goto_7
    if-eqz v9, :cond_13

    .line 242
    .line 243
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    and-int/2addr v11, v0

    .line 248
    if-eqz v11, :cond_12

    .line 249
    .line 250
    add-int/lit8 v10, v10, 0x1

    .line 251
    .line 252
    if-ne v10, v7, :cond_f

    .line 253
    .line 254
    move-object p0, v9

    .line 255
    goto :goto_8

    .line 256
    :cond_f
    if-nez v3, :cond_10

    .line 257
    .line 258
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 259
    .line 260
    new-array v11, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 261
    .line 262
    invoke-direct {v3, v11, v8}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 263
    .line 264
    .line 265
    :cond_10
    if-eqz p0, :cond_11

    .line 266
    .line 267
    invoke-virtual {v3, p0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-object p0, v2

    .line 271
    :cond_11
    invoke-virtual {v3, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    :cond_12
    :goto_8
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    goto :goto_7

    .line 279
    :cond_13
    if-ne v10, v7, :cond_14

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_14
    :goto_9
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    goto :goto_6

    .line 287
    :cond_15
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    goto :goto_5

    .line 292
    :cond_16
    sget-object p0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 293
    .line 294
    return-object p0
.end method

.method public static final invalidateFocusEvent(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p0}, Landroidx/compose/ui/focus/FocusOwner;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
