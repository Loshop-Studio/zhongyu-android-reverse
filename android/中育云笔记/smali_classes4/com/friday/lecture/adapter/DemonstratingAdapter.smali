.class public final Lcom/friday/lecture/adapter/DemonstratingAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Lcom/friday/common/classtest/MqttResponse$Student;",
        ">;",
        "Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder<",
        "Lcom/friday/lecture/databinding/ViewInDemoBinding;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget v0, Lcom/friday/lecture/R$layout;->view_in_demo:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-direct {p0, v0, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/friday/lecture/adapter/DemonstratingAdapter;->a:Ljava/lang/String;

    .line 23
    .line 24
    sget v0, Lcom/friday/lecture/R$id;->iv_remove:I

    .line 25
    .line 26
    sget v1, Lcom/friday/lecture/R$id;->iv_fullscreen:I

    .line 27
    .line 28
    filled-new-array {v0, v1}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addChildClickViewIds([I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;

    .line 2
    .line 3
    check-cast p2, Lkotlin/Pair;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/DemonstratingAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lkotlin/Pair;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lkotlin/Pair;)V
    .locals 8

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
    check-cast p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;

    .line 16
    .line 17
    if-eqz p1, :cond_6

    .line 18
    .line 19
    iget-object v0, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->g:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {p2}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/friday/lecture/adapter/DemonstratingAdapter;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    sget v1, Lcom/friday/lecture/R$drawable;->icon_demo_teacher:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget v1, Lcom/friday/lecture/R$drawable;->icon_demo_student:I

    .line 43
    .line 44
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->e:Landroid/widget/ImageView;

    .line 48
    .line 49
    const-string v1, "ivOffline"

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/16 v2, 0x8

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    move v1, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v1, v2

    .line 72
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->c:Landroidx/cardview/widget/CardView;

    .line 76
    .line 77
    invoke-virtual {p2}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iget-object v4, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->f:Landroid/widget/ImageView;

    .line 101
    .line 102
    const/4 v5, 0x1

    .line 103
    if-le v1, v5, :cond_3

    .line 104
    .line 105
    :cond_2
    move v2, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_3
    if-ne v1, v5, :cond_4

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getDemonstratingList()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-static {v6}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Lkotlin/Pair;

    .line 118
    .line 119
    invoke-virtual {v6}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 124
    .line 125
    invoke-virtual {v6}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    iget-object v7, p0, Lcom/friday/lecture/adapter/DemonstratingAdapter;->a:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_2

    .line 136
    .line 137
    :cond_4
    :goto_2
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    iget-object v2, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->d:Landroid/widget/ImageView;

    .line 141
    .line 142
    if-gt v1, v5, :cond_5

    .line 143
    .line 144
    const/4 v3, 0x4

    .line 145
    :cond_5
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 146
    .line 147
    .line 148
    iget-object v1, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->d:Landroid/widget/ImageView;

    .line 149
    .line 150
    invoke-virtual {p2}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 155
    .line 156
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getFullscreenMember()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->h:Landroid/widget/TextView;

    .line 172
    .line 173
    invoke-virtual {p2}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    iget-object p1, p1, Lcom/friday/lecture/databinding/ViewInDemoBinding;->h:Landroid/widget/TextView;

    .line 187
    .line 188
    iget-object v0, p0, Lcom/friday/lecture/adapter/DemonstratingAdapter;->a:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {p2}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 195
    .line 196
    invoke-virtual {p2}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 205
    .line 206
    .line 207
    :cond_6
    return-void
.end method
