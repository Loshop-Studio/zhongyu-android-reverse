.class final Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/NewestPreviewFragment$onResume$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.view.NewestPreviewFragment$onResume$1$1"
    f = "NewestPreviewFragment.kt"
    l = {
        0x1c6,
        0x1c8
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/view/NewestPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    move-object p1, v1

    .line 68
    :goto_0
    const-string v4, "1"

    .line 69
    .line 70
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->G(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/adapter/PreviewAdapter;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 83
    .line 84
    invoke-static {v1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v2, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 89
    .line 90
    invoke-static {v2}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 106
    .line 107
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->c:Ljava/lang/Object;

    .line 108
    .line 109
    iput v3, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->d:I

    .line 110
    .line 111
    invoke-virtual {v1, v2, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Q(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-ne v1, v0, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move-object v0, p1

    .line 119
    move-object p1, v1

    .line 120
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 127
    .line 128
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 141
    .line 142
    if-eqz p1, :cond_6

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_6
    const-string p1, "12"

    .line 149
    .line 150
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_8

    .line 155
    .line 156
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 157
    .line 158
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->G(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/adapter/PreviewAdapter;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 163
    .line 164
    invoke-static {v1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v3, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->e:Lcom/friday/document/view/NewestPreviewFragment;

    .line 169
    .line 170
    invoke-static {v3}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v3}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 186
    .line 187
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->c:Ljava/lang/Object;

    .line 188
    .line 189
    iput v2, p0, Lcom/friday/document/view/NewestPreviewFragment$onResume$1$1;->d:I

    .line 190
    .line 191
    invoke-virtual {v1, v3, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->R(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-ne v1, v0, :cond_7

    .line 196
    .line 197
    :goto_2
    return-object v0

    .line 198
    :cond_7
    move-object v0, p1

    .line 199
    move-object p1, v1

    .line 200
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 201
    .line 202
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    :cond_8
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 206
    .line 207
    return-object p1
.end method
