.class public final Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;
.super Lcom/friday/lecture/widget/LifecycleFrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public d:Lcom/friday/lecture/adapter/OnlineListAdapter;

.field public e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

.field public f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/friday/lecture/widget/LifecycleFrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->m()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic d(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->w(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic e(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->r(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    return-void
.end method

.method public static synthetic f(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->u(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->t(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->n(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic i(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->s(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->q(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;J)V

    return-void
.end method

.method public static synthetic k(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->o(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->p(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final m()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/friday/lecture/R$layout;->window_student_demo_list:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->a(Landroid/view/View;)Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "bind(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 25
    .line 26
    const-string v1, "binding"

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v2

    .line 34
    :cond_0
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/friday/lecture/databinding/LayoutRandomBinding;->g:Landroid/widget/LinearLayout;

    .line 37
    .line 38
    new-instance v3, Lh3/a;

    .line 39
    .line 40
    invoke-direct {v3, p0}, Lh3/a;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    .line 41
    .line 42
    .line 43
    const-wide/16 v4, 0xbb8

    .line 44
    .line 45
    invoke-static {v0, v4, v5, v3}, Lcom/blankj/utilcode/util/ClickUtils;->applySingleDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v2

    .line 56
    :cond_1
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->f:Landroid/widget/ImageView;

    .line 57
    .line 58
    new-instance v3, Lh3/b;

    .line 59
    .line 60
    invoke-direct {v3}, Lh3/b;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    move-object v0, v2

    .line 74
    :cond_2
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->e:Landroidx/cardview/widget/CardView;

    .line 75
    .line 76
    new-instance v3, Lh3/c;

    .line 77
    .line 78
    invoke-direct {v3, p0}, Lh3/c;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 85
    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v2

    .line 92
    :cond_3
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 93
    .line 94
    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    const/16 v5, 0x8

    .line 101
    .line 102
    invoke-direct {v3, v4, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 106
    .line 107
    .line 108
    const/4 v3, 0x1

    .line 109
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 110
    .line 111
    .line 112
    new-instance v4, Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 113
    .line 114
    new-instance v5, Lh3/d;

    .line 115
    .line 116
    invoke-direct {v5, p0}, Lh3/d;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v4, v5}, Lcom/friday/lecture/adapter/OnlineListAdapter;-><init>(Lhd/a;)V

    .line 120
    .line 121
    .line 122
    iput-object v4, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 123
    .line 124
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 128
    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    move-object v0, v2

    .line 135
    :cond_4
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 136
    .line 137
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    const/4 v5, 0x0

    .line 144
    invoke-direct {v1, v4, v5, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 151
    .line 152
    .line 153
    new-instance v1, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout$initView$5$1;

    .line 154
    .line 155
    invoke-direct {v1, v0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout$initView$5$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 159
    .line 160
    .line 161
    new-instance v1, Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 162
    .line 163
    invoke-direct {v1}, Lcom/friday/lecture/adapter/DemonstratingAdapter;-><init>()V

    .line 164
    .line 165
    .line 166
    iput-object v1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 172
    .line 173
    if-nez v0, :cond_5

    .line 174
    .line 175
    const-string v0, "demonstratingAdapter"

    .line 176
    .line 177
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_5
    move-object v2, v0

    .line 182
    :goto_0
    new-instance v0, Lh3/e;

    .line 183
    .line 184
    invoke-direct {v0, p0}, Lh3/e;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemChildClickListener(Lo1/b;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public static final n(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "<unused var>"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "view"

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 18
    .line 19
    const-string v3, "demonstratingAdapter"

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v1, v4

    .line 28
    :cond_0
    move/from16 v5, p3

    .line 29
    .line 30
    invoke-virtual {v1, v5}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lkotlin/Pair;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    sget v6, Lcom/friday/lecture/R$id;->iv_remove:I

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    const-string v8, "toJson(...)"

    .line 44
    .line 45
    const-class v9, Lcom/friday/common/entity/MqttEntity;

    .line 46
    .line 47
    if-ne v5, v6, :cond_6

    .line 48
    .line 49
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Lcom/friday/lecture/model/ClassTestHelper;->removeFromDemonstratingList(Lkotlin/Pair;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v9}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    new-instance v10, Lcom/friday/common/entity/MqttEntity;

    .line 59
    .line 60
    sget-object v12, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 61
    .line 62
    new-instance v6, Lcom/friday/common/classtest/MqttRequestEntity;

    .line 63
    .line 64
    new-instance v13, Lcom/friday/common/classtest/RequestScreencastData;

    .line 65
    .line 66
    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    const/16 v17, 0x5

    .line 77
    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    const/4 v14, 0x0

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    invoke-direct/range {v13 .. v18}, Lcom/friday/common/classtest/RequestScreencastData;-><init>(ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 84
    .line 85
    .line 86
    const/16 v1, 0x271a

    .line 87
    .line 88
    invoke-direct {v6, v1, v13}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v6}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 v14, 0x4

    .line 99
    const/4 v15, 0x0

    .line 100
    const/4 v13, 0x0

    .line 101
    move-object v11, v12

    .line 102
    move-object v12, v1

    .line 103
    invoke-direct/range {v10 .. v15}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 104
    .line 105
    .line 106
    move-object v12, v11

    .line 107
    invoke-interface {v5, v10}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 111
    .line 112
    if-nez v1, :cond_1

    .line 113
    .line 114
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    move-object v1, v4

    .line 118
    :cond_1
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-ne v1, v7, :cond_2

    .line 123
    .line 124
    invoke-static {v9}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v11, Lcom/friday/common/entity/MqttEntity;

    .line 129
    .line 130
    new-instance v5, Lcom/friday/common/classtest/RequestScreencastList;

    .line 131
    .line 132
    sget-object v6, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 133
    .line 134
    invoke-virtual {v6}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v6}, Lcom/friday/common/helper/b;->t()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    filled-new-array {v6}, [Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-static {v6}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    const/16 v7, 0x2718

    .line 155
    .line 156
    invoke-direct {v5, v7, v6}, Lcom/friday/common/classtest/RequestScreencastList;-><init>(ILjava/util/List;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v5}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    invoke-static {v13, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/4 v15, 0x4

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    invoke-direct/range {v11 .. v16}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v1, v11}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->setTeacherDemonstrating()V

    .line 177
    .line 178
    .line 179
    :cond_2
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 180
    .line 181
    if-nez v1, :cond_3

    .line 182
    .line 183
    const-string v1, "binding"

    .line 184
    .line 185
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    move-object v1, v4

    .line 189
    :cond_3
    iget-object v1, v1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->j:Landroid/widget/TextView;

    .line 190
    .line 191
    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    new-instance v6, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    const-string v7, "\u6b63\u5728\u6f14\u793a "

    .line 205
    .line 206
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v5, "\u4eba"

    .line 213
    .line 214
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 225
    .line 226
    if-nez v1, :cond_4

    .line 227
    .line 228
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    move-object v1, v4

    .line 232
    :cond_4
    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    check-cast v3, Ljava/util/Collection;

    .line 237
    .line 238
    invoke-virtual {v1, v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 239
    .line 240
    .line 241
    iget-object v1, v0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 242
    .line 243
    if-nez v1, :cond_5

    .line 244
    .line 245
    const-string v1, "onlineListAdapter"

    .line 246
    .line 247
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto :goto_0

    .line 251
    :cond_5
    move-object v4, v1

    .line 252
    :goto_0
    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getStudentList()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    check-cast v1, Ljava/util/Collection;

    .line 257
    .line 258
    invoke-virtual {v4, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->y()V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_6
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    sget v5, Lcom/friday/lecture/R$id;->iv_fullscreen:I

    .line 270
    .line 271
    if-ne v2, v5, :cond_9

    .line 272
    .line 273
    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    check-cast v2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 278
    .line 279
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    sget-object v5, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 284
    .line 285
    invoke-virtual {v5}, Lcom/friday/lecture/model/ClassTestHelper;->getFullscreenMember()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    invoke-static {v2, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    xor-int/lit8 v11, v2, 0x1

    .line 294
    .line 295
    invoke-static {v9}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    new-instance v6, Lcom/friday/common/entity/MqttEntity;

    .line 300
    .line 301
    sget-object v7, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 302
    .line 303
    new-instance v9, Lcom/friday/common/classtest/MqttRequestEntity;

    .line 304
    .line 305
    new-instance v10, Lcom/friday/common/classtest/RequestScreencastData;

    .line 306
    .line 307
    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    check-cast v12, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 312
    .line 313
    invoke-virtual {v12}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    const/4 v14, 0x4

    .line 318
    const/4 v15, 0x0

    .line 319
    const/4 v13, 0x0

    .line 320
    invoke-direct/range {v10 .. v15}, Lcom/friday/common/classtest/RequestScreencastData;-><init>(ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 321
    .line 322
    .line 323
    const/16 v11, 0x2719

    .line 324
    .line 325
    invoke-direct {v9, v11, v10}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v9}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v14

    .line 332
    invoke-static {v14, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    const/16 v16, 0x4

    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    .line 339
    move-object v12, v6

    .line 340
    move-object v13, v7

    .line 341
    invoke-direct/range {v12 .. v17}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v2, v12}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 352
    .line 353
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v5}, Lcom/friday/lecture/model/ClassTestHelper;->getFullscreenMember()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    invoke-static {v2, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-eqz v2, :cond_7

    .line 366
    .line 367
    move-object v1, v4

    .line 368
    goto :goto_1

    .line 369
    :cond_7
    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 374
    .line 375
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    :goto_1
    invoke-virtual {v5, v1}, Lcom/friday/lecture/model/ClassTestHelper;->setFullscreenMember(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, v0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 383
    .line 384
    if-nez v0, :cond_8

    .line 385
    .line 386
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    goto :goto_2

    .line 390
    :cond_8
    move-object v4, v0

    .line 391
    :goto_2
    invoke-virtual {v5}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, Ljava/util/Collection;

    .line 396
    .line 397
    invoke-virtual {v4, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 398
    .line 399
    .line 400
    :cond_9
    return-void
.end method

.method public static final o(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object p1, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/lecture/model/ClassTestHelper;->getOnlineList()Landroidx/lifecycle/LiveData;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/Collection;

    .line 12
    .line 13
    if-eqz p1, :cond_5

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const-string v1, "binding"

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object p1, v0

    .line 33
    :cond_1
    iget-object p1, p1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/friday/lecture/databinding/LayoutRandomBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object p1, v0

    .line 49
    :cond_2
    iget-object p1, p1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 50
    .line 51
    const/16 v2, 0x8

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object p1, v0

    .line 64
    :cond_3
    iget-object p1, p1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move-object v0, p1

    .line 78
    :goto_0
    iget-object p1, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 79
    .line 80
    iget-object p1, p1, Lcom/friday/lecture/databinding/LayoutRandomBinding;->e:Landroid/widget/ImageView;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->withLayer()Landroid/view/ViewPropertyAnimator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/high16 v0, 0x43340000    # 180.0f

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->rotationY(F)Landroid/view/ViewPropertyAnimator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-wide/16 v0, 0x4b0

    .line 97
    .line 98
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 103
    .line 104
    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v2, Lh3/g;

    .line 112
    .line 113
    invoke-direct {v2, p0}, Lh3/g;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance v2, Lh3/h;

    .line 121
    .line 122
    invoke-direct {v2, p0, v0, v1}, Lh3/h;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;J)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 130
    .line 131
    .line 132
    :cond_5
    :goto_1
    return-void
.end method

.method public static final p(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/high16 v0, 0x3f000000    # 0.5f

    .line 11
    .line 12
    cmpg-float v0, v0, p1

    .line 13
    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    const v0, 0x3f0ccccd    # 0.55f

    .line 17
    .line 18
    .line 19
    cmpg-float p1, p1, v0

    .line 20
    .line 21
    if-gtz p1, :cond_1

    .line 22
    .line 23
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    const-string p0, "binding"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    :cond_0
    iget-object p0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 34
    .line 35
    iget-object p0, p0, Lcom/friday/lecture/databinding/LayoutRandomBinding;->e:Landroid/widget/ImageView;

    .line 36
    .line 37
    sget p1, Lcom/friday/lecture/R$drawable;->random_flip1:I

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public static final q(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;J)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 7
    .line 8
    const-string v2, "onlineListAdapter"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v3

    .line 17
    :cond_0
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/lit8 v1, v1, -0x1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v3

    .line 37
    :cond_1
    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 42
    .line 43
    sget-object v4, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Lcom/friday/lecture/model/ClassTestHelper;->setRandomMember(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    const-string v5, "demonstratingAdapter"

    .line 57
    .line 58
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v5, v3

    .line 62
    :cond_2
    invoke-virtual {v4}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-virtual {v5, v6}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    iget-object v5, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 72
    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v5, v3

    .line 79
    :cond_3
    invoke-virtual {v4}, Lcom/friday/lecture/model/ClassTestHelper;->getStudentList()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/util/Collection;

    .line 84
    .line 85
    invoke-virtual {v5, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 89
    .line 90
    const-string v4, "binding"

    .line 91
    .line 92
    if-nez v2, :cond_4

    .line 93
    .line 94
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v2, v3

    .line 98
    :cond_4
    iget-object v2, v2, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 99
    .line 100
    iget-object v2, v2, Lcom/friday/lecture/databinding/LayoutRandomBinding;->h:Landroid/widget/TextView;

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 110
    .line 111
    if-nez v1, :cond_5

    .line 112
    .line 113
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    :cond_5
    iget-object v1, v1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 118
    .line 119
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const-string v2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    .line 124
    .line 125
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 129
    .line 130
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 131
    .line 132
    if-nez v2, :cond_6

    .line 133
    .line 134
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_6
    move-object v3, v2

    .line 139
    :goto_0
    iget-object v2, v3, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 140
    .line 141
    const-string v3, "rvStudentList"

    .line 142
    .line 143
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v1, v2, v0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->v(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 147
    .line 148
    .line 149
    new-instance v0, Landroid/os/Handler;

    .line 150
    .line 151
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Lh3/i;

    .line 159
    .line 160
    invoke-direct {v1, p0}, Lh3/i;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    .line 161
    .line 162
    .line 163
    const/16 p0, 0x64

    .line 164
    .line 165
    int-to-long v2, p0

    .line 166
    add-long/2addr p1, v2

    .line 167
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method public static final r(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "binding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/friday/lecture/databinding/LayoutRandomBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v1

    .line 29
    :cond_1
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/friday/lecture/databinding/LayoutRandomBinding;->e:Landroid/widget/ImageView;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v0, v3}, Landroid/view/View;->setRotationY(F)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object v0, v1

    .line 45
    :cond_2
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/friday/lecture/databinding/LayoutRandomBinding;->e:Landroid/widget/ImageView;

    .line 48
    .line 49
    sget v3, Lcom/friday/lecture/R$drawable;->random_flip2:I

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 55
    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v0, v1

    .line 62
    :cond_3
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/friday/lecture/databinding/LayoutRandomBinding;->h:Landroid/widget/TextView;

    .line 65
    .line 66
    const-string v3, ""

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 72
    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v0, v1

    .line 79
    :cond_4
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 86
    .line 87
    if-nez p0, :cond_5

    .line 88
    .line 89
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    move-object v1, p0

    .line 94
    :goto_0
    iget-object p0, v1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 95
    .line 96
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private static final s(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/a;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final t(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Landroid/view/View;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->updateDemonstratingList()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "binding"

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    iget-object v1, v1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->j:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v5, "\u6b63\u5728\u6f14\u793a "

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, "\u4eba"

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    const-string v1, "demonstratingAdapter"

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v1, v2

    .line 62
    :cond_1
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-virtual {v1, v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 72
    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    const-string p0, "onlineListAdapter"

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    move-object v2, p0

    .line 82
    :goto_0
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getStudentList()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Ljava/util/Collection;

    .line 87
    .line 88
    invoke-virtual {v2, p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    invoke-virtual {p1, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 93
    .line 94
    .line 95
    const-class p0, Lcom/friday/common/entity/MqttEntity;

    .line 96
    .line 97
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    sget-object v2, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Ljava/lang/Iterable;

    .line 108
    .line 109
    new-instance v0, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 v1, 0xa

    .line 112
    .line 113
    invoke-static {p1, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lkotlin/Pair;

    .line 135
    .line 136
    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    new-instance p1, Lcom/friday/common/classtest/RequestScreencastList;

    .line 159
    .line 160
    const/16 v1, 0x2718

    .line 161
    .line 162
    invoke-direct {p1, v1, v0}, Lcom/friday/common/classtest/RequestScreencastList;-><init>(ILjava/util/List;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string p1, "toJson(...)"

    .line 170
    .line 171
    invoke-static {v3, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance v1, Lcom/friday/common/entity/MqttEntity;

    .line 175
    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x4

    .line 178
    const/4 v6, 0x0

    .line 179
    invoke-direct/range {v1 .. v6}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public static final u(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->y()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final w(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    move-object v0, p1

    .line 5
    check-cast v0, Ljava/util/Collection;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->x(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, "binding"

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v0

    .line 27
    :cond_0
    iget-object p1, p1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->j:Landroid/widget/TextView;

    .line 28
    .line 29
    sget-object v1, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v4, "\u6b63\u5728\u6f14\u793a "

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v2, "\u4eba"

    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e:Lcom/friday/lecture/adapter/DemonstratingAdapter;

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    const-string p1, "demonstratingAdapter"

    .line 69
    .line 70
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    move-object v0, p1

    .line 75
    :goto_0
    invoke-virtual {v1}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Ljava/util/Collection;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->y()V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method


# virtual methods
.method public c()Landroidx/lifecycle/LifecycleRegistry;
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/LifecycleRegistry;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/lifecycle/LifecycleRegistry;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 7

    .line 1
    invoke-super {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/common/entity/MqttEntity;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/common/entity/MqttEntity;

    .line 11
    .line 12
    sget-object v2, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 13
    .line 14
    new-instance v3, Lcom/friday/common/classtest/MqttRequestEntity;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x2

    .line 18
    const/16 v6, 0x2714

    .line 19
    .line 20
    invoke-direct {v3, v6, v4, v5, v4}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "toJson(...)"

    .line 28
    .line 29
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v4, "board"

    .line 33
    .line 34
    invoke-direct {v1, v2, v3, v4}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getOnlineList()Landroidx/lifecycle/LiveData;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lh3/f;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Lh3/f;-><init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/friday/lecture/model/ClassTestHelper;->setRandomMember(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->clearSelectedList()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lkotlin/Pair;

    .line 34
    .line 35
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 36
    .line 37
    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Lcom/friday/lecture/model/ClassTestHelper;->updateSelectedList(Lcom/friday/common/classtest/MqttResponse$Student;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method

.method public final v(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-gt p3, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-gt p3, p1, :cond_1

    .line 16
    .line 17
    sub-int/2addr p3, v0

    .line 18
    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 p3, 0x0

    .line 27
    invoke-virtual {p2, p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final x(Ljava/util/List;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "onlineListAdapter"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    move-object v2, p1

    .line 13
    check-cast v2, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 19
    .line 20
    const-string v2, "binding"

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :cond_1
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->l:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    add-int/lit8 p1, p1, -0x1

    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v4, "\u5b66\u751f"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, "\u4eba\uff09"

    .line 50
    .line 51
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 62
    .line 63
    if-nez p1, :cond_2

    .line 64
    .line 65
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v1, p1

    .line 70
    :goto_0
    iget-object p1, v1, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->n:Landroid/widget/TextView;

    .line 71
    .line 72
    const-string v0, "\uff08\u8001\u5e081\u4eba"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final y()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->f:Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "binding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->e:Landroidx/cardview/widget/CardView;

    .line 12
    .line 13
    sget-object v1, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/friday/lecture/model/ClassTestHelper;->getSelectedList()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Iterable;

    .line 32
    .line 33
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v3, 0xa

    .line 36
    .line 37
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lkotlin/Pair;

    .line 59
    .line 60
    invoke-virtual {v3}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-static {v2}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getSelectedList()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_2

    .line 89
    .line 90
    const/4 v1, 0x1

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    const/4 v1, 0x0

    .line 93
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 94
    .line 95
    .line 96
    return-void
.end method
