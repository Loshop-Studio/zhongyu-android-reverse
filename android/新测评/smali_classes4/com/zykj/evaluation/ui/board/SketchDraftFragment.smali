# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/evaluation/ui/board/SketchDraftFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\t\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0003J+\u0010%\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0008\u0010\"\u001a\u0004\u0018\u00010!2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0004\u0008%\u0010&J!\u0010\'\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0017\u00a2\u0006\u0004\u0008\'\u0010(J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010)\u001a\u00020\r\u00a2\u0006\u0004\u0008*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010,\u001a\u00020\r\u00a2\u0006\u0004\u0008-\u0010.J\u001d\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000b\u00a2\u0006\u0004\u00082\u00103J\u0015\u00104\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\u0004\u00084\u0010\u001aJ\u0015\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\r\u00a2\u0006\u0004\u00086\u00107J\u0015\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0011\u00a2\u0006\u0004\u00089\u0010:J\u000f\u0010;\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008;\u0010<J\r\u0010=\u001a\u00020\r\u00a2\u0006\u0004\u0008=\u0010>J\r\u0010?\u001a\u00020\r\u00a2\u0006\u0004\u0008?\u0010>J\r\u0010@\u001a\u00020\u0004\u00a2\u0006\u0004\u0008@\u0010\u0003J\r\u0010A\u001a\u00020\u0004\u00a2\u0006\u0004\u0008A\u0010\u0003J\r\u0010B\u001a\u00020\u0004\u00a2\u0006\u0004\u0008B\u0010\u0003J\u0015\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020/\u00a2\u0006\u0004\u0008D\u0010EJ\u001d\u0010F\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020/\u00a2\u0006\u0004\u0008F\u0010GR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0016\u0010\u000c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010PR\u0016\u0010S\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008R\u0010MR\u0018\u0010V\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010\\\u001a\u00020W8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008[\u0010YR\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R0\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR\u0016\u0010C\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008g\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008i\u0010UR\u0016\u0010l\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010hR\u0016\u0010n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010M\u00a8\u0006o"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/board/SketchDraftFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "",
        "P",
        "D0",
        "Landroid/view/View;",
        "view",
        "r0",
        "(Landroid/view/View;)V",
        "",
        "url",
        "",
        "showLoading",
        "forceWebView",
        "Lkotlin/Function1;",
        "Landroid/graphics/Bitmap;",
        "callback",
        "k0",
        "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V",
        "E0",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V",
        "w0",
        "path",
        "I",
        "(Ljava/lang/String;)V",
        "Ljava/io/File;",
        "K",
        "(Ljava/lang/String;)Ljava/io/File;",
        "z0",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "hideAnalysis",
        "j0",
        "(Ljava/lang/String;Z)V",
        "needOldBitmap",
        "M",
        "(Z)Landroid/graphics/Bitmap;",
        "",
        "targetTime",
        "targetPath",
        "p0",
        "(JLjava/lang/String;)V",
        "s0",
        "isSeeMode",
        "t0",
        "(Z)V",
        "bitmap",
        "q0",
        "(Landroid/graphics/Bitmap;)V",
        "H",
        "()Landroid/graphics/Bitmap;",
        "i0",
        "()Z",
        "h0",
        "o0",
        "y0",
        "O",
        "qstLastModifyTime",
        "u0",
        "(J)V",
        "f0",
        "(Ljava/lang/String;J)Z",
        "Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;",
        "a",
        "Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;",
        "binding",
        "b",
        "Z",
        "isChange",
        "c",
        "Ljava/lang/String;",
        "d",
        "e",
        "canShowAnswer",
        "f",
        "Landroid/graphics/Bitmap;",
        "imageWithAnswer",
        "",
        "g",
        "F",
        "scale",
        "h",
        "offset",
        "Lkotlinx/coroutines/Job;",
        "i",
        "Lkotlinx/coroutines/Job;",
        "saveDataJob",
        "j",
        "Lkotlin/jvm/functions/Function1;",
        "isTouchingChangeListener",
        "()Lkotlin/jvm/functions/Function1;",
        "v0",
        "(Lkotlin/jvm/functions/Function1;)V",
        "k",
        "J",
        "l",
        "cachedBitmap",
        "m",
        "oldTime",
        "n",
        "needRefreshOldPng",
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
        "SMAP\nSketchDraftFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchDraftFragment.kt\ncom/zykj/evaluation/ui/board/SketchDraftFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,615:1\n1869#2,2:616\n1999#2,14:628\n257#3,2:618\n257#3,2:620\n257#3,2:622\n257#3,2:642\n257#3,2:646\n257#3,2:648\n1#4:624\n3829#5:625\n4344#5,2:626\n13472#5,2:644\n*S KotlinDebug\n*F\n+ 1 SketchDraftFragment.kt\ncom/zykj/evaluation/ui/board/SketchDraftFragment\n*L\n247#1:616,2\n397#1:628,14\n257#1:618,2\n306#1:620,2\n311#1:622,2\n458#1:642,2\n598#1:646,2\n602#1:648,2\n392#1:625\n392#1:626,2\n553#1:644,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Landroid/graphics/Bitmap;

.field public g:F

.field public final h:F

.field public i:Lkotlinx/coroutines/Job;

.field public j:Lkotlin/jvm/functions/Function1;

.field public k:J

.field public l:Landroid/graphics/Bitmap;

.field public m:J

.field public n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->d:Ljava/lang/String;

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 13
    .line 14
    const v0, 0x3dcccccd    # 0.1f

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->h:F

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic A(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->V(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V

    return-void
.end method

.method public static final A0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->I(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->y0()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->n:Z

    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->d:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p2, Lt5/m;

    .line 15
    .line 16
    invoke-direct {p2}, Lt5/m;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, p1, v0, v0, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k0(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic B(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->m0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final B0(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "bitmap"

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

.method public static synthetic C(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->X(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public static final C0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->n:Z

    .line 6
    .line 7
    iget-wide p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->m:J

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "SketchDraftFragment,oldTime\u662f"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 34
    .line 35
    const-string p2, "binding"

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v0

    .line 44
    :cond_0
    iget-object p1, p1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->j:Landroid/widget/ImageView;

    .line 45
    .line 46
    const-string v1, "ivSketchRefresh"

    .line 47
    .line 48
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->K(Ljava/lang/String;)Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object p1, v0

    .line 69
    :goto_0
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->l:Landroid/graphics/Bitmap;

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    iget-object v1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 78
    .line 79
    if-nez v1, :cond_2

    .line 80
    .line 81
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    move-object v1, v0

    .line 85
    :cond_2
    iget-object v1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 86
    .line 87
    invoke-virtual {v1, p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setImageBackground(Landroid/graphics/Bitmap;)V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 91
    .line 92
    if-nez p0, :cond_3

    .line 93
    .line 94
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    move-object v0, p0

    .line 99
    :goto_1
    iget-object p0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->n:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 100
    .line 101
    const-string p1, "llLoading"

    .line 102
    .line 103
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/16 p1, 0x8

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    :cond_4
    return-void
.end method

.method public static final synthetic D(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->n:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic E(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic F(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final F0(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;Landroid/webkit/WebView;)Lkotlin/Unit;
    .locals 0

    .line 1
    new-instance p4, Lt5/s;

    .line 2
    .line 3
    invoke-direct {p4, p0, p1, p2, p3}, Lt5/s;-><init>(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 p1, 0x12c

    .line 7
    .line 8
    invoke-virtual {p0, p4, p1, p2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final synthetic G(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final G0(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    sget-object v0, Lg7/k;->a:Lg7/k;

    .line 2
    .line 3
    invoke-virtual {p0}, Le7/o0;->getWebView()Landroid/webkit/WebView;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lg7/k;->a(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const-string v2, "binding"

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v3, p2, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    move-object v3, v1

    .line 24
    :cond_0
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setImageBackground(Landroid/graphics/Bitmap;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "SketchDraftFragment,\u622a\u56fe\u5f00\u59cb\u4fdd\u5b58"

    .line 30
    .line 31
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-wide v3, p2, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k:J

    .line 39
    .line 40
    iget-object v5, p2, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p2, v3, v4, v5}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->p0(JLjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_1
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->O()V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object p1, p2, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move-object v1, p1

    .line 62
    :goto_0
    iget-object p1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->q:Landroid/widget/FrameLayout;

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static final H0(Le7/o0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le7/o0;->g(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final J(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-string p0, "bg_at_"

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p1, p0, v0, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const-string p0, ".webp"

    .line 16
    .line 17
    invoke-static {p1, p0, v0, v1, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    return v0
.end method

.method public static final L(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-string p0, "bg_at_"

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p1, p0, v0, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const-string p0, ".webp"

    .line 16
    .line 17
    invoke-static {p1, p0, v0, v1, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    return v0
.end method

.method public static synthetic N(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;ZILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->M(Z)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final Q(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->b:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->D0()V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final R(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    if-eq p1, p2, :cond_0

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    if-eq p1, p2, :cond_1

    .line 12
    .line 13
    const/4 p2, 0x3

    .line 14
    if-eq p1, p2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->j:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->j:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public static final S(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 8
    .line 9
    const v1, 0x7f1302c5

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p2, v1}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 13
    .line 14
    .line 15
    const p2, 0x7f12003c

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const v0, 0x7f1201b7

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Lt5/g;

    .line 30
    .line 31
    invoke-direct {v1, p1}, Lt5/g;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const p2, 0x7f120037

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p2, Lt5/h;

    .line 46
    .line 47
    invoke-direct {p2}, Lt5/h;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0, p2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public static final T(Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final U(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final V(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->h:F

    .line 4
    .line 5
    add-float/2addr p2, v0

    .line 6
    iput p2, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 7
    .line 8
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 9
    .line 10
    cmpl-float p2, p2, v0

    .line 11
    .line 12
    if-lez p2, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 15
    .line 16
    :cond_0
    iget p0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->j(F)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final W(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p2, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->h:F

    .line 4
    .line 5
    sub-float/2addr p2, v0

    .line 6
    iput p2, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    cmpg-float p2, p2, v0

    .line 11
    .line 12
    if-gez p2, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 15
    .line 16
    :cond_0
    iget p0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g:F

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->j(F)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final X(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->isSelected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lw7/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    xor-int/lit8 v1, v0, 0x1

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lw7/c;->j(Z)V

    .line 12
    .line 13
    .line 14
    xor-int/lit8 p0, v0, 0x1

    .line 15
    .line 16
    invoke-virtual {p2, p0}, Landroid/view/View;->setSelected(Z)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lp7/d;->b:Lp7/d;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string p2, "requireContext(...)"

    .line 26
    .line 27
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string p2, "draftTouchEnable"

    .line 31
    .line 32
    xor-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2, v0}, Lp7/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static final Y(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->r0(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final Z(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lw7/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, v0}, Lw7/c;->m(Z)V

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->r0(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static final a0(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lw7/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lw7/c;->m(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->r0(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final b0(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lw7/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, v0}, Lw7/c;->m(Z)V

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->r0(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->G0(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final c0(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->r0(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic d(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->b0(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final d0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->e:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->w0()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 10
    .line 11
    const v0, 0x7f120194

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "getString(...)"

    .line 19
    .line 20
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static synthetic e(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->n0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->Z(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->S(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V

    return-void
.end method

.method public static final g0(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-string p0, "bg_at_"

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p1, p0, v0, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const-string p0, ".webp"

    .line 16
    .line 17
    invoke-static {p1, p0, v0, v1, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    return v0
.end method

.method public static synthetic h(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;Landroid/webkit/WebView;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->F0(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;Landroid/webkit/WebView;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a0(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g0(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->x0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->J(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic l0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x4

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k0(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic m(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->Y(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final m0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->q0(Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->d0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final n0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->f:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic o(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->U(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->R(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic q(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->B0(Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->T(Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic s(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->C0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic t(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->W(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->A0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic v(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c0(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic w(Le7/o0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->H0(Le7/o0;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic x(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->Q(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final x0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->q0(Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static synthetic y(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->L(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic z(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->e0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final D0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->i:Lkotlinx/coroutines/Job;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isActive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->i:Lkotlinx/coroutines/Job;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object v3, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    .line 21
    .line 22
    new-instance v6, Lcom/zykj/evaluation/ui/board/SketchDraftFragment$startSaveDataThread$1;

    .line 23
    .line 24
    invoke-direct {v6, p0, v1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment$startSaveDataThread$1;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    const/4 v7, 0x3

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->i:Lkotlinx/coroutines/Job;

    .line 36
    .line 37
    return-void
.end method

.method public final E0(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    new-instance v0, Le7/o0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x6

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct/range {v0 .. v5}, Le7/o0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const-string v1, "binding"

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    :cond_0
    iget-object v1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->q:Landroid/widget/FrameLayout;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lt5/o;

    .line 44
    .line 45
    invoke-direct {v1, v0, p2, p0, p3}, Lt5/o;-><init>(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Le7/o0;->setPageFinishListener(Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Lt5/p;

    .line 52
    .line 53
    invoke-direct {p2, v0, p1}, Lt5/p;-><init>(Le7/o0;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final H()Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "binding"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d()Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_1
    return-object v1
.end method

.method public final I(Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "\u6e05\u7406\u7f13\u5b58"

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    new-instance p1, Lt5/r;

    .line 22
    .line 23
    invoke-direct {p1}, Lt5/r;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    array-length v1, p1

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_2

    .line 35
    .line 36
    aget-object v3, p1, v2

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    new-instance v6, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v7, "\u5220\u9664\u65e7\u6587\u4ef6: "

    .line 58
    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v5, ", \u7ed3\u679c: "

    .line 66
    .line 67
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catch_0
    move-exception v4

    .line 86
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    new-instance v5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v6, "\u5220\u9664\u6587\u4ef6\u5931\u8d25: "

    .line 100
    .line 101
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v3, ", "

    .line 108
    .line 109
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    :goto_2
    return-void
.end method

.method public final K(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lt5/n;

    .line 21
    .line 22
    invoke-direct {p1}, Lt5/n;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/io/File;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    :goto_0
    return-object v1
.end method

.method public final M(Z)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_3

    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k:J

    .line 9
    .line 10
    invoke-virtual {p0, p1, v2, v3}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->f0(Ljava/lang/String;J)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string p1, "getStemBitmap"

    .line 17
    .line 18
    const-string v0, "\u7f13\u5b58\u5df2\u5931\u6548\uff0c\u5f3a\u5236\u8fd4\u56de\u7a7a\u4ee5\u89e6\u53d1\u5237\u65b0"

    .line 19
    .line 20
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->l:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, p1

    .line 41
    :goto_0
    iget-object p1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getImageBackground()Landroid/graphics/Bitmap;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_2
    return-object p1

    .line 48
    :cond_3
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->l:Landroid/graphics/Bitmap;

    .line 49
    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 53
    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move-object v1, p1

    .line 61
    :goto_1
    iget-object p1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getImageBackground()Landroid/graphics/Bitmap;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_5
    return-object p1
.end method

.method public final O()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "binding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->n:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final P()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "binding"

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
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 13
    .line 14
    new-instance v3, Lt5/a;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lt5/a;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setOnActionListener(Lkotlin/jvm/functions/Function0;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

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
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 31
    .line 32
    new-instance v3, Lt5/v;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lt5/v;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

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
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lw7/c;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, Lp7/d;->b:Lp7/d;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const-string v6, "requireContext(...)"

    .line 61
    .line 62
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v6, "draftTouchEnable"

    .line 66
    .line 67
    const/4 v7, 0x1

    .line 68
    invoke-virtual {v4, v5, v6, v7}, Lp7/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-virtual {v3, v4}, Lw7/c;->j(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 76
    .line 77
    if-nez v3, :cond_3

    .line 78
    .line 79
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move-object v3, v1

    .line 83
    :cond_3
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->l:Landroid/widget/ImageView;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lw7/c;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Lw7/c;->b()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 94
    .line 95
    .line 96
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 97
    .line 98
    if-nez v3, :cond_4

    .line 99
    .line 100
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object v3, v1

    .line 104
    :cond_4
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->l:Landroid/widget/ImageView;

    .line 105
    .line 106
    new-instance v4, Lt5/w;

    .line 107
    .line 108
    invoke-direct {v4, v0, p0}, Lt5/w;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    .line 113
    .line 114
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 115
    .line 116
    if-nez v3, :cond_5

    .line 117
    .line 118
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    move-object v3, v1

    .line 122
    :cond_5
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->k:Landroid/widget/ImageView;

    .line 123
    .line 124
    new-instance v4, Lt5/x;

    .line 125
    .line 126
    invoke-direct {v4, v0, p0}, Lt5/x;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 133
    .line 134
    if-nez v3, :cond_6

    .line 135
    .line 136
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    move-object v3, v1

    .line 140
    :cond_6
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->h:Landroid/widget/ImageView;

    .line 141
    .line 142
    new-instance v4, Lt5/y;

    .line 143
    .line 144
    invoke-direct {v4, v0, p0}, Lt5/y;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    .line 149
    .line 150
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 151
    .line 152
    if-nez v3, :cond_7

    .line 153
    .line 154
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    move-object v3, v1

    .line 158
    :cond_7
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->g:Landroid/widget/ImageView;

    .line 159
    .line 160
    new-instance v4, Lt5/z;

    .line 161
    .line 162
    invoke-direct {v4, v0, p0}, Lt5/z;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    .line 167
    .line 168
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 169
    .line 170
    if-nez v3, :cond_8

    .line 171
    .line 172
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    move-object v3, v1

    .line 176
    :cond_8
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->d:Landroid/widget/ImageView;

    .line 177
    .line 178
    new-instance v4, Lt5/a0;

    .line 179
    .line 180
    invoke-direct {v4, v0, p0}, Lt5/a0;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    .line 185
    .line 186
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 187
    .line 188
    if-nez v3, :cond_9

    .line 189
    .line 190
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    move-object v3, v1

    .line 194
    :cond_9
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->f:Landroid/widget/ImageView;

    .line 195
    .line 196
    new-instance v4, Lt5/b;

    .line 197
    .line 198
    invoke-direct {v4, v0, p0}, Lt5/b;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 205
    .line 206
    if-nez v3, :cond_a

    .line 207
    .line 208
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    move-object v3, v1

    .line 212
    :cond_a
    iget-object v4, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->c:Landroid/widget/ImageView;

    .line 213
    .line 214
    const-string v3, "ivSketchClean"

    .line 215
    .line 216
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance v7, Lt5/c;

    .line 220
    .line 221
    invoke-direct {v7, p0, v0}, Lt5/c;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 222
    .line 223
    .line 224
    const/4 v8, 0x1

    .line 225
    const/4 v9, 0x0

    .line 226
    const-wide/16 v5, 0x0

    .line 227
    .line 228
    invoke-static/range {v4 .. v9}, Lb8/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 232
    .line 233
    if-nez v3, :cond_b

    .line 234
    .line 235
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    move-object v3, v1

    .line 239
    :cond_b
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->e:Landroid/widget/ImageView;

    .line 240
    .line 241
    new-instance v4, Lt5/d;

    .line 242
    .line 243
    invoke-direct {v4, p0, v0}, Lt5/d;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    .line 248
    .line 249
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 250
    .line 251
    if-nez v3, :cond_c

    .line 252
    .line 253
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    move-object v3, v1

    .line 257
    :cond_c
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->i:Landroid/widget/ImageView;

    .line 258
    .line 259
    new-instance v4, Lt5/l;

    .line 260
    .line 261
    invoke-direct {v4, p0, v0}, Lt5/l;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 265
    .line 266
    .line 267
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 268
    .line 269
    if-nez v0, :cond_d

    .line 270
    .line 271
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    move-object v0, v1

    .line 275
    :cond_d
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->h:Landroid/widget/ImageView;

    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 281
    .line 282
    if-nez v0, :cond_e

    .line 283
    .line 284
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    move-object v0, v1

    .line 288
    :cond_e
    iget-object v3, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 289
    .line 290
    const-string v0, "tvShowAnalysis"

    .line 291
    .line 292
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    new-instance v6, Lt5/t;

    .line 296
    .line 297
    invoke-direct {v6, p0}, Lt5/t;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 298
    .line 299
    .line 300
    const/4 v7, 0x1

    .line 301
    const/4 v8, 0x0

    .line 302
    const-wide/16 v4, 0x0

    .line 303
    .line 304
    invoke-static/range {v3 .. v8}, Lb8/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 308
    .line 309
    if-nez v0, :cond_f

    .line 310
    .line 311
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto :goto_0

    .line 315
    :cond_f
    move-object v1, v0

    .line 316
    :goto_0
    iget-object v0, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->j:Landroid/widget/ImageView;

    .line 317
    .line 318
    new-instance v1, Lt5/u;

    .line 319
    .line 320
    invoke-direct {v1, p0}, Lt5/u;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    .line 325
    .line 326
    return-void
.end method

.method public final f0(Ljava/lang/String;J)Z
    .locals 6

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p1, :cond_6

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_0
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long p1, p2, v2

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    new-instance p1, Lt5/q;

    .line 34
    .line 35
    invoke-direct {p1}, Lt5/q;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    array-length v0, p1

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {p1}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/io/File;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string v2, "bg_at_"

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v4, 0x2

    .line 75
    invoke-static {v0, v2, v3, v4, v3}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v5, ".webp"

    .line 80
    .line 81
    invoke-static {v2, v5, v3, v4, v3}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v2}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    cmp-long v3, v3, p2

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    iput-wide v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->m:J

    .line 104
    .line 105
    new-instance p1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v1, "\u68c0\u6d4b\u5230\u5931\u6548\u7f13\u5b58\u6587\u4ef6: "

    .line 111
    .line 112
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, ", \u5f53\u524d\u9898\u76ee\u65f6\u95f4\u6233: "

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p2, ", \u6587\u4ef6\u65f6\u95f4\u6233: "

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string p2, "SketchDraftFragment"

    .line 139
    .line 140
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    const/4 p1, 0x1

    .line 148
    return p1

    .line 149
    :cond_4
    return v1

    .line 150
    :cond_5
    :goto_0
    const-string p1, "\u540e\u7aef\u7ed9\u7684\u8def\u5f84,isCacheInvalid"

    .line 151
    .line 152
    const-string p2, "\u6ca1\u6709\u6587\u4ef6"

    .line 153
    .line 154
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    :goto_1
    return v1
.end method

.method public final h0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final i0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "binding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public final j0(Ljava/lang/String;Z)V
    .locals 12

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const-string v2, "binding"

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v1

    .line 17
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 18
    .line 19
    const-string v3, "tvShowAnalysis"

    .line 20
    .line 21
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 v3, 0x8

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->d:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    const/4 v8, 0x4

    .line 38
    const/4 v9, 0x0

    .line 39
    const-string v5, "?showAnalysis=true"

    .line 40
    .line 41
    const-string v6, "?showAnalysis=false"

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v4, p1

    .line 45
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    xor-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    iput-boolean p2, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->e:Z

    .line 56
    .line 57
    move-object v6, p1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v4, p1

    .line 60
    move-object v6, v4

    .line 61
    :goto_1
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 62
    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v1, p1

    .line 70
    :goto_2
    iget-object p1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->q:Landroid/widget/FrameLayout;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 73
    .line 74
    .line 75
    new-instance v9, Lt5/e;

    .line 76
    .line 77
    invoke-direct {v9, p0}, Lt5/e;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 78
    .line 79
    .line 80
    const/4 v10, 0x4

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v7, 0x1

    .line 83
    const/4 v8, 0x0

    .line 84
    move-object v5, p0

    .line 85
    invoke-static/range {v5 .. v11}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->l0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v3, v5

    .line 89
    iget-boolean p1, v3, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->e:Z

    .line 90
    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    new-instance v7, Lt5/f;

    .line 94
    .line 95
    invoke-direct {v7, p0}, Lt5/f;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 96
    .line 97
    .line 98
    const/4 v8, 0x4

    .line 99
    const/4 v9, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-static/range {v3 .. v9}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->l0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void
.end method

.method public final k0(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p4}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->E0(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k:J

    .line 8
    .line 9
    new-instance p3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "SketchDraftFragment,\u540e\u7aef\u7ed9\u7684\u65f6\u95f4\u662f"

    .line 15
    .line 16
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-static {p3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "SketchDraftFragment,path\u7684\u8def\u5f84\u662f"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-static {p3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 60
    .line 61
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k:J

    .line 62
    .line 63
    invoke-virtual {p0, p3, v0, v1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->f0(Ljava/lang/String;J)Z

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    const-string v0, "ivSketchRefresh"

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    const-string v2, "binding"

    .line 71
    .line 72
    if-eqz p3, :cond_2

    .line 73
    .line 74
    const-string p1, "SketchDraftFragment,\u52a0\u8f7d\u7684\u56fe\u7247------\u672c\u5730\u7f13\u5b58"

    .line 75
    .line 76
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 84
    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move-object v1, p1

    .line 92
    :goto_0
    iget-object p1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->j:Landroid/widget/ImageView;

    .line 93
    .line 94
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 p2, 0x0

    .line 98
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->z0()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_2
    const-string p3, "SketchDraftFragment,\u52a0\u8f7d\u7684\u56fe\u7247-----\u4e91\u7aef\u7f51\u9875"

    .line 106
    .line 107
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-static {p3}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object p3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 115
    .line 116
    if-nez p3, :cond_3

    .line 117
    .line 118
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    move-object v1, p3

    .line 123
    :goto_1
    iget-object p3, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->j:Landroid/widget/ImageView;

    .line 124
    .line 125
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const/16 v0, 0x8

    .line 129
    .line 130
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1, p2, p4}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->E0(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final o0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "binding"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->h()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v1, v0

    .line 29
    :goto_0
    iget-object v0, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->h:Landroid/widget/ImageView;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "binding"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "getRoot(...)"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
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
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->P()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final p0(JLjava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    const-string v4, "targetPath"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v5, "\u4fdd\u5b58\u56fe\u7247, targetTime="

    .line 18
    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v5, ", targetPath="

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "SketchDraftFragment"

    .line 38
    .line 39
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, v1, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_0

    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    iget-object v4, v1, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 56
    .line 57
    const-string v6, "binding"

    .line 58
    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    :cond_1
    iget-object v4, v4, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 66
    .line 67
    invoke-virtual {v4, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->i(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v4, Ljava/io/File;

    .line 71
    .line 72
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_10

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_2

    .line 86
    .line 87
    goto/16 :goto_7

    .line 88
    .line 89
    :cond_2
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v8, "bg_at_"

    .line 94
    .line 95
    const-string v9, ".webp"

    .line 96
    .line 97
    if-eqz v0, :cond_a

    .line 98
    .line 99
    new-instance v10, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    array-length v11, v0

    .line 105
    const/4 v12, 0x0

    .line 106
    move v13, v12

    .line 107
    :goto_0
    if-ge v13, v11, :cond_5

    .line 108
    .line 109
    aget-object v14, v0, v13

    .line 110
    .line 111
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    if-eqz v15, :cond_3

    .line 116
    .line 117
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    const-string v7, "getName(...)"

    .line 122
    .line 123
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object/from16 p3, v0

    .line 127
    .line 128
    const/4 v0, 0x2

    .line 129
    move-object/from16 v16, v6

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    invoke-static {v15, v9, v12, v0, v6}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    if-eqz v15, :cond_4

    .line 137
    .line 138
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v15, v8, v12, v0, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_4

    .line 150
    .line 151
    invoke-interface {v10, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    move-object/from16 p3, v0

    .line 156
    .line 157
    move-object/from16 v16, v6

    .line 158
    .line 159
    const/4 v6, 0x0

    .line 160
    :cond_4
    :goto_1
    add-int/lit8 v13, v13, 0x1

    .line 161
    .line 162
    move-object/from16 v0, p3

    .line 163
    .line 164
    move-object/from16 v6, v16

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_5
    move-object/from16 v16, v6

    .line 168
    .line 169
    const/4 v6, 0x0

    .line 170
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-nez v7, :cond_6

    .line 179
    .line 180
    move-object v7, v6

    .line 181
    goto :goto_2

    .line 182
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-nez v10, :cond_7

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_7
    move-object v10, v7

    .line 194
    check-cast v10, Ljava/io/File;

    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/io/File;->lastModified()J

    .line 197
    .line 198
    .line 199
    move-result-wide v10

    .line 200
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    move-object v13, v12

    .line 205
    check-cast v13, Ljava/io/File;

    .line 206
    .line 207
    invoke-virtual {v13}, Ljava/io/File;->lastModified()J

    .line 208
    .line 209
    .line 210
    move-result-wide v13

    .line 211
    cmp-long v15, v10, v13

    .line 212
    .line 213
    if-gez v15, :cond_9

    .line 214
    .line 215
    move-object v7, v12

    .line 216
    move-wide v10, v13

    .line 217
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-nez v12, :cond_8

    .line 222
    .line 223
    :goto_2
    check-cast v7, Ljava/io/File;

    .line 224
    .line 225
    move-object v10, v7

    .line 226
    goto :goto_3

    .line 227
    :cond_a
    move-object/from16 v16, v6

    .line 228
    .line 229
    const/4 v6, 0x0

    .line 230
    move-object v10, v6

    .line 231
    :goto_3
    if-nez v10, :cond_b

    .line 232
    .line 233
    const-string v0, "\u4fdd\u5b58\u5931\u8d25\uff1a\u672a\u627e\u5230\u751f\u6210\u7684 UUID webp \u6587\u4ef6"

    .line 234
    .line 235
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_b
    new-instance v11, Ljava/io/File;

    .line 244
    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-direct {v11, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    const/4 v14, 0x4

    .line 267
    const/4 v15, 0x0

    .line 268
    const/4 v12, 0x1

    .line 269
    const/4 v13, 0x0

    .line 270
    :try_start_0
    invoke-static/range {v10 .. v15}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_f

    .line 278
    .line 279
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 280
    .line 281
    .line 282
    move-result-wide v2

    .line 283
    const-wide/16 v7, 0x0

    .line 284
    .line 285
    cmp-long v0, v2, v7

    .line 286
    .line 287
    if-lez v0, :cond_f

    .line 288
    .line 289
    invoke-virtual {v10}, Ljava/io/File;->delete()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-nez v0, :cond_c

    .line 294
    .line 295
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    new-instance v2, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const-string v3, "UUID \u4e34\u65f6\u6587\u4ef6\u5220\u9664\u5931\u8d25\uff1a"

    .line 305
    .line 306
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->w([Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :catch_0
    move-exception v0

    .line 325
    goto :goto_6

    .line 326
    :cond_c
    :goto_4
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iput-object v0, v1, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->l:Landroid/graphics/Bitmap;

    .line 335
    .line 336
    if-eqz v0, :cond_e

    .line 337
    .line 338
    iget-object v2, v1, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 339
    .line 340
    if-nez v2, :cond_d

    .line 341
    .line 342
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    move-object v7, v6

    .line 346
    goto :goto_5

    .line 347
    :cond_d
    move-object v7, v2

    .line 348
    :goto_5
    iget-object v2, v7, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 349
    .line 350
    invoke-virtual {v2, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setImageBackground(Landroid/graphics/Bitmap;)V

    .line 351
    .line 352
    .line 353
    :cond_e
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    new-instance v2, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    const-string v3, "\u4fdd\u5b58\u6210\u529f\uff1a"

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :cond_f
    const-string v0, "\u590d\u5236\u540e\u7684\u6587\u4ef6\u5f02\u5e38\uff0c\u7ec8\u6b62\u540e\u7eed\u6d41\u7a0b"

    .line 383
    .line 384
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    new-instance v3, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const-string v4, "\u4fdd\u5b58\u56fe\u7247\u5931\u8d25: "

    .line 402
    .line 403
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    filled-new-array {v5, v2, v0}, [Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :cond_10
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 424
    .line 425
    .line 426
    const-string v3, "\u4fdd\u5b58\u5931\u8d25\uff1a\u76ee\u5f55\u4e0d\u5b58\u5728 "

    .line 427
    .line 428
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    return-void
.end method

.method public final q0(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "binding"

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setImageBackground(Landroid/graphics/Bitmap;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final r0(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "binding"

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
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->k:Landroid/widget/ImageView;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v3, v1

    .line 22
    :cond_1
    iget-object v3, v3, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->h:Landroid/widget/ImageView;

    .line 23
    .line 24
    iget-object v4, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 25
    .line 26
    if-nez v4, :cond_2

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v4, v1

    .line 32
    :cond_2
    iget-object v4, v4, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->g:Landroid/widget/ImageView;

    .line 33
    .line 34
    iget-object v5, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 35
    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object v5, v1

    .line 42
    :cond_3
    iget-object v5, v5, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->d:Landroid/widget/ImageView;

    .line 43
    .line 44
    iget-object v6, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 45
    .line 46
    if-nez v6, :cond_4

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    move-object v1, v6

    .line 53
    :goto_0
    iget-object v1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->f:Landroid/widget/ImageView;

    .line 54
    .line 55
    filled-new-array {v0, v3, v4, v5, v1}, [Landroid/widget/ImageView;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroid/widget/ImageView;

    .line 78
    .line 79
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    return-void
.end method

.method public final s0(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "binding"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v0, v1

    .line 19
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->o:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v1, p1

    .line 33
    :goto_0
    iget-object p1, v1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->m:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final t0(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const-string v1, "binding"

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :cond_0
    iget-object p1, p1, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->k:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v0, p1

    .line 28
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->m:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 29
    .line 30
    const-string v0, "llControl"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x8

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public final u0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k:J

    .line 2
    .line 3
    return-void
.end method

.method public final v0(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->j:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final w0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->f:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move-object v0, v1

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    :cond_1
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->q0(Landroid/graphics/Bitmap;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->y0()V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->d:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v6, Lt5/i;

    .line 26
    .line 27
    invoke-direct {v6, p0}, Lt5/i;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 28
    .line 29
    .line 30
    const/4 v7, 0x4

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    move-object v2, p0

    .line 35
    invoke-static/range {v2 .. v8}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->l0(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final y0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->a:Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "binding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;->n:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final z0()V
    .locals 4

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
    const v1, 0x7f120026

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getString(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 20
    .line 21
    const v3, 0x7f1302c5

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v0, v3}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const v1, 0x7f1201b7

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lt5/j;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Lt5/j;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const v1, 0x7f120037

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lt5/k;

    .line 55
    .line 56
    invoke-direct {v2, p0}, Lt5/k;-><init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "create(...)"

    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 80
    .line 81
    .line 82
    :cond_0
    return-void
.end method
