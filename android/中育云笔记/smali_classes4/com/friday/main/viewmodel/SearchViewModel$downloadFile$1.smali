.class final Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/SearchViewModel;->l(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.main.viewmodel.SearchViewModel$downloadFile$1"
    f = "SearchViewModel.kt"
    l = {
        0x80,
        0x82,
        0x84,
        0x86
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/main/viewmodel/SearchViewModel;

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v4, :cond_1

    .line 16
    .line 17
    if-eq v1, v3, :cond_1

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lcom/friday/common/property/BaseResponse;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/friday/main/viewmodel/SearchViewModel;->h(Lcom/friday/main/viewmodel/SearchViewModel;)Lu3/b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput v5, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->d:I

    .line 66
    .line 67
    invoke-interface {p1, v1, p0}, Lu3/b;->b(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_0
    move-object v1, p1

    .line 75
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_5

    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lcom/friday/common/entity/GetResourceEntity;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/friday/common/entity/GetResourceEntity;->getResourceList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/util/Collection;

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_5

    .line 100
    .line 101
    iget-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 102
    .line 103
    invoke-static {p1}, Lcom/friday/main/viewmodel/SearchViewModel;->g(Lcom/friday/main/viewmodel/SearchViewModel;)Lj2/d;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Lcom/friday/common/entity/GetResourceEntity;

    .line 112
    .line 113
    invoke-virtual {v3}, Lcom/friday/common/entity/GetResourceEntity;->getResourceList()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iget-object v5, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 118
    .line 119
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    iput-object v6, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 124
    .line 125
    iput v4, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->d:I

    .line 126
    .line 127
    invoke-interface {p1, v3, v5, p0}, Lj2/d;->a(Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v0, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    iget-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 135
    .line 136
    invoke-static {p1}, Lcom/friday/main/viewmodel/SearchViewModel;->g(Lcom/friday/main/viewmodel/SearchViewModel;)Lj2/d;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object v4, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 141
    .line 142
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    iput-object v5, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 147
    .line 148
    iput v3, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->d:I

    .line 149
    .line 150
    invoke-interface {p1, v4, p0}, Lj2/d;->c(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v0, :cond_6

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 158
    .line 159
    invoke-static {p1}, Lcom/friday/main/viewmodel/SearchViewModel;->f(Lcom/friday/main/viewmodel/SearchViewModel;)Lcom/friday/common/dao/FileDao;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object v3, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 164
    .line 165
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iput-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 174
    .line 175
    iput v2, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->d:I

    .line 176
    .line 177
    invoke-interface {p1, v3, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-ne p1, v0, :cond_7

    .line 182
    .line 183
    :goto_2
    return-object v0

    .line 184
    :cond_7
    :goto_3
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 185
    .line 186
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/SearchViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 196
    .line 197
    return-object p1
.end method
