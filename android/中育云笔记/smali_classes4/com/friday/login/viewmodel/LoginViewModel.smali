.class public final Lcom/friday/login/viewmodel/LoginViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Ld2/i;

.field public final c:Lcom/friday/common/dao/UserDao;

.field public final d:Lvd/l;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public final g:Landroidx/lifecycle/MutableLiveData;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ld2/i;Lcom/friday/common/dao/UserDao;Lvd/l;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headerBeanFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel;->b:Ld2/i;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/login/viewmodel/LoginViewModel;->c:Lcom/friday/common/dao/UserDao;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/friday/login/viewmodel/LoginViewModel;->d:Lvd/l;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 45
    .line 46
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 52
    .line 53
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 54
    .line 55
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 59
    .line 60
    return-void
.end method

.method public static final synthetic e(Lcom/friday/login/viewmodel/LoginViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->d:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/login/viewmodel/LoginViewModel;)Ld2/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->b:Ld2/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/login/viewmodel/LoginViewModel;)Lcom/friday/common/dao/UserDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->c:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/login/viewmodel/LoginViewModel;Lcom/friday/common/entity/LoginResp;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/common/entity/User;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/login/viewmodel/LoginViewModel;->p(Lcom/friday/common/entity/LoginResp;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/common/entity/User;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1
    const-string v0, "schoolCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "account"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "password"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lk2/o;->a:Lk2/o;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lk2/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "unknown"

    .line 25
    .line 26
    :cond_0
    move-object v5, v0

    .line 27
    new-instance v1, Lcom/friday/common/entity/EzyLoginRequest;

    .line 28
    .line 29
    const/16 v8, 0x20

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v6, ""

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    move-object v2, p1

    .line 36
    move-object v3, p2

    .line 37
    move-object v4, p3

    .line 38
    invoke-direct/range {v1 .. v9}, Lcom/friday/common/entity/EzyLoginRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;

    .line 42
    .line 43
    const/4 v11, 0x0

    .line 44
    move-object v7, p0

    .line 45
    move-object v9, v1

    .line 46
    move-object v8, v2

    .line 47
    move-object v10, v3

    .line 48
    invoke-direct/range {v6 .. v11}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;-><init>(Lcom/friday/login/viewmodel/LoginViewModel;Ljava/lang/String;Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;Lvc/c;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v6

    .line 52
    move-object v2, v7

    .line 53
    new-instance v4, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$2;

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    invoke-direct {v4, p0, p1}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$2;-><init>(Lcom/friday/login/viewmodel/LoginViewModel;Lvc/c;)V

    .line 57
    .line 58
    .line 59
    const/4 v6, 0x4

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-static/range {v2 .. v7}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final j()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;-><init>(Lcom/friday/login/viewmodel/LoginViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final p(Lcom/friday/common/entity/LoginResp;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/common/entity/User;
    .locals 14

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/friday/common/entity/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Lcom/friday/common/helper/b;->G(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, ""

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lcom/friday/common/helper/b;->I(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lcom/friday/common/entity/LoginResp;->getRoleType()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v1, v2}, Lcom/friday/common/helper/b;->K(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/friday/common/entity/LoginResp;->getUserId()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v1, v2, v3}, Lcom/friday/common/helper/b;->H(J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object/from16 v2, p2

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lcom/friday/common/helper/b;->A(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    move-object/from16 v5, p3

    .line 59
    .line 60
    invoke-virtual {v1, v5}, Lcom/friday/common/helper/b;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/friday/common/entity/LoginResp;->getUserId()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    new-instance v6, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, "userNote"

    .line 85
    .line 86
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, "note"

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v0, v1}, Lcom/friday/common/helper/b;->D(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel;->d:Lvd/l;

    .line 130
    .line 131
    :goto_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    move-object v6, v1

    .line 136
    check-cast v6, Lcom/zykj/http/bean/HeaderBean;

    .line 137
    .line 138
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 139
    .line 140
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->r()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->s()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    const/16 v12, 0x13

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    const/4 v8, 0x0

    .line 161
    const/4 v11, 0x0

    .line 162
    invoke-static/range {v6 .. v13}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_0

    .line 171
    .line 172
    new-instance v2, Lcom/friday/common/entity/User;

    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/friday/common/entity/LoginResp;->getUserId()J

    .line 175
    .line 176
    .line 177
    move-result-wide v3

    .line 178
    const/16 v12, 0xe0

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const-string v6, ""

    .line 182
    .line 183
    const-string v7, ""

    .line 184
    .line 185
    const-string v8, ""

    .line 186
    .line 187
    const/4 v9, 0x0

    .line 188
    const/4 v10, 0x0

    .line 189
    const/4 v11, 0x0

    .line 190
    invoke-direct/range {v2 .. v13}, Lcom/friday/common/entity/User;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILkotlin/jvm/internal/n;)V

    .line 191
    .line 192
    .line 193
    return-object v2

    .line 194
    :cond_0
    move-object/from16 v5, p3

    .line 195
    .line 196
    goto :goto_0
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "schoolCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "account"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "password"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "smsCode"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lk2/o;->a:Lk2/o;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Lk2/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const-string v0, "unknown"

    .line 30
    .line 31
    :cond_0
    move-object v4, v0

    .line 32
    new-instance v0, Lcom/friday/common/entity/EzyLoginRequest;

    .line 33
    .line 34
    const/16 v7, 0x20

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    move-object v1, p1

    .line 39
    move-object v2, p2

    .line 40
    move-object v3, p3

    .line 41
    move-object v5, p4

    .line 42
    invoke-direct/range {v0 .. v8}, Lcom/friday/common/entity/EzyLoginRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v4, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    move-object v1, p0

    .line 53
    move-object v3, p1

    .line 54
    move-object v2, v0

    .line 55
    move-object v0, v4

    .line 56
    move-object v4, p2

    .line 57
    invoke-direct/range {v0 .. v5}, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;-><init>(Lcom/friday/login/viewmodel/LoginViewModel;Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 58
    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    move-object v1, v6

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x0

    .line 65
    move-object v4, v0

    .line 66
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 67
    .line 68
    .line 69
    return-void
.end method
