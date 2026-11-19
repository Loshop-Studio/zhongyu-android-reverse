.class final Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/RecycleBinPreviewFragment;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.document.view.RecycleBinPreviewFragment$displayOthers$4$1"
    f = "RecycleBinPreviewFragment.kt"
    l = {
        0x142
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lcom/friday/document/view/RecycleBinPreviewFragment;

.field public final synthetic j:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->e:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->i:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->j:Lcom/friday/common/entity/FileEntity;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->e:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->g:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->h:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->i:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->j:Lcom/friday/common/entity/FileEntity;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->e:Z

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    sget-object v3, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 36
    .line 37
    iget-object v4, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->f:Ljava/lang/String;

    .line 38
    .line 39
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->g:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcom/friday/common/helper/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const/16 v10, 0x1c

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const-wide/16 v8, 0x0

    .line 57
    .line 58
    invoke-static/range {v3 .. v11}, Lcom/friday/common/helper/c;->s(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->g:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Lcom/friday/common/helper/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v1, "7"

    .line 75
    .line 76
    iget-object v3, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->h:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    const/4 v2, 0x0

    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-static {v0, p1, v3, v1, v2}, Lcom/friday/common/helper/c;->e(Lcom/friday/common/helper/c;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_3
    iget-object v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->i:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 96
    .line 97
    invoke-static {v1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v3, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->j:Lcom/friday/common/entity/FileEntity;

    .line 102
    .line 103
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->c:Ljava/lang/Object;

    .line 108
    .line 109
    iput v2, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->d:I

    .line 110
    .line 111
    invoke-virtual {v1, v3, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v0, :cond_4

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->i:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 127
    .line 128
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->J()Landroidx/lifecycle/MutableLiveData;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->j:Lcom/friday/common/entity/FileEntity;

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 143
    .line 144
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_6

    .line 149
    .line 150
    sget p1, Lcom/friday/document/R$string;->connect_network_please:I

    .line 151
    .line 152
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_6
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->i:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 157
    .line 158
    invoke-virtual {p1, v2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->i:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 162
    .line 163
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;->j:Lcom/friday/common/entity/FileEntity;

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->A(Lcom/friday/common/entity/FileEntity;)V

    .line 170
    .line 171
    .line 172
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 173
    .line 174
    return-object p1
.end method
