# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/HomeViewModel;->b()V
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
    c = "com.zykj.study.viewmodels.HomeViewModel$checkVersion$1"
    f = "HomeViewModel.kt"
    l = {
        0x2a,
        0x2d,
        0x32
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public final synthetic e:Lcom/zykj/study/viewmodels/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/HomeViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->e:Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->e:Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;-><init>(Lcom/zykj/study/viewmodels/HomeViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/zykj/lib/ota/bean/VersionInfo;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/zykj/lib/login/proto/UserBean;

    .line 25
    .line 26
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget v1, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->c:I

    .line 40
    .line 41
    iget-object v3, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lcom/zykj/lib/login/proto/UserBean;

    .line 44
    .line 45
    iget-object v4, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 48
    .line 49
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->e:Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/HomeViewModel;->e()Landroidx/datastore/core/DataStore;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput v4, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->d:I

    .line 71
    .line 72
    invoke-static {p1, p0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v0, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_0
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 80
    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    iget-object v1, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->e:Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const-string v6, "getId(...)"

    .line 90
    .line 91
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-lez v5, :cond_7

    .line 99
    .line 100
    :try_start_2
    invoke-static {v1}, Lcom/zykj/study/viewmodels/HomeViewModel;->a(Lcom/zykj/study/viewmodels/HomeViewModel;)Lo4/k;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v6, "com.zhongyukejiao.learningexpert"

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getRole()Lcom/zykj/lib/login/proto/RoleType;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    sget-object v8, Lcom/zykj/lib/login/proto/RoleType;->Student:Lcom/zykj/lib/login/proto/RoleType;

    .line 111
    .line 112
    const/4 v9, 0x0

    .line 113
    if-ne v7, v8, :cond_5

    .line 114
    .line 115
    move v4, v9

    .line 116
    :cond_5
    iput-object v1, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->a:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iput-object v7, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->b:Ljava/lang/Object;

    .line 123
    .line 124
    iput v9, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->c:I

    .line 125
    .line 126
    iput v3, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->d:I

    .line 127
    .line 128
    const/16 v3, 0x2777

    .line 129
    .line 130
    invoke-interface {v5, v6, v3, v4, p0}, Lo4/k;->a(Ljava/lang/String;IILm7/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    if-ne v3, v0, :cond_6

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    move-object v4, v3

    .line 138
    move-object v3, p1

    .line 139
    move-object p1, v4

    .line 140
    move-object v4, v1

    .line 141
    move v1, v9

    .line 142
    :goto_1
    check-cast p1, Lcom/zykj/lib/ota/bean/VersionInfo;

    .line 143
    .line 144
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/HomeViewModel;->c()Ll8/g;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v3}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    iput-object v3, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->a:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iput-object v3, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->b:Ljava/lang/Object;

    .line 159
    .line 160
    iput v1, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->c:I

    .line 161
    .line 162
    iput v2, p0, Lcom/zykj/study/viewmodels/HomeViewModel$checkVersion$1;->d:I

    .line 163
    .line 164
    invoke-interface {v4, p1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    if-ne p1, v0, :cond_7

    .line 169
    .line 170
    :goto_2
    return-object v0

    .line 171
    :catch_0
    :cond_7
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 172
    .line 173
    return-object p1
.end method
