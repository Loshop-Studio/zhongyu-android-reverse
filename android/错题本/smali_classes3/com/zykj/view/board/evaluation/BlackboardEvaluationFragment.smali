# RE note 本类字节码直接引用的读写或显示接口包括偏好设置、文件流、位图。
.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u0095\u00012\u00020\u0001:\u0002\u0095\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J9\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008\"\u0010#J#\u0010\'\u001a\u00020\u00062\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0006\u0018\u00010$\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001b\u00a2\u0006\u0004\u0008*\u0010+J!\u0010/\u001a\u00020\u00062\u0008\u0008\u0002\u0010-\u001a\u00020,2\u0008\u0008\u0002\u0010.\u001a\u00020\u0019\u00a2\u0006\u0004\u0008/\u00100J\r\u00101\u001a\u00020\u0006\u00a2\u0006\u0004\u00081\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00082\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00083\u0010\u0003J\u000f\u00104\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00084\u0010\u0003J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u00086\u00107J\u000f\u00108\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u00088\u0010\u0003J\u000f\u00109\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00089\u0010\u0003J\u000f\u0010:\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008:\u0010\u0003J!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020,H\u0002\u00a2\u0006\u0004\u0008?\u0010@J\u000f\u0010A\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008A\u0010\u0003J\u000f\u0010B\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008B\u0010\u0003J\u000f\u0010C\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008C\u0010\u0003J\u0017\u0010D\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008D\u0010#J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008E\u0010FJ\u000f\u0010G\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008G\u0010\u0003J\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008I\u00107J\u000f\u0010J\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008J\u0010\u0003J\u000f\u0010K\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008K\u0010\u0003J\u001f\u0010O\u001a\u00020\u00062\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020LH\u0002\u00a2\u0006\u0004\u0008O\u0010PJ\u000f\u0010Q\u001a\u00020LH\u0002\u00a2\u0006\u0004\u0008Q\u0010RJ\u000f\u0010S\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008S\u0010TJ\u0017\u0010V\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008V\u0010WJ\u0017\u0010Z\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020XH\u0002\u00a2\u0006\u0004\u0008Z\u0010[J\u0017\u0010]\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008]\u0010WJ\u000f\u0010_\u001a\u00020^H\u0002\u00a2\u0006\u0004\u0008_\u0010`J\'\u0010c\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008c\u0010dJ\u0017\u0010e\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008e\u0010fJ\u0017\u0010i\u001a\u00020\u00062\u0006\u0010h\u001a\u00020gH\u0002\u00a2\u0006\u0004\u0008i\u0010jJ\u0017\u0010k\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008k\u0010fJ\u0017\u0010l\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008l\u0010WJ\u0017\u0010m\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008m\u0010nJ\u0017\u0010q\u001a\u00020\u00062\u0006\u0010p\u001a\u00020oH\u0002\u00a2\u0006\u0004\u0008q\u0010rJ\u0017\u0010t\u001a\u00020\u00062\u0006\u0010s\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008t\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u0019\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008h\u0010\u0082\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\'\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u008f\u0001R%\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0006\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008&\u0010\u0088\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001R\u0013\u0010\u0094\u0001\u001a\u00020\u00198F\u00a2\u0006\u0007\u001a\u0005\u0008\u0094\u0001\u0010\u001f\u00a8\u0006\u0096\u0001"
    }
    d2 = {
        "Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ld6/s;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "",
        "horizontalOffset",
        "verticalOffset",
        "minWidth",
        "minHeight",
        "",
        "isBoardAsWidth",
        "Landroid/graphics/Bitmap;",
        "getScreenshot",
        "(IIIIZ)Landroid/graphics/Bitmap;",
        "isPageNotEmpty",
        "()Z",
        "Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;",
        "config",
        "setConfig",
        "(Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;)V",
        "Lkotlin/Function1;",
        "",
        "pageSlideListener",
        "setOnPageSlideListener",
        "(Lr6/c;)V",
        "bitmap",
        "addImage",
        "(Landroid/graphics/Bitmap;)V",
        "",
        "tips",
        "isCancelable",
        "showProgress",
        "(Ljava/lang/String;Z)V",
        "hideProgress",
        "initData",
        "initView",
        "initTranslationConfig",
        "canDoEdit",
        "switchTouchMode",
        "(Z)V",
        "initClickListener",
        "initBlackboard",
        "initBoardConfig",
        "Landroid/content/Context;",
        "context",
        "sourcePath",
        "Ljava/io/File;",
        "createOpaqueCropTempFile",
        "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;",
        "initPageControl",
        "capture",
        "askForErase",
        "executeConfig",
        "setCurrentActionUI",
        "(Landroid/view/View;)V",
        "hideEvaluationPenColorPanel",
        "toggleColorPanel",
        "activatePenTool",
        "initEvaluationPenColorStrips",
        "alignEvaluationPenColorPanelToPen",
        "Landroid/widget/RadioGroup;",
        "source",
        "syncTarget",
        "attachPenColorListeners",
        "(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V",
        "penColorToolbarGroup",
        "()Landroid/widget/RadioGroup;",
        "penColorSlotCount",
        "()I",
        "slotIndex",
        "penColorIntAtToolbarSlot",
        "(I)I",
        "Landroid/content/SharedPreferences;",
        "prefs",
        "resolveSavedPenColorSlot",
        "(Landroid/content/SharedPreferences;)I",
        "color",
        "indexOfToolbarSlotMatchingColor",
        "Lcom/zykj/blackboard/proxy/CustomColorView;",
        "buildEvaluationSelectCustomColorView",
        "()Lcom/zykj/blackboard/proxy/CustomColorView;",
        "persist",
        "notifySdkSelectCallback",
        "applyEvaluationPenColorAtSlot",
        "(IZZ)V",
        "syncEvaluationPenColorFromEditedGraph",
        "(I)V",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "setSelectEditColorChangeListenerCompat",
        "(Lcom/zykj/blackboard/bean/BoardConfig;)V",
        "syncEvaluationPenRadiosAtSlot",
        "normalizeEvaluationPenColor",
        "isEvaluationAllowedPenColor",
        "(I)Z",
        "Landroid/view/MotionEvent;",
        "event",
        "handleDrag",
        "(Landroid/view/MotionEvent;)V",
        "y",
        "calculateTranslationY",
        "(F)V",
        "Lcom/zykj/view/utils/ImagePicker;",
        "imagePicker",
        "Lcom/zykj/view/utils/ImagePicker;",
        "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;",
        "mBinding",
        "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "boardControl",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "pageControl",
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "path",
        "Ljava/lang/String;",
        "fragmentConfig",
        "Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;",
        "evaluationSelectColorChangeCallback",
        "Lr6/c;",
        "suppressPenColorSync",
        "Z",
        "Landroid/graphics/Rect;",
        "dragRect",
        "Landroid/graphics/Rect;",
        "defaultTranslateTop",
        "F",
        "defaultTranslateBottom",
        "Landroid/app/ProgressDialog;",
        "mProgressDialog",
        "Landroid/app/ProgressDialog;",
        "isImageOutOfCount",
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
        "SMAP\nBlackboardEvaluationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1042:1\n311#2:1043\n327#2,4:1044\n312#2:1048\n311#2:1049\n327#2,4:1050\n312#2:1054\n257#2,2:1061\n257#2,2:1063\n278#2,2:1065\n257#2,2:1067\n257#2,2:1069\n257#2,2:1071\n257#2,2:1073\n257#2,2:1075\n257#2,2:1077\n257#2,2:1079\n255#2:1081\n257#2,2:1082\n83#3,6:1055\n1310#4,2:1084\n1#5:1086\n346#6,8:1087\n*S KotlinDebug\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n*L\n130#1:1043\n130#1:1044,4\n130#1:1048\n144#1:1049\n144#1:1050,4\n144#1:1054\n672#1:1061,2\n674#1:1063,2\n676#1:1065,2\n678#1:1067,2\n680#1:1069,2\n682#1:1071,2\n684#1:1073,2\n686#1:1075,2\n688#1:1077,2\n723#1:1079,2\n738#1:1081\n743#1:1082,2\n512#1:1055,6\n931#1:1084,2\n798#1:1087,8\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EVALUATION_SELECT_EDIT_COLOR_LIST:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final KEY_PEN_COLOR_ARGB_LEGACY:Ljava/lang/String; = "pen_color_argb"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final KEY_PEN_COLOR_SLOT:Ljava/lang/String; = "pen_color_slot_index"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final KEY_TEXT_COLOR_ARGB:Ljava/lang/String; = "text_color_argb"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PREF_EVALUATION_PEN:Ljava/lang/String; = "blackboard_evaluation_pen"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private defaultTranslateBottom:F

.field private defaultTranslateTop:F

.field private dragRect:Landroid/graphics/Rect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private evaluationSelectColorChangeCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final imagePicker:Lcom/zykj/view/utils/ImagePicker;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

.field private mProgressDialog:Landroid/app/ProgressDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pageSlideListener:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private path:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private suppressPenColorSync:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Companion:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$Companion;

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
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->EVALUATION_SELECT_EDIT_COLOR_LIST:Ljava/util/List;

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
    new-instance v0, Lcom/zykj/view/utils/ImagePicker;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->imagePicker:Lcom/zykj/view/utils/ImagePicker;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->dragRect:Landroid/graphics/Rect;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic A(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$20(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic B(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initBlackboard$lambda$32(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initBlackboard$lambda$33(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initTranslationConfig$lambda$6$lambda$5(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static synthetic E(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$17(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$22(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->capture$lambda$39(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$alignEvaluationPenColorPanelToPen$applyAlignment(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->alignEvaluationPenColorPanelToPen$applyAlignment(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$applyEvaluationPenColorAtSlot(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;IZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->applyEvaluationPenColorAtSlot(IZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$createOpaqueCropTempFile(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->createOpaqueCropTempFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getBoardConfig$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getEvaluationSelectColorChangeCallback$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lr6/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->evaluationSelectColorChangeCallback:Lr6/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getImagePicker$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/utils/ImagePicker;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->imagePicker:Lcom/zykj/view/utils/ImagePicker;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMBinding$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageSlideListener$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lr6/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageSlideListener:Lr6/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$indexOfToolbarSlotMatchingColor(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->indexOfToolbarSlotMatchingColor(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$isEvaluationAllowedPenColor(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->isEvaluationAllowedPenColor(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$normalizeEvaluationPenColor(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->normalizeEvaluationPenColor(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$setEvaluationSelectColorChangeCallback$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->evaluationSelectColorChangeCallback:Lr6/c;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setFragmentConfig$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$syncEvaluationPenColorFromEditedGraph(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->syncEvaluationPenColorFromEditedGraph(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$syncEvaluationPenRadiosAtSlot(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->syncEvaluationPenRadiosAtSlot(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final activatePenTool(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

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
    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine$default(Lcom/zykj/blackboard/bean/BoardConfig;ZFFILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, "mBinding"

    .line 22
    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivPen:Landroid/widget/ImageView;

    .line 26
    .line 27
    const-string v3, "ivPen"

    .line 28
    .line 29
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setCurrentActionUI(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_5

    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 38
    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorToolbar:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "getRoot(...)"

    .line 48
    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v1, 0x0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v0, v1

    .line 62
    :goto_0
    if-nez v0, :cond_2

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 69
    .line 70
    .line 71
    :cond_2
    if-nez v0, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/16 v1, 0x8

    .line 75
    .line 76
    :goto_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->alignEvaluationPenColorPanelToPen()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :cond_5
    return-void

    .line 90
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1
.end method

.method private static final addImage$lambda$41$lambda$40(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderRectF()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x2

    .line 34
    :goto_0
    const/4 v3, 0x1

    .line 35
    sub-int/2addr v2, v3

    .line 36
    mul-int/2addr v2, v0

    .line 37
    int-to-float v0, v2

    .line 38
    div-float/2addr p0, v0

    .line 39
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveStart()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v0, v1, v2, v3, v1}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->areaMoveEnd$default(Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iget-object p1, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageSlideListener:Lr6/c;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {p1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void

    .line 69
    :cond_4
    const-string p0, "mBinding"

    .line 70
    .line 71
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1
.end method

.method private final alignEvaluationPenColorPanelToPen()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorToolbar:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v3, "getRoot(...)"

    .line 15
    .line 16
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v1, v3, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->llEvaluationTools:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    const-string v2, "llEvaluationTools"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget v3, Lcom/zykj/view/R$dimen;->view_3:I

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;

    .line 45
    .line 46
    invoke-direct {v4, v0, v2, p0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$alignEvaluationPenColorPanelToPen$1;-><init>(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method private static final alignEvaluationPenColorPanelToPen$applyAlignment(Landroid/view/View;ILcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/LinearLayout;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget-object p2, p2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivPen:Landroid/widget/ImageView;

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    new-instance p2, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, p2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 21
    .line 22
    .line 23
    new-instance p3, Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 29
    .line 30
    .line 31
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    iget v1, p3, Landroid/graphics/Rect;->left:I

    .line 34
    .line 35
    sub-int/2addr v0, v1

    .line 36
    int-to-float v0, v0

    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 38
    .line 39
    .line 40
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 41
    .line 42
    add-int/2addr p2, p1

    .line 43
    iget p1, p3, Landroid/graphics/Rect;->top:I

    .line 44
    .line 45
    sub-int/2addr p2, p1

    .line 46
    int-to-float p1, p2

    .line 47
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const-string p0, "mBinding"

    .line 52
    .line 53
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0
.end method

# RE I/O 保存整数偏好（SharedPreferences$Editor.putInt）。
.method private final applyEvaluationPenColorAtSlot(IZZ)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorIntAtToolbarSlot(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintColor(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintColor(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    if-eqz p2, :cond_2

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorSlotCount()I

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
    invoke-static {p1, v1, p2}, Lkotlin/collections/u;->m(III)I

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
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->evaluationSelectColorChangeCallback:Lr6/c;

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
    invoke-interface {p1, p2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void
.end method

.method private final askForErase()V
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
    new-instance v2, Lcom/canhub/cropper/p;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v2, p0, v3}, Lcom/canhub/cropper/p;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget v1, Lcom/zykj/view/R$string;->cancel:I

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Lcom/zykj/view/board/board/q;

    .line 43
    .line 44
    invoke-direct {v2, v3}, Lcom/zykj/view/board/board/q;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method private static final askForErase$lambda$44$lambda$42(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-static {p0, p2, p1, p2}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->cleanPage$default(Lcom/zykj/blackboard/core/edit/IPageControl;Lcom/zykj/blackboard/core/graph/IGraph;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private static final askForErase$lambda$44$lambda$43(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final attachPenColorListeners(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/evaluation/f;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Lcom/zykj/view/board/evaluation/f;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final attachPenColorListeners$lambda$55(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;I)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->suppressPenColorSync:Z

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
    goto :goto_2

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
    invoke-static {v2, v1}, Lkotlin/collections/u;->N(II)Lx6/f;

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
    const/4 v5, 0x0

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    move-object v4, v1

    .line 31
    check-cast v4, Lkotlin/collections/c0;

    .line 32
    .line 33
    invoke-virtual {v4}, Lkotlin/collections/c0;->nextInt()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ltz v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {p2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ne v4, p3, :cond_1

    .line 48
    .line 49
    move v0, v3

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 55
    .line 56
    .line 57
    throw v5

    .line 58
    :cond_3
    :goto_1
    if-ltz v0, :cond_6

    .line 59
    .line 60
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorSlotCount()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-ge v0, p2, :cond_6

    .line 65
    .line 66
    const/4 p2, 0x1

    .line 67
    iput-boolean p2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->suppressPenColorSync:Z

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    instance-of v1, p3, Landroid/widget/RadioButton;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    move-object v5, p3

    .line 78
    check-cast v5, Landroid/widget/RadioButton;

    .line 79
    .line 80
    :cond_4
    if-eqz v5, :cond_5

    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    invoke-virtual {p1, p3}, Landroid/widget/RadioGroup;->check(I)V

    .line 87
    .line 88
    .line 89
    :cond_5
    iput-boolean v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->suppressPenColorSync:Z

    .line 90
    .line 91
    invoke-direct {p0, v0, p2, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->applyEvaluationPenColorAtSlot(IZZ)V

    .line 92
    .line 93
    .line 94
    :cond_6
    :goto_2
    return-void
.end method

.method private final buildEvaluationSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final calculateTranslationY(F)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "mBinding"

    .line 10
    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDrag:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->dragRect:Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    sub-float/2addr p1, v0

    .line 26
    iget v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->defaultTranslateTop:F

    .line 27
    .line 28
    iget v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->defaultTranslateBottom:F

    .line 29
    .line 30
    iget-object v4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getBottomOffset()F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v4, 0x0

    .line 40
    :goto_0
    sub-float/2addr v1, v4

    .line 41
    cmpg-float v4, p1, v0

    .line 42
    .line 43
    if-gez v4, :cond_1

    .line 44
    .line 45
    move p1, v0

    .line 46
    :cond_1
    cmpl-float v0, p1, v1

    .line 47
    .line 48
    if-lez v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v1, p1

    .line 52
    :goto_1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->viewRoot:Lcom/zykj/view/widget/TouchSwitchView;

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v2

    .line 66
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v2
.end method

.method private final capture()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getImageGraphCount()I

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
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getMaxImageCount()Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x3

    .line 28
    :goto_1
    if-lt v0, v2, :cond_2

    .line 29
    .line 30
    const-string v0, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 31
    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->imagePicker:Lcom/zykj/view/utils/ImagePicker;

    .line 39
    .line 40
    new-instance v5, Lcom/zykj/view/board/evaluation/e;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    invoke-direct {v5, p0, v0}, Lcom/zykj/view/board/evaluation/e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-static/range {v2 .. v7}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera$default(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private static final capture$lambda$39(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Ld6/s;
    .locals 4

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->s(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "getAbsolutePath(...)"

    .line 19
    .line 20
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v2}, Lcom/zykj/blackboard/core/edit/IPageControl;->addSpecialImage(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 37
    .line 38
    new-instance v2, Lcom/zykj/view/board/evaluation/a;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {v2, v1, p0, v3}, Lcom/zykj/view/board/evaluation/a;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    const-string p0, "mBinding"

    .line 49
    .line 50
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    throw p0

    .line 55
    :cond_2
    :goto_0
    return-object v0
.end method

.method private static final capture$lambda$39$lambda$38$lambda$37(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderRectF()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x2

    .line 34
    :goto_0
    const/4 v3, 0x1

    .line 35
    sub-int/2addr v2, v3

    .line 36
    mul-int/2addr v2, v0

    .line 37
    int-to-float v0, v2

    .line 38
    div-float/2addr p0, v0

    .line 39
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveStart()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v0, v1, v2, v3, v1}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->areaMoveEnd$default(Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iget-object p1, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageSlideListener:Lr6/c;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {p1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void

    .line 69
    :cond_4
    const-string p0, "mBinding"

    .line 70
    .line 71
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）、编码位图（Bitmap.compress）。
.method private final createOpaqueCropTempFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 5

    .line 1
    const-string v0, "eval_crop_opaque_"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 5
    .line 6
    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-lez v2, :cond_4

    .line 32
    .line 33
    if-gtz v3, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v3, Landroid/graphics/Canvas;

    .line 43
    .line 44
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, -0x1

    .line 48
    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {v3, p2, v4, v4, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    .line 56
    .line 57
    .line 58
    new-instance p2, Ljava/io/File;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v4, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, ".jpg"

    .line 77
    .line 78
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance p1, Ljava/io/FileOutputStream;

    .line 89
    .line 90
    invoke-direct {p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 94
    .line 95
    const/16 v3, 0x5c

    .line 96
    .line 97
    invoke-virtual {v2, v0, v3, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 98
    .line 99
    .line 100
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 105
    .line 106
    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    invoke-static {p2}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_3
    return-object p2

    .line 114
    :catchall_0
    move-exception p2

    .line 115
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    :try_start_4
    invoke-static {p1, p2}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :cond_4
    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 122
    .line 123
    .line 124
    :catch_0
    return-object v1
.end method

.method public static synthetic e()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$27$lambda$26()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method private final executeConfig(Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_14

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDottedLine:Landroid/widget/ImageView;

    .line 9
    .line 10
    const-string v3, "ivDottedLine"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedDottedLine()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0x8

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    move v3, v5

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v3, v4

    .line 27
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 31
    .line 32
    if-eqz v0, :cond_13

    .line 33
    .line 34
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivCamera:Landroid/widget/ImageView;

    .line 35
    .line 36
    const-string v3, "ivCamera"

    .line 37
    .line 38
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedCamera()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    move v3, v5

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v3, v4

    .line 50
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 54
    .line 55
    if-eqz v0, :cond_12

    .line 56
    .line 57
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDrag:Landroid/widget/ImageView;

    .line 58
    .line 59
    const-string v3, "ivDrag"

    .line 60
    .line 61
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getEnableMove()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    const/4 v3, 0x4

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v3, v5

    .line 73
    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 77
    .line 78
    if-eqz v0, :cond_11

    .line 79
    .line 80
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivWithdraw:Landroid/widget/ImageView;

    .line 81
    .line 82
    const-string v3, "ivWithdraw"

    .line 83
    .line 84
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedWithdraw()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    move v3, v5

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move v3, v4

    .line 96
    :goto_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 100
    .line 101
    if-eqz v0, :cond_10

    .line 102
    .line 103
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivRecover:Landroid/widget/ImageView;

    .line 104
    .line 105
    const-string v3, "ivRecover"

    .line 106
    .line 107
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedRecover()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_4

    .line 115
    .line 116
    move v3, v5

    .line 117
    goto :goto_4

    .line 118
    :cond_4
    move v3, v4

    .line 119
    :goto_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 123
    .line 124
    if-eqz v0, :cond_f

    .line 125
    .line 126
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivSelect:Landroid/widget/ImageView;

    .line 127
    .line 128
    const-string v3, "ivSelect"

    .line 129
    .line 130
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedSelect()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_5

    .line 138
    .line 139
    move v3, v5

    .line 140
    goto :goto_5

    .line 141
    :cond_5
    move v3, v4

    .line 142
    :goto_5
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 146
    .line 147
    if-eqz v0, :cond_e

    .line 148
    .line 149
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivText:Landroid/widget/ImageView;

    .line 150
    .line 151
    const-string v3, "ivText"

    .line 152
    .line 153
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedText()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_6

    .line 161
    .line 162
    move v3, v5

    .line 163
    goto :goto_6

    .line 164
    :cond_6
    move v3, v4

    .line 165
    :goto_6
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 169
    .line 170
    if-eqz v0, :cond_d

    .line 171
    .line 172
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivQuestion:Landroid/widget/ImageView;

    .line 173
    .line 174
    const-string v3, "ivQuestion"

    .line 175
    .line 176
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedQuestion()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_7

    .line 184
    .line 185
    move v3, v5

    .line 186
    goto :goto_7

    .line 187
    :cond_7
    move v3, v4

    .line 188
    :goto_7
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 192
    .line 193
    if-eqz v0, :cond_c

    .line 194
    .line 195
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivAnswer:Landroid/widget/ImageView;

    .line 196
    .line 197
    const-string v1, "ivAnswer"

    .line 198
    .line 199
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getNeedAnswer()Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_8

    .line 207
    .line 208
    move v4, v5

    .line 209
    :cond_8
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 210
    .line 211
    .line 212
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 213
    .line 214
    if-eqz v0, :cond_b

    .line 215
    .line 216
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getMaxVerticalTime()Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-eqz v1, :cond_9

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxHeightTimes(I)V

    .line 231
    .line 232
    .line 233
    :cond_9
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getMaxImageCount()Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    if-eqz v1, :cond_a

    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMaxImageSize(I)V

    .line 244
    .line 245
    .line 246
    :cond_a
    invoke-virtual {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getDefaultTextSize()F

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 251
    .line 252
    .line 253
    :cond_b
    return-void

    .line 254
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v1

    .line 258
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v1

    .line 262
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v1

    .line 266
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v1

    .line 270
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v1

    .line 274
    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v1

    .line 278
    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v1

    .line 282
    :cond_13
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v1

    .line 286
    :cond_14
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v1
.end method

.method public static synthetic f(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->capture$lambda$39$lambda$38$lambda$37(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$13(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic getScreenshot$default(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;IIIIZILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p5, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move v5, p5

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->getScreenshot(IIIIZ)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$28(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method private final handleDrag(Landroid/view/MotionEvent;)V
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
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->calculateTranslationY(F)V

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
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->calculateTranslationY(F)V

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
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->calculateTranslationY(F)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final hideEvaluationPenColorPanel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorToolbar:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v0, "mBinding"

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    throw v0
.end method

.method public static synthetic i(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initTranslationConfig$lambda$6(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method private final indexOfToolbarSlotMatchingColor(I)I
    .locals 7

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorToolbarGroup()Landroid/widget/RadioGroup;

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

.method private final initBlackboard()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->path:Ljava/lang/String;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->path:Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->switchTouchMode(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->path:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Landroidx/navigation/serialization/b;

    .line 60
    .line 61
    const/4 v3, 0x7

    .line 62
    invoke-direct {v2, p0, v3}, Landroidx/navigation/serialization/b;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lcom/zykj/view/board/evaluation/e;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->ready(Ljava/lang/String;Lr6/f;Lr6/c;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    const-string v0, "mBinding"

    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    throw v0
.end method

.method private static final initBlackboard$lambda$32(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;
    .locals 0

    .line 1
    const-string p2, "boardControl"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initBoardConfig()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initPageControl()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->executeConfig(Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->activatePenTool(Z)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->switchTouchMode(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->tvHint:Landroid/widget/TextView;

    .line 34
    .line 35
    const/16 p1, 0x8

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    const-string p0, "mBinding"

    .line 44
    .line 45
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    throw p0
.end method

.method private static final initBlackboard$lambda$33(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->switchTouchMode(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->tvHint:Landroid/widget/TextView;

    .line 23
    .line 24
    const/16 p1, 0x8

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const-string p0, "mBinding"

    .line 33
    .line 34
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

# RE I/O 读取整数偏好（SharedPreferences.getInt）。
.method private final initBoardConfig()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

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
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->resolveSavedPenColorSlot(Landroid/content/SharedPreferences;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-direct {p0, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorIntAtToolbarSlot(I)I

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
    iget-object v4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-static {}, Lcom/zykj/view/utils/SPDataKt;->getSpTouchable()Ljava/lang/Boolean;

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
    invoke-virtual {v4, v5}, Lcom/zykj/blackboard/bean/BoardConfig;->setFingerDraw(Z)V

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    iget-object v1, v5, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivTouch:Landroid/widget/ImageView;

    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x2

    .line 78
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMaxImageSize(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v6}, Lcom/zykj/blackboard/bean/BoardConfig;->setImageBackground(Z)V

    .line 82
    .line 83
    .line 84
    const/high16 v1, 0x40400000    # 3.0f

    .line 85
    .line 86
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintWidth(F)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintWidth(F)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v3}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintColor(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v3}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintColor(I)V

    .line 96
    .line 97
    .line 98
    sget-object v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->EVALUATION_SELECT_EDIT_COLOR_LIST:Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setSelectEditColorList(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->buildEvaluationSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setSelectCustomColorView(Lcom/zykj/blackboard/proxy/CustomColorView;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setSelectEditColorChangeListenerCompat(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 111
    .line 112
    .line 113
    const/4 v1, -0x1

    .line 114
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBackgroundColor(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, v6}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v6}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setVerticalTranslate(Z)V

    .line 125
    .line 126
    .line 127
    const/4 v3, 0x3

    .line 128
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxHeightTimes(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v6}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxWidthTimes(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x42880000    # 68.0f

    .line 138
    .line 139
    invoke-virtual {v4, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextMinSize(F)V

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x42b00000    # 88.0f

    .line 146
    .line 147
    invoke-virtual {v4, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextMaxSize(F)V

    .line 148
    .line 149
    .line 150
    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;

    .line 151
    .line 152
    invoke-direct {v0, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setImageCropView(Lcom/zykj/blackboard/proxy/ImageCropView;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_2
    const-string v0, "mBinding"

    .line 160
    .line 161
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :cond_3
    :goto_2
    invoke-direct {p0, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->syncEvaluationPenRadiosAtSlot(I)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method private final initClickListener()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivWithdraw:Landroid/widget/ImageView;

    .line 9
    .line 10
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 11
    .line 12
    const/16 v4, 0xb

    .line 13
    .line 14
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 21
    .line 22
    if-eqz v0, :cond_d

    .line 23
    .line 24
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivRecover:Landroid/widget/ImageView;

    .line 25
    .line 26
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 36
    .line 37
    if-eqz v0, :cond_c

    .line 38
    .line 39
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivSelect:Landroid/widget/ImageView;

    .line 40
    .line 41
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 51
    .line 52
    if-eqz v0, :cond_b

    .line 53
    .line 54
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivTouch:Landroid/widget/ImageView;

    .line 55
    .line 56
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 57
    .line 58
    const/4 v4, 0x4

    .line 59
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 66
    .line 67
    if-eqz v0, :cond_a

    .line 68
    .line 69
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivPen:Landroid/widget/ImageView;

    .line 70
    .line 71
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 72
    .line 73
    const/4 v4, 0x5

    .line 74
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 81
    .line 82
    if-eqz v0, :cond_9

    .line 83
    .line 84
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivLine:Landroid/widget/ImageView;

    .line 85
    .line 86
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 87
    .line 88
    const/4 v4, 0x6

    .line 89
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 96
    .line 97
    if-eqz v0, :cond_8

    .line 98
    .line 99
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDottedLine:Landroid/widget/ImageView;

    .line 100
    .line 101
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 102
    .line 103
    const/4 v4, 0x7

    .line 104
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 111
    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivEraser:Landroid/widget/ImageView;

    .line 115
    .line 116
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 117
    .line 118
    const/16 v4, 0x8

    .line 119
    .line 120
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 127
    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivCamera:Landroid/widget/ImageView;

    .line 131
    .line 132
    const-string v0, "ivCamera"

    .line 133
    .line 134
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v6, Lcom/zykj/view/board/evaluation/b;

    .line 138
    .line 139
    const/16 v0, 0x9

    .line 140
    .line 141
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 142
    .line 143
    .line 144
    const/4 v7, 0x1

    .line 145
    const/4 v8, 0x0

    .line 146
    const-wide/16 v4, 0x0

    .line 147
    .line 148
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 152
    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivQuestion:Landroid/widget/ImageView;

    .line 156
    .line 157
    const-string v0, "ivQuestion"

    .line 158
    .line 159
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    new-instance v6, Lcom/zykj/view/board/evaluation/b;

    .line 163
    .line 164
    const/16 v0, 0xa

    .line 165
    .line 166
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 167
    .line 168
    .line 169
    const/4 v7, 0x1

    .line 170
    const/4 v8, 0x0

    .line 171
    const-wide/16 v4, 0x0

    .line 172
    .line 173
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 177
    .line 178
    if-eqz v0, :cond_4

    .line 179
    .line 180
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivAnswer:Landroid/widget/ImageView;

    .line 181
    .line 182
    const-string v0, "ivAnswer"

    .line 183
    .line 184
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    new-instance v6, Lcom/zykj/view/board/evaluation/b;

    .line 188
    .line 189
    const/16 v0, 0xc

    .line 190
    .line 191
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 192
    .line 193
    .line 194
    const/4 v7, 0x1

    .line 195
    const/4 v8, 0x0

    .line 196
    const-wide/16 v4, 0x0

    .line 197
    .line 198
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 202
    .line 203
    if-eqz v0, :cond_3

    .line 204
    .line 205
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivText:Landroid/widget/ImageView;

    .line 206
    .line 207
    const-string v0, "ivText"

    .line 208
    .line 209
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    new-instance v6, Lcom/zykj/view/board/evaluation/b;

    .line 213
    .line 214
    const/16 v0, 0xd

    .line 215
    .line 216
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x1

    .line 220
    const/4 v8, 0x0

    .line 221
    const-wide/16 v4, 0x0

    .line 222
    .line 223
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 227
    .line 228
    if-eqz v0, :cond_2

    .line 229
    .line 230
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDelete:Landroid/widget/ImageView;

    .line 231
    .line 232
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 242
    .line 243
    if-eqz v0, :cond_1

    .line 244
    .line 245
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivEvaSubmit:Landroid/widget/ImageView;

    .line 246
    .line 247
    new-instance v3, Lcom/zykj/view/board/evaluation/b;

    .line 248
    .line 249
    const/4 v4, 0x1

    .line 250
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/evaluation/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    .line 255
    .line 256
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 257
    .line 258
    if-eqz v0, :cond_0

    .line 259
    .line 260
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDrag:Landroid/widget/ImageView;

    .line 261
    .line 262
    new-instance v1, Lcom/zykj/view/board/evaluation/c;

    .line 263
    .line 264
    invoke-direct {v1, p0}, Lcom/zykj/view/board/evaluation/c;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v1

    .line 275
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v1

    .line 279
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v1

    .line 283
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v1

    .line 287
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v1

    .line 291
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v1

    .line 295
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v1

    .line 299
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v1

    .line 303
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v1

    .line 307
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v1

    .line 311
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v1

    .line 315
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v1

    .line 319
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v1

    .line 323
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v1

    .line 327
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v1
.end method

.method private static final initClickListener$lambda$10(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_NEW_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivSelect:Landroid/widget/ImageView;

    .line 18
    .line 19
    const-string v0, "ivSelect"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setCurrentActionUI(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "mBinding"

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0

    .line 35
    :cond_1
    return-void
.end method

.method private static final initClickListener$lambda$12(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    xor-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setFingerDraw(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivTouch:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lcom/zykj/view/utils/SPDataKt;->setSpTouchable(Ljava/lang/Boolean;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const-string p0, "mBinding"

    .line 43
    .line 44
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    throw p0

    .line 49
    :cond_1
    return-void
.end method

.method private static final initClickListener$lambda$13(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->activatePenTool(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private static final initClickListener$lambda$15(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING_BEELINE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

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
    invoke-virtual {p1, v2, v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine(ZFF)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivLine:Landroid/widget/ImageView;

    .line 25
    .line 26
    const-string v0, "ivLine"

    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setCurrentActionUI(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p0, "mBinding"

    .line 36
    .line 37
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0

    .line 42
    :cond_1
    return-void
.end method

.method private static final initClickListener$lambda$17(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING_BEELINE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

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
    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine$default(Lcom/zykj/blackboard/bean/BoardConfig;ZFFILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDottedLine:Landroid/widget/ImageView;

    .line 26
    .line 27
    const-string v0, "ivDottedLine"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setCurrentActionUI(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-string p0, "mBinding"

    .line 37
    .line 38
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0

    .line 43
    :cond_1
    return-void
.end method

.method private static final initClickListener$lambda$19(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_ERASER_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivEraser:Landroid/widget/ImageView;

    .line 18
    .line 19
    const-string v0, "ivEraser"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setCurrentActionUI(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "mBinding"

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0

    .line 35
    :cond_1
    return-void
.end method

.method private static final initClickListener$lambda$20(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->capture()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final initClickListener$lambda$21(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getOnImportQuestionClick()Lr6/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static final initClickListener$lambda$22(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getOnImportAnswerClick()Lr6/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static final initClickListener$lambda$27(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/zykj/view/dialog/TextEditDialog;

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {p1, v0, v3, v1, v2}, Lcom/zykj/view/dialog/TextEditDialog;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/e;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 22
    .line 23
    const/16 v1, 0x13

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lcom/zykj/view/board/evaluation/e;

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/evaluation/e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Landroidx/lifecycle/k;

    .line 35
    .line 36
    const/16 v2, 0x17

    .line 37
    .line 38
    invoke-direct {p0, v2}, Landroidx/lifecycle/k;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const-string v2, ""

    .line 42
    .line 43
    invoke-virtual {p1, v2, v0, v1, p0}, Lcom/zykj/view/dialog/TextEditDialog;->showDialog(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private static final initClickListener$lambda$27$lambda$23(Ljava/lang/String;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final initClickListener$lambda$27$lambda$25(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Ld6/s;
    .locals 3

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->TOP_CENTER:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 11
    .line 12
    const/16 v2, 0x14

    .line 13
    .line 14
    invoke-interface {v0, p1, v1, v2}, Lcom/zykj/blackboard/core/edit/IPageControl;->addText(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivSelect:Landroid/widget/ImageView;

    .line 25
    .line 26
    const-string v1, "ivSelect"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setCurrentActionUI(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p0, p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string p0, "mBinding"

    .line 51
    .line 52
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    throw p0

    .line 57
    :cond_1
    :goto_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 58
    .line 59
    return-object p0
.end method

.method private static final initClickListener$lambda$27$lambda$26()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final initClickListener$lambda$28(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->askForErase()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final initClickListener$lambda$29(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getCallbackForSubmit()Lr6/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static final initClickListener$lambda$30(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->handleDrag(Landroid/view/MotionEvent;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0
.end method

.method private static final initClickListener$lambda$7(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IPageControl;->withdraw()Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private static final initClickListener$lambda$8(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->hideEvaluationPenColorPanel()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IPageControl;->recover()Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private final initData()V
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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->path:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method private final initEvaluationPenColorStrips()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorToolbar:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->rgPenColor:Landroid/widget/RadioGroup;

    .line 11
    .line 12
    const-string v3, "rgPenColor"

    .line 13
    .line 14
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-object v1, v3, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorSelectProxy:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->rgPenColorProxy:Landroid/widget/RadioGroup;

    .line 24
    .line 25
    const-string v2, "rgPenColorProxy"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->attachPenColorListeners(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v1, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->attachPenColorListeners(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1
.end method

.method private final initPageControl()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getCurrentPage()Lcom/zykj/blackboard/core/edit/IPageControl;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x3

    .line 22
    invoke-static {v0, v2, v1, v3, v1}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->createPage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLr6/a;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/IPageControl;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    new-instance v3, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$1;

    .line 35
    .line 36
    invoke-direct {v3, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$1;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    new-instance v3, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 55
    .line 56
    const-string v3, "mBinding"

    .line 57
    .line 58
    if-eqz v0, :cond_8

    .line 59
    .line 60
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivWithdraw:Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivRecover:Landroid/widget/ImageView;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    new-instance v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$3;

    .line 79
    .line 80
    invoke-direct {v1, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$3;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->setGeometrySelectListener(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    new-instance v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$4;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->setTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V

    .line 96
    .line 97
    .line 98
    :cond_6
    return-void

    .line 99
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v1
.end method

.method private final initTranslationConfig()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDrag:Landroid/widget/ImageView;

    .line 6
    .line 7
    new-instance v1, Lcom/zykj/view/board/evaluation/d;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/evaluation/d;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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

.method private static final initTranslationConfig$lambda$6(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDrag:Landroid/widget/ImageView;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->dragRect:Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->viewRoot:Lcom/zykj/view/widget/TouchSwitchView;

    .line 20
    .line 21
    new-instance v1, Lcom/zykj/view/board/evaluation/d;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/evaluation/d;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method private static final initTranslationConfig$lambda$6$lambda$5(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "mBinding"

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->viewRoot:Lcom/zykj/view/widget/TouchSwitchView;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->dragRect:Landroid/graphics/Rect;

    .line 19
    .line 20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v5, " "

    .line 29
    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v4, "initTranslationConfig"

    .line 41
    .line 42
    invoke-static {v4, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->defaultTranslateTop:F

    .line 47
    .line 48
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->dragRect:Landroid/graphics/Rect;

    .line 51
    .line 52
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    sub-int/2addr v0, v1

    .line 55
    int-to-float v0, v0

    .line 56
    iput v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->defaultTranslateBottom:F

    .line 57
    .line 58
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "window"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Landroid/view/WindowManager;

    .line 69
    .line 70
    if-nez v0, :cond_0

    .line 71
    .line 72
    const/4 v0, -0x1

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    new-instance v1, Landroid/graphics/Point;

    .line 75
    .line 76
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 84
    .line 85
    .line 86
    iget v0, v1, Landroid/graphics/Point;->y:I

    .line 87
    .line 88
    :goto_0
    int-to-float v0, v0

    .line 89
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 90
    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getDefaultLocationRatio()F

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const/high16 v1, 0x3f000000    # 0.5f

    .line 99
    .line 100
    :goto_1
    mul-float/2addr v0, v1

    .line 101
    invoke-direct {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->calculateTranslationY(F)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 105
    .line 106
    if-eqz p0, :cond_2

    .line 107
    .line 108
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->viewRoot:Lcom/zykj/view/widget/TouchSwitchView;

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v2

    .line 119
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v2
.end method

.method private final initView()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initEvaluationPenColorStrips()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initBlackboard()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initTranslationConfig()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final isEvaluationAllowedPenColor(I)Z
    .locals 7

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorToolbarGroup()Landroid/widget/RadioGroup;

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

.method public static synthetic j(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->askForErase$lambda$44$lambda$43(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->setSelectEditColorChangeListenerCompat$lambda$59$lambda$58(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$15(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->askForErase$lambda$44$lambda$42(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$30(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private final normalizeEvaluationPenColor(I)I
    .locals 8

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int v1, p1, v0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorToolbarGroup()Landroid/widget/RadioGroup;

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
    invoke-direct {p0, v4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorIntAtToolbarSlot(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1
.end method

.method public static synthetic o(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$19(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->attachPenColorListeners$lambda$55(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method private final penColorIntAtToolbarSlot(I)I
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorToolbarGroup()Landroid/widget/RadioGroup;

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
    invoke-static {p1, v3, v1}, Lkotlin/collections/u;->m(III)I

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

.method private final penColorSlotCount()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorToolbarGroup()Landroid/widget/RadioGroup;

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
    if-gez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    return v0
.end method

.method private final penColorToolbarGroup()Landroid/widget/RadioGroup;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorToolbar:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->rgPenColor:Landroid/widget/RadioGroup;

    .line 8
    .line 9
    const-string v1, "rgPenColor"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "mBinding"

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    throw v0
.end method

.method public static synthetic q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$8(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$27(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

# RE I/O 读取整数偏好（SharedPreferences.getInt）、保存整数偏好（SharedPreferences$Editor.putInt）。
.method private final resolveSavedPenColorSlot(Landroid/content/SharedPreferences;)I
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
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorSlotCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    if-gez v0, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    :cond_0
    invoke-static {p1, v2, v0}, Lkotlin/collections/u;->m(III)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    const-string v1, "pen_color_argb"

    .line 29
    .line 30
    invoke-interface {p1, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    const/high16 v2, -0x1000000

    .line 37
    .line 38
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-direct {p0, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->indexOfToolbarSlotMatchingColor(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 59
    .line 60
    .line 61
    :cond_2
    return v2
.end method

.method public static synthetic s(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$10(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method private final setCurrentActionUI(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivSelect:Landroid/widget/ImageView;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivPen:Landroid/widget/ImageView;

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivEraser:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivLine:Landroid/widget/ImageView;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivDottedLine:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1
.end method

.method private final setSelectEditColorChangeListenerCompat(Lcom/zykj/blackboard/bean/BoardConfig;)V
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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    new-instance v0, Lcom/zykj/view/board/evaluation/e;

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/board/evaluation/e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 52
    .line 53
    .line 54
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v3, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private static final setSelectEditColorChangeListenerCompat$lambda$59$lambda$58(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->syncEvaluationPenColorFromEditedGraph(I)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic showProgress$default(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget p1, Lcom/zykj/view/R$string;->progress_content:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p4, "getString(...)"

    .line 12
    .line 13
    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->showProgress(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final switchTouchMode(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->viewRoot:Lcom/zykj/view/widget/TouchSwitchView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p1, "mBinding"

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method

.method private final syncEvaluationPenColorFromEditedGraph(I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->normalizeEvaluationPenColor(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->indexOfToolbarSlotMatchingColor(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p0, p1, v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->applyEvaluationPenColorAtSlot(IZZ)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->syncEvaluationPenRadiosAtSlot(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final syncEvaluationPenRadiosAtSlot(I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->penColorSlotCount()I

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
    invoke-static {p1, v2, v0}, Lkotlin/collections/u;->m(III)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput-boolean v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->suppressPenColorSync:Z

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 18
    .line 19
    const-string v1, "mBinding"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v0, :cond_8

    .line 23
    .line 24
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorToolbar:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->rgPenColor:Landroid/widget/RadioGroup;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v4, v0, Landroid/widget/RadioButton;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    check-cast v0, Landroid/widget/RadioButton;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v0, v3

    .line 40
    :goto_0
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object v4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget-object v4, v4, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorToolbar:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 47
    .line 48
    iget-object v4, v4, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;->rgPenColor:Landroid/widget/RadioGroup;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {v4, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v3

    .line 62
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 63
    .line 64
    if-eqz v0, :cond_7

    .line 65
    .line 66
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorSelectProxy:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->rgPenColorProxy:Landroid/widget/RadioGroup;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    instance-of v0, p1, Landroid/widget/RadioButton;

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    check-cast p1, Landroid/widget/RadioButton;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object p1, v3

    .line 82
    :goto_2
    if-eqz p1, :cond_6

    .line 83
    .line 84
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->includePenColorSelectProxy:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 89
    .line 90
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->rgPenColorProxy:Landroid/widget/RadioGroup;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {v0, p1}, Landroid/widget/RadioGroup;->check(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v3

    .line 104
    :cond_6
    :goto_3
    iput-boolean v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->suppressPenColorSync:Z

    .line 105
    .line 106
    return-void

    .line 107
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v3

    .line 111
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v3
.end method

.method public static synthetic t(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->addImage$lambda$41$lambda$40(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$12(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$29(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic w(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$7(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic x(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$21(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$27$lambda$23(Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initClickListener$lambda$27$lambda$25(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addImage(Landroid/graphics/Bitmap;)V
    .locals 3
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getImageGraphCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getMaxImageCount()Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v2, 0x3

    .line 33
    :goto_1
    if-lt v0, v2, :cond_2

    .line 34
    .line 35
    const-string p1, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 36
    .line 37
    new-array v0, v1, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->addSpecialImage(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 58
    .line 59
    new-instance v1, Lcom/zykj/view/board/evaluation/a;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v1, p1, p0, v2}, Lcom/zykj/view/board/evaluation/a;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    const-string p1, "mBinding"

    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    throw p1

    .line 76
    :cond_4
    return-void
.end method

.method public final getScreenshot(IIIIZ)Landroid/graphics/Bitmap;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v9, 0xc0

    .line 6
    .line 7
    const/4 v10, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move v1, p1

    .line 12
    move v2, p2

    .line 13
    move v3, p3

    .line 14
    move v4, p4

    .line 15
    move/from16 v5, p5

    .line 16
    .line 17
    invoke-static/range {v0 .. v10}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->minScreenshot$default(Lcom/zykj/blackboard/core/edit/IPageControl;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return-object p1
.end method

.method public final hideProgress()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mProgressDialog:Landroid/app/ProgressDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mProgressDialog:Landroid/app/ProgressDialog;

    .line 10
    .line 11
    return-void
.end method

.method public final isImageOutOfCount()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getImageGraphCount()I

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
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getMaxImageCount()Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x3

    .line 28
    :goto_1
    if-lt v0, v2, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_2
    return v1
.end method

.method public final isPageNotEmpty()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->isPageNotEmpty()Z

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
    return v2

    .line 14
    :cond_0
    return v1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initData()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
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
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 14
    .line 15
    const-string v2, "sketchView"

    .line 16
    .line 17
    if-eqz p3, :cond_3

    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getEnableMove()Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    const/4 v3, 0x1

    .line 24
    if-ne p3, v3, :cond_3

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p2, 0x0

    .line 38
    :goto_0
    iget-object p3, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 39
    .line 40
    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-lez v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget v1, Lcom/zykj/view/R$dimen;->view_38:I

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    sub-int v0, p2, v0

    .line 72
    .line 73
    :cond_1
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 74
    .line 75
    invoke-virtual {p3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 80
    .line 81
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_3
    iget-object p2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->getDefaultLocationRatio()F

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    const/high16 p2, 0x3f000000    # 0.5f

    .line 95
    .line 96
    :goto_1
    const/high16 p3, 0x3f800000    # 1.0f

    .line 97
    .line 98
    sub-float/2addr p3, p2

    .line 99
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    const-string v3, "window"

    .line 104
    .line 105
    invoke-virtual {p2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Landroid/view/WindowManager;

    .line 110
    .line 111
    if-nez p2, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    new-instance v0, Landroid/graphics/Point;

    .line 115
    .line 116
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 124
    .line 125
    .line 126
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 127
    .line 128
    :goto_2
    int-to-float p2, v0

    .line 129
    mul-float/2addr p2, p3

    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    sget v0, Lcom/zykj/view/R$dimen;->view_9:I

    .line 135
    .line 136
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    int-to-float p3, p3

    .line 141
    sub-float/2addr p2, p3

    .line 142
    iget-object p3, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 143
    .line 144
    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    float-to-int p2, p2

    .line 154
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 155
    .line 156
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 157
    .line 158
    .line 159
    :goto_3
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const-string p2, "getRoot(...)"

    .line 169
    .line 170
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-object p1

    .line 174
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 175
    .line 176
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardControl:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageControl:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 10
    .line 11
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
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initView()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setConfig(Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "\u9ed8\u8ba4\u4f4d\u7f6e\u4f1a\u95ea\uff0c\u4e0d\u5efa\u8bae\u4f7f\u7528"
    .end annotation

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->fragmentConfig:Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->executeConfig(Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setOnPageSlideListener(Lr6/c;)V
    .locals 0
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->pageSlideListener:Lr6/c;

    .line 2
    .line 3
    return-void
.end method

.method public final showProgress(Ljava/lang/String;Z)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "tips"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mProgressDialog:Landroid/app/ProgressDialog;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, ""

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, p1, v2, p2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->mProgressDialog:Landroid/app/ProgressDialog;

    .line 25
    .line 26
    return-void
.end method
