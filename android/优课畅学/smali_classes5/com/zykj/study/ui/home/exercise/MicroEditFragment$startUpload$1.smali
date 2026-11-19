.class final Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->O(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.exercise.MicroEditFragment$startUpload$1"
    f = "MicroEditFragment.kt"
    l = {
        0xce,
        0xd5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Z

.field public c:I

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->f:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->g:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->g:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->e:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li8/b0;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->d:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->f:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, ".zip"

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v6, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1$1;

    .line 71
    .line 72
    iget-object v7, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->f:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    invoke-direct {v6, v7, v2, v8}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->e:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iput v5, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->d:I

    .line 83
    .line 84
    invoke-static {p1, v6, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v1, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    iget-object v5, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->g:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 96
    .line 97
    iget-object v6, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->f:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->e:Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->a:Ljava/lang/Object;

    .line 110
    .line 111
    iput-boolean p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->b:Z

    .line 112
    .line 113
    iput v3, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->c:I

    .line 114
    .line 115
    iput v4, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->d:I

    .line 116
    .line 117
    invoke-virtual {v5, v6, v2, p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->P(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v1, :cond_5

    .line 122
    .line 123
    :goto_1
    return-object v1

    .line 124
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->g:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 125
    .line 126
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 127
    .line 128
    sget v1, Lcom/zykj/study/R$string;->micro_zip_error:I

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    const-string v1, "getString(...)"

    .line 135
    .line 136
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0, p1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;->g:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 143
    .line 144
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->w(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {p1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->postValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 160
    .line 161
    return-object p1
.end method
