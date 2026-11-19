.class public Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;
.super Lcom/friday/paint/databinding/FragmentThePaintBinding;
.source "SourceFile"


# static fields
.field public static final L:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final M:Landroid/util/SparseIntArray;


# instance fields
.field public final J:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public K:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->L:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "item_paint_pen_color"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x2

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v3, Lcom/friday/paint/R$layout;->item_paint_pen_color:I

    .line 22
    .line 23
    filled-new-array {v3}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Landroid/util/SparseIntArray;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->M:Landroid/util/SparseIntArray;

    .line 37
    .line 38
    sget v1, Lcom/friday/paint/R$id;->drawerLayout:I

    .line 39
    .line 40
    const/4 v2, 0x3

    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 42
    .line 43
    .line 44
    sget v1, Lcom/friday/paint/R$id;->vp_paint:I

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 48
    .line 49
    .line 50
    sget v1, Lcom/friday/paint/R$id;->iv_back:I

    .line 51
    .line 52
    const/4 v2, 0x5

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 54
    .line 55
    .line 56
    sget v1, Lcom/friday/paint/R$id;->tooBox:I

    .line 57
    .line 58
    const/4 v2, 0x6

    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 60
    .line 61
    .line 62
    sget v1, Lcom/friday/paint/R$id;->iv_touch:I

    .line 63
    .line 64
    const/4 v2, 0x7

    .line 65
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 66
    .line 67
    .line 68
    sget v1, Lcom/friday/paint/R$id;->iv_select:I

    .line 69
    .line 70
    const/16 v2, 0x8

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 73
    .line 74
    .line 75
    sget v1, Lcom/friday/paint/R$id;->iv_pen:I

    .line 76
    .line 77
    const/16 v2, 0x9

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 80
    .line 81
    .line 82
    sget v1, Lcom/friday/paint/R$id;->iv_eraser:I

    .line 83
    .line 84
    const/16 v2, 0xa

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 87
    .line 88
    .line 89
    sget v1, Lcom/friday/paint/R$id;->iv_gallery:I

    .line 90
    .line 91
    const/16 v2, 0xb

    .line 92
    .line 93
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 94
    .line 95
    .line 96
    sget v1, Lcom/friday/paint/R$id;->iv_camera:I

    .line 97
    .line 98
    const/16 v2, 0xc

    .line 99
    .line 100
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 101
    .line 102
    .line 103
    sget v1, Lcom/friday/paint/R$id;->iv_delete:I

    .line 104
    .line 105
    const/16 v2, 0xd

    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 108
    .line 109
    .line 110
    sget v1, Lcom/friday/paint/R$id;->iv_expansion:I

    .line 111
    .line 112
    const/16 v2, 0xe

    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 115
    .line 116
    .line 117
    sget v1, Lcom/friday/paint/R$id;->rg_eraser:I

    .line 118
    .line 119
    const/16 v2, 0xf

    .line 120
    .line 121
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 122
    .line 123
    .line 124
    sget v1, Lcom/friday/paint/R$id;->rb_line:I

    .line 125
    .line 126
    const/16 v2, 0x10

    .line 127
    .line 128
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 129
    .line 130
    .line 131
    sget v1, Lcom/friday/paint/R$id;->rb_image:I

    .line 132
    .line 133
    const/16 v2, 0x11

    .line 134
    .line 135
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 136
    .line 137
    .line 138
    sget v1, Lcom/friday/paint/R$id;->ll_student_feature:I

    .line 139
    .line 140
    const/16 v2, 0x12

    .line 141
    .line 142
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 143
    .line 144
    .line 145
    sget v1, Lcom/friday/paint/R$id;->iv_answer_board:I

    .line 146
    .line 147
    const/16 v2, 0x13

    .line 148
    .line 149
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 150
    .line 151
    .line 152
    sget v1, Lcom/friday/paint/R$id;->iv_subjective_submit:I

    .line 153
    .line 154
    const/16 v2, 0x14

    .line 155
    .line 156
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 157
    .line 158
    .line 159
    sget v1, Lcom/friday/paint/R$id;->iv_screen_shoot:I

    .line 160
    .line 161
    const/16 v2, 0x15

    .line 162
    .line 163
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 164
    .line 165
    .line 166
    sget v1, Lcom/friday/paint/R$id;->iv_ask:I

    .line 167
    .line 168
    const/16 v2, 0x16

    .line 169
    .line 170
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 171
    .line 172
    .line 173
    sget v1, Lcom/friday/paint/R$id;->iv_drawer_hint:I

    .line 174
    .line 175
    const/16 v2, 0x17

    .line 176
    .line 177
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 178
    .line 179
    .line 180
    sget v1, Lcom/friday/paint/R$id;->iv_prev_page:I

    .line 181
    .line 182
    const/16 v2, 0x18

    .line 183
    .line 184
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 185
    .line 186
    .line 187
    sget v1, Lcom/friday/paint/R$id;->tv_current_paging:I

    .line 188
    .line 189
    const/16 v2, 0x19

    .line 190
    .line 191
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 192
    .line 193
    .line 194
    sget v1, Lcom/friday/paint/R$id;->iv_next_page:I

    .line 195
    .line 196
    const/16 v2, 0x1a

    .line 197
    .line 198
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 199
    .line 200
    .line 201
    sget v1, Lcom/friday/paint/R$id;->ll_drawer_right:I

    .line 202
    .line 203
    const/16 v2, 0x1b

    .line 204
    .line 205
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 206
    .line 207
    .line 208
    sget v1, Lcom/friday/paint/R$id;->rv_note_menu:I

    .line 209
    .line 210
    const/16 v2, 0x1c

    .line 211
    .line 212
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 213
    .line 214
    .line 215
    sget v1, Lcom/friday/paint/R$id;->iv_copy_to_others:I

    .line 216
    .line 217
    const/16 v2, 0x1d

    .line 218
    .line 219
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 220
    .line 221
    .line 222
    sget v1, Lcom/friday/paint/R$id;->iv_remove_page:I

    .line 223
    .line 224
    const/16 v2, 0x1e

    .line 225
    .line 226
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 227
    .line 228
    .line 229
    sget v1, Lcom/friday/paint/R$id;->iv_copy_page:I

    .line 230
    .line 231
    const/16 v2, 0x1f

    .line 232
    .line 233
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 234
    .line 235
    .line 236
    sget v1, Lcom/friday/paint/R$id;->iv_add_page:I

    .line 237
    .line 238
    const/16 v2, 0x20

    .line 239
    .line 240
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 241
    .line 242
    .line 243
    sget v1, Lcom/friday/paint/R$id;->rv_note_list:I

    .line 244
    .line 245
    const/16 v2, 0x21

    .line 246
    .line 247
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 248
    .line 249
    .line 250
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->L:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->M:Landroid/util/SparseIntArray;

    const/16 v2, 0x22

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 37

    const/4 v0, 0x2

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/drawerlayout/widget/DrawerLayout;

    const/16 v0, 0x20

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/16 v0, 0x13

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/16 v0, 0x16

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    const/16 v0, 0x1f

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/ImageView;

    const/16 v0, 0x1d

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/ImageView;

    const/16 v0, 0x17

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/ImageView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/ImageView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/ImageView;

    const/16 v0, 0x1a

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/ImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/ImageView;

    const/16 v0, 0x18

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/ImageView;

    const/16 v0, 0x1e

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/ImageView;

    const/16 v0, 0x15

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/ImageView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Landroid/widget/ImageView;

    const/16 v0, 0x14

    aget-object v0, p3, v0

    move-object/from16 v24, v0

    check-cast v24, Landroid/widget/ImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object/from16 v25, v0

    check-cast v25, Landroid/widget/ImageView;

    const/16 v0, 0x1b

    aget-object v0, p3, v0

    move-object/from16 v26, v0

    check-cast v26, Landroid/widget/LinearLayout;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object/from16 v27, v0

    check-cast v27, Landroid/widget/LinearLayout;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object/from16 v28, v0

    check-cast v28, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object/from16 v29, v0

    check-cast v29, Landroid/widget/RadioButton;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object/from16 v30, v0

    check-cast v30, Landroid/widget/RadioButton;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v31, v0

    check-cast v31, Landroid/widget/RadioGroup;

    const/16 v0, 0x21

    aget-object v0, p3, v0

    move-object/from16 v32, v0

    check-cast v32, Landroidx/recyclerview/widget/RecyclerView;

    const/16 v0, 0x1c

    aget-object v0, p3, v0

    move-object/from16 v33, v0

    check-cast v33, Landroid/widget/LinearLayout;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object/from16 v34, v0

    check-cast v34, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x19

    aget-object v0, p3, v0

    move-object/from16 v35, v0

    check-cast v35, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object/from16 v36, v0

    check-cast v36, Landroidx/viewpager2/widget/ViewPager2;

    const/4 v3, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v36}, Lcom/friday/paint/databinding/FragmentThePaintBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/friday/paint/databinding/ItemPaintPenColorBinding;Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroidx/viewpager2/widget/ViewPager2;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->K:J

    .line 4
    iget-object v1, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 v1, 0x0

    .line 5
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, v0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->J:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v1, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 8
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 9
    invoke-virtual {v0}, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lx3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->K:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->K:J

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public executeBindings()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->K:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->K:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->K:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    check-cast p2, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 6
    .line 7
    invoke-virtual {p0, p2, p3}, Lcom/friday/paint/databinding/FragmentThePaintBindingImpl;->a(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
