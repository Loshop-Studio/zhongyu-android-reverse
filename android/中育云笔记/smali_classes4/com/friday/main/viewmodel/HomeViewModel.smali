.class public final Lcom/friday/main/viewmodel/HomeViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lu3/a;

.field public final c:Lcom/friday/common/network/StudentSession;

.field public final d:Lcom/friday/common/dao/FileDao;

.field public final e:Lcom/friday/common/dao/UserDao;

.field public final f:Lvd/l;

.field public final g:Lvd/k;

.field public final h:Lvd/l;

.field public final i:Lvd/k;

.field public final j:Landroid/content/ServiceConnection;

.field public final k:Landroidx/lifecycle/MutableLiveData;

.field public final l:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu3/a;Lcom/friday/common/network/StudentSession;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/UserDao;Lvd/l;Lvd/k;)V
    .locals 1

    .line 1
    const-string v0, "cameraService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "studentSession"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "fileDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "userDao"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "headerBeanFlow"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "unauthorizedFlow"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->b:Lu3/a;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/friday/main/viewmodel/HomeViewModel;->c:Lcom/friday/common/network/StudentSession;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/friday/main/viewmodel/HomeViewModel;->d:Lcom/friday/common/dao/FileDao;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/friday/main/viewmodel/HomeViewModel;->e:Lcom/friday/common/dao/UserDao;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/friday/main/viewmodel/HomeViewModel;->f:Lvd/l;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/friday/main/viewmodel/HomeViewModel;->g:Lvd/k;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, Lcom/friday/main/viewmodel/HomeViewModel;->h:Lvd/l;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    const/4 p3, 0x7

    .line 55
    invoke-static {p2, p2, p1, p3, p1}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->i:Lvd/k;

    .line 60
    .line 61
    new-instance p1, Lcom/friday/main/viewmodel/HomeViewModel$b;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Lcom/friday/main/viewmodel/HomeViewModel$b;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->j:Landroid/content/ServiceConnection;

    .line 67
    .line 68
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 69
    .line 70
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 76
    .line 77
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 81
    .line 82
    return-void
.end method

.method private final A()J
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static synthetic e(Lcom/friday/main/viewmodel/HomeViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/viewmodel/HomeViewModel;->p(Lcom/friday/main/viewmodel/HomeViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/main/viewmodel/HomeViewModel;)Lu3/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->b:Lu3/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->d:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/main/viewmodel/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/network/StudentSession;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->c:Lcom/friday/common/network/StudentSession;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/UserDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->e:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/main/viewmodel/HomeViewModel;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/main/viewmodel/HomeViewModel;->A()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final p(Lcom/friday/main/viewmodel/HomeViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final l(Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/friday/main/viewmodel/HomeViewModel$checkOfficeFile$2;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p1
.end method

.method public final m(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/HomeViewModel;->w()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->h:Lvd/l;

    .line 13
    .line 14
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lv7/a;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v3, Lcom/friday/main/viewmodel/HomeViewModel$checkVersion$1$1;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v3, p1, p0, v2}, Lcom/friday/main/viewmodel/HomeViewModel$checkVersion$1$1;-><init>(Lv7/a;Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    :try_start_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/HomeViewModel;->x()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    xor-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    iget-object v1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->f:Lvd/l;

    .line 51
    .line 52
    invoke-interface {v1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lcom/zykj/http/bean/HeaderBean;

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, "/api/services/app/AppStore/CheckUpdateAsync?packageName="

    .line 75
    .line 76
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, "&version="

    .line 83
    .line 84
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, "&appType="

    .line 91
    .line 92
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v0, Lje/v$a;

    .line 103
    .line 104
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    new-instance v1, Lje/w$a;

    .line 112
    .line 113
    invoke-direct {v1}, Lje/w$a;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Lje/w$a;->b()Lje/w;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v0, p1}, Lje/v;->b(Lje/w;)Lje/e;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v0, Lcom/friday/main/viewmodel/HomeViewModel$a;

    .line 129
    .line 130
    invoke-direct {v0, p0}, Lcom/friday/main/viewmodel/HomeViewModel$a;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1, v0}, Lje/e;->a(Lje/f;)V

    .line 134
    .line 135
    .line 136
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 137
    .line 138
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    goto :goto_0

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    move-object p1, v0

    .line 145
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 146
    .line 147
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final n(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/HomeViewModel;->w()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/content/Intent;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "cn.com.techvision.appstore"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v1, "cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/friday/main/viewmodel/HomeViewModel;->j:Landroid/content/ServiceConnection;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "fileName"

    .line 4
    .line 5
    move-object/from16 v6, p1

    .line 6
    .line 7
    invoke-static {v6, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "parentId"

    .line 11
    .line 12
    move-object/from16 v10, p2

    .line 13
    .line 14
    invoke-static {v10, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 18
    .line 19
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 20
    .line 21
    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/util/Date;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    const-string v1, "toString(...)"

    .line 44
    .line 45
    invoke-static {v12, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/16 v16, 0x4

    .line 49
    .line 50
    const/16 v17, 0x0

    .line 51
    .line 52
    const-string v13, "-"

    .line 53
    .line 54
    const-string v14, ""

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    invoke-static/range {v12 .. v17}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lcom/friday/common/entity/FileEntity;

    .line 65
    .line 66
    const v24, 0x7e000

    .line 67
    .line 68
    .line 69
    const/16 v25, 0x0

    .line 70
    .line 71
    const-string v7, ""

    .line 72
    .line 73
    const-string v8, ""

    .line 74
    .line 75
    const-string v9, "0"

    .line 76
    .line 77
    const/4 v13, 0x1

    .line 78
    const/4 v14, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    const/16 v19, 0x0

    .line 84
    .line 85
    const/16 v20, 0x0

    .line 86
    .line 87
    const-wide/16 v21, 0x0

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    move-object v12, v11

    .line 92
    move-wide/from16 v4, p3

    .line 93
    .line 94
    invoke-direct/range {v2 .. v25}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lcom/friday/main/viewmodel/HomeViewModel$createFolder$1;

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    invoke-direct {v1, v0, v2, v3}, Lcom/friday/main/viewmodel/HomeViewModel$createFolder$1;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, Lcom/friday/main/viewmodel/HomeViewModel$createFolder$2;

    .line 104
    .line 105
    invoke-direct {v4, v0, v3}, Lcom/friday/main/viewmodel/HomeViewModel$createFolder$2;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

    .line 106
    .line 107
    .line 108
    new-instance v3, Lw3/k;

    .line 109
    .line 110
    invoke-direct {v3, v0, v2}, Lw3/k;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lcom/friday/common/entity/FileEntity;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1, v4, v3}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final q(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/HomeViewModel;->w()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->j:Landroid/content/ServiceConnection;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final r()Lvd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->h:Lvd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

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

.method public final t()Lvd/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->i:Lvd/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Lvd/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->g:Lvd/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    const-string v0, "cn.com.techvision.appstore"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/AppUtils;->isAppInstalled(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final y()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/main/viewmodel/HomeViewModel$restoreStudentSession$1;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

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

.method public final z(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/main/viewmodel/HomeViewModel$updateServerInfo$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/friday/main/viewmodel/HomeViewModel$updateServerInfo$1;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lcom/zykj/message/server/bean/ServerInfo;Lvc/c;)V

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
