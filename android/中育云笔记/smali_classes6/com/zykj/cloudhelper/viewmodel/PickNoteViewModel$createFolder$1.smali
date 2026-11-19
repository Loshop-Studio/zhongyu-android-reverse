.class final Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->j(Ljava/lang/String;Ljava/lang/String;J)V
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
    c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$createFolder$1"
    f = "PickNoteViewModel.kt"
    l = {
        0x113,
        0x11d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->e:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->e:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->d:I

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
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/friday/common/property/BaseResponse;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->e:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->i(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Lpa/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v4, Lcom/friday/common/entity/UpdateRequest;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-direct/range {v4 .. v9}, Lcom/friday/common/entity/UpdateRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput v3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->d:I

    .line 80
    .line 81
    invoke-interface {p1, v4, p0}, Lpa/a;->c(Lcom/friday/common/entity/UpdateRequest;Lvc/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v0, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    :goto_0
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->e:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 97
    .line 98
    invoke-static {v1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->g(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Lcom/friday/common/dao/FileDao;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iget-object v3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 103
    .line 104
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->c:Ljava/lang/Object;

    .line 109
    .line 110
    iput v2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;->d:I

    .line 111
    .line 112
    invoke-interface {v1, v3, p0}, Lcom/friday/common/dao/FileDao;->I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v0, :cond_4

    .line 117
    .line 118
    :goto_1
    return-object v0

    .line 119
    :cond_4
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_5
    new-instance p1, Ljava/lang/Exception;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 125
    .line 126
    .line 127
    throw p1
.end method
