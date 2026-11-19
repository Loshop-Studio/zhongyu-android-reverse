.class public Lcom/zykj/mistake/DataBinderMapperImpl;
.super Landroidx/databinding/DataBinderMapper;
.source "SourceFile"


# static fields
.field public static final a:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/mistake/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    sget v2, Lcom/zykj/mistake/R$layout;->activity_legacy_mistake:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 14
    .line 15
    .line 16
    sget v2, Lcom/zykj/mistake/R$layout;->activity_lesson_player:I

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    .line 21
    .line 22
    sget v2, Lcom/zykj/mistake/R$layout;->activity_mistake_collection_detail:I

    .line 23
    .line 24
    const/4 v3, 0x3

    .line 25
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 26
    .line 27
    .line 28
    sget v2, Lcom/zykj/mistake/R$layout;->activity_mistake_create_or_edit:I

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 32
    .line 33
    .line 34
    sget v2, Lcom/zykj/mistake/R$layout;->activity_mistake_detail:I

    .line 35
    .line 36
    const/4 v3, 0x5

    .line 37
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 38
    .line 39
    .line 40
    sget v2, Lcom/zykj/mistake/R$layout;->activity_mistake_list:I

    .line 41
    .line 42
    const/4 v3, 0x6

    .line 43
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    sget v2, Lcom/zykj/mistake/R$layout;->activity_sketch:I

    .line 47
    .line 48
    const/4 v3, 0x7

    .line 49
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 50
    .line 51
    .line 52
    sget v2, Lcom/zykj/mistake/R$layout;->dialog_convert:I

    .line 53
    .line 54
    const/16 v3, 0x8

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 57
    .line 58
    .line 59
    sget v2, Lcom/zykj/mistake/R$layout;->dialog_fragment_answer:I

    .line 60
    .line 61
    const/16 v3, 0x9

    .line 62
    .line 63
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 64
    .line 65
    .line 66
    sget v2, Lcom/zykj/mistake/R$layout;->dialog_fragment_image:I

    .line 67
    .line 68
    const/16 v3, 0xa

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 71
    .line 72
    .line 73
    sget v2, Lcom/zykj/mistake/R$layout;->dialog_fragment_picture_note_delete:I

    .line 74
    .line 75
    const/16 v3, 0xb

    .line 76
    .line 77
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 78
    .line 79
    .line 80
    sget v2, Lcom/zykj/mistake/R$layout;->dialog_mistake_tag_add:I

    .line 81
    .line 82
    const/16 v3, 0xc

    .line 83
    .line 84
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 85
    .line 86
    .line 87
    sget v2, Lcom/zykj/mistake/R$layout;->dialog_webview_shot:I

    .line 88
    .line 89
    const/16 v3, 0xd

    .line 90
    .line 91
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 92
    .line 93
    .line 94
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_compose_page:I

    .line 95
    .line 96
    const/16 v3, 0xe

    .line 97
    .line 98
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 99
    .line 100
    .line 101
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_empty:I

    .line 102
    .line 103
    const/16 v3, 0xf

    .line 104
    .line 105
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 106
    .line 107
    .line 108
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_micro_class:I

    .line 109
    .line 110
    const/16 v3, 0x10

    .line 111
    .line 112
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 113
    .line 114
    .line 115
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_mistake_notebook:I

    .line 116
    .line 117
    const/16 v3, 0x11

    .line 118
    .line 119
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 120
    .line 121
    .line 122
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_note:I

    .line 123
    .line 124
    const/16 v3, 0x12

    .line 125
    .line 126
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 127
    .line 128
    .line 129
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_original_answer:I

    .line 130
    .line 131
    const/16 v3, 0x13

    .line 132
    .line 133
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 134
    .line 135
    .line 136
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_revised_answer:I

    .line 137
    .line 138
    const/16 v3, 0x14

    .line 139
    .line 140
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 141
    .line 142
    .line 143
    sget v2, Lcom/zykj/mistake/R$layout;->fragment_typical_answer:I

    .line 144
    .line 145
    const/16 v3, 0x15

    .line 146
    .line 147
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 148
    .line 149
    .line 150
    sget v2, Lcom/zykj/mistake/R$layout;->include_mistake_detail_end:I

    .line 151
    .line 152
    const/16 v3, 0x16

    .line 153
    .line 154
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 155
    .line 156
    .line 157
    sget v2, Lcom/zykj/mistake/R$layout;->item_list_note_image:I

    .line 158
    .line 159
    const/16 v3, 0x17

    .line 160
    .line 161
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 162
    .line 163
    .line 164
    sget v2, Lcom/zykj/mistake/R$layout;->item_micro_sessions:I

    .line 165
    .line 166
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/databinding/DataBinderMapper;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final collectDependencies()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;

    .line 8
    .line 9
    invoke-direct {v1}, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/zykj/view/DataBinderMapperImpl;

    .line 16
    .line 17
    invoke-direct {v1}, Lcom/zykj/view/DataBinderMapperImpl;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final convertBrIdToString(I)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lf4/a;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public final getDataBinder(Landroidx/databinding/DataBindingComponent;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;
    .locals 42

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    sget-object v0, Lcom/zykj/mistake/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    move/from16 v3, p3

    invoke-virtual {v0, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    const/4 v13, 0x0

    if-lez v0, :cond_19

    .line 2
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_18

    const/4 v6, 0x4

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v15, 0x2

    const/16 p3, 0x15

    const/16 v16, 0x12

    const/16 v17, 0xf

    const/16 v18, 0x13

    const/16 v19, 0xc

    const/16 v20, 0xe

    const/16 v11, 0x9

    const/16 v21, 0xd

    const/16 v22, 0xa

    const/16 v23, 0xb

    const/4 v12, 0x3

    const/16 v24, 0x10

    const-wide/16 v4, -0x1

    const/4 v14, 0x0

    const/16 v28, 0x8

    const/4 v10, 0x1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 3
    :pswitch_0
    const-string v0, "layout/item_micro_sessions_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/mistake/databinding/ItemMicroSessionsBindingImpl;

    .line 5
    sget-object v3, Lcom/zykj/mistake/databinding/ItemMicroSessionsBindingImpl;->d:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v9, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 6
    aget-object v7, v3, v15

    check-cast v7, Landroid/widget/ImageView;

    aget-object v8, v3, v10

    check-cast v8, Landroid/widget/LinearLayout;

    aget-object v8, v3, v12

    check-cast v8, Landroid/widget/LinearLayout;

    aget-object v6, v3, v6

    check-cast v6, Landroid/widget/TextView;

    invoke-direct {v0, v1, v2, v7, v6}, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 7
    iput-wide v4, v0, Lcom/zykj/mistake/databinding/ItemMicroSessionsBindingImpl;->c:J

    .line 8
    aget-object v1, v3, v14

    check-cast v1, Landroidx/cardview/widget/CardView;

    .line 9
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 11
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ItemMicroSessionsBindingImpl;->invalidateAll()V

    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for item_micro_sessions is invalid. Received: "

    .line 13
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15
    :pswitch_1
    const-string v0, "layout/item_list_note_image_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    new-instance v0, Lcom/zykj/mistake/databinding/ItemListNoteImageBindingImpl;

    .line 17
    sget-object v3, Lcom/zykj/mistake/databinding/ItemListNoteImageBindingImpl;->b:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v15, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 18
    aget-object v6, v3, v10

    check-cast v6, Landroid/widget/ImageView;

    .line 19
    invoke-direct {v0, v1, v2, v14}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 20
    iput-wide v4, v0, Lcom/zykj/mistake/databinding/ItemListNoteImageBindingImpl;->a:J

    .line 21
    aget-object v1, v3, v14

    check-cast v1, Landroid/widget/FrameLayout;

    .line 22
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 23
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 24
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ItemListNoteImageBindingImpl;->invalidateAll()V

    return-object v0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for item_list_note_image is invalid. Received: "

    .line 26
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 28
    :pswitch_2
    const-string v0, "layout/include_mistake_detail_end_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29
    new-instance v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBindingImpl;

    .line 30
    sget-object v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBindingImpl;->l:Landroid/util/SparseIntArray;

    const/16 v4, 0x11

    invoke-static {v1, v2, v4, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v16

    .line 31
    aget-object v3, v16, v17

    check-cast v3, Landroid/widget/TextView;

    aget-object v4, v16, v24

    check-cast v4, Landroid/widget/TextView;

    aget-object v5, v16, v11

    check-cast v5, Lcom/zykj/mistake/widget/FlowLayout;

    aget-object v11, v16, v21

    check-cast v11, Lcom/zykj/mistake/widget/FlowLayout;

    aget-object v17, v16, v22

    check-cast v17, Lcom/zykj/mistake/widget/FlowLayout;

    aget-object v18, v16, v19

    check-cast v18, Lcom/zykj/mistake/widget/FlowLayout;

    aget-object v19, v16, v23

    check-cast v19, Lcom/zykj/mistake/widget/FlowLayout;

    aget-object v20, v16, v20

    check-cast v20, Landroidx/constraintlayout/widget/Guideline;

    aget-object v15, v16, v15

    check-cast v15, Landroid/widget/ScrollView;

    aget-object v12, v16, v12

    check-cast v12, Landroid/widget/TextView;

    aget-object v7, v16, v7

    check-cast v7, Landroid/widget/TextView;

    aget-object v7, v16, v28

    check-cast v7, Landroid/widget/TextView;

    aget-object v6, v16, v6

    check-cast v6, Landroid/widget/TextView;

    aget-object v6, v16, v9

    check-cast v6, Landroid/widget/TextView;

    aget-object v6, v16, v8

    check-cast v6, Landroid/widget/TextView;

    aget-object v6, v16, v10

    check-cast v6, Landroid/widget/TextView;

    move-object v10, v12

    move/from16 v31, v14

    move-object/from16 v8, v18

    move-object/from16 v9, v19

    const-wide/16 v14, -0x1

    move-object v12, v6

    move-object v6, v11

    move-object v11, v7

    move-object/from16 v7, v17

    invoke-direct/range {v0 .. v12}, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/zykj/mistake/widget/FlowLayout;Lcom/zykj/mistake/widget/FlowLayout;Lcom/zykj/mistake/widget/FlowLayout;Lcom/zykj/mistake/widget/FlowLayout;Lcom/zykj/mistake/widget/FlowLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 32
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBindingImpl;->k:J

    .line 33
    aget-object v1, v16, v31

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 35
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 36
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBindingImpl;->invalidateAll()V

    return-object v0

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for include_mistake_detail_end is invalid. Received: "

    .line 38
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    move/from16 v31, v14

    move v0, v15

    move-wide v14, v4

    .line 40
    const-string v4, "layout/fragment_typical_answer_0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 41
    new-instance v3, Lcom/zykj/mistake/databinding/FragmentTypicalAnswerBindingImpl;

    .line 42
    sget-object v4, Lcom/zykj/mistake/databinding/FragmentTypicalAnswerBindingImpl;->b:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v9, v13, v4}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v4

    .line 43
    aget-object v5, v4, v10

    check-cast v5, Landroid/widget/LinearLayout;

    aget-object v0, v4, v0

    check-cast v0, Landroid/widget/LinearLayout;

    aget-object v0, v4, v12

    check-cast v0, Landroid/widget/LinearLayout;

    aget-object v0, v4, v6

    check-cast v0, Landroid/widget/LinearLayout;

    move/from16 v0, v31

    .line 44
    invoke-direct {v3, v1, v2, v0}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 45
    iput-wide v14, v3, Lcom/zykj/mistake/databinding/FragmentTypicalAnswerBindingImpl;->a:J

    .line 46
    aget-object v0, v4, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 47
    invoke-virtual {v0, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {v3, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 49
    invoke-virtual {v3}, Lcom/zykj/mistake/databinding/FragmentTypicalAnswerBindingImpl;->invalidateAll()V

    return-object v3

    .line 50
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_typical_answer is invalid. Received: "

    .line 51
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    move v0, v15

    move-wide v14, v4

    .line 53
    const-string v4, "layout/fragment_revised_answer_0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 54
    new-instance v3, Lcom/zykj/mistake/databinding/FragmentRevisedAnswerBindingImpl;

    .line 55
    sget-object v4, Lcom/zykj/mistake/databinding/FragmentRevisedAnswerBindingImpl;->b:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v6, v13, v4}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v4

    .line 56
    aget-object v0, v4, v0

    check-cast v0, Landroid/widget/TextView;

    aget-object v0, v4, v12

    check-cast v0, Landroid/widget/LinearLayout;

    aget-object v0, v4, v10

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 57
    invoke-direct {v3, v1, v2, v0}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 58
    iput-wide v14, v3, Lcom/zykj/mistake/databinding/FragmentRevisedAnswerBindingImpl;->a:J

    .line 59
    aget-object v0, v4, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 60
    invoke-virtual {v0, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 61
    invoke-virtual {v3, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 62
    invoke-virtual {v3}, Lcom/zykj/mistake/databinding/FragmentRevisedAnswerBindingImpl;->invalidateAll()V

    return-object v3

    .line 63
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_revised_answer is invalid. Received: "

    .line 64
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 65
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    move v0, v15

    move-wide v14, v4

    .line 66
    const-string v4, "layout/fragment_original_answer_0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 67
    new-instance v3, Lcom/zykj/mistake/databinding/FragmentOriginalAnswerBindingImpl;

    .line 68
    sget-object v4, Lcom/zykj/mistake/databinding/FragmentOriginalAnswerBindingImpl;->b:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v6, v13, v4}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v4

    .line 69
    aget-object v0, v4, v0

    check-cast v0, Landroid/widget/TextView;

    aget-object v0, v4, v12

    check-cast v0, Landroid/widget/LinearLayout;

    aget-object v0, v4, v10

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 70
    invoke-direct {v3, v1, v2, v0}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 71
    iput-wide v14, v3, Lcom/zykj/mistake/databinding/FragmentOriginalAnswerBindingImpl;->a:J

    .line 72
    aget-object v0, v4, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 73
    invoke-virtual {v0, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 74
    invoke-virtual {v3, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 75
    invoke-virtual {v3}, Lcom/zykj/mistake/databinding/FragmentOriginalAnswerBindingImpl;->invalidateAll()V

    return-object v3

    .line 76
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_original_answer is invalid. Received: "

    .line 77
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    move v0, v15

    move-wide v14, v4

    .line 79
    const-string v4, "layout/fragment_note_0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 80
    new-instance v3, Lcom/zykj/mistake/databinding/FragmentNoteBindingImpl;

    .line 81
    sget-object v4, Lcom/zykj/mistake/databinding/FragmentNoteBindingImpl;->d:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v6, v13, v4}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v4

    .line 82
    aget-object v0, v4, v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    aget-object v5, v4, v10

    check-cast v5, Landroid/widget/LinearLayout;

    aget-object v5, v4, v12

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {v3, v1, v2, v0, v5}, Lcom/zykj/mistake/databinding/FragmentNoteBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 83
    iput-wide v14, v3, Lcom/zykj/mistake/databinding/FragmentNoteBindingImpl;->c:J

    const/16 v31, 0x0

    .line 84
    aget-object v0, v4, v31

    check-cast v0, Landroid/widget/ScrollView;

    .line 85
    invoke-virtual {v0, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 86
    invoke-virtual {v3, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 87
    invoke-virtual {v3}, Lcom/zykj/mistake/databinding/FragmentNoteBindingImpl;->invalidateAll()V

    return-object v3

    .line 88
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_note is invalid. Received: "

    .line 89
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    move v0, v15

    move-wide v14, v4

    .line 91
    const-string v4, "layout/fragment_mistake_notebook_0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    move v4, v0

    .line 92
    new-instance v0, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBindingImpl;

    .line 93
    sget-object v3, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBindingImpl;->f:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v8, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v7

    .line 94
    aget-object v3, v7, v9

    check-cast v3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    aget-object v5, v7, v12

    check-cast v5, Landroid/widget/LinearLayout;

    aget-object v4, v7, v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    aget-object v8, v7, v10

    check-cast v8, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    aget-object v6, v7, v6

    check-cast v6, Landroid/widget/TextView;

    move-object v6, v5

    move-object v5, v4

    move-object v4, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 95
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBindingImpl;->e:J

    const/16 v31, 0x0

    .line 96
    aget-object v1, v7, v31

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 97
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 98
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 99
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBindingImpl;->invalidateAll()V

    return-object v0

    .line 100
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_mistake_notebook is invalid. Received: "

    .line 101
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 102
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_8
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 103
    const-string v0, "layout/fragment_micro_class_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 104
    new-instance v0, Lcom/zykj/mistake/databinding/FragmentMicroClassBindingImpl;

    .line 105
    sget-object v3, Lcom/zykj/mistake/databinding/FragmentMicroClassBindingImpl;->b:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v11, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 106
    aget-object v5, v3, v10

    check-cast v5, Landroid/widget/LinearLayout;

    aget-object v4, v3, v4

    check-cast v4, Landroid/widget/LinearLayout;

    aget-object v4, v3, v9

    check-cast v4, Landroid/widget/LinearLayout;

    aget-object v4, v3, v8

    check-cast v4, Landroid/widget/LinearLayout;

    aget-object v4, v3, v12

    check-cast v4, Landroid/widget/LinearLayout;

    aget-object v4, v3, v6

    check-cast v4, Landroid/widget/LinearLayout;

    aget-object v4, v3, v7

    check-cast v4, Landroid/widget/LinearLayout;

    aget-object v4, v3, v28

    check-cast v4, Landroid/widget/LinearLayout;

    const/4 v4, 0x0

    .line 107
    invoke-direct {v0, v1, v2, v4}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 108
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/FragmentMicroClassBindingImpl;->a:J

    .line 109
    aget-object v1, v3, v4

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 110
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 111
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 112
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/FragmentMicroClassBindingImpl;->invalidateAll()V

    return-object v0

    .line 113
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_micro_class is invalid. Received: "

    .line 114
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 115
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_9
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 116
    const-string v0, "layout/fragment_empty_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 117
    new-instance v0, Lcom/zykj/mistake/databinding/FragmentEmptyBindingImpl;

    .line 118
    sget-object v3, Lcom/zykj/mistake/databinding/FragmentEmptyBindingImpl;->c:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v4, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 119
    aget-object v4, v3, v10

    check-cast v4, Landroid/widget/TextView;

    invoke-direct {v0, v1, v2, v4}, Lcom/zykj/mistake/databinding/FragmentEmptyBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/TextView;)V

    .line 120
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/FragmentEmptyBindingImpl;->b:J

    const/16 v31, 0x0

    .line 121
    aget-object v1, v3, v31

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 122
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 123
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 124
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/FragmentEmptyBindingImpl;->invalidateAll()V

    return-object v0

    .line 125
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_empty is invalid. Received: "

    .line 126
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_a
    move-wide v14, v4

    .line 128
    const-string v0, "layout/fragment_compose_page_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 129
    new-instance v0, Lcom/zykj/mistake/databinding/FragmentComposePageBindingImpl;

    .line 130
    invoke-static {v1, v2, v10, v13, v13}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    const/16 v31, 0x0

    .line 131
    aget-object v3, v3, v31

    check-cast v3, Landroidx/compose/ui/platform/ComposeView;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/mistake/databinding/FragmentComposePageBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroidx/compose/ui/platform/ComposeView;)V

    .line 132
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/FragmentComposePageBindingImpl;->b:J

    .line 133
    iget-object v1, v0, Lcom/zykj/mistake/databinding/FragmentComposePageBinding;->a:Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 134
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 135
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/FragmentComposePageBindingImpl;->invalidateAll()V

    return-object v0

    .line 136
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for fragment_compose_page is invalid. Received: "

    .line 137
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 138
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_b
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 139
    const-string v0, "layout/dialog_webview_shot_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 140
    new-instance v0, Lcom/zykj/mistake/databinding/DialogWebviewShotBindingImpl;

    .line 141
    sget-object v3, Lcom/zykj/mistake/databinding/DialogWebviewShotBindingImpl;->h:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v7, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v11

    .line 142
    aget-object v3, v11, v8

    check-cast v3, Landroid/widget/ImageView;

    aget-object v5, v11, v6

    check-cast v5, Landroid/widget/ImageView;

    aget-object v6, v11, v9

    check-cast v6, Landroid/widget/ImageView;

    aget-object v7, v11, v12

    check-cast v7, Landroid/widget/ImageView;

    aget-object v4, v11, v4

    check-cast v4, Landroid/widget/TextView;

    aget-object v8, v11, v10

    check-cast v8, Landroid/webkit/WebView;

    move-object/from16 v40, v7

    move-object v7, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, v40

    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/webkit/WebView;)V

    .line 143
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/DialogWebviewShotBindingImpl;->g:J

    const/16 v31, 0x0

    .line 144
    aget-object v1, v11, v31

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 145
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 146
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 147
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/DialogWebviewShotBindingImpl;->invalidateAll()V

    return-object v0

    .line 148
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for dialog_webview_shot is invalid. Received: "

    .line 149
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 150
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_c
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 151
    const-string v0, "layout/dialog_mistake_tag_add_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 152
    new-instance v0, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBindingImpl;

    .line 153
    sget-object v3, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBindingImpl;->g:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v9, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v7

    .line 154
    aget-object v3, v7, v4

    check-cast v3, Landroid/widget/EditText;

    aget-object v4, v7, v12

    check-cast v4, Landroid/widget/TextView;

    aget-object v5, v7, v6

    check-cast v5, Landroid/widget/TextView;

    aget-object v6, v7, v10

    check-cast v6, Landroid/widget/TextView;

    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 155
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBindingImpl;->f:J

    const/16 v31, 0x0

    .line 156
    aget-object v1, v7, v31

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 157
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 158
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 159
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/DialogMistakeTagAddBindingImpl;->invalidateAll()V

    return-object v0

    .line 160
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for dialog_mistake_tag_add is invalid. Received: "

    .line 161
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 162
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_d
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 163
    const-string v0, "layout/dialog_fragment_picture_note_delete_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 164
    new-instance v0, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBindingImpl;

    .line 165
    sget-object v3, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBindingImpl;->d:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v12, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 166
    aget-object v4, v3, v4

    check-cast v4, Landroid/widget/TextView;

    aget-object v5, v3, v10

    check-cast v5, Landroid/widget/TextView;

    invoke-direct {v0, v1, v2, v4, v5}, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 167
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBindingImpl;->c:J

    const/16 v31, 0x0

    .line 168
    aget-object v1, v3, v31

    check-cast v1, Landroid/widget/LinearLayout;

    .line 169
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 170
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 171
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBindingImpl;->invalidateAll()V

    return-object v0

    .line 172
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for dialog_fragment_picture_note_delete is invalid. Received: "

    .line 173
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 174
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_e
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 175
    const-string v0, "layout/dialog_fragment_image_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 176
    new-instance v0, Lcom/zykj/mistake/databinding/DialogFragmentImageBindingImpl;

    .line 177
    sget-object v3, Lcom/zykj/mistake/databinding/DialogFragmentImageBindingImpl;->e:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v6, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v6

    .line 178
    aget-object v3, v6, v4

    check-cast v3, Landroid/widget/ImageView;

    aget-object v4, v6, v12

    check-cast v4, Landroid/widget/ImageView;

    aget-object v5, v6, v10

    check-cast v5, Landroid/widget/ImageView;

    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 179
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/DialogFragmentImageBindingImpl;->d:J

    const/16 v31, 0x0

    .line 180
    aget-object v1, v6, v31

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 181
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 182
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 183
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/DialogFragmentImageBindingImpl;->invalidateAll()V

    return-object v0

    .line 184
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for dialog_fragment_image is invalid. Received: "

    .line 185
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 186
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_f
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 187
    const-string v0, "layout/dialog_fragment_answer_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 188
    new-instance v0, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBindingImpl;

    .line 189
    sget-object v3, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBindingImpl;->e:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v6, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v6

    .line 190
    aget-object v3, v6, v12

    check-cast v3, Landroid/widget/ImageView;

    aget-object v4, v6, v4

    check-cast v4, Lcom/zykj/mistake/widget/IntrinsicWidthImageView;

    aget-object v5, v6, v10

    check-cast v5, Lcom/zykj/mistake/widget/IntrinsicWidthImageView;

    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/ImageView;Lcom/zykj/mistake/widget/IntrinsicWidthImageView;Lcom/zykj/mistake/widget/IntrinsicWidthImageView;)V

    .line 191
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBindingImpl;->d:J

    const/16 v31, 0x0

    .line 192
    aget-object v1, v6, v31

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 193
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 194
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 195
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBindingImpl;->invalidateAll()V

    return-object v0

    .line 196
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for dialog_fragment_answer is invalid. Received: "

    .line 197
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 198
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_10
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 199
    const-string v0, "layout/dialog_convert_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 200
    new-instance v0, Lcom/zykj/mistake/databinding/DialogConvertBindingImpl;

    .line 201
    sget-object v3, Lcom/zykj/mistake/databinding/DialogConvertBindingImpl;->i:Landroid/util/SparseIntArray;

    move/from16 v5, v28

    invoke-static {v1, v2, v5, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v11

    .line 202
    aget-object v3, v11, v9

    check-cast v3, Landroid/widget/LinearLayout;

    aget-object v5, v11, v12

    check-cast v5, Lcom/zykj/mistake/widget/LineBottomProView;

    aget-object v8, v11, v8

    check-cast v8, Landroid/widget/TextView;

    aget-object v7, v11, v7

    check-cast v7, Landroid/widget/TextView;

    aget-object v4, v11, v4

    check-cast v4, Landroid/widget/TextView;

    aget-object v6, v11, v6

    check-cast v6, Landroid/widget/TextView;

    aget-object v9, v11, v10

    check-cast v9, Landroid/widget/TextView;

    move-object/from16 v40, v7

    move-object v7, v4

    move-object v4, v5

    move-object v5, v8

    move-object v8, v6

    move-object/from16 v6, v40

    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/databinding/DialogConvertBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/LinearLayout;Lcom/zykj/mistake/widget/LineBottomProView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 203
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/DialogConvertBindingImpl;->h:J

    const/16 v31, 0x0

    .line 204
    aget-object v1, v11, v31

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 205
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 206
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 207
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/DialogConvertBindingImpl;->invalidateAll()V

    return-object v0

    .line 208
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for dialog_convert is invalid. Received: "

    .line 209
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 210
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_11
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 211
    const-string v0, "layout/activity_sketch_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 212
    new-instance v0, Lcom/zykj/mistake/databinding/ActivitySketchBindingImpl;

    .line 213
    sget-object v3, Lcom/zykj/mistake/databinding/ActivitySketchBindingImpl;->c:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v12, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 214
    aget-object v4, v3, v4

    check-cast v4, Landroid/widget/ImageView;

    aget-object v5, v3, v10

    check-cast v5, Landroidx/fragment/app/FragmentContainerView;

    invoke-direct {v0, v1, v2, v4}, Lcom/zykj/mistake/databinding/ActivitySketchBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/ImageView;)V

    .line 215
    iput-wide v14, v0, Lcom/zykj/mistake/databinding/ActivitySketchBindingImpl;->b:J

    const/16 v31, 0x0

    .line 216
    aget-object v1, v3, v31

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 217
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 218
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 219
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ActivitySketchBindingImpl;->invalidateAll()V

    return-object v0

    .line 220
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for activity_sketch is invalid. Received: "

    .line 221
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 222
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_12
    move-wide/from16 v40, v4

    move v4, v15

    move-wide/from16 v14, v40

    .line 223
    const-string v0, "layout/activity_mistake_list_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 224
    new-instance v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBindingImpl;

    .line 225
    sget-object v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBindingImpl;->t:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v5, Lcom/zykj/mistake/databinding/ActivityMistakeListBindingImpl;->u:Landroid/util/SparseIntArray;

    move/from16 v29, v6

    const/16 v6, 0x14

    invoke-static {v1, v2, v6, v3, v5}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    const/16 v31, 0x0

    .line 226
    aget-object v5, v3, v31

    check-cast v5, Landroidx/drawerlayout/widget/DrawerLayout;

    aget-object v6, v3, v10

    check-cast v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    aget-object v10, v3, v12

    check-cast v10, Landroid/widget/ImageView;

    aget-object v12, v3, v22

    check-cast v12, Landroid/widget/ImageView;

    aget-object v21, v3, v21

    check-cast v21, Landroid/widget/ImageView;

    aget-object v11, v3, v11

    check-cast v11, Landroid/widget/LinearLayout;

    aget-object v19, v3, v19

    check-cast v19, Landroid/widget/LinearLayout;

    const/16 v28, 0x8

    aget-object v22, v3, v28

    check-cast v22, Landroid/widget/LinearLayout;

    aget-object v17, v3, v17

    check-cast v17, Landroid/widget/LinearLayout;

    aget-object v16, v3, v16

    check-cast v16, Landroid/widget/LinearLayout;

    const/16 v26, 0x11

    aget-object v25, v3, v26

    check-cast v25, Landroidx/recyclerview/widget/RecyclerView;

    aget-object v4, v3, v4

    check-cast v4, Landroid/widget/RelativeLayout;

    aget-object v4, v3, v24

    check-cast v4, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    aget-object v23, v3, v23

    check-cast v23, Landroid/widget/TextView;

    aget-object v20, v3, v20

    check-cast v20, Landroid/widget/TextView;

    aget-object v18, v3, v18

    check-cast v18, Landroid/widget/TextView;

    aget-object v9, v3, v9

    check-cast v9, Landroid/widget/TextView;

    aget-object v8, v3, v8

    move-object/from16 v18, v8

    check-cast v18, Landroid/widget/TextView;

    aget-object v7, v3, v7

    check-cast v7, Landroid/widget/TextView;

    aget-object v3, v3, v29

    check-cast v3, Landroid/widget/TextView;

    move-object v14, v4

    move-object v4, v6

    move-object v8, v11

    move-object v6, v12

    move-object/from16 v12, v16

    move-object/from16 v11, v17

    move-object/from16 v16, v20

    move-object/from16 v15, v23

    move-object/from16 v13, v25

    move-object/from16 v20, v3

    move-object v3, v5

    move-object/from16 v17, v9

    move-object v5, v10

    move-object/from16 v9, v19

    move-object/from16 v10, v22

    move-object/from16 v19, v7

    move-object/from16 v7, v21

    invoke-direct/range {v0 .. v20}, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v5, -0x1

    .line 227
    iput-wide v5, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBindingImpl;->s:J

    .line 228
    iget-object v1, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 229
    iget-object v1, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 230
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 231
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ActivityMistakeListBindingImpl;->invalidateAll()V

    return-object v0

    .line 232
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for activity_mistake_list is invalid. Received: "

    .line 233
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 234
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_13
    move/from16 v29, v6

    move-wide v5, v4

    move v4, v15

    .line 235
    const-string v0, "layout/activity_mistake_detail_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 236
    new-instance v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBindingImpl;

    .line 237
    sget-object v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBindingImpl;->s:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v14, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBindingImpl;->t:Landroid/util/SparseIntArray;

    const/16 v15, 0x18

    invoke-static {v1, v2, v15, v3, v14}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    const/16 v31, 0x0

    .line 238
    aget-object v14, v3, v31

    check-cast v14, Landroidx/drawerlayout/widget/DrawerLayout;

    aget-object v7, v3, v7

    check-cast v7, Lcom/zykj/mistake/widget/FlowLayout;

    aget-object v10, v3, v10

    check-cast v10, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    aget-object v4, v3, v4

    check-cast v4, Landroid/widget/ImageView;

    const/16 v28, 0x8

    aget-object v15, v3, v28

    check-cast v15, Landroid/widget/ImageView;

    aget-object v25, v3, v29

    check-cast v25, Landroid/widget/ImageView;

    const/16 v26, 0x11

    aget-object v26, v3, v26

    check-cast v26, Landroid/widget/ImageView;

    aget-object v21, v3, v21

    check-cast v21, Landroid/widget/LinearLayout;

    aget-object v21, v3, v22

    check-cast v21, Landroid/widget/LinearLayout;

    aget-object v9, v3, v9

    check-cast v9, Landroid/widget/LinearLayout;

    aget-object v9, v3, v19

    check-cast v9, Landroid/widget/RelativeLayout;

    aget-object v9, v3, p3

    check-cast v9, Landroid/widget/LinearLayout;

    aget-object v9, v3, v24

    check-cast v9, Landroid/widget/RelativeLayout;

    aget-object v8, v3, v8

    check-cast v8, Landroid/widget/LinearLayout;

    aget-object v8, v3, v11

    move-object v11, v8

    check-cast v11, Landroid/widget/ScrollView;

    aget-object v8, v3, v20

    check-cast v8, Lcom/flyco/tablayout/SlidingTabLayout;

    const/16 v19, 0x16

    aget-object v19, v3, v19

    check-cast v19, Landroid/widget/TextView;

    const/16 v20, 0x17

    aget-object v20, v3, v20

    check-cast v20, Landroid/widget/TextView;

    aget-object v18, v3, v18

    check-cast v18, Landroid/widget/TextView;

    aget-object v16, v3, v16

    check-cast v16, Landroid/widget/TextView;

    aget-object v12, v3, v12

    check-cast v12, Landroid/widget/TextView;

    const/16 v27, 0x14

    aget-object v18, v3, v27

    check-cast v18, Landroid/view/View;

    aget-object v17, v3, v17

    check-cast v17, Lcom/zykj/mistake/widget/CustomViewPager;

    aget-object v3, v3, v23

    check-cast v3, Lcom/zykj/mistake/widget/StemWebView;

    move-object/from16 v5, v18

    move-object/from16 v18, v17

    move-object/from16 v17, v5

    move-object v6, v4

    move-object v4, v7

    move-object v5, v10

    move-object v7, v15

    move-object/from16 v15, v16

    move-object/from16 v13, v19

    move-object/from16 v19, v3

    move-object v10, v9

    move-object/from16 v16, v12

    move-object v3, v14

    move-object/from16 v14, v20

    move-object/from16 v9, v21

    move-object v12, v8

    move-object/from16 v8, v25

    invoke-direct/range {v0 .. v19}, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/zykj/mistake/widget/FlowLayout;Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Landroid/widget/ScrollView;Lcom/flyco/tablayout/SlidingTabLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lcom/zykj/mistake/widget/CustomViewPager;Lcom/zykj/mistake/widget/StemWebView;)V

    const-wide/16 v5, -0x1

    .line 239
    iput-wide v5, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBindingImpl;->r:J

    .line 240
    iget-object v1, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 241
    iget-object v1, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 242
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 243
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBindingImpl;->invalidateAll()V

    return-object v0

    .line 244
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for activity_mistake_detail is invalid. Received: "

    .line 245
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 246
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_14
    move/from16 v29, v6

    move-wide v5, v4

    move v4, v15

    .line 247
    const-string v0, "layout/activity_mistake_create_or_edit_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 248
    new-instance v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;

    .line 249
    sget-object v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->A:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v14, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->B:Landroid/util/SparseIntArray;

    const/16 v15, 0x27

    invoke-static {v1, v2, v15, v3, v14}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    const/16 v14, 0x25

    .line 250
    aget-object v14, v3, v14

    check-cast v14, Landroid/widget/TextView;

    const/16 v15, 0x26

    aget-object v15, v3, v15

    check-cast v15, Landroid/widget/TextView;

    const/16 v31, 0x0

    aget-object v30, v3, v31

    check-cast v30, Landroidx/drawerlayout/widget/DrawerLayout;

    aget-object v20, v3, v20

    check-cast v20, Landroid/widget/EditText;

    const/16 v31, 0x23

    aget-object v31, v3, v31

    check-cast v31, Lcom/zykj/mistake/widget/FlowLayout;

    const/16 v32, 0x17

    aget-object v32, v3, v32

    check-cast v32, Landroidx/constraintlayout/widget/Group;

    const/16 v33, 0x1f

    aget-object v33, v3, v33

    check-cast v33, Landroidx/constraintlayout/widget/Group;

    const/16 v34, 0x24

    aget-object v34, v3, v34

    check-cast v34, Landroidx/constraintlayout/widget/Guideline;

    aget-object v12, v3, v12

    check-cast v12, Landroid/widget/ImageButton;

    aget-object v10, v3, v10

    check-cast v10, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    const/16 v34, 0x1a

    aget-object v34, v3, v34

    check-cast v34, Landroid/widget/ImageView;

    const/16 v35, 0x19

    aget-object v35, v3, v35

    check-cast v35, Landroid/widget/ImageView;

    const/16 v35, 0x1b

    aget-object v35, v3, v35

    check-cast v35, Landroidx/appcompat/widget/AppCompatImageView;

    aget-object v16, v3, v16

    check-cast v16, Landroid/widget/ImageView;

    const/16 v26, 0x11

    aget-object v26, v3, v26

    check-cast v26, Landroid/widget/ImageView;

    aget-object v18, v3, v18

    check-cast v18, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v36, 0x20

    aget-object v36, v3, v36

    check-cast v36, Landroid/widget/ImageView;

    const/16 v36, 0x1d

    aget-object v36, v3, v36

    check-cast v36, Landroid/widget/ImageView;

    const/16 v37, 0x1c

    aget-object v37, v3, v37

    check-cast v37, Landroid/widget/ImageView;

    const/16 v37, 0x1e

    aget-object v37, v3, v37

    check-cast v37, Landroidx/appcompat/widget/AppCompatImageView;

    aget-object v38, v3, p3

    check-cast v38, Landroid/widget/ImageView;

    const/16 v27, 0x14

    aget-object v27, v3, v27

    check-cast v27, Landroid/widget/ImageView;

    const/16 v39, 0x16

    aget-object v39, v3, v39

    check-cast v39, Landroidx/appcompat/widget/AppCompatImageView;

    aget-object v11, v3, v11

    check-cast v11, Lorg/angmarch/views/NiceSpinner;

    aget-object v8, v3, v8

    check-cast v8, Landroid/widget/ScrollView;

    const/16 v8, 0x21

    aget-object v8, v3, v8

    check-cast v8, Landroid/widget/TextView;

    const/16 v25, 0x18

    aget-object v8, v3, v25

    check-cast v8, Landroid/widget/TextView;

    aget-object v8, v3, v24

    check-cast v8, Landroid/widget/TextView;

    const/16 v28, 0x8

    aget-object v8, v3, v28

    check-cast v8, Landroid/widget/TextView;

    const/16 v8, 0x22

    aget-object v8, v3, v8

    check-cast v8, Landroid/widget/TextView;

    aget-object v8, v3, v21

    check-cast v8, Landroid/widget/TextView;

    aget-object v7, v3, v7

    check-cast v7, Landroid/widget/TextView;

    aget-object v7, v3, v19

    check-cast v7, Landroid/widget/TextView;

    aget-object v7, v3, v17

    check-cast v7, Landroid/widget/TextView;

    aget-object v7, v3, v29

    check-cast v7, Landroid/widget/TextView;

    aget-object v8, v3, v23

    move-object/from16 v24, v8

    check-cast v24, Landroidx/appcompat/widget/AppCompatTextView;

    aget-object v8, v3, v9

    move-object/from16 v25, v8

    check-cast v25, Landroid/view/View;

    aget-object v4, v3, v4

    check-cast v4, Landroid/view/View;

    aget-object v3, v3, v22

    check-cast v3, Landroid/view/View;

    move-object/from16 v5, v26

    move-object/from16 v26, v4

    move-object v4, v15

    move-object v15, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v11

    move-object/from16 v6, v20

    move-object/from16 v20, v27

    move-object/from16 v5, v30

    move-object/from16 v7, v31

    move-object/from16 v8, v32

    move-object/from16 v9, v33

    move-object/from16 v13, v35

    move-object/from16 v17, v36

    move-object/from16 v19, v38

    move-object/from16 v21, v39

    move-object/from16 v27, v3

    move-object v11, v10

    move-object v10, v12

    move-object v3, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v18

    move-object/from16 v12, v34

    move-object/from16 v18, v37

    invoke-direct/range {v0 .. v27}, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/EditText;Lcom/zykj/mistake/widget/FlowLayout;Landroidx/constraintlayout/widget/Group;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageButton;Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Lorg/angmarch/views/NiceSpinner;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    const-wide/16 v5, -0x1

    .line 251
    iput-wide v5, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->z:J

    .line 252
    iget-object v1, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 253
    iget-object v1, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 254
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 255
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->invalidateAll()V

    return-object v0

    .line 256
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for activity_mistake_create_or_edit is invalid. Received: "

    .line 257
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 258
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_15
    move-wide v5, v4

    .line 259
    const-string v0, "layout/activity_mistake_collection_detail_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 260
    new-instance v0, Lcom/zykj/mistake/databinding/ActivityMistakeCollectionDetailBindingImpl;

    .line 261
    invoke-static {v1, v2, v10, v13, v13}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    const/16 v31, 0x0

    .line 262
    aget-object v3, v3, v31

    check-cast v3, Landroidx/compose/ui/platform/ComposeView;

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/mistake/databinding/ActivityMistakeCollectionDetailBinding;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroidx/compose/ui/platform/ComposeView;)V

    .line 263
    iput-wide v5, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCollectionDetailBindingImpl;->b:J

    .line 264
    iget-object v1, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCollectionDetailBinding;->a:Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 265
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 266
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ActivityMistakeCollectionDetailBindingImpl;->invalidateAll()V

    return-object v0

    .line 267
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for activity_mistake_collection_detail is invalid. Received: "

    .line 268
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 269
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_16
    move-wide v5, v4

    move v4, v15

    .line 270
    const-string v0, "layout/activity_lesson_player_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 271
    new-instance v0, Lcom/zykj/mistake/databinding/ActivityLessonPlayerBindingImpl;

    .line 272
    sget-object v3, Lcom/zykj/mistake/databinding/ActivityLessonPlayerBindingImpl;->b:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v4, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 273
    aget-object v4, v3, v10

    check-cast v4, Landroidx/fragment/app/FragmentContainerView;

    const/4 v4, 0x0

    .line 274
    invoke-direct {v0, v1, v2, v4}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 275
    iput-wide v5, v0, Lcom/zykj/mistake/databinding/ActivityLessonPlayerBindingImpl;->a:J

    .line 276
    aget-object v1, v3, v4

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 277
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 278
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 279
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ActivityLessonPlayerBindingImpl;->invalidateAll()V

    return-object v0

    .line 280
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for activity_lesson_player is invalid. Received: "

    .line 281
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 282
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_17
    move-wide v5, v4

    move v4, v15

    .line 283
    const-string v0, "layout/activity_legacy_mistake_0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 284
    new-instance v0, Lcom/zykj/mistake/databinding/ActivityLegacyMistakeBindingImpl;

    .line 285
    sget-object v3, Lcom/zykj/mistake/databinding/ActivityLegacyMistakeBindingImpl;->b:Landroid/util/SparseIntArray;

    invoke-static {v1, v2, v12, v13, v3}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v3

    .line 286
    aget-object v4, v3, v4

    check-cast v4, Landroidx/fragment/app/FragmentContainerView;

    aget-object v4, v3, v10

    check-cast v4, Landroid/widget/RelativeLayout;

    const/4 v4, 0x0

    .line 287
    invoke-direct {v0, v1, v2, v4}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 288
    iput-wide v5, v0, Lcom/zykj/mistake/databinding/ActivityLegacyMistakeBindingImpl;->a:J

    .line 289
    aget-object v1, v3, v4

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 290
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 291
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 292
    invoke-virtual {v0}, Lcom/zykj/mistake/databinding/ActivityLegacyMistakeBindingImpl;->invalidateAll()V

    return-object v0

    .line 293
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The tag for activity_legacy_mistake is invalid. Received: "

    .line 294
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 295
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 296
    :cond_18
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "view must have a tag"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    :goto_0
    return-object v13

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDataBinder(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;
    .locals 1

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    .line 393
    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    .line 394
    :cond_0
    sget-object v0, Lcom/zykj/mistake/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p3

    if-lez p3, :cond_2

    const/4 p3, 0x0

    .line 395
    aget-object p2, p2, p3

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 396
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "view must have a tag"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final getLayoutId(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, Lf4/b;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method
