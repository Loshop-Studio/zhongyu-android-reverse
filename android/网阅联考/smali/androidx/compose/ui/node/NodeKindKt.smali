.class public final Landroidx/compose/ui/node/NodeKindKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a&\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\u0008\u00030\u0006H\u0080\u000c\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u000c\u0010\u001a\u001a\u00020\u000c*\u00020\u001bH\u0003\u001a\u000c\u0010\u001c\u001a\u00020\u0005*\u00020\u001bH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"%\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\u0008\u00030\u00068@X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "Inserted",
        "",
        "Removed",
        "Updated",
        "includeSelfInTraversal",
        "",
        "Landroidx/compose/ui/node/NodeKind;",
        "getIncludeSelfInTraversal-H91voCI$annotations",
        "(I)V",
        "getIncludeSelfInTraversal-H91voCI",
        "(I)Z",
        "autoInvalidateInsertedNode",
        "",
        "node",
        "Landroidx/compose/ui/Modifier$Node;",
        "autoInvalidateNode",
        "phase",
        "autoInvalidateRemovedNode",
        "autoInvalidateUpdatedNode",
        "calculateNodeKindSetFrom",
        "element",
        "Landroidx/compose/ui/Modifier$Element;",
        "or",
        "other",
        "or-64DMado",
        "(II)I",
        "scheduleInvalidationOfAssociatedFocusTargets",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "specifiesCanFocusProperty",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,283:1\n51#1:287\n51#1:289\n51#1:291\n51#1:293\n51#1:295\n51#1:297\n51#1:299\n51#1:301\n51#1:303\n51#1:305\n51#1:307\n51#1:310\n51#1:312\n51#1:314\n51#1:316\n51#1:318\n51#1:320\n51#1:322\n51#1:324\n51#1:326\n51#1:328\n51#1:330\n51#1:332\n51#1:334\n51#1:336\n81#2:284\n67#2:285\n69#2:286\n85#2:288\n71#2:290\n73#2:292\n75#2:294\n77#2:296\n91#2:298\n89#2:300\n83#2:302\n79#2:304\n81#2:306\n67#2:308\n69#2:309\n71#2:311\n73#2:313\n75#2:315\n77#2:317\n79#2:319\n81#2:321\n83#2:323\n85#2:325\n87#2:327\n89#2:329\n91#2:331\n93#2:333\n95#2:335\n69#2:337\n69#2:339\n83#2:340\n71#2:342\n73#2:344\n79#2:346\n87#2:348\n89#2:350\n91#2:352\n87#2:354\n196#3:338\n196#3:341\n196#3:343\n196#3:345\n196#3:347\n196#3:349\n196#3:351\n196#3:353\n340#4:355\n206#4,2:356\n208#4,7:361\n215#4,15:369\n1182#5:358\n1161#5,2:359\n48#6:368\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n103#1:287\n106#1:289\n109#1:291\n112#1:293\n115#1:295\n121#1:297\n124#1:299\n127#1:301\n130#1:303\n133#1:305\n140#1:307\n149#1:310\n152#1:312\n155#1:314\n158#1:316\n161#1:318\n164#1:320\n167#1:322\n170#1:324\n173#1:326\n176#1:328\n179#1:330\n182#1:332\n185#1:334\n188#1:336\n59#1:284\n101#1:285\n103#1:286\n106#1:288\n109#1:290\n112#1:292\n115#1:294\n121#1:296\n124#1:298\n127#1:300\n130#1:302\n133#1:304\n140#1:306\n147#1:308\n149#1:309\n152#1:311\n155#1:313\n158#1:315\n161#1:317\n164#1:319\n167#1:321\n170#1:323\n173#1:325\n176#1:327\n179#1:329\n182#1:331\n185#1:333\n188#1:335\n209#1:337\n212#1:339\n216#1:340\n219#1:342\n222#1:344\n225#1:346\n228#1:348\n237#1:350\n246#1:352\n253#1:354\n209#1:338\n216#1:341\n219#1:343\n222#1:345\n225#1:347\n228#1:349\n237#1:351\n246#1:353\n253#1:355\n253#1:356,2\n253#1:361,7\n253#1:369,15\n253#1:358\n253#1:359,2\n253#1:368\n*E\n"
    }
.end annotation


# static fields
.field private static final Inserted:I = 0x1

.field private static final Removed:I = 0x2

.field private static final Updated:I


# direct methods
.method public static final autoInvalidateInsertedNode(Landroidx/compose/ui/Modifier$Node;)V
    .locals 1

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-static {p0, v0}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateNode(Landroidx/compose/ui/Modifier$Node;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final autoInvalidateNode(Landroidx/compose/ui/Modifier$Node;I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    and-int/2addr v1, v2

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v3

    .line 24
    :goto_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    instance-of v1, p0, Landroidx/compose/ui/node/LayoutModifierNode;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    move-object v1, p0

    .line 31
    check-cast v1, Landroidx/compose/ui/node/LayoutModifierNode;

    .line 32
    .line 33
    invoke-static {v1}, Landroidx/compose/ui/node/LayoutModifierNodeKt;->invalidateMeasurements(Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 34
    .line 35
    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {p0, v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireCoordinator-64DMado(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->onRelease()V

    .line 47
    .line 48
    .line 49
    :cond_1
    const/16 v1, 0x100

    .line 50
    .line 51
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    and-int/2addr v1, v4

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    move v1, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v1, v3

    .line 65
    :goto_1
    if-eqz v1, :cond_3

    .line 66
    .line 67
    instance-of v1, p0, Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->invalidateMeasurements$ui_release()V

    .line 76
    .line 77
    .line 78
    :cond_3
    const/4 v1, 0x4

    .line 79
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    and-int/2addr v1, v4

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    move v1, v2

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move v1, v3

    .line 93
    :goto_2
    if-eqz v1, :cond_5

    .line 94
    .line 95
    instance-of v1, p0, Landroidx/compose/ui/node/DrawModifierNode;

    .line 96
    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    move-object v1, p0

    .line 100
    check-cast v1, Landroidx/compose/ui/node/DrawModifierNode;

    .line 101
    .line 102
    invoke-static {v1}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    const/16 v1, 0x8

    .line 106
    .line 107
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    and-int/2addr v1, v4

    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    move v1, v2

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    move v1, v3

    .line 121
    :goto_3
    if-eqz v1, :cond_7

    .line 122
    .line 123
    instance-of v1, p0, Landroidx/compose/ui/node/SemanticsModifierNode;

    .line 124
    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    move-object v1, p0

    .line 128
    check-cast v1, Landroidx/compose/ui/node/SemanticsModifierNode;

    .line 129
    .line 130
    invoke-static {v1}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 131
    .line 132
    .line 133
    :cond_7
    const/16 v1, 0x40

    .line 134
    .line 135
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    and-int/2addr v1, v4

    .line 144
    if-eqz v1, :cond_8

    .line 145
    .line 146
    move v1, v2

    .line 147
    goto :goto_4

    .line 148
    :cond_8
    move v1, v3

    .line 149
    :goto_4
    if-eqz v1, :cond_9

    .line 150
    .line 151
    instance-of v1, p0, Landroidx/compose/ui/node/ParentDataModifierNode;

    .line 152
    .line 153
    if-eqz v1, :cond_9

    .line 154
    .line 155
    move-object v1, p0

    .line 156
    check-cast v1, Landroidx/compose/ui/node/ParentDataModifierNode;

    .line 157
    .line 158
    invoke-static {v1}, Landroidx/compose/ui/node/ParentDataModifierNodeKt;->invalidateParentData(Landroidx/compose/ui/node/ParentDataModifierNode;)V

    .line 159
    .line 160
    .line 161
    :cond_9
    const/16 v1, 0x400

    .line 162
    .line 163
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    and-int/2addr v1, v4

    .line 172
    if-eqz v1, :cond_a

    .line 173
    .line 174
    move v1, v2

    .line 175
    goto :goto_5

    .line 176
    :cond_a
    move v1, v3

    .line 177
    :goto_5
    if-eqz v1, :cond_c

    .line 178
    .line 179
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 180
    .line 181
    if-eqz v1, :cond_c

    .line 182
    .line 183
    if-ne p1, v0, :cond_b

    .line 184
    .line 185
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->onReset()V

    .line 186
    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_b
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    move-object v4, p0

    .line 198
    check-cast v4, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 199
    .line 200
    invoke-interface {v1, v4}, Landroidx/compose/ui/focus/FocusOwner;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    .line 201
    .line 202
    .line 203
    :cond_c
    :goto_6
    const/16 v1, 0x800

    .line 204
    .line 205
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    and-int/2addr v1, v4

    .line 214
    if-eqz v1, :cond_d

    .line 215
    .line 216
    move v1, v2

    .line 217
    goto :goto_7

    .line 218
    :cond_d
    move v1, v3

    .line 219
    :goto_7
    if-eqz v1, :cond_f

    .line 220
    .line 221
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 222
    .line 223
    if-eqz v1, :cond_f

    .line 224
    .line 225
    move-object v1, p0

    .line 226
    check-cast v1, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 227
    .line 228
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKindKt;->specifiesCanFocusProperty(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_f

    .line 233
    .line 234
    if-ne p1, v0, :cond_e

    .line 235
    .line 236
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKindKt;->scheduleInvalidationOfAssociatedFocusTargets(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V

    .line 237
    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_e
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-interface {v4}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-interface {v4, v1}, Landroidx/compose/ui/focus/FocusOwner;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V

    .line 249
    .line 250
    .line 251
    :cond_f
    :goto_8
    const/16 v1, 0x1000

    .line 252
    .line 253
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    and-int/2addr v1, v4

    .line 262
    if-eqz v1, :cond_10

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_10
    move v2, v3

    .line 266
    :goto_9
    if-eqz v2, :cond_11

    .line 267
    .line 268
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 269
    .line 270
    if-eqz v1, :cond_11

    .line 271
    .line 272
    if-eq p1, v0, :cond_11

    .line 273
    .line 274
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    check-cast p0, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 283
    .line 284
    invoke-interface {p1, p0}, Landroidx/compose/ui/focus/FocusOwner;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    .line 285
    .line 286
    .line 287
    :cond_11
    return-void

    .line 288
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 289
    .line 290
    const-string p1, "Check failed."

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p0
.end method

.method public static final autoInvalidateRemovedNode(Landroidx/compose/ui/Modifier$Node;)V
    .locals 1

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {p0, v0}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateNode(Landroidx/compose/ui/Modifier$Node;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final autoInvalidateUpdatedNode(Landroidx/compose/ui/Modifier$Node;)V
    .locals 1

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateNode(Landroidx/compose/ui/Modifier$Node;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final calculateNodeKindSetFrom(Landroidx/compose/ui/Modifier$Element;)I
    .locals 2

    const-string v0, "element"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v0

    .line 2
    instance-of v1, p0, Landroidx/compose/ui/layout/LayoutModifier;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    .line 3
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 4
    :cond_0
    instance-of v1, p0, Landroidx/compose/ui/layout/IntermediateLayoutModifier;

    if-eqz v1, :cond_1

    const/16 v1, 0x200

    .line 5
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 6
    :cond_1
    instance-of v1, p0, Landroidx/compose/ui/draw/DrawModifier;

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    .line 7
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 8
    :cond_2
    instance-of v1, p0, Landroidx/compose/ui/semantics/SemanticsModifier;

    if-eqz v1, :cond_3

    const/16 v1, 0x8

    .line 9
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 10
    :cond_3
    instance-of v1, p0, Landroidx/compose/ui/input/pointer/PointerInputModifier;

    if-eqz v1, :cond_4

    const/16 v1, 0x10

    .line 11
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 12
    :cond_4
    instance-of v1, p0, Landroidx/compose/ui/modifier/ModifierLocalConsumer;

    if-nez v1, :cond_5

    .line 13
    instance-of v1, p0, Landroidx/compose/ui/modifier/ModifierLocalProvider;

    if-eqz v1, :cond_6

    :cond_5
    const/16 v1, 0x20

    .line 14
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 15
    :cond_6
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusEventModifier;

    if-eqz v1, :cond_7

    const/16 v1, 0x1000

    .line 16
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 17
    :cond_7
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusOrderModifier;

    if-eqz v1, :cond_8

    const/16 v1, 0x800

    .line 18
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 19
    :cond_8
    instance-of v1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedModifier;

    if-eqz v1, :cond_9

    const/16 v1, 0x100

    .line 20
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 21
    :cond_9
    instance-of v1, p0, Landroidx/compose/ui/layout/ParentDataModifier;

    if-eqz v1, :cond_a

    const/16 v1, 0x40

    .line 22
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 23
    :cond_a
    instance-of v1, p0, Landroidx/compose/ui/layout/OnPlacedModifier;

    if-nez v1, :cond_b

    .line 24
    instance-of v1, p0, Landroidx/compose/ui/layout/OnRemeasuredModifier;

    if-nez v1, :cond_b

    .line 25
    instance-of p0, p0, Landroidx/compose/ui/layout/LookaheadOnPlacedModifier;

    if-eqz p0, :cond_c

    :cond_b
    const/16 p0, 0x80

    .line 26
    invoke-static {p0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result p0

    or-int/2addr v0, p0

    :cond_c
    return v0
.end method

.method public static final calculateNodeKindSetFrom(Landroidx/compose/ui/Modifier$Node;)I
    .locals 2

    const-string v0, "node"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v0

    .line 28
    instance-of v1, p0, Landroidx/compose/ui/node/LayoutModifierNode;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    .line 29
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 30
    :cond_0
    instance-of v1, p0, Landroidx/compose/ui/node/DrawModifierNode;

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    .line 31
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 32
    :cond_1
    instance-of v1, p0, Landroidx/compose/ui/node/SemanticsModifierNode;

    if-eqz v1, :cond_2

    const/16 v1, 0x8

    .line 33
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 34
    :cond_2
    instance-of v1, p0, Landroidx/compose/ui/node/PointerInputModifierNode;

    if-eqz v1, :cond_3

    const/16 v1, 0x10

    .line 35
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 36
    :cond_3
    instance-of v1, p0, Landroidx/compose/ui/modifier/ModifierLocalNode;

    if-eqz v1, :cond_4

    const/16 v1, 0x20

    .line 37
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 38
    :cond_4
    instance-of v1, p0, Landroidx/compose/ui/node/ParentDataModifierNode;

    if-eqz v1, :cond_5

    const/16 v1, 0x40

    .line 39
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 40
    :cond_5
    instance-of v1, p0, Landroidx/compose/ui/node/LayoutAwareModifierNode;

    if-eqz v1, :cond_6

    const/16 v1, 0x80

    .line 41
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 42
    :cond_6
    instance-of v1, p0, Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;

    if-eqz v1, :cond_7

    const/16 v1, 0x100

    .line 43
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 44
    :cond_7
    instance-of v1, p0, Landroidx/compose/ui/node/IntermediateLayoutModifierNode;

    if-eqz v1, :cond_8

    const/16 v1, 0x200

    .line 45
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 46
    :cond_8
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v1, :cond_9

    const/16 v1, 0x400

    .line 47
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 48
    :cond_9
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    if-eqz v1, :cond_a

    const/16 v1, 0x800

    .line 49
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 50
    :cond_a
    instance-of v1, p0, Landroidx/compose/ui/focus/FocusEventModifierNode;

    if-eqz v1, :cond_b

    const/16 v1, 0x1000

    .line 51
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 52
    :cond_b
    instance-of v1, p0, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v1, :cond_c

    const/16 v1, 0x2000

    .line 53
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    or-int/2addr v0, v1

    .line 54
    :cond_c
    instance-of p0, p0, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz p0, :cond_d

    const/16 p0, 0x4000

    .line 55
    invoke-static {p0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result p0

    or-int/2addr v0, p0

    :cond_d
    return v0
.end method

.method public static final getIncludeSelfInTraversal-H91voCI(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/2addr p0, v0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    return p0
.end method

.method public static synthetic getIncludeSelfInTraversal-H91voCI$annotations(I)V
    .locals 0

    return-void
.end method

.method public static final or-64DMado(II)I
    .locals 0

    or-int/2addr p0, p1

    return p0
.end method

.method private static final scheduleInvalidationOfAssociatedFocusTargets(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 4
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

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
    if-eqz v1, :cond_5

    .line 16
    .line 17
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    .line 18
    .line 19
    const/16 v2, 0x10

    .line 20
    .line 21
    new-array v2, v2, [Landroidx/compose/ui/Modifier$Node;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v1, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v1, v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Landroidx/compose/ui/Modifier$Node;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    and-int/2addr v3, v0

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    invoke-static {v1, v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    :goto_1
    if-eqz v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    and-int/2addr v3, v0

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    instance-of v3, v2, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 87
    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    check-cast v2, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 91
    .line 92
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v3}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v3, v2}, Landroidx/compose/ui/focus/FocusOwner;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    return-void

    .line 110
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string v0, "Check failed."

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0
.end method

.method private static final specifiesCanFocusProperty(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)Z
    .locals 1
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/node/CanFocusChecker;->INSTANCE:Landroidx/compose/ui/node/CanFocusChecker;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/node/CanFocusChecker;->reset()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;->modifyFocusProperties(Landroidx/compose/ui/focus/FocusProperties;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/node/CanFocusChecker;->isCanFocusSet()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
