# RE note 本类字节码直接引用的读写或显示接口包括偏好设置、文件流、位图。
.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 \u0082\u00012\u00020\u0001:\u0001\\B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\u000f\u0010\u0008\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u000cJ\u000f\u0010 \u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008 \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008!\u0010\u0003J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00101\u001a\u00020)2\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0004\u00081\u00102J\u0017\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00084\u0010.J\u000f\u00106\u001a\u000205H\u0002\u00a2\u0006\u0004\u00086\u00107J\'\u0010:\u001a\u00020\u00042\u0006\u0010,\u001a\u00020)2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010<\u001a\u00020\u00042\u0006\u00103\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010,\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008B\u0010=J\u0017\u0010C\u001a\u00020)2\u0006\u00103\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008C\u0010.J\u0017\u0010D\u001a\u00020\t2\u0006\u00103\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u0017\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH\u0002\u00a2\u0006\u0004\u0008H\u0010IJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020JH\u0002\u00a2\u0006\u0004\u0008L\u0010MJ\u0019\u0010P\u001a\u00020\u00042\u0008\u0010O\u001a\u0004\u0018\u00010NH\u0016\u00a2\u0006\u0004\u0008P\u0010QJ+\u0010V\u001a\u00020\u00192\u0006\u0010S\u001a\u00020R2\u0008\u0010U\u001a\u0004\u0018\u00010T2\u0008\u0010O\u001a\u0004\u0018\u00010NH\u0016\u00a2\u0006\u0004\u0008V\u0010WJ!\u0010X\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010O\u001a\u0004\u0018\u00010NH\u0016\u00a2\u0006\u0004\u0008X\u0010YJ\u000f\u0010Z\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008Z\u0010\u0003R\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR$\u0010s\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0016\u0010v\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u0016\u0010}\u001a\u00020J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0016\u0010\u007f\u001a\u00020J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010|R&\u0010\u0081\u0001\u001a\u0010\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010r\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "",
        "G0",
        "M0",
        "n0",
        "J0",
        "",
        "canDoEdit",
        "W0",
        "(Z)V",
        "j0",
        "m0",
        "Landroid/content/Context;",
        "context",
        "",
        "sourcePath",
        "Ljava/io/File;",
        "f0",
        "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;",
        "I0",
        "c0",
        "V",
        "Landroid/view/View;",
        "view",
        "T0",
        "(Landroid/view/View;)V",
        "h0",
        "toggleColorPanel",
        "R",
        "H0",
        "S",
        "Landroid/widget/RadioGroup;",
        "source",
        "syncTarget",
        "Y",
        "(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V",
        "R0",
        "()Landroid/widget/RadioGroup;",
        "",
        "Q0",
        "()I",
        "slotIndex",
        "P0",
        "(I)I",
        "Landroid/content/SharedPreferences;",
        "prefs",
        "S0",
        "(Landroid/content/SharedPreferences;)I",
        "color",
        "i0",
        "Lt5/a;",
        "a0",
        "()Lt5/a;",
        "persist",
        "notifySdkSelectCallback",
        "U",
        "(IZZ)V",
        "X0",
        "(I)V",
        "Lv4/b;",
        "boardConfig",
        "U0",
        "(Lv4/b;)V",
        "Y0",
        "O0",
        "N0",
        "(I)Z",
        "Landroid/view/MotionEvent;",
        "event",
        "g0",
        "(Landroid/view/MotionEvent;)V",
        "",
        "y",
        "b0",
        "(F)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "Lm7/n;",
        "a",
        "Lm7/n;",
        "imagePicker",
        "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;",
        "b",
        "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;",
        "mBinding",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "c",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "boardControl",
        "Ld5/k;",
        "d",
        "Ld5/k;",
        "pageControl",
        "e",
        "Lv4/b;",
        "f",
        "Ljava/lang/String;",
        "path",
        "Lkotlin/Function1;",
        "g",
        "Lkotlin/jvm/functions/Function1;",
        "evaluationSelectColorChangeCallback",
        "h",
        "Z",
        "suppressPenColorSync",
        "Landroid/graphics/Rect;",
        "i",
        "Landroid/graphics/Rect;",
        "dragRect",
        "j",
        "F",
        "defaultTranslateTop",
        "k",
        "defaultTranslateBottom",
        "l",
        "pageSlideListener",
        "m",
        "view_release"
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
        "SMAP\nBlackboardEvaluationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1042:1\n311#2:1043\n327#2,4:1044\n312#2:1048\n311#2:1049\n327#2,4:1050\n312#2:1054\n257#2,2:1061\n257#2,2:1063\n278#2,2:1065\n257#2,2:1067\n257#2,2:1069\n257#2,2:1071\n257#2,2:1073\n257#2,2:1075\n257#2,2:1077\n257#2,2:1079\n255#2:1081\n257#2,2:1082\n83#3,6:1055\n1310#4,2:1084\n1#5:1086\n346#6,8:1087\n*S KotlinDebug\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n*L\n130#1:1043\n130#1:1044,4\n130#1:1048\n144#1:1049\n144#1:1050,4\n144#1:1054\n672#1:1061,2\n674#1:1063,2\n676#1:1065,2\n678#1:1067,2\n680#1:1069,2\n682#1:1071,2\n684#1:1073,2\n686#1:1075,2\n688#1:1077,2\n723#1:1079,2\n738#1:1081\n743#1:1082,2\n512#1:1055,6\n931#1:1084,2\n798#1:1087,8\n*E\n"
    }
.end annotation


# static fields
.field public static final m:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

.field public static final n:Ljava/util/List;


# instance fields
.field public final a:Lm7/n;

.field public b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

.field public c:Lcom/zykj/blackboard/core/edit/IBoardControl;

.field public d:Ld5/k;

.field public e:Lv4/b;

.field public f:Ljava/lang/String;

.field public g:Lkotlin/jvm/functions/Function1;

.field public h:Z

.field public i:Landroid/graphics/Rect;

.field public j:F

.field public k:F

.field public l:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->m:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

    .line 8
    .line 9
    const-string v0, "#000000"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "#007DFE"

    .line 20
    .line 21
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "#FE3720"

    .line 30
    .line 31
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->n:Ljava/util/List;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm7/n;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v0, p0, v1, v2, v1}, Lm7/n;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a:Lm7/n;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Landroid/graphics/Rect;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic A(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->L0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static final A0()Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic B(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->s0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final B0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->V()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic C(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->w0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final C0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic D(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final D0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g0(Landroid/view/MotionEvent;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0
.end method

.method public static final synthetic E(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final E0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Ld5/k;->o()Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static final synthetic F(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;IZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->U(IZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final F0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Ld5/k;->B()Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static final synthetic G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final G0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "path"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public static final synthetic H(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lv4/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lm7/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a:Lm7/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final K0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v1, v0

    .line 28
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->v:Lcom/zykj/view/widget/TouchSwitchView;

    .line 29
    .line 30
    new-instance v1, Ld7/k;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Ld7/k;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final synthetic L(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i0(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final L0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "mBinding"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->v:Lcom/zykj/view/widget/TouchSwitchView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Landroid/graphics/Rect;

    .line 23
    .line 24
    new-instance v4, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v5, " "

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v4, "initTranslationConfig"

    .line 45
    .line 46
    invoke-static {v4, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    iput v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:F

    .line 51
    .line 52
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Landroid/graphics/Rect;

    .line 55
    .line 56
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 57
    .line 58
    sub-int/2addr v0, v1

    .line 59
    int-to-float v0, v0

    .line 60
    iput v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k:F

    .line 61
    .line 62
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    int-to-float v0, v0

    .line 67
    const/high16 v1, 0x3f000000    # 0.5f

    .line 68
    .line 69
    mul-float/2addr v0, v1

    .line 70
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b0(F)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 74
    .line 75
    if-nez p0, :cond_1

    .line 76
    .line 77
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move-object v2, p0

    .line 82
    :goto_0
    iget-object p0, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->v:Lcom/zykj/view/widget/TouchSwitchView;

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static final synthetic M(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->N0(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final M0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->n0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->H0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->J0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic N(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->O0(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic O(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic P(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->X0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic Q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Y0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final T(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const-string p2, "mBinding"

    .line 11
    .line 12
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    :cond_0
    iget-object p2, p2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 19
    .line 20
    .line 21
    new-instance p2, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, p2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 27
    .line 28
    .line 29
    new-instance p3, Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 35
    .line 36
    .line 37
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 38
    .line 39
    iget v1, p3, Landroid/graphics/Rect;->left:I

    .line 40
    .line 41
    sub-int/2addr v0, v1

    .line 42
    int-to-float v0, v0

    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 44
    .line 45
    .line 46
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    add-int/2addr p2, p1

    .line 49
    iget p1, p3, Landroid/graphics/Rect;->top:I

    .line 50
    .line 51
    sub-int/2addr p2, p1

    .line 52
    int-to-float p1, p2

    .line 53
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static final V0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->X0(I)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final W(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-static {p0, p2, p1, p2}, Ld5/k$a;->e(Ld5/k;Lg5/c;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static final X(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final Z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;I)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p3, v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move v3, v2

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_3

    .line 28
    .line 29
    move-object v4, v1

    .line 30
    check-cast v4, Lkotlin/collections/IntIterator;

    .line 31
    .line 32
    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-gez v3, :cond_1

    .line 37
    .line 38
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-ne v4, p3, :cond_2

    .line 50
    .line 51
    move v0, v3

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    :goto_1
    if-ltz v0, :cond_6

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Q0()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-ge v0, p2, :cond_6

    .line 63
    .line 64
    const/4 p2, 0x1

    .line 65
    iput-boolean p2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Z

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    instance-of v1, p3, Landroid/widget/RadioButton;

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    check-cast p3, Landroid/widget/RadioButton;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    const/4 p3, 0x0

    .line 79
    :goto_2
    if-eqz p3, :cond_5

    .line 80
    .line 81
    invoke-virtual {p3}, Landroid/view/View;->getId()I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    invoke-virtual {p1, p3}, Landroid/widget/RadioGroup;->check(I)V

    .line 86
    .line 87
    .line 88
    :cond_5
    iput-boolean v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Z

    .line 89
    .line 90
    invoke-virtual {p0, v0, p2, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->U(IZZ)V

    .line 91
    .line 92
    .line 93
    :cond_6
    :goto_3
    return-void
.end method

.method public static synthetic c()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->A0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e0(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static final d0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/UriUtils;->uri2FileNoCacheCopy(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getAbsolutePath(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ld5/k;->C(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    const-string p1, "mBinding"

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    :cond_1
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->t:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 43
    .line 44
    new-instance v1, Ld7/t;

    .line 45
    .line 46
    invoke-direct {v1, v0, p0}, Ld7/t;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->q0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final e0(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg5/a;->c()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "mBinding"

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object v0, v1

    .line 18
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->t:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Lv4/b;->z()Lv4/d;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Lv4/d;->b()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v2, 0x2

    .line 40
    :goto_0
    const/4 v3, 0x1

    .line 41
    sub-int/2addr v2, v3

    .line 42
    mul-int/2addr v0, v2

    .line 43
    int-to-float v0, v0

    .line 44
    div-float/2addr p0, v0

    .line 45
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ld5/k;->areaMoveStart()V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v0, v1, v2, v3, v1}, Ld5/k$a;->d(Ld5/k;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object p1, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l:Lkotlin/jvm/functions/Function1;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public static synthetic f(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->B0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->K0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static synthetic h(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->X(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->V0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->r0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->W(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final k0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lkotlin/Unit;
    .locals 0

    .line 1
    const-string p2, "boardControl"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->m0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->I0()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R(Z)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->W0(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const-string p0, "mBinding"

    .line 27
    .line 28
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->u:Landroid/widget/TextView;

    .line 33
    .line 34
    const/16 p1, 0x8

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->D0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final l0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v0, "\u52a0\u8f7d\u5931\u8d25,\u6e05\u9664\u7f13\u5b58\u540e\u518d\u8bd5"

    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->W0(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const-string p0, "mBinding"

    .line 23
    .line 24
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->u:Landroid/widget/TextView;

    .line 29
    .line 30
    const/16 p1, 0x8

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->t0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method private final n0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->r:Landroid/widget/ImageView;

    .line 13
    .line 14
    new-instance v3, Ld7/u;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Ld7/u;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->n:Landroid/widget/ImageView;

    .line 31
    .line 32
    new-instance v3, Ld7/a0;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Ld7/a0;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v1

    .line 48
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Landroid/widget/ImageView;

    .line 49
    .line 50
    new-instance v3, Ld7/b0;

    .line 51
    .line 52
    invoke-direct {v3, p0}, Ld7/b0;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v1

    .line 66
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Landroid/widget/ImageView;

    .line 67
    .line 68
    new-instance v3, Ld7/b;

    .line 69
    .line 70
    invoke-direct {v3, p0}, Ld7/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    move-object v0, v1

    .line 84
    :cond_4
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 85
    .line 86
    new-instance v3, Ld7/c;

    .line 87
    .line 88
    invoke-direct {v3, p0}, Ld7/c;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object v0, v1

    .line 102
    :cond_5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 103
    .line 104
    new-instance v3, Ld7/d;

    .line 105
    .line 106
    invoke-direct {v3, p0}, Ld7/d;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 113
    .line 114
    if-nez v0, :cond_6

    .line 115
    .line 116
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    move-object v0, v1

    .line 120
    :cond_6
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 121
    .line 122
    new-instance v3, Ld7/e;

    .line 123
    .line 124
    invoke-direct {v3, p0}, Ld7/e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 131
    .line 132
    if-nez v0, :cond_7

    .line 133
    .line 134
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    move-object v0, v1

    .line 138
    :cond_7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 139
    .line 140
    new-instance v3, Ld7/f;

    .line 141
    .line 142
    invoke-direct {v3, p0}, Ld7/f;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 149
    .line 150
    if-nez v0, :cond_8

    .line 151
    .line 152
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    move-object v0, v1

    .line 156
    :cond_8
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->e:Landroid/widget/ImageView;

    .line 157
    .line 158
    const-string v0, "ivCamera"

    .line 159
    .line 160
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v6, Ld7/g;

    .line 164
    .line 165
    invoke-direct {v6, p0}, Ld7/g;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 166
    .line 167
    .line 168
    const/4 v7, 0x1

    .line 169
    const/4 v8, 0x0

    .line 170
    const-wide/16 v4, 0x0

    .line 171
    .line 172
    invoke-static/range {v3 .. v8}, Lm7/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 176
    .line 177
    if-nez v0, :cond_9

    .line 178
    .line 179
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    move-object v0, v1

    .line 183
    :cond_9
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 184
    .line 185
    const-string v0, "ivQuestion"

    .line 186
    .line 187
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v6, Ld7/h;

    .line 191
    .line 192
    invoke-direct {v6, p0}, Ld7/h;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 193
    .line 194
    .line 195
    const/4 v7, 0x1

    .line 196
    const/4 v8, 0x0

    .line 197
    const-wide/16 v4, 0x0

    .line 198
    .line 199
    invoke-static/range {v3 .. v8}, Lm7/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 203
    .line 204
    if-nez v0, :cond_a

    .line 205
    .line 206
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    move-object v0, v1

    .line 210
    :cond_a
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->d:Landroid/widget/ImageView;

    .line 211
    .line 212
    const-string v0, "ivAnswer"

    .line 213
    .line 214
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    new-instance v6, Ld7/v;

    .line 218
    .line 219
    invoke-direct {v6, p0}, Ld7/v;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 220
    .line 221
    .line 222
    const/4 v7, 0x1

    .line 223
    const/4 v8, 0x0

    .line 224
    const-wide/16 v4, 0x0

    .line 225
    .line 226
    invoke-static/range {v3 .. v8}, Lm7/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 230
    .line 231
    if-nez v0, :cond_b

    .line 232
    .line 233
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    move-object v0, v1

    .line 237
    :cond_b
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->p:Landroid/widget/ImageView;

    .line 238
    .line 239
    const-string v0, "ivText"

    .line 240
    .line 241
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    new-instance v6, Ld7/w;

    .line 245
    .line 246
    invoke-direct {v6, p0}, Ld7/w;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 247
    .line 248
    .line 249
    const/4 v7, 0x1

    .line 250
    const/4 v8, 0x0

    .line 251
    const-wide/16 v4, 0x0

    .line 252
    .line 253
    invoke-static/range {v3 .. v8}, Lm7/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 257
    .line 258
    if-nez v0, :cond_c

    .line 259
    .line 260
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    move-object v0, v1

    .line 264
    :cond_c
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->f:Landroid/widget/ImageView;

    .line 265
    .line 266
    new-instance v3, Ld7/x;

    .line 267
    .line 268
    invoke-direct {v3, p0}, Ld7/x;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 275
    .line 276
    if-nez v0, :cond_d

    .line 277
    .line 278
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    move-object v0, v1

    .line 282
    :cond_d
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->j:Landroid/widget/ImageView;

    .line 283
    .line 284
    new-instance v3, Ld7/y;

    .line 285
    .line 286
    invoke-direct {v3, p0}, Ld7/y;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    .line 291
    .line 292
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 293
    .line 294
    if-nez v0, :cond_e

    .line 295
    .line 296
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    goto :goto_0

    .line 300
    :cond_e
    move-object v1, v0

    .line 301
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 302
    .line 303
    new-instance v1, Ld7/z;

    .line 304
    .line 305
    invoke-direct {v1, p0}, Ld7/z;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 309
    .line 310
    .line 311
    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->F0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final o0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->k:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p1, "mBinding"

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Landroid/widget/ImageView;

    .line 24
    .line 25
    const-string v0, "ivSelect"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T0(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->x0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final p0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Lv4/b;->R()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    xor-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lv4/b;->f0(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const-string p0, "mBinding"

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-virtual {p1}, Lv4/b;->R()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lv4/b;->R()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lm7/q;->u(Ljava/lang/Boolean;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->o0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final q0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic r(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->p0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final r0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->e:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 11
    .line 12
    .line 13
    const/high16 v0, 0x41f00000    # 30.0f

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {p1, v2, v0, v1}, Lv4/b;->c0(ZFF)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const-string p1, "mBinding"

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 31
    .line 32
    const-string v0, "ivLine"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T0(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->C0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final s0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->e:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x6

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Lv4/b;->d0(Lv4/b;ZFFILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    const-string p1, "mBinding"

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 32
    .line 33
    const-string v0, "ivDottedLine"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T0(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public static synthetic t(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->E0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final t0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->f:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p1, "mBinding"

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 24
    .line 25
    const-string v0, "ivEraser"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T0(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->v0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final u0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic v(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->y0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final v0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->z0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final w0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final x0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lg7/l;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "requireActivity(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {p1, v0, v3, v1, v2}, Lg7/l;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ld7/m;

    .line 22
    .line 23
    invoke-direct {v0}, Ld7/m;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ld7/n;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Ld7/n;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Ld7/o;

    .line 32
    .line 33
    invoke-direct {p0}, Ld7/o;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, ""

    .line 37
    .line 38
    invoke-virtual {p1, v2, v0, v1, p0}, Lg7/l;->s(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static synthetic y(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final y0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->c:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 11
    .line 12
    const/16 v2, 0x14

    .line 13
    .line 14
    invoke-interface {v0, p1, v1, v2}, Ld5/k;->q(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lh5/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "mBinding"

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Landroid/widget/ImageView;

    .line 31
    .line 32
    const-string v1, "ivSelect"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T0(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lg5/a;->getId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p0, p1}, Ld5/k;->F(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0
.end method


# virtual methods
.method public final H0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->d:Landroid/widget/RadioGroup;

    .line 15
    .line 16
    const-string v3, "rgPenColor"

    .line 17
    .line 18
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 22
    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v3

    .line 30
    :goto_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 31
    .line 32
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->d:Landroid/widget/RadioGroup;

    .line 33
    .line 34
    const-string v2, "rgPenColorProxy"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Y(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Y(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final I0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->a()Ld5/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x3

    .line 22
    invoke-static {v0, v2, v1, v3, v1}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->a(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ld5/k;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v0, v1

    .line 28
    :goto_1
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    new-instance v3, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$e;

    .line 35
    .line 36
    invoke-direct {v3, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3}, Ld5/k;->setAreaMoveListener(Ls5/d;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    new-instance v3, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$f;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$f;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v3}, Ld5/k;->e(Ls5/j;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 55
    .line 56
    const-string v3, "mBinding"

    .line 57
    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :cond_5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->r:Landroid/widget/ImageView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 70
    .line 71
    if-nez v0, :cond_6

    .line 72
    .line 73
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_6
    move-object v1, v0

    .line 78
    :goto_2
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->n:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 84
    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    new-instance v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$g;

    .line 88
    .line 89
    invoke-direct {v1, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$g;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v1}, Ld5/k;->j(Ls5/e;)V

    .line 93
    .line 94
    .line 95
    :cond_7
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 96
    .line 97
    if-eqz v0, :cond_8

    .line 98
    .line 99
    new-instance v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$h;

    .line 100
    .line 101
    invoke-direct {v1, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$h;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v1}, Ld5/k;->k(Ls5/f;)V

    .line 105
    .line 106
    .line 107
    :cond_8
    return-void
.end method

.method public final J0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 12
    .line 13
    new-instance v1, Ld7/a;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Ld7/a;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final N0(I)Z
    .locals 7

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R0()Landroid/widget/RadioGroup;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v4, v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    instance-of v6, v5, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    check-cast v5, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 v5, 0x0

    .line 29
    :goto_1
    if-nez v5, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {v5}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->getColor()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    and-int/2addr v5, v0

    .line 37
    if-ne v5, p1, :cond_2

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    return v3
.end method

.method public final O0(I)I
    .locals 8

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int v1, p1, v0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R0()Landroid/widget/RadioGroup;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x0

    .line 15
    move v5, v4

    .line 16
    :goto_0
    if-ge v5, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    instance-of v7, v6, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    check-cast v6, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/4 v6, 0x0

    .line 30
    :goto_1
    if-nez v6, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-virtual {v6}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->getColor()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    and-int/2addr v7, v0

    .line 38
    if-ne v7, v1, :cond_2

    .line 39
    .line 40
    const/high16 v1, -0x1000000

    .line 41
    .line 42
    and-int/2addr p1, v1

    .line 43
    invoke-virtual {v6}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->getColor()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    and-int/2addr v0, v1

    .line 48
    or-int/2addr p1, v0

    .line 49
    return p1

    .line 50
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-virtual {p0, v4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->P0(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1
.end method

.method public final P0(I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R0()Landroid/widget/RadioGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/high16 v2, -0x1000000

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {p1, v3, v1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    instance-of v0, p1, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p1, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    :goto_0
    if-nez p1, :cond_2

    .line 34
    .line 35
    return v2

    .line 36
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->getColor()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public final Q0()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R0()Landroid/widget/RadioGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final R(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->c:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lv4/b;->l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x6

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Lv4/b;->d0(Lv4/b;ZFFILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, "mBinding"

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v1

    .line 29
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 30
    .line 31
    const-string v3, "ivPen"

    .line 32
    .line 33
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T0(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    if-eqz p1, :cond_6

    .line 40
    .line 41
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v1, p1

    .line 50
    :goto_0
    iget-object p1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v0, "getRoot(...)"

    .line 57
    .line 58
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x0

    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move v0, v1

    .line 71
    :goto_1
    if-nez v0, :cond_4

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 78
    .line 79
    .line 80
    :cond_4
    if-nez v0, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    const/16 v1, 0x8

    .line 84
    .line 85
    :goto_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    if-nez v0, :cond_6

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->S()V

    .line 91
    .line 92
    .line 93
    :cond_6
    return-void
.end method

.method public final R0()Landroid/widget/RadioGroup;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->d:Landroid/widget/RadioGroup;

    .line 14
    .line 15
    const-string v1, "rgPenColor"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final S()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v3, "getRoot(...)"

    .line 19
    .line 20
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v1, v3

    .line 32
    :goto_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->s:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    const-string v2, "llEvaluationTools"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget v3, Lcom/zykj/view/R$dimen;->view_3:I

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$b;

    .line 54
    .line 55
    invoke-direct {v4, v0, v2, p0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$b;-><init>(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

# RE I/O 读取整数偏好（SharedPreferences.getInt）、保存整数偏好（SharedPreferences$Editor.putInt）。
.method public final S0(Landroid/content/SharedPreferences;)I
    .locals 4

    .line 1
    const-string v0, "pen_color_slot_index"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Q0()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {p1, v2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_0
    const-string v1, "pen_color_argb"

    .line 30
    .line 31
    invoke-interface {p1, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const/high16 v2, -0x1000000

    .line 38
    .line 39
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p0, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i0(I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 60
    .line 61
    .line 62
    :cond_1
    return v2
.end method

.method public final T0(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Landroid/widget/ImageView;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object v0, v1

    .line 26
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object v0, v1

    .line 52
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    move-object v1, v0

    .line 66
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

# RE I/O 保存整数偏好（SharedPreferences$Editor.putInt）。
.method public final U(IZZ)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->P0(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lv4/b;->m0(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lv4/b;->a0(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    if-eqz p2, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Q0()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 v1, 0x0

    .line 22
    if-lez p2, :cond_1

    .line 23
    .line 24
    add-int/lit8 p2, p2, -0x1

    .line 25
    .line 26
    invoke-static {p1, v1, p2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move p1, v1

    .line 32
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const-string v2, "blackboard_evaluation_pen"

    .line 37
    .line 38
    invoke-virtual {p2, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const-string v1, "pen_color_slot_index"

    .line 47
    .line 48
    invoke-interface {p2, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 53
    .line 54
    .line 55
    :cond_2
    if-eqz p3, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void
.end method

.method public final U0(Lv4/b;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getMethods(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "setSelectEditColorChangeListener"

    .line 25
    .line 26
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    array-length v4, v4

    .line 37
    const/4 v5, 0x1

    .line 38
    if-ne v4, v5, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v3, 0x0

    .line 45
    :goto_1
    if-nez v3, :cond_2

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 49
    .line 50
    new-instance v0, Ld7/s;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Ld7/s;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 53
    .line 54
    .line 55
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v3, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 69
    .line 70
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final V()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 8
    .line 9
    sget v2, Lcom/zykj/view/R$style;->Theme_AppCompat_Light_Dialog_Alert:I

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/zykj/view/R$string;->clear_canvas:I

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v1, Lcom/zykj/view/R$string;->sure:I

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Ld7/q;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Ld7/q;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget v1, Lcom/zykj/view/R$string;->cancel:I

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Ld7/r;

    .line 42
    .line 43
    invoke-direct {v2}, Ld7/r;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method

.method public final W0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->v:Lcom/zykj/view/widget/TouchSwitchView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final X0(I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->O0(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i0(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, p1, v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->U(IZZ)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Y0(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Y(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V
    .locals 1

    .line 1
    new-instance v0, Ld7/l;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Ld7/l;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final Y0(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Q0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p1, v2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput-boolean v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Z

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 18
    .line 19
    const-string v1, "mBinding"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v3

    .line 28
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->d:Landroid/widget/RadioGroup;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    instance-of v4, v0, Landroid/widget/RadioButton;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    check-cast v0, Landroid/widget/RadioButton;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v0, v3

    .line 44
    :goto_0
    if-eqz v0, :cond_4

    .line 45
    .line 46
    iget-object v4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 47
    .line 48
    if-nez v4, :cond_3

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v4, v3

    .line 54
    :cond_3
    iget-object v4, v4, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 55
    .line 56
    iget-object v4, v4, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->d:Landroid/widget/RadioGroup;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {v4, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 63
    .line 64
    .line 65
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 66
    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move-object v0, v3

    .line 73
    :cond_5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->d:Landroid/widget/RadioGroup;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    instance-of v0, p1, Landroid/widget/RadioButton;

    .line 82
    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    check-cast p1, Landroid/widget/RadioButton;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    move-object p1, v3

    .line 89
    :goto_1
    if-eqz p1, :cond_8

    .line 90
    .line 91
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 92
    .line 93
    if-nez v0, :cond_7

    .line 94
    .line 95
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    move-object v3, v0

    .line 100
    :goto_2
    iget-object v0, v3, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 101
    .line 102
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->d:Landroid/widget/RadioGroup;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    invoke-virtual {v0, p1}, Landroid/widget/RadioGroup;->check(I)V

    .line 109
    .line 110
    .line 111
    :cond_8
    iput-boolean v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Z

    .line 112
    .line 113
    return-void
.end method

.method public final a0()Lt5/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b0(F)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "mBinding"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v0, v0

    .line 29
    sub-float/2addr p1, v0

    .line 30
    iget v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:F

    .line 31
    .line 32
    iget v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k:F

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    sub-float/2addr v1, v4

    .line 36
    cmpg-float v4, p1, v0

    .line 37
    .line 38
    if-gez v4, :cond_1

    .line 39
    .line 40
    move p1, v0

    .line 41
    :cond_1
    cmpl-float v0, p1, v1

    .line 42
    .line 43
    if-lez v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v1, p1

    .line 47
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-object v2, p1

    .line 56
    :goto_1
    iget-object p1, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->v:Lcom/zykj/view/widget/TouchSwitchView;

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final c0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ld5/k;->y()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const/4 v2, 0x3

    .line 13
    if-lt v0, v2, :cond_1

    .line 14
    .line 15
    const-string v0, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a:Lm7/n;

    .line 24
    .line 25
    new-instance v5, Ld7/p;

    .line 26
    .line 27
    invoke-direct {v5, p0}, Ld7/p;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 28
    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-static/range {v2 .. v7}, Lm7/n;->y(Lm7/n;Landroid/net/Uri;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）、编码位图（Bitmap.compress）。
.method public final f0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 3
    .line 4
    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-lez v1, :cond_4

    .line 30
    .line 31
    if-gtz v2, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Landroid/graphics/Canvas;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 43
    .line 44
    .line 45
    const/4 v3, -0x1

    .line 46
    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v2, p2, v3, v3, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    .line 54
    .line 55
    .line 56
    new-instance p2, Ljava/io/File;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v4, "eval_crop_opaque_"

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v2, ".jpg"

    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-direct {p2, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Ljava/io/FileOutputStream;

    .line 92
    .line 93
    invoke-direct {p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    :try_start_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 97
    .line 98
    const/16 v3, 0x5c

    .line 99
    .line 100
    invoke-virtual {v1, v2, v3, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    :try_start_2
    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 110
    .line 111
    .line 112
    if-nez v2, :cond_3

    .line 113
    .line 114
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_3
    return-object p2

    .line 119
    :catchall_0
    move-exception p2

    .line 120
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    :catchall_1
    move-exception v1

    .line 122
    :try_start_4
    invoke-static {p1, p2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_4
    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 127
    .line 128
    .line 129
    :catch_0
    return-object v0
.end method

.method public final g0(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b0(F)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b0(F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b0(F)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final i0(I)I
    .locals 7

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R0()Landroid/widget/RadioGroup;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v4, v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    instance-of v6, v5, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    check-cast v5, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 v5, 0x0

    .line 29
    :goto_1
    if-nez v5, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {v5}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->getColor()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    and-int/2addr v5, v0

    .line 37
    if-ne v5, p1, :cond_2

    .line 38
    .line 39
    return v4

    .line 40
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return v3
.end method

.method public final j0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v1, ""

    .line 26
    .line 27
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->W0(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    const-string v0, "mBinding"

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->t:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Ld7/i;

    .line 66
    .line 67
    invoke-direct {v2, p0}, Ld7/i;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 68
    .line 69
    .line 70
    new-instance v3, Ld7/j;

    .line 71
    .line 72
    invoke-direct {v3, p0}, Ld7/j;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

# RE I/O 读取整数偏好（SharedPreferences.getInt）。
.method public final m0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getConfig()Lv4/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "blackboard_evaluation_pen"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->S0(Landroid/content/SharedPreferences;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {p0, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->P0(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const-string v4, "text_color_argb"

    .line 37
    .line 38
    const/high16 v5, -0x1000000

    .line 39
    .line 40
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-static {}, Lm7/q;->j()Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x1

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v5, v6

    .line 61
    :goto_1
    invoke-virtual {v4, v5}, Lv4/b;->f0(Z)V

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 65
    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    const-string v5, "mBinding"

    .line 69
    .line 70
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-object v1, v5

    .line 75
    :goto_2
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Landroid/widget/ImageView;

    .line 76
    .line 77
    invoke-virtual {v4}, Lv4/b;->R()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 82
    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    invoke-virtual {v4, v1}, Lv4/b;->k0(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v6}, Lv4/b;->i0(Z)V

    .line 89
    .line 90
    .line 91
    const/high16 v1, 0x40400000    # 3.0f

    .line 92
    .line 93
    invoke-virtual {v4, v1}, Lv4/b;->n0(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v1}, Lv4/b;->b0(F)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v3}, Lv4/b;->m0(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v3}, Lv4/b;->a0(I)V

    .line 103
    .line 104
    .line 105
    sget-object v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->n:Ljava/util/List;

    .line 106
    .line 107
    invoke-virtual {v4, v1}, Lv4/b;->p0(Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a0()Lt5/a;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v4, v1}, Lv4/b;->o0(Lt5/a;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->U0(Lv4/b;)V

    .line 118
    .line 119
    .line 120
    const/4 v1, -0x1

    .line 121
    invoke-virtual {v4, v1}, Lv4/b;->Z(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, Lv4/b;->z()Lv4/d;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1, v6}, Lv4/d;->l(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v6}, Lv4/d;->o(Z)V

    .line 132
    .line 133
    .line 134
    const/4 v3, 0x3

    .line 135
    invoke-virtual {v1, v3}, Lv4/d;->j(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v6}, Lv4/d;->k(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v0}, Lv4/b;->V(I)V

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x42880000    # 68.0f

    .line 145
    .line 146
    invoke-virtual {v4, v0}, Lv4/b;->Y(F)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v0}, Lv4/b;->X(F)V

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x42b00000    # 88.0f

    .line 153
    .line 154
    invoke-virtual {v4, v0}, Lv4/b;->W(F)V

    .line 155
    .line 156
    .line 157
    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$d;

    .line 158
    .line 159
    invoke-direct {v0, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$d;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v0}, Lv4/b;->j0(Lt5/b;)V

    .line 163
    .line 164
    .line 165
    :cond_3
    invoke-virtual {p0, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Y0(I)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->G0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/high16 p2, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const/high16 p3, 0x3f000000    # 0.5f

    .line 13
    .line 14
    sub-float/2addr p2, p3

    .line 15
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    int-to-float p3, p3

    .line 20
    mul-float/2addr p3, p2

    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    sget v0, Lcom/zykj/view/R$dimen;->view_9:I

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    int-to-float p2, p2

    .line 32
    sub-float/2addr p3, p2

    .line 33
    iget-object p2, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->t:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 34
    .line 35
    const-string v0, "sketchView"

    .line 36
    .line 37
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    float-to-int p3, p3

    .line 47
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string p2, "getRoot(...)"

    .line 62
    .line 63
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 68
    .line 69
    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lv4/b;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Ld5/k;

    .line 10
    .line 11
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->M0()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
