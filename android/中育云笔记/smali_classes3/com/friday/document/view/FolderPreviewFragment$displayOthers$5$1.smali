.class final Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/FolderPreviewFragment;->L(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.view.FolderPreviewFragment$displayOthers$5$1"
    f = "FolderPreviewFragment.kt"
    l = {
        0x1a3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Z

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;

.field public final synthetic g:Lcom/friday/document/view/FolderPreviewFragment;


# direct methods
.method public constructor <init>(ZLcom/friday/common/entity/FileEntity;Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->e:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->g:Lcom/friday/document/view/FolderPreviewFragment;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->e:Z

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->g:Lcom/friday/document/view/FolderPreviewFragment;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;-><init>(ZLcom/friday/common/entity/FileEntity;Lcom/friday/document/view/FolderPreviewFragment;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->d:I

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
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->c:Ljava/lang/Object;

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
    iget-boolean p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->e:Z

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    sget-object v3, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getRealOssUrl()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const/16 v10, 0x1c

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    const-wide/16 v8, 0x0

    .line 55
    .line 56
    invoke-static/range {v3 .. v11}, Lcom/friday/common/helper/c;->s(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getRealOssUrl()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v3, "7"

    .line 73
    .line 74
    invoke-static {v3, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 81
    .line 82
    const/4 v1, 0x2

    .line 83
    const/4 v2, 0x0

    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static {v0, p1, v3, v1, v2}, Lcom/friday/common/helper/c;->e(Lcom/friday/common/helper/c;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_3
    iget-object v1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->g:Lcom/friday/document/view/FolderPreviewFragment;

    .line 92
    .line 93
    invoke-static {v1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v3, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 98
    .line 99
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->c:Ljava/lang/Object;

    .line 104
    .line 105
    iput v2, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->d:I

    .line 106
    .line 107
    invoke-virtual {v1, v3, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v0, :cond_4

    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->g:Lcom/friday/document/view/FolderPreviewFragment;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->J()Landroidx/lifecycle/MutableLiveData;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->g:Lcom/friday/document/view/FolderPreviewFragment;

    .line 139
    .line 140
    invoke-virtual {p1, v2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->g:Lcom/friday/document/view/FolderPreviewFragment;

    .line 144
    .line 145
    invoke-static {p1}, Lcom/friday/document/view/FolderPreviewFragment;->H(Lcom/friday/document/view/FolderPreviewFragment;)Lcom/friday/document/viewmodel/FolderViewModel;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object v0, p0, Lcom/friday/document/view/FolderPreviewFragment$displayOthers$5$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->A(Lcom/friday/common/entity/FileEntity;)V

    .line 152
    .line 153
    .line 154
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 155
    .line 156
    return-object p1
.end method
