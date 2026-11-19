.class final Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel;->w0(ZLcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.document.viewmodel.BaseFileViewModel$setMultiSelectModeEnable$1"
    f = "BaseFileViewModel.kt"
    l = {
        0x244
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public e:I

.field public final synthetic f:Lcom/friday/document/viewmodel/BaseFileViewModel;

.field public final synthetic g:Z

.field public final synthetic h:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/BaseFileViewModel;ZLcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->f:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->g:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->h:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->f:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->g:Z

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->h:Lcom/friday/common/entity/FileEntity;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;ZLcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->e:I

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
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/List;

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
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->f:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Z()Landroidx/lifecycle/MutableLiveData;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-boolean v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->g:Z

    .line 38
    .line 39
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-boolean p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->g:Z

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->f:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Y()Landroidx/lifecycle/MutableLiveData;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->h:Lcom/friday/common/entity/FileEntity;

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    :cond_3
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :cond_4
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->f:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->a0()Lvd/l;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iput-object v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->c:Ljava/lang/Object;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    iput v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->d:I

    .line 88
    .line 89
    iput v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;->e:I

    .line 90
    .line 91
    invoke-interface {v1, p1, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-ne p1, v0, :cond_5

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_5
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p1
.end method
