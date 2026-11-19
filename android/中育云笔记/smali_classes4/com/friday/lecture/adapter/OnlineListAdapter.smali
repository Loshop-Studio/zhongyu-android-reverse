.class public final Lcom/friday/lecture/adapter/OnlineListAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/common/classtest/MqttResponse$Student;",
        "Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder<",
        "Lcom/friday/lecture/databinding/ItemOnlineListBinding;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lhd/a;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhd/a;)V
    .locals 3

    .line 1
    const-string v0, "onSelectChanged"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/friday/lecture/R$layout;->item_online_list:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {p0, v0, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/friday/lecture/adapter/OnlineListAdapter;->a:Lhd/a;

    .line 14
    .line 15
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/friday/common/helper/b;->t()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/friday/lecture/adapter/OnlineListAdapter;->b:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic i(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/lecture/adapter/OnlineListAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/lecture/adapter/OnlineListAdapter;->k(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/lecture/adapter/OnlineListAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static final k(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/lecture/adapter/OnlineListAdapter;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->isSelected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getSelectedList()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x4

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lk2/k;->k(Landroid/content/Context;)Lk2/k;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "\u6700\u591a\u652f\u63014\u4eba\u6295\u5c4f\uff0c\u65e0\u6cd5\u518d\u9009\u4e2d\u66f4\u591a\u7684\u4eba"

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lk2/k;->m(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    sget-object p2, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 35
    .line 36
    invoke-virtual {p2, p0}, Lcom/friday/lecture/model/ClassTestHelper;->updateSelectedList(Lcom/friday/common/classtest/MqttResponse$Student;)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p1, Lcom/friday/lecture/adapter/OnlineListAdapter;->a:Lhd/a;

    .line 40
    .line 41
    invoke-interface {p2}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;

    .line 2
    .line 3
    check-cast p2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/OnlineListAdapter;->j(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/friday/common/classtest/MqttResponse$Student;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/friday/common/classtest/MqttResponse$Student;)V
    .locals 5

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;->getDataBinding()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;

    .line 16
    .line 17
    if-eqz p1, :cond_4

    .line 18
    .line 19
    iget-object v0, p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;->c:Landroidx/cardview/widget/CardView;

    .line 20
    .line 21
    new-instance v1, Lb3/a;

    .line 22
    .line 23
    invoke-direct {v1, p2, p0}, Lb3/a;-><init>(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/lecture/adapter/OnlineListAdapter;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;->c:Landroidx/cardview/widget/CardView;

    .line 30
    .line 31
    sget-object v1, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/friday/lecture/model/ClassTestHelper;->getSelectedList()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;->g:Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;->g:Landroid/widget/TextView;

    .line 58
    .line 59
    iget-object v2, p0, Lcom/friday/lecture/adapter/OnlineListAdapter;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;->d:Landroid/widget/ImageView;

    .line 73
    .line 74
    const-string v2, "ivFlagInDemo"

    .line 75
    .line 76
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/lang/Iterable;

    .line 84
    .line 85
    new-instance v2, Ljava/util/ArrayList;

    .line 86
    .line 87
    const/16 v3, 0xa

    .line 88
    .line 89
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_0

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lkotlin/Pair;

    .line 111
    .line 112
    invoke-virtual {v3}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 117
    .line 118
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    invoke-interface {v2, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    const/16 v2, 0x8

    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    if-eqz v1, :cond_1

    .line 130
    .line 131
    move v1, v3

    .line 132
    goto :goto_1

    .line 133
    :cond_1
    move v1, v2

    .line 134
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;->e:Landroid/widget/ImageView;

    .line 138
    .line 139
    invoke-virtual {p2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v4, p0, Lcom/friday/lecture/adapter/OnlineListAdapter;->b:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_2

    .line 150
    .line 151
    sget v1, Lcom/friday/lecture/R$drawable;->icon_demo_teacher:I

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_2
    sget v1, Lcom/friday/lecture/R$drawable;->icon_demo_student:I

    .line 155
    .line 156
    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 157
    .line 158
    .line 159
    iget-object p1, p1, Lcom/friday/lecture/databinding/ItemOnlineListBinding;->f:Landroid/view/View;

    .line 160
    .line 161
    const-string v0, "randomSelected"

    .line 162
    .line 163
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getRandomlySelectedMember()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-eqz p2, :cond_3

    .line 181
    .line 182
    move v2, v3

    .line 183
    :cond_3
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 184
    .line 185
    .line 186
    :cond_4
    return-void
.end method
