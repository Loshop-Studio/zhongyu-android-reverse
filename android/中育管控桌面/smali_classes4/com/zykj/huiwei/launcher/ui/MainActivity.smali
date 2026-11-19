# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/huiwei/launcher/ui/MainActivity;
.super Lcom/zykj/huiwei/launcher/ui/Hilt_MainActivity;
.source "SourceFile"

# interfaces
.implements Ls3/e;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/MainActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/ui/Hilt_MainActivity<",
        "Lcom/zykj/huiwei/launcher/databinding/HwActivityMainBinding;",
        ">;",
        "Ls3/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0005\n\u0002\u0008\u0005\n\u0002\u0008\u0005\n\u0002\u0008\u0005\n\u0002\u0008\u0005\n\u0002\u0008\u0008*\u00066;@EJO\u0008\u0007\u0018\u0000 T2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001UB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0005J\u000f\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0005J\u000f\u0010\u000c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0005J\u0019\u0010\u000f\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0094@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\tR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u001b\u0010,\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008.\u0010)\u001a\u0004\u0008/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u0010)\u001a\u0004\u00088\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010)\u001a\u0004\u0008=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008A\u0010)\u001a\u0004\u0008B\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u0010)\u001a\u0004\u0008G\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008K\u0010)\u001a\u0004\u0008L\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008P\u0010)\u001a\u0004\u0008Q\u0010R\u00a8\u0006V"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/MainActivity;",
        "Lcom/zykj/huiwei/launcher/base/CommonActivity;",
        "Lcom/zykj/huiwei/launcher/databinding/HwActivityMainBinding;",
        "Ls3/e;",
        "<init>",
        "()V",
        "",
        "X",
        "H",
        "Z",
        "f0",
        "T",
        "g0",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onResume",
        "onPause",
        "onDestroy",
        "",
        "layoutId",
        "()I",
        "Landroidx/navigation/NavController;",
        "getNavController",
        "()Landroidx/navigation/NavController;",
        "",
        "e",
        "isFloatingToolServiceBound",
        "Lj4/e;",
        "f",
        "Lj4/e;",
        "O",
        "()Lj4/e;",
        "d0",
        "(Lj4/e;)V",
        "floatingToolManager",
        "Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;",
        "g",
        "Lkotlin/Lazy;",
        "S",
        "()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;",
        "viewModel",
        "Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;",
        "h",
        "R",
        "()Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;",
        "unAuthorModel",
        "Lj/a;",
        "i",
        "Lj/a;",
        "iSystemInterface",
        "com/zykj/huiwei/launcher/ui/MainActivity$d",
        "j",
        "P",
        "()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;",
        "lCLogoutReceiver",
        "com/zykj/huiwei/launcher/ui/MainActivity$f",
        "k",
        "Q",
        "()Lcom/zykj/huiwei/launcher/ui/MainActivity$f;",
        "snRv",
        "com/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1",
        "l",
        "L",
        "()Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;",
        "appStatusFilterReceiver",
        "com/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1",
        "m",
        "N",
        "()Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;",
        "filterAppListReceiver",
        "com/zykj/huiwei/launcher/ui/MainActivity$b",
        "n",
        "K",
        "()Lcom/zykj/huiwei/launcher/ui/MainActivity$b;",
        "appChanged",
        "com/zykj/huiwei/launcher/ui/MainActivity$c",
        "o",
        "M",
        "()Lcom/zykj/huiwei/launcher/ui/MainActivity$c;",
        "connection",
        "p",
        "a",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n70#2,11:457\n70#2,11:468\n1563#3:479\n1634#3,3:480\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity\n*L\n62#1:457,11\n63#1:468,11\n126#1:479\n126#1:480,3\n*E\n"
    }
.end annotation


# static fields
.field public static final p:Lcom/zykj/huiwei/launcher/ui/MainActivity$a;

.field public static final q:I


# instance fields
.field public e:Z

.field public f:Lj4/e;

.field public final g:Lkotlin/Lazy;

.field public final h:Lkotlin/Lazy;

.field public i:Lj/a;

.field public final j:Lkotlin/Lazy;

.field public final k:Lkotlin/Lazy;

.field public final l:Lkotlin/Lazy;

.field public final m:Lkotlin/Lazy;

.field public final n:Lkotlin/Lazy;

.field public final o:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/ui/MainActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->p:Lcom/zykj/huiwei/launcher/ui/MainActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->q:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/Hilt_MainActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->g:Lkotlin/Lazy;

    .line 32
    .line 33
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$4;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$4;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 39
    .line 40
    const-class v2, Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;

    .line 41
    .line 42
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$5;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$5;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$6;

    .line 52
    .line 53
    invoke-direct {v4, v5, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$special$$inlined$viewModels$default$6;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->h:Lkotlin/Lazy;

    .line 60
    .line 61
    new-instance v0, Ly3/e;

    .line 62
    .line 63
    invoke-direct {v0}, Ly3/e;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->j:Lkotlin/Lazy;

    .line 71
    .line 72
    new-instance v0, Ly3/f;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Ly3/f;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->k:Lkotlin/Lazy;

    .line 82
    .line 83
    new-instance v0, Ly3/g;

    .line 84
    .line 85
    invoke-direct {v0, p0}, Ly3/g;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->l:Lkotlin/Lazy;

    .line 93
    .line 94
    new-instance v0, Ly3/h;

    .line 95
    .line 96
    invoke-direct {v0, p0}, Ly3/h;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->m:Lkotlin/Lazy;

    .line 104
    .line 105
    new-instance v0, Ly3/i;

    .line 106
    .line 107
    invoke-direct {v0, p0}, Ly3/i;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->n:Lkotlin/Lazy;

    .line 115
    .line 116
    new-instance v0, Ly3/j;

    .line 117
    .line 118
    invoke-direct {v0, p0}, Ly3/j;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->o:Lkotlin/Lazy;

    .line 126
    .line 127
    return-void
.end method

.method public static synthetic A(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$c;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->I(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Ljava/lang/Integer;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->b0(Ljava/lang/Integer;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lj/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->i:Lj/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic D(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->S()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic E(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lj/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->i:Lj/a;

    .line 2
    .line 3
    return-void
.end method

.method public static final F(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$b;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final G(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final I(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$c;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$c;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final J(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final U(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->e:Z

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final V(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lkotlin/Unit;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->e:Z

    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final W(Lcom/zykj/huiwei/launcher/ui/MainActivity;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 7

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/MainActivity$initFloatLaunchers$3$1;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initFloatLaunchers$3$1;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public static final Y(Lcom/zykj/huiwei/launcher/ui/MainActivity;Ljava/util/List;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/google/gson/Gson;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->S()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->g()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lh/a;

    .line 46
    .line 47
    new-instance v2, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 48
    .line 49
    iget-object v3, v1, Lh/a;->a:Ljava/lang/String;

    .line 50
    .line 51
    const-string v4, "label"

    .line 52
    .line 53
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, v1, Lh/a;->d:Ljava/lang/String;

    .line 57
    .line 58
    const-string v5, "iconCachePath"

    .line 59
    .line 60
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v5, v1, Lh/a;->b:Ljava/lang/String;

    .line 64
    .line 65
    const-string v6, "packageName"

    .line 66
    .line 67
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, v1, Lh/a;->c:Landroid/content/ComponentName;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v6, "getClassName(...)"

    .line 77
    .line 78
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v2, v3, v4, v5, v1}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static final a0(Lcom/zykj/base/bean/toast/ToastMessage;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Li4/r;->a:Li4/r;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Li4/r;->a(Lcom/zykj/base/bean/toast/ToastMessage;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final b0(Ljava/lang/Integer;)Lkotlin/Unit;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/4 v0, 0x1

    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    sget-object p0, Li4/g;->a:Li4/g$a;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {p0, v1, v0, v2}, Li4/g$a;->i(Li4/g$a;ZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final c0()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$d;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final e0(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$f;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$f;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic q(Lcom/zykj/huiwei/launcher/ui/MainActivity;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->W(Lcom/zykj/huiwei/launcher/ui/MainActivity;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$f;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->e0(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/huiwei/launcher/ui/MainActivity;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->Y(Lcom/zykj/huiwei/launcher/ui/MainActivity;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic t(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->U(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->V(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->c0()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic w(Lcom/zykj/base/bean/toast/ToastMessage;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->a0(Lcom/zykj/base/bean/toast/ToastMessage;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->J(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$b;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->F(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->G(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final H()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "cn.com.techvision.settingserver"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const-string v1, "cn.com.techvision.action.BIND_SYSTEM_SERVICE"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->M()Lcom/zykj/huiwei/launcher/ui/MainActivity$c;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {p0, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final K()Lcom/zykj/huiwei/launcher/ui/MainActivity$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->n:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final L()Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->l:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final M()Lcom/zykj/huiwei/launcher/ui/MainActivity$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->o:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$c;

    .line 8
    .line 9
    return-object v0
.end method

.method public final N()Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->m:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final O()Lj4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->f:Lj4/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "floatingToolManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final P()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$d;

    .line 8
    .line 9
    return-object v0
.end method

.method public final Q()Lcom/zykj/huiwei/launcher/ui/MainActivity$f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->k:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$f;

    .line 8
    .line 9
    return-object v0
.end method

.method public final R()Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->h:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final S()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final T()V
    .locals 4

    .line 1
    new-instance v0, Lj4/e;

    .line 2
    .line 3
    new-instance v1, Ly3/l;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ly3/l;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ly3/b;

    .line 9
    .line 10
    invoke-direct {v2, p0}, Ly3/b;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Ly3/c;

    .line 14
    .line 15
    invoke-direct {v3, p0}, Ly3/c;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v1, v2, v3}, Lj4/e;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->d0(Lj4/e;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final X()V
    .locals 3

    .line 1
    sget-object v0, Lh/b;->a:Lh/b;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ly3/k;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Ly3/k;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lh/b;->a(Landroid/app/Application;Lh/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Z()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->P()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/IntentFilter;

    .line 6
    .line 7
    const-string v2, "com.android.launcher3.mdm.LOGOUT"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->L()Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Landroid/content/IntentFilter;

    .line 22
    .line 23
    const-string v2, "com.android.launcher3.mdm.control_default_apps"

    .line 24
    .line 25
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->N()Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Landroid/content/IntentFilter;

    .line 36
    .line 37
    const-string v2, "com.linspirer.edu.appstorelist"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->Q()Lcom/zykj/huiwei/launcher/ui/MainActivity$f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Landroid/content/IntentFilter;

    .line 50
    .line 51
    const-string v2, "com.android.laucher3.mdm.obtaindevicesn"

    .line 52
    .line 53
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->K()Lcom/zykj/huiwei/launcher/ui/MainActivity$b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Landroid/content/IntentFilter;

    .line 64
    .line 65
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "android.intent.action.PACKAGE_REMOVED"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v2, "android.intent.action.PACKAGE_ADDED"

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v2, "package"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    new-instance v6, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6;

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-direct {v6, p0, v0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$6;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 94
    .line 95
    .line 96
    const/4 v7, 0x3

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    new-instance v12, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$7;

    .line 108
    .line 109
    invoke-direct {v12, p0, v0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initLC$7;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 110
    .line 111
    .line 112
    const/4 v13, 0x3

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    const/4 v11, 0x0

    .line 116
    invoke-static/range {v9 .. v14}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->f0()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final d0(Lj4/e;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->f:Lj4/e;

    .line 7
    .line 8
    return-void
.end method

.method public final f0()V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$tryGetSn$1;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final g0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->O()Lj4/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lj4/e;->s()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity;->e:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public getNavController()Landroidx/navigation/NavController;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseActivity;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwActivityMainBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwActivityMainBinding;->navHostFragmentContainer:Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    const-string v1, "navHostFragmentContainer"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lcom/zykj/huiwei/launcher/ui/MainActivity$initView$2;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p2, p0, v0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initView$2;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/MainActivity$initView$3;

    .line 19
    .line 20
    invoke-direct {v4, p0, v0}, Lcom/zykj/huiwei/launcher/ui/MainActivity$initView$3;-><init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x3

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->S()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, Ly3/a;

    .line 39
    .line 40
    invoke-direct {p2}, Ly3/a;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$e;

    .line 44
    .line 45
    invoke-direct {v0, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0, v0}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    const-string p2, "https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userServiceAgreement.html"

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->e(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string p2, "https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userPrivacyPolicy.html"

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->d(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->g()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->R()Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance p2, Ly3/d;

    .line 80
    .line 81
    invoke-direct {p2}, Ly3/d;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/MainActivity$e;

    .line 85
    .line 86
    invoke-direct {v0, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 90
    .line 91
    .line 92
    sget-object p1, Li4/g;->a:Li4/g$a;

    .line 93
    .line 94
    invoke-virtual {p1}, Li4/g$a;->g()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_0

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->Z()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->T()V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->X()V

    .line 108
    .line 109
    .line 110
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    # RE layout layout/hw_activity_main (0x7f0c003c), APK res/bI.xml
    const v0, 0x7f0c003c

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super {p0, p1}, Lcom/zykj/huiwei/launcher/ui/Hilt_MainActivity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/huiwei/launcher/ui/Hilt_MainActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 5
    .line 6
    sget-object v0, Li4/g;->a:Li4/g$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Li4/g$a;->g()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->M()Lcom/zykj/huiwei/launcher/ui/MainActivity$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->L()Lcom/zykj/huiwei/launcher/ui/MainActivity$appStatusFilterReceiver$2$1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->N()Lcom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->P()Lcom/zykj/huiwei/launcher/ui/MainActivity$d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->Q()Lcom/zykj/huiwei/launcher/ui/MainActivity$f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->K()Lcom/zykj/huiwei/launcher/ui/MainActivity$b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->g0()V

    .line 60
    .line 61
    .line 62
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Li4/g;->a:Li4/g$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Li4/g$a;->g()Z

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
    const-string v1, "com.linspirer.edu.enablehome"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v1, "com.android.launcher3"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/huiwei/launcher/base/CommonActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Li4/g;->a:Li4/g$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Li4/g$a;->g()Z

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
    const-string v1, "com.linspirer.edu.disablehome"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v1, "com.android.launcher3"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/content/Intent;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "com.linspirer.edu.get_gesture_state"

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->H()V

    .line 48
    .line 49
    .line 50
    return-void
.end method
