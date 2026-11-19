.class final Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/StudentSharePreviewFragment;->D(Lcom/friday/document/model/ShareFile;)V
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
    c = "com.friday.document.view.share.StudentSharePreviewFragment$displayNote$1"
    f = "StudentSharePreviewFragment.kt"
    l = {
        0x99
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/share/StudentSharePreviewFragment;

.field public final synthetic e:Lcom/friday/document/model/ShareFile;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->d:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->e:Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->d:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->e:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;-><init>(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->c:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->d:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->z(Lcom/friday/document/view/share/StudentSharePreviewFragment;)Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->e:Lcom/friday/document/model/ShareFile;

    .line 34
    .line 35
    iput v2, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->c:I

    .line 36
    .line 37
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->D(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->e:Lcom/friday/document/model/ShareFile;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;->d:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 47
    .line 48
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    sget-object v2, Lcom/friday/document/view/preview/NotePreviewFragment;->e:Lcom/friday/document/view/preview/NotePreviewFragment$a;

    .line 51
    .line 52
    check-cast p1, Ljava/lang/Iterable;

    .line 53
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    const/16 v4, 0xa

    .line 57
    .line 58
    invoke-static {p1, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const/4 p1, 0x0

    .line 90
    new-array p1, p1, [Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {v3, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, [Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v5, "12"

    .line 107
    .line 108
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v2, p1, v3, v4, v0}, Lcom/friday/document/view/preview/NotePreviewFragment$a;->a([Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/friday/document/view/preview/NotePreviewFragment;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sget v1, Lcom/friday/document/R$id;->fragment_container:I

    .line 129
    .line 130
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 135
    .line 136
    .line 137
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 138
    .line 139
    return-object p1
.end method
