.class public final Lcom/zykj/view/board/board/BoardFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/BoardFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 r2\u00020\u0001:\u0001rB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJS\u0010%\u001a\u00020\u000e2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u0010 \u001a\u00020\u001e2\u0008\u0008\u0002\u0010\"\u001a\u00020!2\u0018\u0008\u0002\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000e\u0018\u00010#\u00a2\u0006\u0004\u0008%\u0010&J/\u0010\'\u001a\u00020\u000e2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008\'\u0010(J/\u0010)\u001a\u00020\u000e2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008)\u0010(J%\u0010,\u001a\u00020\u000e2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u001e0*2\u0008\u0008\u0002\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008,\u0010-Jo\u00106\u001a\u00020\u000e2\u0008\u0008\u0002\u0010.\u001a\u00020!2\u0008\u0008\u0002\u0010/\u001a\u00020!2&\u0008\u0002\u00104\u001a \u0008\u0001\u0012\u0004\u0012\u000201\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e02\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001002$\u00105\u001a \u0008\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e02\u0012\u0006\u0012\u0004\u0018\u00010300\u00a2\u0006\u0004\u00086\u00107J\r\u00108\u001a\u00020\u000e\u00a2\u0006\u0004\u00088\u0010\u0003J\u0013\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u001e0*\u00a2\u0006\u0004\u00089\u0010:J\u0013\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u001e0*\u00a2\u0006\u0004\u0008;\u0010:J\r\u0010<\u001a\u00020\u000e\u00a2\u0006\u0004\u0008<\u0010\u0003J\u000f\u0010=\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008=\u0010\u0003J\u000f\u0010>\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008>\u0010\u0003J\u000f\u0010?\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008?\u0010\u0003J\u000f\u0010@\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008@\u0010\u0003J\u000f\u0010A\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008A\u0010\u0003J\u000f\u0010B\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008B\u0010\u0003J\u000f\u0010C\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008C\u0010\u0003J\u000f\u0010D\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008D\u0010\u0003J\u000f\u0010E\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008E\u0010\u0003J\u000f\u0010F\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008F\u0010\u0003J\u000f\u0010G\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008G\u0010\u0003J\u000f\u0010H\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008H\u0010\u0003J\u000f\u0010I\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008I\u0010\u0003J\u000f\u0010J\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008J\u0010\u0003J\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008L\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008N\u0010\u0003J\u000f\u0010O\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008O\u0010\u0003J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020PH\u0002\u00a2\u0006\u0004\u0008R\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010`8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\"\u0010e\u001a\u0010\u0012\u000c\u0012\n d*\u0004\u0018\u00010\u001e0\u001e0c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0011\u0010g\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008g\u0010hR$\u0010o\u001a\u00020i2\u0006\u0010j\u001a\u00020i8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008k\u0010l\"\u0004\u0008m\u0010nR\u0014\u0010\u001f\u001a\u00020\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010q\u00a8\u0006s"
    }
    d2 = {
        "Lcom/zykj/view/board/board/BoardFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "Ld6/s;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "showProgress",
        "hideProgress",
        "Lcom/zykj/view/board/board/BoardViewConfig;",
        "boardViewConfig",
        "setBoardViewConfig",
        "(Lcom/zykj/view/board/board/BoardViewConfig;)V",
        "Lcom/zykj/view/board/board/BoardCallbackConfig;",
        "boardCallbackConfig",
        "setBoardCallbackConfig",
        "(Lcom/zykj/view/board/board/BoardCallbackConfig;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "",
        "path",
        "filename",
        "",
        "isSelected",
        "Lkotlin/Function1;",
        "imagePathCallback",
        "addBitmap",
        "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;)V",
        "addFullBitmap",
        "(Landroid/graphics/Bitmap;Ljava/lang/String;Z)V",
        "addBitmapMaxHeight",
        "",
        "pathList",
        "addBitmapList",
        "(Ljava/util/List;Z)V",
        "needClear",
        "isContentThumbnail",
        "Lkotlin/Function2;",
        "",
        "Lh6/c;",
        "",
        "error",
        "callback",
        "getSavePath",
        "(ZZLr6/e;Lr6/e;)V",
        "cleanBoardCache",
        "getRecordingImagePathList",
        "()Ljava/util/List;",
        "getPathListByImageGraph",
        "resetRevoke",
        "initView",
        "initClickListener",
        "loadSketchData",
        "initBasicData",
        "initMainClickListener",
        "initSelectListener",
        "initPenClickListener",
        "initEraserClickListener",
        "initGraphClickListener",
        "initBackgroundClickListener",
        "initExtraClickListener",
        "initDismissCustomColorPaletteOnSketchTouch",
        "initProgressBarTouchListener",
        "initObserver",
        "isOpen",
        "startToolAnimate",
        "(Z)V",
        "startGallery",
        "startCapture",
        "Lcom/zykj/view/board/board/BoardSketchConfig;",
        "boardSketchConfig",
        "setBoardSketchConfig",
        "(Lcom/zykj/view/board/board/BoardSketchConfig;)V",
        "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;",
        "mBinding",
        "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;",
        "Lcom/zykj/view/board/board/BoardViewModel;",
        "mViewModel$delegate",
        "Ld6/e;",
        "getMViewModel",
        "()Lcom/zykj/view/board/board/BoardViewModel;",
        "mViewModel",
        "Lcom/zykj/view/utils/ImagePicker;",
        "mImagePicker",
        "Lcom/zykj/view/utils/ImagePicker;",
        "Lkotlin/Function0;",
        "audioCallback",
        "Lr6/a;",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "kotlin.jvm.PlatformType",
        "audioPermissionRequest",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "isImageOutOfCount",
        "()Z",
        "Lcom/zykj/view/board/board/SimpleUIState;",
        "value",
        "getUiState",
        "()Lcom/zykj/view/board/board/SimpleUIState;",
        "setUiState",
        "(Lcom/zykj/view/board/board/SimpleUIState;)V",
        "uiState",
        "getPath",
        "()Ljava/lang/String;",
        "Companion",
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
        "SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,1030:1\n1#2:1031\n1321#3,2:1032\n1332#3,3:1034\n1332#3,3:1037\n1332#3,3:1040\n1332#3,3:1043\n29#4:1046\n85#4,18:1047\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n*L\n378#1:1032,2\n391#1:1034,3\n398#1:1037,3\n415#1:1040,3\n466#1:1043,3\n781#1:1046\n781#1:1047,18\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/view/board/board/BoardFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private audioCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final audioPermissionRequest:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

.field private final mImagePicker:Lcom/zykj/view/utils/ImagePicker;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mViewModel$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/board/board/BoardFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/view/board/board/BoardFragment;->Companion:Lcom/zykj/view/board/board/BoardFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/k;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroidx/lifecycle/k;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mViewModel$delegate:Ld6/e;

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/view/utils/ImagePicker;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mImagePicker:Lcom/zykj/view/utils/ImagePicker;

    .line 25
    .line 26
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 27
    .line 28
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lcom/zykj/view/board/board/g;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lcom/zykj/view/board/board/g;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "registerForActivityResult(...)"

    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->audioPermissionRequest:Landroidx/activity/result/ActivityResultLauncher;

    .line 46
    .line 47
    return-void
.end method

.method public static synthetic A(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$11(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic B(Lcom/zykj/view/board/board/BoardFragment;I)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initPenClickListener$lambda$31(Lcom/zykj/view/board/board/BoardFragment;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initPenClickListener$lambda$28$lambda$27(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic D(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$59$lambda$57(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic E(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$18$lambda$17(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$59$lambda$50(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic G(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initSelectListener$lambda$20(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic H(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$35(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->loadSketchData$lambda$5(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$59$lambda$50$lambda$49(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->audioPermissionRequest$lambda$1(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic L(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initBackgroundClickListener$lambda$45$lambda$44(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic M(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$14(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic N(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initProgressBarTouchListener$lambda$66(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$59$lambda$53(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic P(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$8(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Q(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$39$lambda$38(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initProgressBarTouchListener$lambda$68(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initBasicData$lambda$6(Lcom/zykj/view/board/board/BoardFragment;)V

    return-void
.end method

.method public static synthetic T(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$37(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic U(Ljava/io/File;Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->startGallery$lambda$73$lambda$72(Ljava/io/File;Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initPenClickListener$lambda$26$lambda$25(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic W(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$41(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$35$lambda$34(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$62$lambda$61(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Z(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$13(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initEraserClickListener$lambda$33$lambda$32(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMImagePicker$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/utils/ImagePicker;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->mImagePicker:Lcom/zykj/view/utils/ImagePicker;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMViewModel(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/board/board/BoardViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setBoardSketchConfig(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/board/board/BoardSketchConfig;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->setBoardSketchConfig(Lcom/zykj/view/board/board/BoardSketchConfig;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$startToolAnimate(Lcom/zykj/view/board/board/BoardFragment;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->startToolAnimate(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic addBitmap$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    const-string p3, ""

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 19
    .line 20
    if-eqz p7, :cond_3

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 24
    .line 25
    if-eqz p6, :cond_4

    .line 26
    .line 27
    move-object p5, v0

    .line 28
    :cond_4
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/view/board/board/BoardFragment;->addBitmap(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic addBitmapList$default(Lcom/zykj/view/board/board/BoardFragment;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->addBitmapList(Ljava/util/List;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic addBitmapMaxHeight$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/board/board/BoardFragment;->addBitmapMaxHeight(Landroid/graphics/Bitmap;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic addFullBitmap$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/board/board/BoardFragment;->addFullBitmap(Landroid/graphics/Bitmap;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final audioPermissionRequest$lambda$1(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->audioCallback:Lr6/a;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->audioCallback:Lr6/a;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic b0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initPenClickListener$lambda$30$lambda$29(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic c0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$18(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initSelectListener$lambda$22(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initProgressBarTouchListener$lambda$69(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$48(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f()Lcom/zykj/view/board/board/BoardViewModel;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/BoardFragment;->mViewModel_delegate$lambda$0()Lcom/zykj/view/board/board/BoardViewModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f0(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initProgressBarTouchListener$lambda$64(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$40(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$16(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method private final getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mViewModel$delegate:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/BoardViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getPath()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

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
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method public static synthetic getSavePath$default(Lcom/zykj/view/board/board/BoardFragment;ZZLr6/e;Lr6/e;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 7
    .line 8
    if-eqz p6, :cond_1

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 12
    .line 13
    if-eqz p5, :cond_2

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardFragment;->getSavePath(ZZLr6/e;Lr6/e;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic h(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->startCapture$lambda$75(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$7(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$39(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initSelectListener$lambda$23(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method private final initBackgroundClickListener()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;->rgBackgroundColor:Landroid/widget/RadioGroup;

    .line 9
    .line 10
    const-string v2, "rgBackgroundColor"

    .line 11
    .line 12
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lz6/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lz6/h;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    add-int/lit8 v4, v2, 0x1

    .line 35
    .line 36
    if-ltz v2, :cond_0

    .line 37
    .line 38
    check-cast v3, Landroid/view/View;

    .line 39
    .line 40
    new-instance v5, Lcom/zykj/view/board/board/c;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-direct {v5, p0, v2, v6}, Lcom/zykj/view/board/board/c;-><init>(Lcom/zykj/view/board/board/BoardFragment;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    move v2, v4

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    return-void

    .line 56
    :cond_2
    const-string v0, "mBinding"

    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method private static final initBackgroundClickListener$lambda$45$lambda$44(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateBackgroundLevel(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final initBasicData()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 6
    .line 7
    new-instance v1, Lcom/zykj/view/board/board/i;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/zykj/view/board/board/i;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$initBasicData$2;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/zykj/view/board/board/BoardFragment$initBasicData$2;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->setTextEditView(Lcom/zykj/blackboard/proxy/TextEditView;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$initBasicData$3;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lcom/zykj/view/board/board/BoardFragment$initBasicData$3;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->setImageCropView(Lcom/zykj/blackboard/proxy/ImageCropView;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->setCustomColorView(Lcom/zykj/blackboard/proxy/CustomColorView;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    const-string v0, "mBinding"

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    throw v0
.end method

.method private static final initBasicData$lambda$6(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "mBinding"

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-float p0, p0

    .line 30
    invoke-virtual {v0, v1, p0}, Lcom/zykj/view/board/board/BoardViewModel;->initZoomPointF(FF)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v2

    .line 38
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v2
.end method

.method private final initClickListener()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initSelectListener()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initPenClickListener()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initEraserClickListener()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initBackgroundClickListener()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initProgressBarTouchListener()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initDismissCustomColorPaletteOnSketchTouch()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final initDismissCustomColorPaletteOnSketchTouch()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flSketchBoardTouch:Lcom/zykj/view/widget/SketchBoardTouchFrameLayout;

    .line 6
    .line 7
    new-instance v1, Lcom/zykj/view/board/board/f;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/view/widget/SketchBoardTouchFrameLayout;->setOnBeforeTouchDispatchToChildren(Lr6/a;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string v0, "mBinding"

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    throw v0
.end method

.method private static final initDismissCustomColorPaletteOnSketchTouch$lambda$63(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForCanvasTouch()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 9
    .line 10
    return-object p0
.end method

.method private final initEraserClickListener()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;->rgEraserSize:Landroid/widget/RadioGroup;

    .line 9
    .line 10
    const-string v2, "rgEraserSize"

    .line 11
    .line 12
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lz6/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lz6/h;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    add-int/lit8 v4, v2, 0x1

    .line 35
    .line 36
    if-ltz v2, :cond_0

    .line 37
    .line 38
    check-cast v3, Landroid/view/View;

    .line 39
    .line 40
    new-instance v5, Lcom/zykj/view/board/board/c;

    .line 41
    .line 42
    const/4 v6, 0x2

    .line 43
    invoke-direct {v5, p0, v2, v6}, Lcom/zykj/view/board/board/c;-><init>(Lcom/zykj/view/board/board/BoardFragment;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    move v2, v4

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    return-void

    .line 56
    :cond_2
    const-string v0, "mBinding"

    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method private static final initEraserClickListener$lambda$33$lambda$32(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateEraserSizeLevel(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final initExtraClickListener()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->ivBack:Landroidx/appcompat/widget/AppCompatImageView;

    .line 9
    .line 10
    new-instance v3, Lcom/zykj/view/board/board/b;

    .line 11
    .line 12
    const/4 v4, 0x7

    .line 13
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->ivExpansion:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    new-instance v3, Lcom/zykj/view/board/board/b;

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 40
    .line 41
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->ivRecord:Landroidx/appcompat/widget/AppCompatImageView;

    .line 42
    .line 43
    const-string v4, "ivRecord"

    .line 44
    .line 45
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v6, Lcom/zykj/view/board/board/b;

    .line 49
    .line 50
    const/16 v4, 0x9

    .line 51
    .line 52
    invoke-direct {v6, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 53
    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    const/4 v8, 0x0

    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->ivAudio:Landroid/widget/ImageView;

    .line 63
    .line 64
    new-instance v4, Lcom/zykj/view/board/board/b;

    .line 65
    .line 66
    const/16 v5, 0xa

    .line 67
    .line 68
    invoke-direct {v4, p0, v5}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->llCrop:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 75
    .line 76
    new-instance v4, Lcom/zykj/view/board/board/d;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-direct {v4, p0, v0, v5}, Lcom/zykj/view/board/board/d;-><init>(Lcom/zykj/view/board/board/BoardFragment;Landroidx/databinding/ViewDataBinding;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->llPreview:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 86
    .line 87
    new-instance v4, Lcom/zykj/view/board/board/d;

    .line 88
    .line 89
    const/4 v5, 0x1

    .line 90
    invoke-direct {v4, p0, v0, v5}, Lcom/zykj/view/board/board/d;-><init>(Lcom/zykj/view/board/board/BoardFragment;Landroidx/databinding/ViewDataBinding;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    .line 95
    .line 96
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->llUpload:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 97
    .line 98
    new-instance v4, Lcom/zykj/view/board/board/d;

    .line 99
    .line 100
    const/4 v5, 0x2

    .line 101
    invoke-direct {v4, p0, v0, v5}, Lcom/zykj/view/board/board/d;-><init>(Lcom/zykj/view/board/board/BoardFragment;Landroidx/databinding/ViewDataBinding;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->llDeleteDraft:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 108
    .line 109
    new-instance v3, Lcom/zykj/view/board/board/b;

    .line 110
    .line 111
    const/16 v4, 0xb

    .line 112
    .line 113
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 120
    .line 121
    if-eqz v0, :cond_0

    .line 122
    .line 123
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 124
    .line 125
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;->tvCommit:Landroid/widget/TextView;

    .line 126
    .line 127
    new-instance v2, Lcom/zykj/view/board/board/d;

    .line 128
    .line 129
    const/4 v3, 0x3

    .line 130
    invoke-direct {v2, p0, v0, v3}, Lcom/zykj/view/board/board/d;-><init>(Lcom/zykj/view/board/board/BoardFragment;Landroidx/databinding/ViewDataBinding;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v1

    .line 149
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1
.end method

.method private static final initExtraClickListener$lambda$47(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnBackClick()Lr6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private static final initExtraClickListener$lambda$48(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->handleExpandClick()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final initExtraClickListener$lambda$59$lambda$50(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/view/board/board/f;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-direct {p1, p0, v0}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->audioCallback:Lr6/a;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->audioPermissionRequest:Landroidx/activity/result/ActivityResultLauncher;

    .line 10
    .line 11
    const-string p1, "android.permission.RECORD_AUDIO"

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final initExtraClickListener$lambda$59$lambda$50$lambda$49(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->switchRecordState()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final initExtraClickListener$lambda$59$lambda$51(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v1, p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateMicroPhone$default(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final initExtraClickListener$lambda$59$lambda$53(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnCropClick()Lr6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->llCrop:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v5, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    invoke-direct {v5, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;-><init>(Lr6/c;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lh6/c;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$2;

    .line 34
    .line 35
    invoke-direct {v6, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$2;-><init>(Lr6/c;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lh6/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->getSavePath$default(Lcom/zykj/view/board/board/BoardViewModel;ZZLr6/e;Lr6/e;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method private static final initExtraClickListener$lambda$59$lambda$55(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnPreviewClick()Lr6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->llPreview:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v5, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$1;

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    invoke-direct {v5, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$1;-><init>(Lr6/c;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lh6/c;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;

    .line 34
    .line 35
    invoke-direct {v6, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;-><init>(Lr6/c;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lh6/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->getSavePath$default(Lcom/zykj/view/board/board/BoardViewModel;ZZLr6/e;Lr6/e;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method private static final initExtraClickListener$lambda$59$lambda$57(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnCommitClick()Lr6/e;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$1;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p1, p2, v1}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$1;-><init>(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lr6/e;Lh6/c;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x3

    .line 28
    invoke-static {p0, v1, v1, v0, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private static final initExtraClickListener$lambda$59$lambda$58(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->dropDraftCache()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final initExtraClickListener$lambda$62$lambda$61(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnCommitClick()Lr6/e;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p1, p2, v1}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;-><init>(Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lr6/e;Lh6/c;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x3

    .line 28
    invoke-static {p0, v1, v1, v0, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private final initGraphClickListener()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivImageGallery:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    const-string v2, "ivImageGallery"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v4, Lcom/zykj/view/board/board/b;

    .line 15
    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    invoke-direct {v4, p0, v2}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v7, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivImageCamera:Landroidx/appcompat/widget/AppCompatImageView;

    .line 29
    .line 30
    const-string v1, "ivImageCamera"

    .line 31
    .line 32
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v10, Lcom/zykj/view/board/board/b;

    .line 36
    .line 37
    const/16 v1, 0xe

    .line 38
    .line 39
    invoke-direct {v10, p0, v1}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 40
    .line 41
    .line 42
    const/4 v11, 0x1

    .line 43
    const/4 v12, 0x0

    .line 44
    const-wide/16 v8, 0x0

    .line 45
    .line 46
    invoke-static/range {v7 .. v12}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivText:Landroidx/appcompat/widget/AppCompatImageView;

    .line 50
    .line 51
    const-string v2, "ivText"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lcom/zykj/view/board/board/b;

    .line 57
    .line 58
    const/16 v2, 0xf

    .line 59
    .line 60
    invoke-direct {v4, p0, v2}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 61
    .line 62
    .line 63
    const-wide/16 v2, 0x0

    .line 64
    .line 65
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivRectangle:Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 71
    .line 72
    const/16 v3, 0x10

    .line 73
    .line 74
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivOval:Landroidx/appcompat/widget/AppCompatImageView;

    .line 81
    .line 82
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 83
    .line 84
    const/16 v3, 0x11

    .line 85
    .line 86
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivTriangle:Landroid/widget/ImageView;

    .line 93
    .line 94
    new-instance v1, Lcom/zykj/view/board/board/b;

    .line 95
    .line 96
    const/16 v2, 0x12

    .line 97
    .line 98
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_0
    const-string v0, "mBinding"

    .line 106
    .line 107
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    throw v0
.end method

.method private static final initGraphClickListener$lambda$43$lambda$35(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnGalleryClick()Lr6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/view/board/board/f;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->startGallery()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static final initGraphClickListener$lambda$43$lambda$35$lambda$34(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->startGallery()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final initGraphClickListener$lambda$43$lambda$37(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnCameraClick()Lr6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/view/board/board/f;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->startCapture()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static final initGraphClickListener$lambda$43$lambda$37$lambda$36(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->startCapture()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final initGraphClickListener$lambda$43$lambda$39(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string p1, "requireContext(...)"

    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v4, Lcom/zykj/view/board/board/a;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {v4, p0, p1}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x7

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static/range {v0 .. v6}, Lcom/zykj/view/board/board/DialogKt;->showTextEditDialog$default(Landroid/content/Context;Ljava/lang/String;Lr6/c;Lr6/a;Lr6/c;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final initGraphClickListener$lambda$43$lambda$39$lambda$38(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->addText(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 14
    .line 15
    return-object p0
.end method

.method private static final initGraphClickListener$lambda$43$lambda$40(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lcom/zykj/view/board/board/GraphType$Rectangle;->INSTANCE:Lcom/zykj/view/board/board/GraphType$Rectangle;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateGraphType(Lcom/zykj/view/board/board/GraphType;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final initGraphClickListener$lambda$43$lambda$41(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lcom/zykj/view/board/board/GraphType$Oval;->INSTANCE:Lcom/zykj/view/board/board/GraphType$Oval;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateGraphType(Lcom/zykj/view/board/board/GraphType;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final initGraphClickListener$lambda$43$lambda$42(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lcom/zykj/view/board/board/GraphType$Triangle;->INSTANCE:Lcom/zykj/view/board/board/GraphType$Triangle;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateGraphType(Lcom/zykj/view/board/board/GraphType;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final initMainClickListener()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivWithdraw:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 10
    .line 11
    const/16 v3, 0x18

    .line 12
    .line 13
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivRecover:Landroidx/appcompat/widget/AppCompatImageView;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 22
    .line 23
    const/16 v3, 0x1a

    .line 24
    .line 25
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivSelect:Landroidx/appcompat/widget/AppCompatImageView;

    .line 32
    .line 33
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 34
    .line 35
    const/16 v3, 0x1b

    .line 36
    .line 37
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivTouch:Landroidx/appcompat/widget/AppCompatImageView;

    .line 44
    .line 45
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivEnlarge:Landroidx/appcompat/widget/AppCompatImageView;

    .line 55
    .line 56
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivReduce:Landroidx/appcompat/widget/AppCompatImageView;

    .line 66
    .line 67
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 68
    .line 69
    const/4 v3, 0x2

    .line 70
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivPen:Landroidx/appcompat/widget/AppCompatImageView;

    .line 77
    .line 78
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 79
    .line 80
    const/4 v3, 0x3

    .line 81
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivEraser:Landroidx/appcompat/widget/AppCompatImageView;

    .line 88
    .line 89
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 90
    .line 91
    const/4 v3, 0x4

    .line 92
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivImageAdd:Landroidx/appcompat/widget/AppCompatImageView;

    .line 99
    .line 100
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 101
    .line 102
    const/4 v3, 0x5

    .line 103
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivBackgroundColor:Landroidx/appcompat/widget/AppCompatImageView;

    .line 110
    .line 111
    new-instance v2, Lcom/zykj/view/board/board/b;

    .line 112
    .line 113
    const/4 v3, 0x6

    .line 114
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivDelete:Landroidx/appcompat/widget/AppCompatImageView;

    .line 121
    .line 122
    new-instance v1, Lcom/zykj/view/board/board/b;

    .line 123
    .line 124
    const/16 v2, 0x19

    .line 125
    .line 126
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_0
    const-string v0, "mBinding"

    .line 134
    .line 135
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    throw v0
.end method

.method private static final initMainClickListener$lambda$19$lambda$10(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x1

    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, v1, p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateTouchable$default(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$11(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateZoomLevel(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$12(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateZoomLevel(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$13(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lcom/zykj/view/board/board/MainToolType$Pen;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Pen;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateModeType(Lcom/zykj/view/board/board/MainToolType;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->switchPenTool()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$14(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lcom/zykj/view/board/board/MainToolType$Eraser;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Eraser;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateModeType(Lcom/zykj/view/board/board/MainToolType;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->switchEraserTool()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$15(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->switchGraphTool()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$16(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->switchBackgroundTool()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$18(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "requireContext(...)"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/zykj/view/board/board/f;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, Lcom/zykj/view/board/board/DialogKt;->showAskForCleanDialog(Landroid/content/Context;Lr6/a;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$18$lambda$17(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->cleanPage()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final initMainClickListener$lambda$19$lambda$7(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->startRevoke(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$8(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->startRevoke(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final initMainClickListener$lambda$19$lambda$9(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForToolbarClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->updateModeType(Lcom/zykj/view/board/board/MainToolType;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->switchSelectTool()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final initObserver()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    invoke-static {v0, v2, v2, v1, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final initPenClickListener()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenType:Landroid/widget/RadioGroup;

    .line 11
    .line 12
    const-string v3, "rgPenType"

    .line 13
    .line 14
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lz6/h;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lz6/h;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroid/view/View;

    .line 36
    .line 37
    new-instance v4, Lcom/zykj/view/board/board/b;

    .line 38
    .line 39
    const/16 v5, 0xd

    .line 40
    .line 41
    invoke-direct {v4, p0, v5}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 49
    .line 50
    if-eqz v0, :cond_7

    .line 51
    .line 52
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenSize:Landroid/widget/RadioGroup;

    .line 55
    .line 56
    const-string v3, "rgPenSize"

    .line 57
    .line 58
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lz6/h;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0}, Lz6/h;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v3, 0x0

    .line 70
    move v4, v3

    .line 71
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    add-int/lit8 v6, v4, 0x1

    .line 82
    .line 83
    if-ltz v4, :cond_1

    .line 84
    .line 85
    check-cast v5, Landroid/view/View;

    .line 86
    .line 87
    new-instance v7, Lcom/zykj/view/board/board/c;

    .line 88
    .line 89
    const/4 v8, 0x1

    .line 90
    invoke-direct {v7, p0, v4, v8}, Lcom/zykj/view/board/board/c;-><init>(Lcom/zykj/view/board/board/BoardFragment;II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    .line 95
    .line 96
    move v4, v6

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 103
    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 107
    .line 108
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenColor:Landroid/widget/RadioGroup;

    .line 109
    .line 110
    const-string v4, "rgPenColor"

    .line 111
    .line 112
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lz6/h;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Lz6/h;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    add-int/lit8 v5, v3, 0x1

    .line 134
    .line 135
    if-ltz v3, :cond_3

    .line 136
    .line 137
    check-cast v4, Landroid/view/View;

    .line 138
    .line 139
    new-instance v6, Lcom/zykj/view/board/board/c;

    .line 140
    .line 141
    const/4 v7, 0x3

    .line 142
    invoke-direct {v6, p0, v3, v7}, Lcom/zykj/view/board/board/c;-><init>(Lcom/zykj/view/board/board/BoardFragment;II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    move v3, v5

    .line 149
    goto :goto_2

    .line 150
    :cond_3
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 151
    .line 152
    .line 153
    throw v1

    .line 154
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 155
    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 159
    .line 160
    new-instance v1, Lcom/zykj/view/board/board/a;

    .line 161
    .line 162
    const/16 v2, 0x8

    .line 163
    .line 164
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->setOnColorChangeListener(Lr6/c;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v1

    .line 175
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v1

    .line 179
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v1

    .line 183
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v1
.end method

.method private static final initPenClickListener$lambda$26$lambda$25(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/zykj/view/R$id;->rb_pen_custom:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lcom/zykj/view/board/board/PenType$Custom;->INSTANCE:Lcom/zykj/view/board/board/PenType$Custom;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenType(Lcom/zykj/view/board/board/PenType;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget v0, Lcom/zykj/view/R$id;->rb_pen_line:I

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, Lcom/zykj/view/board/board/PenType$Line;->INSTANCE:Lcom/zykj/view/board/board/PenType$Line;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenType(Lcom/zykj/view/board/board/PenType;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget v0, Lcom/zykj/view/R$id;->rb_pen_dotted_line:I

    .line 34
    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object p1, Lcom/zykj/view/board/board/PenType$DottedLine;->INSTANCE:Lcom/zykj/view/board/board/PenType$DottedLine;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenType(Lcom/zykj/view/board/board/PenType;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    sget v0, Lcom/zykj/view/R$id;->rb_pen_cursor:I

    .line 48
    .line 49
    if-ne p1, v0, :cond_3

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object p1, Lcom/zykj/view/board/board/PenType$Cursor;->INSTANCE:Lcom/zykj/view/board/board/PenType$Cursor;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenType(Lcom/zykj/view/board/board/PenType;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    sget v0, Lcom/zykj/view/R$id;->rb_pen_highlighter:I

    .line 62
    .line 63
    if-ne p1, v0, :cond_4

    .line 64
    .line 65
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, Lcom/zykj/view/board/board/PenType$Highlighter;->INSTANCE:Lcom/zykj/view/board/board/PenType$Highlighter;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenType(Lcom/zykj/view/board/board/PenType;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method private static final initPenClickListener$lambda$28$lambda$27(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenSizeLevel(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final initPenClickListener$lambda$30$lambda$29(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenColorLevel(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final initPenClickListener$lambda$31(Lcom/zykj/view/board/board/BoardFragment;I)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updatePenCustomColor(I)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 9
    .line 10
    return-object p0
.end method

.method private final initProgressBarTouchListener()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    .line 9
    .line 10
    const-string v3, "sketchProgressVertical"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Lcom/zykj/view/board/board/f;

    .line 16
    .line 17
    const/4 v4, 0x5

    .line 18
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/view/board/board/a;

    .line 22
    .line 23
    const/4 v5, 0x4

    .line 24
    invoke-direct {v4, p0, v5}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 25
    .line 26
    .line 27
    new-instance v5, Lcom/zykj/view/board/board/a;

    .line 28
    .line 29
    const/4 v6, 0x5

    .line 30
    invoke-direct {v5, p0, v6}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v3, v4, v5}, Lcom/zykj/view/utils/ExtKt;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView;Lr6/a;Lr6/c;Lr6/c;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    .line 41
    .line 42
    const-string v1, "sketchProgressHorizontal"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lcom/zykj/view/board/board/f;

    .line 48
    .line 49
    const/4 v2, 0x6

    .line 50
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lcom/zykj/view/board/board/a;

    .line 54
    .line 55
    const/4 v3, 0x6

    .line 56
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Lcom/zykj/view/board/board/a;

    .line 60
    .line 61
    const/4 v4, 0x7

    .line 62
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/view/utils/ExtKt;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView;Lr6/a;Lr6/c;Lr6/c;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1
.end method

.method private static final initProgressBarTouchListener$lambda$64(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoveStart()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final initProgressBarTouchListener$lambda$65(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p0, v1, p1, v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoving$default(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final initProgressBarTouchListener$lambda$66(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p0, v1, p1, v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoveEnd$default(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final initProgressBarTouchListener$lambda$67(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoveStart()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final initProgressBarTouchListener$lambda$68(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {p0, p1, v0, v1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoving$default(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final initProgressBarTouchListener$lambda$69(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {p0, p1, v0, v1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->areaMoveEnd$default(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    return-object p0
.end method

.method private final initSelectListener()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->ivSelectPen:Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    .line 12
    new-instance v3, Lcom/zykj/view/board/board/b;

    .line 13
    .line 14
    const/16 v4, 0x13

    .line 15
    .line 16
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->ivSelectHighlighter:Landroidx/appcompat/widget/AppCompatImageView;

    .line 29
    .line 30
    new-instance v3, Lcom/zykj/view/board/board/b;

    .line 31
    .line 32
    const/16 v4, 0x14

    .line 33
    .line 34
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->ivSelectImage:Landroidx/appcompat/widget/AppCompatImageView;

    .line 47
    .line 48
    new-instance v3, Lcom/zykj/view/board/board/b;

    .line 49
    .line 50
    const/16 v4, 0x15

    .line 51
    .line 52
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->ivSelectText:Landroidx/appcompat/widget/AppCompatImageView;

    .line 65
    .line 66
    new-instance v3, Lcom/zykj/view/board/board/b;

    .line 67
    .line 68
    const/16 v4, 0x16

    .line 69
    .line 70
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 77
    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->ivSelectGeometry:Landroidx/appcompat/widget/AppCompatImageView;

    .line 83
    .line 84
    new-instance v1, Lcom/zykj/view/board/board/b;

    .line 85
    .line 86
    const/16 v2, 0x17

    .line 87
    .line 88
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v1

    .line 99
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v1

    .line 107
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v1

    .line 111
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v1
.end method

.method private static final initSelectListener$lambda$20(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForSelectToolbarItemClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateSelectTypeByEnum(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final initSelectListener$lambda$21(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForSelectToolbarItemClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE_HIGHLIGHTER:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateSelectTypeByEnum(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final initSelectListener$lambda$22(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForSelectToolbarItemClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Lcom/zykj/blackboard/enums/SelectGraphEnum;->IMAGE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateSelectTypeByEnum(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final initSelectListener$lambda$23(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForSelectToolbarItemClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Lcom/zykj/blackboard/enums/SelectGraphEnum;->TEXT:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateSelectTypeByEnum(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final initSelectListener$lambda$24(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->dismissPanelsForSelectToolbarItemClick()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Lcom/zykj/blackboard/enums/SelectGraphEnum;->GEOMETRY:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateSelectTypeByEnum(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final initView()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initBasicData()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initClickListener()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initObserver()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->loadSketchData()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic j(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$59$lambda$51(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardFragment;->loadSketchData$lambda$4(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$12(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initSelectListener$lambda$21(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method private final loadSketchData()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getNeedLoading()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->showProgress()V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getPath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    new-instance v0, Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 68
    .line 69
    const-string v1, "unknown board path"

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    :goto_1
    const-string v1, "\u9875\u9762BoardFragment\uff0c\u5f00\u59cb\u52a0\u8f7d\u753b\u677f\u6570\u636e\uff0c\u753b\u677f\u8def\u5f84"

    .line 76
    .line 77
    invoke-static {v1, v0}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 93
    .line 94
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance v2, Lcom/zykj/view/board/board/h;

    .line 98
    .line 99
    invoke-direct {v2, p0}, Lcom/zykj/view/board/board/h;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 100
    .line 101
    .line 102
    new-instance v3, Lcom/zykj/view/board/board/a;

    .line 103
    .line 104
    const/4 v4, 0x3

    .line 105
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v0, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->ready(Ljava/lang/String;Lr6/f;Lr6/c;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    const-string v0, "mBinding"

    .line 113
    .line 114
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const/4 v0, 0x0

    .line 118
    throw v0
.end method

.method private static final loadSketchData$lambda$4(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;
    .locals 2

    .line 1
    const-string v0, "iBoardControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "\u9875\u9762BoardFragment\uff0c\u753b\u677f\u6570\u636e\u52a0\u8f7d\u6210\u529f\uff0c\u662f\u5426\u7f13\u5b58"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "\uff0c\u52a0\u8f7d\u8017\u65f6\u4e3a"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardViewModel;->initBoardControl(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->hideProgress()V

    .line 43
    .line 44
    .line 45
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 46
    .line 47
    return-object p0
.end method

.method private static final loadSketchData$lambda$5(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Throwable;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "\u9875\u9762BoardFragment\uff0c\u753b\u677f\u6570\u636e\u52a0\u8f7d\u5931\u8d25\uff0cmessage: "

    .line 11
    .line 12
    invoke-static {v0, p1}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->hideProgress()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnLoadFailed()Lr6/a;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 46
    .line 47
    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initProgressBarTouchListener$lambda$65(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final mViewModel_delegate$lambda$0()Lcom/zykj/view/board/board/BoardViewModel;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic n(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$42(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initDismissCustomColorPaletteOnSketchTouch$lambda$63(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$47(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Ljava/io/File;Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->startCapture$lambda$75$lambda$74(Ljava/io/File;Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$15(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$10(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method private final setBoardSketchConfig(Lcom/zykj/view/board/board/BoardSketchConfig;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initSketchConfig(Lcom/zykj/view/board/board/BoardSketchConfig;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final startCapture()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->isImageOutOfCount()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v0, v0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardFragment;->mImagePicker:Lcom/zykj/view/utils/ImagePicker;

    .line 21
    .line 22
    new-instance v5, Lcom/zykj/view/board/board/a;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {v5, p0, v0}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 26
    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-static/range {v2 .. v7}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera$default(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private static final startCapture$lambda$75(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;
    .locals 9

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->s(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance v6, Lcom/zykj/view/board/board/e;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v6, p1, v1}, Lcom/zykj/view/board/board/e;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    const/4 v7, 0x5

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v8}, Lcom/zykj/view/board/board/BoardFragment;->addBitmap$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method private static final startCapture$lambda$75$lambda$74(Ljava/io/File;Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method private final startGallery()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->isImageOutOfCount()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v0, v0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mImagePicker:Lcom/zykj/view/utils/ImagePicker;

    .line 21
    .line 22
    new-instance v1, Lcom/zykj/view/board/board/a;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/board/a;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lcom/zykj/view/utils/ImagePicker;->startGallery(ZLr6/c;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static final startGallery$lambda$73(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;
    .locals 9

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->s(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance v6, Lcom/zykj/view/board/board/e;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v6, p1, v1}, Lcom/zykj/view/board/board/e;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    const/4 v7, 0x5

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v8}, Lcom/zykj/view/board/board/BoardFragment;->addBitmap$default(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method private static final startGallery$lambda$73$lambda$72(Ljava/io/File;Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method private final startToolAnimate(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->ivExpansion:Landroidx/appcompat/widget/AppCompatImageView;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 17
    .line 18
    .line 19
    const-wide/16 v4, 0x1f4

    .line 20
    .line 21
    invoke-virtual {v0, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 22
    .line 23
    .line 24
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$startToolAnimate$lambda$71$$inlined$doOnEnd$1;

    .line 25
    .line 26
    invoke-direct {v4, p0, p1}, Lcom/zykj/view/board/board/BoardFragment$startToolAnimate$lambda$71$$inlined$doOnEnd$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    iget-object v5, v5, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 40
    .line 41
    invoke-virtual {v5}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    int-to-float v5, v5

    .line 50
    neg-float v5, v5

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_1
    move v5, v4

    .line 57
    :goto_0
    if-eqz p1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 61
    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    int-to-float p1, p1

    .line 75
    neg-float v4, p1

    .line 76
    :goto_1
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const/4 v6, 0x2

    .line 87
    new-array v7, v6, [F

    .line 88
    .line 89
    aput v5, v7, v3

    .line 90
    .line 91
    const/4 v8, 0x1

    .line 92
    aput v4, v7, v8

    .line 93
    .line 94
    const-string v9, "translationX"

    .line 95
    .line 96
    invoke-static {p1, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object v7, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 105
    .line 106
    if-eqz v7, :cond_4

    .line 107
    .line 108
    iget-object v7, v7, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->toolPanel:Landroid/widget/FrameLayout;

    .line 109
    .line 110
    new-array v10, v6, [F

    .line 111
    .line 112
    aput v5, v10, v3

    .line 113
    .line 114
    aput v4, v10, v8

    .line 115
    .line 116
    invoke-static {v7, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {p1, v7}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object v7, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 125
    .line 126
    if-eqz v7, :cond_3

    .line 127
    .line 128
    iget-object v1, v7, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->ivExpansion:Landroidx/appcompat/widget/AppCompatImageView;

    .line 129
    .line 130
    new-array v2, v6, [F

    .line 131
    .line 132
    aput v5, v2, v3

    .line 133
    .line 134
    aput v4, v2, v8

    .line 135
    .line 136
    invoke-static {v1, v9, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {p1, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v1

    .line 155
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v1

    .line 163
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v1
.end method

.method public static synthetic t(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initMainClickListener$lambda$19$lambda$9(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->startGallery$lambda$73(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initSelectListener$lambda$24(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic w(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$59$lambda$58(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic x(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->initExtraClickListener$lambda$59$lambda$55(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initProgressBarTouchListener$lambda$67(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->initGraphClickListener$lambda$43$lambda$37$lambda$36(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addBitmap(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;)V
    .locals 10
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "filename"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v8, 0x4

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v2, p1

    .line 14
    move-object v3, p2

    .line 15
    move-object v6, p3

    .line 16
    move v5, p4

    .line 17
    move-object v7, p5

    .line 18
    invoke-static/range {v1 .. v9}, Lcom/zykj/view/board/board/BoardViewModel;->addImageGraph$default(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final addBitmapList(Ljava/util/List;Z)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    const-string v0, "pathList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->addBitmapList(Ljava/util/List;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final addBitmapMaxHeight(Landroid/graphics/Bitmap;Ljava/lang/String;Z)V
    .locals 9
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v3, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->MODE_MATRIX_HEIGHT:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 6
    .line 7
    const/16 v7, 0x30

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move v4, p3

    .line 15
    invoke-static/range {v0 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->addImageGraph$default(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final addFullBitmap(Landroid/graphics/Bitmap;Ljava/lang/String;Z)V
    .locals 9
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v3, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->MODE_MIN_VALUE:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 6
    .line 7
    const/16 v7, 0x30

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move v4, p3

    .line 15
    invoke-static/range {v0 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->addImageGraph$default(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final cleanBoardCache()V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData(Ljava/lang/String;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final getPathListByImageGraph()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getPathListByImageGraph()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getRecordingImagePathList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getRecordingImagePathList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getSavePath(ZZLr6/e;Lr6/e;)V
    .locals 3
    .param p3    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lr6/e;",
            "Lr6/e;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$getSavePath$1;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p3, p4, v2}, Lcom/zykj/view/board/board/BoardFragment$getSavePath$1;-><init>(Lr6/e;Lr6/e;Lh6/c;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, v1, p4}, Lcom/zykj/view/board/board/BoardViewModel;->getSavePath(ZZLr6/e;Lr6/e;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final getUiState()Lcom/zykj/view/board/board/SimpleUIState;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/SimpleUIState;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/zykj/view/board/board/BoardViewModel;->getMainToolState()Lkotlinx/coroutines/flow/m0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/zykj/view/board/board/MainToolState;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/zykj/view/board/board/MainToolState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewModel;->getExtraUIState()Lkotlinx/coroutines/flow/m0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/view/board/board/ExtraUIState;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Lcom/zykj/view/board/board/BoardViewModel;->getExpandState()Lkotlinx/coroutines/flow/m0;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/zykj/view/board/board/ExpandState;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/zykj/view/board/board/ExpandState;->getExpandStatus()Lcom/zykj/view/board/board/ExpandStatus;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/view/board/board/SimpleUIState;-><init>(Lcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ExpandStatus;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final hideProgress()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->loadingLayout:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "mBinding"

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    throw v0
.end method

.method public final isImageOutOfCount()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->isImageOutOfCount()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "getRoot(...)"

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public onDestroyView()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->hideProgress()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initView()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final resetRevoke()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->resetRevoke()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setBoardCallbackConfig(Lcom/zykj/view/board/board/BoardCallbackConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/view/board/board/BoardCallbackConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardCallbackConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->initCallbackConfig(Lcom/zykj/view/board/board/BoardCallbackConfig;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setBoardViewConfig(Lcom/zykj/view/board/board/BoardViewConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/view/board/board/BoardViewConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardViewConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateUIByViewConfig(Lcom/zykj/view/board/board/BoardViewConfig;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setUiState(Lcom/zykj/view/board/board/SimpleUIState;)V
    .locals 2
    .param p1    # Lcom/zykj/view/board/board/SimpleUIState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/view/board/board/SimpleUIState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->updateModeType(Lcom/zykj/view/board/board/MainToolType;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Lcom/zykj/view/board/board/SimpleUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->updateMinorToolType(Lcom/zykj/view/board/board/MinorToolType;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->getMViewModel()Lcom/zykj/view/board/board/BoardViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1}, Lcom/zykj/view/board/board/SimpleUIState;->getExpandStatus()Lcom/zykj/view/board/board/ExpandStatus;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v1, Lcom/zykj/view/board/board/ExpandStatus$Expanded;->INSTANCE:Lcom/zykj/view/board/board/ExpandStatus$Expanded;

    .line 37
    .line 38
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->updateExpandState(Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final showProgress()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->loadingLayout:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "mBinding"

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method
