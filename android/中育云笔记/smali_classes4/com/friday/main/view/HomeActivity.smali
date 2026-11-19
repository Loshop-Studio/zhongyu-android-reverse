.class public final Lcom/friday/main/view/HomeActivity;
.super Lcom/friday/main/view/Hilt_HomeActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/main/HomeActivity"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/main/view/HomeActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/main/view/Hilt_HomeActivity<",
        "Lcom/friday/main/databinding/HomeActivityBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final v:Lcom/friday/main/view/HomeActivity$a;

.field public static final w:I

.field public static final x:Ljava/util/ArrayList;


# instance fields
.field public final g:Lqc/d;

.field public final h:Lqc/d;

.field public final i:J

.field public j:Lj2/j;

.field public k:Lj2/c;

.field public l:Lj2/f;

.field public m:Lj2/b;

.field public n:Lj2/e;

.field public o:Lj2/i;

.field public p:Lj2/h;

.field public final q:Lcom/friday/main/view/HomeActivity$messageServerListener$1;

.field public r:Lkotlinx/coroutines/g;

.field public final s:Lqc/d;

.field public final t:Landroidx/activity/result/ActivityResultLauncher;

.field public u:J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/friday/main/view/HomeActivity$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/friday/main/view/HomeActivity$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/main/view/HomeActivity;->v:Lcom/friday/main/view/HomeActivity$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/friday/main/view/HomeActivity;->w:I

    .line 12
    .line 13
    new-instance v0, Ls3/a;

    .line 14
    .line 15
    sget v1, Lcom/friday/main/R$mipmap;->icon_new_selected:I

    .line 16
    .line 17
    sget v2, Lcom/friday/main/R$mipmap;->icon_new_notselect:I

    .line 18
    .line 19
    sget v3, Lcom/friday/main/R$string;->newest:I

    .line 20
    .line 21
    invoke-static {v3}, Lz1/b;->f(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, Ls3/a;-><init>(IILjava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ls3/a;

    .line 30
    .line 31
    sget v2, Lcom/friday/main/R$mipmap;->icon_folder_selected:I

    .line 32
    .line 33
    sget v3, Lcom/friday/main/R$mipmap;->icon_folder_notselect:I

    .line 34
    .line 35
    sget v5, Lcom/friday/main/R$string;->folder:I

    .line 36
    .line 37
    invoke-static {v5}, Lz1/b;->f(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-direct {v1, v2, v3, v5, v4}, Ls3/a;-><init>(IILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ls3/a;

    .line 45
    .line 46
    sget v3, Lcom/friday/main/R$mipmap;->icon_share_select:I

    .line 47
    .line 48
    sget v5, Lcom/friday/main/R$mipmap;->icon_share_normal:I

    .line 49
    .line 50
    sget v6, Lcom/friday/main/R$string;->share_title:I

    .line 51
    .line 52
    invoke-static {v6}, Lz1/b;->f(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-direct {v2, v3, v5, v6, v4}, Ls3/a;-><init>(IILjava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Ls3/a;

    .line 60
    .line 61
    sget v5, Lcom/friday/main/R$drawable;->icon_recycle_bin:I

    .line 62
    .line 63
    sget v6, Lcom/friday/main/R$drawable;->icon_recycle_bin_unselected:I

    .line 64
    .line 65
    sget v7, Lcom/friday/main/R$string;->recycle_bin:I

    .line 66
    .line 67
    invoke-static {v7}, Lz1/b;->f(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-direct {v3, v5, v6, v7, v4}, Ls3/a;-><init>(IILjava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    filled-new-array {v0, v1, v2, v3}, [Ls3/a;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lcom/friday/main/view/HomeActivity;->x:Ljava/util/ArrayList;

    .line 83
    .line 84
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/main/view/Hilt_HomeActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/main/view/HomeActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/main/view/HomeActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/main/view/HomeActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/main/view/HomeActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/main/view/HomeActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/main/view/HomeActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/main/view/HomeActivity;->g:Lqc/d;

    .line 32
    .line 33
    new-instance v0, Lv3/k1;

    .line 34
    .line 35
    invoke-direct {v0}, Lv3/k1;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/main/view/HomeActivity;->h:Lqc/d;

    .line 43
    .line 44
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iput-wide v0, p0, Lcom/friday/main/view/HomeActivity;->i:J

    .line 55
    .line 56
    new-instance v0, Lcom/friday/main/view/HomeActivity$messageServerListener$1;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Lcom/friday/main/view/HomeActivity$messageServerListener$1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/friday/main/view/HomeActivity;->q:Lcom/friday/main/view/HomeActivity$messageServerListener$1;

    .line 62
    .line 63
    new-instance v0, Lv3/l1;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Lv3/l1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lcom/friday/main/view/HomeActivity;->s:Lqc/d;

    .line 73
    .line 74
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 75
    .line 76
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v1, Lv3/m1;

    .line 80
    .line 81
    invoke-direct {v1, p0}, Lv3/m1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, Lcom/friday/main/view/HomeActivity;->t:Landroidx/activity/result/ActivityResultLauncher;

    .line 89
    .line 90
    return-void
.end method

.method private final A0()V
    .locals 14

    .line 1
    const-string v0, "checkTab"

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lv3/q1;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lv3/q1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "mqttServiceStatus"

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lv3/r1;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lv3/r1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "stopScreencastByPc"

    .line 34
    .line 35
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lv3/s1;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lv3/s1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "stopApplicationByPc"

    .line 48
    .line 49
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, Lv3/b1;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lv3/b1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "StartScreencast"

    .line 62
    .line 63
    const-class v1, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, Lv3/c1;

    .line 70
    .line 71
    invoke-direct {v1, p0}, Lv3/c1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "IntranetMqttConnected"

    .line 78
    .line 79
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Lv3/d1;

    .line 84
    .line 85
    invoke-direct {v1, p0}, Lv3/d1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 89
    .line 90
    .line 91
    const-string v0, "StopScreencast"

    .line 92
    .line 93
    const-class v1, Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v1, Lv3/e1;

    .line 100
    .line 101
    invoke-direct {v1, p0}, Lv3/e1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v1, Lv3/f1;

    .line 116
    .line 117
    invoke-direct {v1, p0}, Lv3/f1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0, p0, v1}, Le2/b;->a(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Lhd/l;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-instance v5, Lcom/friday/main/view/HomeActivity$initObserver$9;

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-direct {v5, p0, v0}, Lcom/friday/main/view/HomeActivity$initObserver$9;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 131
    .line 132
    .line 133
    const/4 v6, 0x3

    .line 134
    const/4 v7, 0x0

    .line 135
    const/4 v3, 0x0

    .line 136
    const/4 v4, 0x0

    .line 137
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 138
    .line 139
    .line 140
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    new-instance v11, Lcom/friday/main/view/HomeActivity$initObserver$10;

    .line 145
    .line 146
    invoke-direct {v11, p0, v0}, Lcom/friday/main/view/HomeActivity$initObserver$10;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 147
    .line 148
    .line 149
    const/4 v12, 0x3

    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v10, 0x0

    .line 153
    invoke-static/range {v8 .. v13}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 154
    .line 155
    .line 156
    const-string v1, "EndInClassTest"

    .line 157
    .line 158
    invoke-static {v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    new-instance v2, Lv3/g1;

    .line 163
    .line 164
    invoke-direct {v2, p0}, Lv3/g1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v1, p0, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 168
    .line 169
    .line 170
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    new-instance v6, Lcom/friday/main/view/HomeActivity$initObserver$12;

    .line 175
    .line 176
    invoke-direct {v6, p0, v0}, Lcom/friday/main/view/HomeActivity$initObserver$12;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 177
    .line 178
    .line 179
    const/4 v7, 0x3

    .line 180
    const/4 v8, 0x0

    .line 181
    const/4 v5, 0x0

    .line 182
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public static final B0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->x()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Lj2/e;->c()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1, v0}, Lj2/e;->d(Z)V

    .line 24
    .line 25
    .line 26
    const-string p1, "\u6295\u5c4f\u5df2\u65ad\u5f00"

    .line 27
    .line 28
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Lj2/e;->e()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Lj2/e;->b()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->getActivityList()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v1, "getActivityList(...)"

    .line 55
    .line 56
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    check-cast p1, Ljava/lang/Iterable;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object v2, v1

    .line 76
    check-cast v2, Landroid/app/Activity;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const-class v3, Lcom/friday/common/activity/RequestScreenCastActivity;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    const/4 v1, 0x0

    .line 100
    :goto_0
    check-cast v1, Landroid/app/Activity;

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    invoke-static {v1}, Lcom/blankj/utilcode/util/ActivityUtils;->finishActivity(Landroid/app/Activity;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    :goto_1
    const-string p1, "\u5df2\u79bb\u5f00\u8bfe\u5802"

    .line 108
    .line 109
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    :goto_2
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-interface {p1, p0}, Lj2/b;->e(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 124
    .line 125
    iget-object p1, p1, Lcom/friday/main/databinding/HomeActivityBinding;->e:Landroid/widget/ImageView;

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p1}, Lj2/b;->b()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-interface {p1}, Lj2/b;->c()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-interface {p0}, Lj2/e;->a()V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public static final C0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-class v0, Lcom/friday/common/classtest/ScreencastResponse;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/friday/common/classtest/ScreencastResponse;

    .line 8
    .line 9
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->isScreenLock()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Lj2/b;->d()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    new-instance v0, Landroid/content/Intent;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-class v1, Lcom/friday/common/activity/RequestScreenCastActivity;

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    .line 47
    .line 48
    const-string p0, "key_port"

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/friday/common/classtest/ScreencastResponse;->getPort()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lcom/blankj/utilcode/util/ActivityUtils;->startActivity(Landroid/content/Intent;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void

    .line 61
    :cond_1
    const-string p0, "restart_record_service"

    .line 62
    .line 63
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-interface {p0, p1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static final D0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/main/databinding/HomeActivityBinding;->e:Landroid/widget/ImageView;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final E0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->x()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Lj2/e;->e()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Lj2/e;->b()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Lj2/b;->c()V

    .line 34
    .line 35
    .line 36
    const-string p0, "\u6f14\u793a\u5df2\u7ed3\u675f"

    .line 37
    .line 38
    invoke-static {p0}, Lz1/b;->d(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->getActivityList()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p1, "getActivityList(...)"

    .line 47
    .line 48
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast p0, Ljava/lang/Iterable;

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    move-object v1, p1

    .line 68
    check-cast v1, Landroid/app/Activity;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-class v2, Lcom/friday/common/activity/RequestScreenCastActivity;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    move-object v0, p1

    .line 91
    :cond_2
    check-cast v0, Landroid/app/Activity;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-static {v0}, Lcom/blankj/utilcode/util/ActivityUtils;->finishActivity(Landroid/app/Activity;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    return-void

    .line 99
    :cond_4
    const-string p0, "pause_record_service"

    .line 100
    .line 101
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p0, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public static final F0(Lcom/friday/main/view/HomeActivity;Lcom/friday/main/model/VersionUpdate;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/friday/main/view/AppUpdateDialog;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/friday/main/view/AppUpdateDialog;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "getSupportFragmentManager(...)"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-class v0, Lcom/friday/main/view/AppUpdateDialog;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final G0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->x()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lj2/e;->c()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-interface {p1, v0}, Lj2/e;->d(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1, p0}, Lj2/b;->e(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Lj2/b;->b()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Lj2/b;->c()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Lj2/e;->b()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, Lj2/e;->a()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static final H0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Integer;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->y0()Lcom/friday/main/adapter/TabAdapter;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, p1, v0}, Lcom/friday/main/adapter/TabAdapter;->m(IZ)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public static final I0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->x()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Lj2/e;->c()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1, v0}, Lj2/e;->d(Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Lj2/e;->e()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Lj2/e;->b()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Lj2/b;->c()V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1, p0}, Lj2/b;->e(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 69
    .line 70
    iget-object p0, p0, Lcom/friday/main/databinding/HomeActivityBinding;->e:Landroid/widget/ImageView;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public static final J0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->x()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "\u6295\u5c4f\u5df2\u65ad\u5f00"

    .line 12
    .line 13
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Lj2/e;->c()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-interface {p1, v0}, Lj2/e;->d(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1, p0}, Lj2/b;->e(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/friday/main/databinding/HomeActivityBinding;->e:Landroid/widget/ImageView;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Lj2/b;->b()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1}, Lj2/b;->c()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {p0}, Lj2/e;->a()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p1}, Lj2/e;->e()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {p1}, Lj2/e;->b()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-interface {p0}, Lj2/b;->c()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_1
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->getActivityList()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string p1, "getActivityList(...)"

    .line 101
    .line 102
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    check-cast p0, Ljava/lang/Iterable;

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_3

    .line 116
    .line 117
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    move-object v0, p1

    .line 122
    check-cast v0, Landroid/app/Activity;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-class v1, Lcom/friday/common/activity/RequestScreenCastActivity;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_3
    const/4 p1, 0x0

    .line 146
    :goto_0
    check-cast p1, Landroid/app/Activity;

    .line 147
    .line 148
    if-eqz p1, :cond_4

    .line 149
    .line 150
    invoke-static {p1}, Lcom/blankj/utilcode/util/ActivityUtils;->finishActivity(Landroid/app/Activity;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    return-void
.end method

.method public static final L0(Lcom/friday/main/view/HomeActivity;IZ)Lqc/q;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/friday/main/databinding/LayoutTabBinding;->f:Landroid/widget/ImageView;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity;->T0(IZ)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final M0(Lcom/friday/main/view/HomeActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, p0}, Lj2/b;->f(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "\u968f\u5802\u6d4b\u529f\u80fd\u9700\u8981\u60ac\u6d6e\u7a97\u6743\u9650"

    .line 21
    .line 22
    invoke-static {p0}, Lz1/b;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic N(Lcom/friday/main/view/HomeActivity;Lcom/friday/main/model/VersionUpdate;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->F0(Lcom/friday/main/view/HomeActivity;Lcom/friday/main/model/VersionUpdate;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final N0(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/view/HomeActivity$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/main/view/HomeActivity$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/main/view/HomeActivity$b;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic O(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/view/HomeActivity;->P0(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;Landroid/view/View;)V

    return-void
.end method

.method public static final O0(Lcom/friday/main/view/HomeActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/main/databinding/PopupWindowCreateNewBinding;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "binding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p3, Lcom/friday/main/databinding/PopupWindowCreateNewBinding;->c:Lcom/friday/common/widget/FridayDrawableTextView;

    .line 17
    .line 18
    new-instance v0, Lv3/o1;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2}, Lv3/o1;-><init>(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p3, Lcom/friday/main/databinding/PopupWindowCreateNewBinding;->d:Lcom/friday/common/widget/FridayDrawableTextView;

    .line 27
    .line 28
    new-instance p3, Lv3/p1;

    .line 29
    .line 30
    invoke-direct {p3, p0, p2}, Lv3/p1;-><init>(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 37
    .line 38
    return-object p0
.end method

.method public static synthetic P(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->G0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public static final P0(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p2, Lk2/v;->a:Lk2/v$a;

    .line 2
    .line 3
    const-string v0, "NewFolder"

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/friday/main/view/HomeActivity;->j0(Landroid/widget/PopupWindow;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic Q(Lcom/friday/main/view/HomeActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->p0(Lcom/friday/main/view/HomeActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final Q0(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p2, Lk2/v;->a:Lk2/v$a;

    .line 2
    .line 3
    const-string v0, "NewNote"

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/friday/main/view/HomeActivity;->l0(Landroid/widget/PopupWindow;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic R()Lcom/friday/main/adapter/TabAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/main/view/HomeActivity;->V0()Lcom/friday/main/adapter/TabAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic S(Lcom/friday/main/view/HomeActivity;IZ)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/view/HomeActivity;->L0(Lcom/friday/main/view/HomeActivity;IZ)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->B0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic U(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->D0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic U0(Lcom/friday/main/view/HomeActivity;IZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity;->T0(IZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic V(Lcom/friday/main/view/HomeActivity;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->H0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final V0()Lcom/friday/main/adapter/TabAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/main/adapter/TabAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/main/adapter/TabAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic W(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/view/HomeActivity;->Q0(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X(Lcom/friday/main/view/HomeActivity;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->I0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic Y(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->m0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/view/HomeActivity$b;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/main/view/HomeActivity;->N0(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/view/HomeActivity$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->k0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lcom/friday/main/view/HomeActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->M0(Lcom/friday/main/view/HomeActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic c0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->J0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->E0(Lcom/friday/main/view/HomeActivity;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HomeActivity;->C0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f0(Lcom/friday/main/view/HomeActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/main/databinding/PopupWindowCreateNewBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/main/view/HomeActivity;->O0(Lcom/friday/main/view/HomeActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/main/databinding/PopupWindowCreateNewBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g0(Lcom/friday/main/view/HomeActivity;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->n0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic h0(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/viewmodel/HomeViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic i0(Lcom/friday/main/view/HomeActivity;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/main/view/HomeActivity;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final k0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/main/view/HomeActivity$createNewFolder$createDialog$1$1;-><init>(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final m0(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/main/view/HomeActivity$createNewNote$createDialog$1$1;-><init>(Lcom/friday/main/view/HomeActivity;Ljava/lang/String;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final p0(Lcom/friday/main/view/HomeActivity;Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/friday/main/view/DBActivity;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final K0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/friday/main/databinding/LayoutTabBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->y0()Lcom/friday/main/adapter/TabAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Lv3/a1;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Lv3/a1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lcom/friday/main/adapter/TabAdapter;->o(Lhd/p;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->y0()Lcom/friday/main/adapter/TabAdapter;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, Lcom/friday/main/view/HomeActivity;->x:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lcom/friday/main/view/HomeActivity$initTab$1$2;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lcom/friday/main/view/HomeActivity$initTab$1$2;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->y0()Lcom/friday/main/adapter/TabAdapter;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final R0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "package:"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Landroid/content/Intent;

    .line 27
    .line 28
    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 29
    .line 30
    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Landroid/content/Intent;

    .line 34
    .line 35
    const-string v3, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 36
    .line 37
    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v1, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v3, 0x0

    .line 49
    const-string v4, "\u65e0\u6cd5\u6253\u5f00\u7cfb\u7edf\u8bbe\u7f6e\uff0c\u8bf7\u624b\u52a8\u5f00\u542f\u60ac\u6d6e\u7a97\u6743\u9650"

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v2, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    move-object v1, v2

    .line 65
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->t:Landroidx/activity/result/ActivityResultLauncher;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catch_0
    new-array v0, v3, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v4, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catch_1
    new-array v0, v3, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v4, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    return-void

    .line 83
    :cond_1
    new-array v0, v3, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v4, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final S0(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->x0()Lcom/friday/main/view/HomeActivity$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/blankj/utilcode/util/NetworkUtils;->registerNetworkStatusChangedListener(Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->x0()Lcom/friday/main/view/HomeActivity$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lcom/blankj/utilcode/util/NetworkUtils;->unregisterNetworkStatusChangedListener(Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final T0(IZ)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    if-eq p1, v1, :cond_2

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    if-eq p1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v2, Lk2/v;->a:Lk2/v$a;

    .line 14
    .line 15
    const-string v3, "Me"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v2, Lk2/v;->a:Lk2/v$a;

    .line 22
    .line 23
    const-string v3, "Share"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    sget-object v2, Lk2/v;->a:Lk2/v$a;

    .line 30
    .line 31
    const-string v3, "Folder"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    sget-object v2, Lk2/v;->a:Lk2/v$a;

    .line 38
    .line 39
    const-string v3, "Recent"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->q0()Lj2/c;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v2}, Lj2/c;->j()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->r0()Lj2/f;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v2}, Lj2/c;->j()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->n0()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-ne v2, v1, :cond_4

    .line 63
    .line 64
    if-ne p1, v1, :cond_4

    .line 65
    .line 66
    if-eqz p2, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->r0()Lj2/f;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p2}, Lj2/f;->f()V

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->n0()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-ne p2, v0, :cond_5

    .line 80
    .line 81
    if-ne p1, v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->v0()Lj2/i;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-interface {p2}, Lj2/i;->l()V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    check-cast p2, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 95
    .line 96
    iget-object p2, p2, Lcom/friday/main/databinding/HomeActivityBinding;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-virtual {p2, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/home_activity (0x7f0c006c), APK res/NR.xml
    sget v0, Lcom/friday/main/R$layout;->home_activity:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->initFragment()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->initView()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/friday/main/view/HomeActivity;->A0()V

    .line 15
    .line 16
    .line 17
    const-string v0, "STORAGE"

    .line 18
    .line 19
    const-string v1, "CAMERA"

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permissionGroup([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->request()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-virtual {p0, v0}, Lcom/friday/main/view/HomeActivity;->S0(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->w()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, p0}, Lcom/friday/main/viewmodel/HomeViewModel;->n(Landroid/app/Activity;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v2, "getPackageName(...)"

    .line 63
    .line 64
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lcom/friday/main/viewmodel/HomeViewModel;->m(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "updateInfo"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    :try_start_0
    const-class v1, Lcom/friday/main/model/VersionUpdate;

    .line 93
    .line 94
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lcom/friday/main/model/VersionUpdate;

    .line 99
    .line 100
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v0}, Lcom/friday/main/model/VersionUpdate;->getResult()Lcom/friday/main/model/Result;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, Lcom/friday/main/model/Result;->getVersionCode()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-le v2, v1, :cond_1

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Lcom/friday/main/viewmodel/HomeViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    new-instance v2, Le2/a;

    .line 123
    .line 124
    invoke-direct {v2, v0}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    .line 129
    .line 130
    :catch_0
    :cond_1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_2

    .line 141
    .line 142
    :try_start_1
    sget-object v0, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 143
    .line 144
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity;->q:Lcom/friday/main/view/HomeActivity$messageServerListener$1;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->k(Ldb/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 147
    .line 148
    .line 149
    :catch_1
    :cond_2
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->o0()V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final initFragment()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    new-instance v1, Lcom/friday/main/view/HomeActivity$initFragment$1$1;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/friday/main/view/HomeActivity$initFragment$1$1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public initView()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->K0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/main/databinding/LayoutTabBinding;->f:Landroid/widget/ImageView;

    .line 16
    .line 17
    const-string v1, "ivMe"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 27
    .line 28
    iget-object v1, v1, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 29
    .line 30
    iget-object v1, v1, Lcom/friday/main/databinding/LayoutTabBinding;->c:Landroidx/cardview/widget/CardView;

    .line 31
    .line 32
    const-string v2, "cvCreate"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 42
    .line 43
    iget-object v2, v2, Lcom/friday/main/databinding/HomeActivityBinding;->c:Landroidx/cardview/widget/CardView;

    .line 44
    .line 45
    const-string v3, "cvAirPlay"

    .line 46
    .line 47
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x3

    .line 51
    new-array v3, v3, [Landroid/view/View;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput-object v0, v3, v4

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    aput-object v1, v3, v0

    .line 58
    .line 59
    const/4 v0, 0x2

    .line 60
    aput-object v2, v3, v0

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseActivity;->setClickListener([Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->q()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    new-instance v0, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 78
    .line 79
    invoke-direct {v0}, Lcom/friday/common/widget/dialog/FBIWarningDialog;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-class v2, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    return-void
.end method

.method public final j0(Landroid/widget/PopupWindow;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->n0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->y0()Lcom/friday/main/adapter/TabAdapter;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v0, v1, v4, v2, v3}, Lcom/friday/main/adapter/TabAdapter;->n(Lcom/friday/main/adapter/TabAdapter;IZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 19
    .line 20
    new-instance v1, Lv3/i1;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lv3/i1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "0"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Lcom/friday/common/widget/dialog/a;->w(Ljava/lang/String;Lhd/l;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "getSupportFragmentManager(...)"

    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v2, "create_dir"

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final l0(Landroid/widget/PopupWindow;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->n0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->n0()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x3

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->n0()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x4

    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->y0()Lcom/friday/main/adapter/TabAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {v0, v3, v3, v1, v2}, Lcom/friday/main/adapter/TabAdapter;->n(Lcom/friday/main/adapter/TabAdapter;IZILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 32
    .line 33
    new-instance v1, Lv3/j1;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lv3/j1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "1"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lcom/friday/common/widget/dialog/a;->w(Ljava/lang/String;Lhd/l;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "getSupportFragmentManager(...)"

    .line 49
    .line 50
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v2, "create_dir"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final n0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final o0()V
    .locals 2

    .line 1
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf2/c;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/friday/main/databinding/LayoutTabBinding;->d:Landroidx/cardview/widget/CardView;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/friday/main/databinding/LayoutTabBinding;->d:Landroidx/cardview/widget/CardView;

    .line 32
    .line 33
    new-instance v1, Lv3/h1;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lv3/h1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/friday/main/view/HomeActivity;->u:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x7d0

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    sget v2, Lcom/friday/main/R$string;->click_again_to_exit:I

    .line 16
    .line 17
    invoke-static {v2}, Lz1/b;->h(I)V

    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Lcom/friday/main/view/HomeActivity;->u:J

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/ServiceUtils;->getAllRunningServices()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v1}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->exitApp()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseActivity;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lk2/m;->a:Lk2/m$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lk2/m$a;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->c:Landroidx/cardview/widget/CardView;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->R0()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->s0()Lj2/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1, p0}, Lj2/b;->f(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 58
    .line 59
    iget-object v0, v0, Lcom/friday/main/databinding/LayoutTabBinding;->f:Landroid/widget/ImageView;

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x1

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->y0()Lcom/friday/main/adapter/TabAdapter;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/friday/main/adapter/TabAdapter;->p()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 82
    .line 83
    iget-object p1, p1, Lcom/friday/main/databinding/LayoutTabBinding;->f:Landroid/widget/ImageView;

    .line 84
    .line 85
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x2

    .line 89
    const/4 v0, 0x0

    .line 90
    const/4 v1, 0x4

    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-static {p0, v1, v2, p1, v0}, Lcom/friday/main/view/HomeActivity;->U0(Lcom/friday/main/view/HomeActivity;IZILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Lcom/friday/main/databinding/HomeActivityBinding;

    .line 101
    .line 102
    iget-object v0, v0, Lcom/friday/main/databinding/HomeActivityBinding;->d:Lcom/friday/main/databinding/LayoutTabBinding;

    .line 103
    .line 104
    iget-object v0, v0, Lcom/friday/main/databinding/LayoutTabBinding;->c:Landroidx/cardview/widget/CardView;

    .line 105
    .line 106
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    sget-object v0, Lk2/v;->a:Lk2/v$a;

    .line 113
    .line 114
    const-string v2, "New"

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v0, Lm2/a$a;

    .line 120
    .line 121
    new-instance v2, Lm2/a;

    .line 122
    .line 123
    invoke-direct {v2, p0}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v2}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {v2}, Lcom/friday/main/databinding/PopupWindowCreateNewBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/main/databinding/PopupWindowCreateNewBinding;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const-string v3, "inflate(...)"

    .line 138
    .line 139
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const/4 v2, -0x2

    .line 147
    invoke-virtual {v0, v2, v2}, Lm2/a$a;->e(II)Lm2/a$a;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    new-instance v1, Lv3/n1;

    .line 156
    .line 157
    invoke-direct {v1, p0}, Lv3/n1;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Lm2/a$a;->a()Lm2/a;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    sget v2, Lcom/friday/main/R$dimen;->view_33:I

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    float-to-int v1, v1

    .line 179
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    sget v3, Lcom/friday/main/R$dimen;->view_40:I

    .line 184
    .line 185
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    float-to-int v2, v2

    .line 190
    const v3, 0x800053

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 194
    .line 195
    .line 196
    :cond_4
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/main/view/Hilt_HomeActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Lcom/friday/main/viewmodel/HomeViewModel;->q(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Lcom/friday/main/view/HomeActivity;->S0(Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/blankj/utilcode/util/ServiceUtils;->getAllRunningServices()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->v()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->t0()Lj2/e;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Lj2/e;->c()V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    :try_start_0
    sget-object v0, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity;->q:Lcom/friday/main/view/HomeActivity$messageServerListener$1;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->o(Ldb/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    :catch_0
    :cond_2
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->o()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/main/view/HomeActivity;->w0()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->s()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->r:Lkotlinx/coroutines/g;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lkotlinx/coroutines/g;->isCompleted()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void

    .line 39
    :cond_2
    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lcom/friday/main/view/HomeActivity$onResume$1;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {v1, p0, v2}, Lcom/friday/main/view/HomeActivity$onResume$1;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenCreated(Lhd/p;)Lkotlinx/coroutines/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/friday/main/view/HomeActivity;->r:Lkotlinx/coroutines/g;

    .line 54
    .line 55
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final q0()Lj2/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->k:Lj2/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "documentFragment"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final r0()Lj2/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->l:Lj2/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "folderFragment"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final s0()Lj2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->m:Lj2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iClassManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final t0()Lj2/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->n:Lj2/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iFloatWindowManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final u0()Lj2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->p:Lj2/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iRecycle"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final v0()Lj2/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->o:Lj2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iShare"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final w0()Lcom/friday/main/viewmodel/HomeViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x0()Lcom/friday/main/view/HomeActivity$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->s:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/view/HomeActivity$b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y0()Lcom/friday/main/adapter/TabAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->h:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/adapter/TabAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final z0()Lj2/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity;->j:Lj2/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "userFragment"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method
