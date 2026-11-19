.class public final Lcom/zykj/view/board/play/SketchPlayFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetTextI18n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/play/SketchPlayFragment$Companion;,
        Lcom/zykj/view/board/play/SketchPlayFragment$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0002\u009d\u0001\u0008\u0007\u0018\u0000 \u00a9\u00012\u00020\u0001:\u0002\u00a9\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J!\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001f\u0010\u0011J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0008\u0008\u0002\u0010\"\u001a\u00020\r\u00a2\u0006\u0004\u0008#\u0010$Jh\u00101\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u0008\u0008\u0002\u0010(\u001a\u00020\'2\u0008\u0008\u0002\u0010)\u001a\u00020\r2\u0016\u0008\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010*2%\u0008\u0002\u00100\u001a\u001f\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008-\u0012\u0008\u0008.\u0012\u0004\u0008\u0008(/\u0012\u0004\u0012\u00020\u000f\u0018\u00010*\u00a2\u0006\u0004\u00081\u00102JC\u00105\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\'2\u0008\u0008\u0002\u00103\u001a\u00020\r2\u0010\u0008\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001042\u0010\u0008\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u000104\u00a2\u0006\u0004\u00085\u00106J\r\u00107\u001a\u00020\u000f\u00a2\u0006\u0004\u00087\u0010\u0003J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208\u00a2\u0006\u0004\u0008:\u0010;J\r\u0010<\u001a\u00020\r\u00a2\u0006\u0004\u0008<\u0010=J\r\u0010>\u001a\u00020\u000f\u00a2\u0006\u0004\u0008>\u0010\u0003J\r\u0010?\u001a\u00020\u000f\u00a2\u0006\u0004\u0008?\u0010\u0003J\u001b\u0010A\u001a\u00020\u000f2\u000c\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u000f04\u00a2\u0006\u0004\u0008A\u0010BJ\u0015\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\r\u00a2\u0006\u0004\u0008D\u0010\u0011J!\u0010F\u001a\u00020\u000f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0*\u00a2\u0006\u0004\u0008F\u0010GJ\u0015\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\r\u00a2\u0006\u0004\u0008I\u0010\u0011J\u0015\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020J\u00a2\u0006\u0004\u0008L\u0010MJ\u0017\u0010O\u001a\u00020\u000f2\u0008\u0008\u0001\u0010N\u001a\u00020\'\u00a2\u0006\u0004\u0008O\u0010PJ\u0017\u0010R\u001a\u00020\u000f2\u0008\u0008\u0001\u0010Q\u001a\u00020\'\u00a2\u0006\u0004\u0008R\u0010PJ\u0015\u0010S\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020J\u00a2\u0006\u0004\u0008S\u0010MJ\u0015\u0010U\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\r\u00a2\u0006\u0004\u0008U\u0010\u0011J\u0015\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\r\u00a2\u0006\u0004\u0008W\u0010\u0011J0\u0010Z\u001a\u00020\u000f2!\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008-\u0012\u0008\u0008.\u0012\u0004\u0008\u0008(X\u0012\u0004\u0012\u00020\u000f0*\u00a2\u0006\u0004\u0008Z\u0010GJ\u0015\u0010\\\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\r\u00a2\u0006\u0004\u0008\\\u0010\u0011J\u0017\u0010^\u001a\u00020\u000f2\u0008\u0008\u0001\u0010]\u001a\u00020\'\u00a2\u0006\u0004\u0008^\u0010PJ\r\u0010_\u001a\u00020 \u00a2\u0006\u0004\u0008_\u0010`J3\u0010c\u001a\u00020\u000f2$\u0010b\u001a \u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0*\u0012\u0004\u0012\u00020\u000f0a\u00a2\u0006\u0004\u0008c\u0010dJ\r\u0010e\u001a\u00020\r\u00a2\u0006\u0004\u0008e\u0010=J\r\u0010f\u001a\u00020\'\u00a2\u0006\u0004\u0008f\u0010gJ\r\u0010i\u001a\u00020h\u00a2\u0006\u0004\u0008i\u0010jJ\r\u0010k\u001a\u00020\u000f\u00a2\u0006\u0004\u0008k\u0010\u0003J!\u0010n\u001a\u00020\u000f2\u0008\u0008\u0002\u0010l\u001a\u00020%2\u0008\u0008\u0002\u0010m\u001a\u00020\r\u00a2\u0006\u0004\u0008n\u0010oJ\r\u0010p\u001a\u00020\u000f\u00a2\u0006\u0004\u0008p\u0010\u0003J\u000f\u0010q\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008q\u0010\u0003J\u000f\u0010r\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008r\u0010\u0003J\u000f\u0010s\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008s\u0010\u0003J\u000f\u0010t\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008t\u0010\u0003J\u000f\u0010u\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008u\u0010\u0003J\u0019\u0010v\u001a\u00020\u000f2\u0008\u0008\u0002\u0010(\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008v\u0010PJ\u000f\u0010w\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008w\u0010\u0003J\u0017\u0010x\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0002\u00a2\u0006\u0004\u0008x\u0010;J\u000f\u0010y\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008y\u0010\u0003R\u0018\u0010z\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\'\u0010\u007f\u001a\u0012\u0012\u0004\u0012\u00020}0|j\u0008\u0012\u0004\u0012\u00020}`~8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u0085\u0001R\u0017\u0010(\u001a\u00020\'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008(\u0010\u008a\u0001R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R9\u0010\u0095\u0001\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0*\u0012\u0004\u0012\u00020\u000f\u0018\u00010a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R!\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\'\u0010\u009b\u0001\u001a\u0012\u0012\r\u0012\u000b \u009a\u0001*\u0004\u0018\u00010%0%0\u0099\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u009c\u0001R!\u0010\u00a2\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001\u001a\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u001c\u0010\u00a4\u0001\u001a\u0005\u0018\u00010\u00a3\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u001c\u0010\u00a7\u0001\u001a\u0005\u0018\u00010\u00a6\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\u00a8\u0006\u00aa\u0001"
    }
    d2 = {
        "Lcom/zykj/view/board/play/SketchPlayFragment;",
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
        "",
        "isVisibleToUser",
        "Ld6/s;",
        "setUserVisibleHint",
        "(Z)V",
        "hidden",
        "onHiddenChanged",
        "onResume",
        "onPause",
        "onDestroyView",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "performClickStartPlay",
        "Landroid/graphics/Bitmap;",
        "getScreenBitmap",
        "()Landroid/graphics/Bitmap;",
        "isEnable",
        "setScaleEnable",
        "",
        "newSpeed",
        "showToast",
        "changeSpeed",
        "(DZ)V",
        "",
        "path",
        "",
        "progress",
        "showLoading",
        "Lkotlin/Function1;",
        "",
        "onFailure",
        "Lkotlin/ParameterName;",
        "name",
        "isVideo",
        "onSuccess",
        "play",
        "(Ljava/lang/String;IZLr6/c;Lr6/c;)V",
        "resumePlaying",
        "Lkotlin/Function0;",
        "seekTo",
        "(IZLr6/a;Lr6/a;)V",
        "sketchStartPlaying",
        "Lcom/zykj/view/board/play/NewPlayerConfig;",
        "newPlayerConfig",
        "setNewPlayerConfig",
        "(Lcom/zykj/view/board/play/NewPlayerConfig;)V",
        "isCanPlay",
        "()Z",
        "stopPlay",
        "startPlay",
        "onAutoHideAction",
        "setOnAutoHideAction",
        "(Lr6/a;)V",
        "seekBarVisibleManually",
        "setSeekBarVisibleManually",
        "sketchTapAction",
        "setSketchTapAction",
        "(Lr6/c;)V",
        "interceptWhenVideo",
        "setInterceptWhenVideo",
        "Landroid/graphics/drawable/Drawable;",
        "drawable",
        "setSeekBarProgressColor",
        "(Landroid/graphics/drawable/Drawable;)V",
        "color",
        "setSeekBarThumbColor",
        "(I)V",
        "colorRes",
        "setSpeedRateItemColor",
        "setSpeedRateBackgroundDrawable",
        "isVisible",
        "setFullscreenVisible",
        "state",
        "setAutoHideSeekBarState",
        "itself",
        "fullscreenClickListener",
        "setFullscreenClickListener",
        "selected",
        "setFullscreenSelected",
        "resId",
        "setFullscreenRes",
        "getSpeedRate",
        "()D",
        "Lkotlin/Function2;",
        "showCallback",
        "setCustomSpeedWindow",
        "(Lr6/e;)V",
        "isPlaying",
        "getProgress",
        "()I",
        "",
        "getFloatProgress",
        "()F",
        "cancelAutoHideJob",
        "tips",
        "isCancelable",
        "showProgress",
        "(Ljava/lang/String;Z)V",
        "hideProgress",
        "initView",
        "hideSeekBar",
        "showSeekBar",
        "toggleControlBarVisible",
        "sketchResumePlaying",
        "initPlaySketch",
        "initStaticSketch",
        "handleConfig",
        "startControlBarJob",
        "mNewPlayerConfig",
        "Lcom/zykj/view/board/play/NewPlayerConfig;",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/view/board/play/PlayerConfigSetting;",
        "Lkotlin/collections/ArrayList;",
        "mNewPlayerConfigData",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/view/board/play/SketchPlayExtraConfig;",
        "extraConfig",
        "Lcom/zykj/view/board/play/SketchPlayExtraConfig;",
        "isReady",
        "Z",
        "progressTime",
        "Ljava/lang/String;",
        "totalTime",
        "mTotalTime",
        "I",
        "continueWhenResume",
        "Lcom/zykj/view/board/play/PlaySpeedRatePopup;",
        "playSpeedRatePopup",
        "Lcom/zykj/view/board/play/PlaySpeedRatePopup;",
        "Lcom/zykj/view/board/play/PlaySettingPopup;",
        "playSettingPopup",
        "Lcom/zykj/view/board/play/PlaySettingPopup;",
        "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;",
        "mBinding",
        "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;",
        "playSpeedRateShowCall",
        "Lr6/e;",
        "writeFileCallback",
        "Lr6/a;",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "kotlin.jvm.PlatformType",
        "permissionRequest",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "com/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1",
        "playStatusListener$delegate",
        "Ld6/e;",
        "getPlayStatusListener",
        "()Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;",
        "playStatusListener",
        "Lkotlinx/coroutines/w0;",
        "autoHideSeekBarJob",
        "Lkotlinx/coroutines/w0;",
        "Landroid/app/ProgressDialog;",
        "mProgressDialog",
        "Landroid/app/ProgressDialog;",
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
        "SMAP\nSketchPlayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,839:1\n257#2,2:840\n257#2,2:842\n257#2,2:844\n257#2,2:846\n257#2,2:848\n255#2:850\n*S KotlinDebug\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n*L\n279#1:840,2\n281#1:842,2\n290#1:844,2\n292#1:846,2\n741#1:848,2\n221#1:850\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/view/board/play/SketchPlayFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private autoHideSeekBarJob:Lkotlinx/coroutines/w0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private continueWhenResume:Z

.field private extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isReady:Z

.field private mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

.field private mNewPlayerConfig:Lcom/zykj/view/board/play/NewPlayerConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mNewPlayerConfigData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/view/board/play/PlayerConfigSetting;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mProgressDialog:Landroid/app/ProgressDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mTotalTime:I

.field private final permissionRequest:Landroidx/activity/result/ActivityResultLauncher;
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

.field private playSettingPopup:Lcom/zykj/view/board/play/PlaySettingPopup;

.field private playSpeedRatePopup:Lcom/zykj/view/board/play/PlaySpeedRatePopup;

.field private playSpeedRateShowCall:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final playStatusListener$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private progress:I

.field private progressTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private totalTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private writeFileCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/view/board/play/SketchPlayFragment;->Companion:Lcom/zykj/view/board/play/SketchPlayFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 12
    .line 13
    const/16 v9, 0x7f

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    invoke-direct/range {v1 .. v10}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;-><init>(ZZZZLr6/a;Lr6/c;Lr6/c;ILkotlin/jvm/internal/e;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 27
    .line 28
    const-string v0, "00:00"

    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->progressTime:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->totalTime:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    iput v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 36
    .line 37
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 38
    .line 39
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/zykj/view/board/play/a;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Lcom/zykj/view/board/play/a;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "registerForActivityResult(...)"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->permissionRequest:Landroidx/activity/result/ActivityResultLauncher;

    .line 57
    .line 58
    new-instance v0, Lcom/zykj/view/board/play/d;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lcom/zykj/view/board/play/d;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playStatusListener$delegate:Ld6/e;

    .line 68
    .line 69
    return-void
.end method

.method public static final synthetic access$getExtraConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMNewPlayerConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/NewPlayerConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfig:Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMTotalTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getProgressTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->progressTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTotalTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->totalTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$hideSeekBar(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->hideSeekBar()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$initPlaySketch(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initPlaySketch(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$initStaticSketch(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->initStaticSketch()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setContinueWhenResume$p(Lcom/zykj/view/board/play/SketchPlayFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->continueWhenResume:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setMTotalTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setProgress$p(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->progress:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setProgressTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->progressTime:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$showSeekBar(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->showSeekBar()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$sketchResumePlaying(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->sketchResumePlaying()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$startControlBarJob(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->startControlBarJob()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic changeSpeed$default(Lcom/zykj/view/board/play/SketchPlayFragment;DZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/board/play/SketchPlayFragment;->changeSpeed(DZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->playStatusListener_delegate$lambda$12(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$7(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/SketchPlayFragment;->handleConfig$lambda$13()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method private final getPlayStatusListener()Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playStatusListener$delegate:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic h(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$3(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method private final handleConfig(Lcom/zykj/view/board/play/NewPlayerConfig;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/view/board/play/NewPlayerConfig;->getNeedDelete()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "getString(...)"

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v2, Lcom/zykj/view/board/play/PlayerConfigSetting;

    .line 17
    .line 18
    sget v3, Lcom/zykj/view/R$drawable;->icon_play_setting_delete:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sget v5, Lcom/zykj/view/R$string;->delete:I

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/view/board/play/NewPlayerConfig;->getCallbackForDelete()Lr6/a;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-nez v5, :cond_0

    .line 38
    .line 39
    new-instance v5, Landroidx/lifecycle/k;

    .line 40
    .line 41
    const/16 v6, 0x1d

    .line 42
    .line 43
    invoke-direct {v5, v6}, Landroidx/lifecycle/k;-><init>(I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-direct {v2, v3, v4, v5}, Lcom/zykj/view/board/play/PlayerConfigSetting;-><init>(ILjava/lang/String;Lr6/a;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/view/board/play/NewPlayerConfig;->getNeedRecord()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance v2, Lcom/zykj/view/board/play/PlayerConfigSetting;

    .line 61
    .line 62
    sget v3, Lcom/zykj/view/R$drawable;->icon_play_setting_record:I

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    sget v5, Lcom/zykj/view/R$string;->record:I

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zykj/view/board/play/NewPlayerConfig;->getCallbackForRecord()Lr6/a;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    new-instance v1, Lcom/zykj/view/board/play/b;

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-direct {v1, v5}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 87
    .line 88
    .line 89
    :cond_2
    invoke-direct {v2, v3, v4, v1}, Lcom/zykj/view/board/play/PlayerConfigSetting;-><init>(ILjava/lang/String;Lr6/a;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/view/board/play/NewPlayerConfig;->getExtrasForSetting()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    const-string v2, "mBinding"

    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->ivSetting:Landroid/widget/ImageView;

    .line 112
    .line 113
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    const/16 v4, 0x8

    .line 120
    .line 121
    const/4 v5, 0x0

    .line 122
    if-nez v3, :cond_4

    .line 123
    .line 124
    move v3, v5

    .line 125
    goto :goto_0

    .line 126
    :cond_4
    move v3, v4

    .line 127
    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 131
    .line 132
    if-eqz v0, :cond_6

    .line 133
    .line 134
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->ivBack:Landroid/widget/ImageView;

    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/zykj/view/board/play/NewPlayerConfig;->getNeedBack()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_5

    .line 141
    .line 142
    move v4, v5

    .line 143
    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v1
.end method

.method private static final handleConfig$lambda$13()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final handleConfig$lambda$14()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method private final hideSeekBar()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->groupSeekBar:Landroidx/constraintlayout/widget/Group;

    .line 11
    .line 12
    const-string v3, "groupSeekBar"

    .line 13
    .line 14
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/16 v3, 0x8

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->getShowFullscreenButton()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 37
    .line 38
    const-string v1, "ivFullscreen"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_1
    return-void

    .line 52
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1
.end method

.method public static synthetic i(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILr6/c;Lr6/c;)Ld6/s;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/view/board/play/SketchPlayFragment;->play$lambda$10(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILr6/c;Lr6/c;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private final initPlaySketch(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->seekBar:Landroid/widget/SeekBar;

    .line 11
    .line 12
    iget v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->seekBar:Landroid/widget/SeekBar;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lcom/zykj/view/board/play/SketchPlayFragment;->Companion:Lcom/zykj/view/board/play/SketchPlayFragment$Companion;

    .line 29
    .line 30
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 31
    .line 32
    int-to-long v3, v0

    .line 33
    invoke-virtual {p1, v3, v4}, Lcom/zykj/view/board/play/SketchPlayFragment$Companion;->formatTime(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->totalTime:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvTime:Landroid/widget/TextView;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->progressTime:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v3, "/"

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 77
    .line 78
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->getPlayStatusListener()Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1, v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 86
    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 90
    .line 91
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->getPlayStatusListener()Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p1, v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    iput-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->isReady:Z

    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 102
    .line 103
    if-eqz p1, :cond_0

    .line 104
    .line 105
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 106
    .line 107
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 108
    .line 109
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->showSeekBar()V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v1

    .line 122
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1

    .line 130
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v1

    .line 138
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v1
.end method

.method public static synthetic initPlaySketch$default(Lcom/zykj/view/board/play/SketchPlayFragment;IILjava/lang/Object;)V
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
    invoke-direct {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initPlaySketch(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final initStaticSketch()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 7
    .line 8
    const-string v2, "mBinding"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_16

    .line 12
    .line 13
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 14
    .line 15
    new-instance v4, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$1;

    .line 16
    .line 17
    invoke-direct {v4, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 24
    .line 25
    if-eqz v1, :cond_15

    .line 26
    .line 27
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveMaxWidthTimes()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 34
    .line 35
    if-eqz v4, :cond_14

    .line 36
    .line 37
    iget-object v4, v4, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 38
    .line 39
    invoke-virtual {v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveMaxHeightTimes()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/16 v5, 0x8

    .line 44
    .line 45
    const/high16 v6, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x1

    .line 49
    if-le v1, v8, :cond_7

    .line 50
    .line 51
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfig:Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 52
    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    invoke-virtual {v9}, Lcom/zykj/view/board/play/NewPlayerConfig;->isMoveReset()Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-ne v9, v8, :cond_2

    .line 60
    .line 61
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 62
    .line 63
    if-eqz v9, :cond_1

    .line 64
    .line 65
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 66
    .line 67
    invoke-virtual {v9}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveStart()V

    .line 68
    .line 69
    .line 70
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 71
    .line 72
    if-eqz v9, :cond_0

    .line 73
    .line 74
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 75
    .line 76
    const/4 v10, 0x2

    .line 77
    invoke-static {v9, v0, v3, v10, v3}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveEnd$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v3

    .line 85
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v3

    .line 89
    :cond_2
    :goto_0
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 90
    .line 91
    if-eqz v9, :cond_6

    .line 92
    .line 93
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    .line 94
    .line 95
    invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V

    .line 96
    .line 97
    .line 98
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 99
    .line 100
    if-eqz v9, :cond_5

    .line 101
    .line 102
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    .line 103
    .line 104
    int-to-float v1, v1

    .line 105
    div-float v1, v6, v1

    .line 106
    .line 107
    invoke-virtual {v9, v1}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 111
    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    iget-object v9, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    .line 115
    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveHorizontalProgress()F

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-virtual {v9, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v3

    .line 132
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v3

    .line 136
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v3

    .line 140
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v3

    .line 144
    :cond_7
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 145
    .line 146
    if-eqz v1, :cond_13

    .line 147
    .line 148
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    .line 149
    .line 150
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 151
    .line 152
    .line 153
    :goto_1
    if-le v4, v8, :cond_f

    .line 154
    .line 155
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfig:Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 156
    .line 157
    if-eqz v1, :cond_a

    .line 158
    .line 159
    invoke-virtual {v1}, Lcom/zykj/view/board/play/NewPlayerConfig;->isMoveReset()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-ne v1, v8, :cond_a

    .line 164
    .line 165
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 166
    .line 167
    if-eqz v1, :cond_9

    .line 168
    .line 169
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveStart()V

    .line 172
    .line 173
    .line 174
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 175
    .line 176
    if-eqz v1, :cond_8

    .line 177
    .line 178
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 179
    .line 180
    invoke-static {v1, v3, v0, v8, v3}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveEnd$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v3

    .line 188
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v3

    .line 192
    :cond_a
    :goto_2
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 193
    .line 194
    if-eqz v0, :cond_e

    .line 195
    .line 196
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    .line 197
    .line 198
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 202
    .line 203
    if-eqz v0, :cond_d

    .line 204
    .line 205
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    .line 206
    .line 207
    int-to-float v1, v4

    .line 208
    div-float/2addr v6, v1

    .line 209
    invoke-virtual {v0, v6}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 210
    .line 211
    .line 212
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 213
    .line 214
    if-eqz v0, :cond_c

    .line 215
    .line 216
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    .line 217
    .line 218
    if-eqz v0, :cond_b

    .line 219
    .line 220
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 221
    .line 222
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveVerticalProgress()F

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    invoke-virtual {v1, v0}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v3

    .line 234
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v3

    .line 238
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v3

    .line 242
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v3

    .line 246
    :cond_f
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 247
    .line 248
    if-eqz v0, :cond_12

    .line 249
    .line 250
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    .line 251
    .line 252
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 253
    .line 254
    .line 255
    :goto_3
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 256
    .line 257
    if-eqz v0, :cond_11

    .line 258
    .line 259
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    .line 260
    .line 261
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$2;

    .line 262
    .line 263
    invoke-direct {v1, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$2;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView$ProgressListener;)V

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 270
    .line 271
    if-eqz v0, :cond_10

    .line 272
    .line 273
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    .line 274
    .line 275
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3;

    .line 276
    .line 277
    invoke-direct {v1, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView$ProgressListener;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v3

    .line 288
    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v3

    .line 292
    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v3

    .line 296
    :cond_13
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v3

    .line 300
    :cond_14
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v3

    .line 304
    :cond_15
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw v3

    .line 308
    :cond_16
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v3
.end method

.method private final initView()V
    .locals 9

    .line 1
    new-instance v0, Lcom/zykj/view/board/play/PlaySpeedRatePopup;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireActivity(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/PlaySpeedRatePopup;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSpeedRatePopup:Lcom/zykj/view/board/play/PlaySpeedRatePopup;

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/view/board/play/PlaySettingPopup;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/PlaySettingPopup;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSettingPopup:Lcom/zykj/view/board/play/PlaySettingPopup;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    const-string v2, "mBinding"

    .line 35
    .line 36
    if-eqz v0, :cond_7

    .line 37
    .line 38
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 41
    .line 42
    const-string v3, "1.0X"

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->hideSeekBar()V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 51
    .line 52
    if-eqz v0, :cond_6

    .line 53
    .line 54
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->ivBack:Landroid/widget/ImageView;

    .line 55
    .line 56
    const-string v0, "ivBack"

    .line 57
    .line 58
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Lcom/zykj/view/board/play/f;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/play/f;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 65
    .line 66
    .line 67
    const/4 v7, 0x1

    .line 68
    const/4 v8, 0x0

    .line 69
    const-wide/16 v4, 0x0

    .line 70
    .line 71
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->ivSetting:Landroid/widget/ImageView;

    .line 79
    .line 80
    const-string v0, "ivSetting"

    .line 81
    .line 82
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v6, Lcom/zykj/view/board/play/f;

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/play/f;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 89
    .line 90
    .line 91
    const/4 v7, 0x1

    .line 92
    const/4 v8, 0x0

    .line 93
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 103
    .line 104
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 105
    .line 106
    const-string v0, "ivRecord"

    .line 107
    .line 108
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v6, Lcom/zykj/view/board/play/f;

    .line 112
    .line 113
    const/4 v0, 0x2

    .line 114
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/play/f;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 115
    .line 116
    .line 117
    const/4 v7, 0x1

    .line 118
    const/4 v8, 0x0

    .line 119
    const-wide/16 v4, 0x0

    .line 120
    .line 121
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 125
    .line 126
    if-eqz v0, :cond_3

    .line 127
    .line 128
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 129
    .line 130
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->seekBar:Landroid/widget/SeekBar;

    .line 131
    .line 132
    new-instance v3, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;

    .line 133
    .line 134
    invoke-direct {v3, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 145
    .line 146
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 147
    .line 148
    const-string v0, "tvSpeedRate"

    .line 149
    .line 150
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    new-instance v6, Lcom/zykj/view/board/play/f;

    .line 154
    .line 155
    const/4 v0, 0x3

    .line 156
    invoke-direct {v6, p0, v0}, Lcom/zykj/view/board/play/f;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 157
    .line 158
    .line 159
    const/4 v7, 0x1

    .line 160
    const/4 v8, 0x0

    .line 161
    const-wide/16 v4, 0x0

    .line 162
    .line 163
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/utils/ExtKt;->singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 167
    .line 168
    if-eqz v0, :cond_1

    .line 169
    .line 170
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 171
    .line 172
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 173
    .line 174
    new-instance v3, Lcom/zykj/view/board/play/f;

    .line 175
    .line 176
    const/4 v4, 0x4

    .line 177
    invoke-direct {v3, p0, v4}, Lcom/zykj/view/board/play/f;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    .line 182
    .line 183
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 184
    .line 185
    if-eqz v0, :cond_0

    .line 186
    .line 187
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->clRoot:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 188
    .line 189
    new-instance v1, Lcom/zykj/view/board/play/f;

    .line 190
    .line 191
    const/4 v2, 0x5

    .line 192
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/f;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v1

    .line 203
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v1

    .line 207
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v1

    .line 215
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v1

    .line 219
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v1

    .line 223
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v1

    .line 227
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v1
.end method

.method private static final initView$lambda$1(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfig:Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/view/board/play/NewPlayerConfig;->getCallbackForBack()Lr6/a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method private static final initView$lambda$2(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_2

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSettingPopup:Lcom/zykj/view/board/play/PlaySettingPopup;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->ivSetting:Landroid/widget/ImageView;

    .line 19
    .line 20
    const-string v1, "ivSetting"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfigData:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1, v0, p0}, Lcom/zykj/view/board/play/PlaySettingPopup;->showPopup(Landroid/view/View;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "mBinding"

    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    const-string p0, "playSettingPopup"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_2
    sget p1, Lcom/zykj/view/R$string;->no_content:I

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 p1, 0x0

    .line 50
    new-array p1, p1, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private static final initView$lambda$3(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->performClickStartPlay()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final initView$lambda$7(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSpeedRateShowCall:Lr6/e;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "tvSpeedRate"

    .line 5
    .line 6
    const-string v2, "mBinding"

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    iget-object v0, v3, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lcom/zykj/view/board/play/e;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/e;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    throw v0

    .line 35
    :cond_1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSpeedRatePopup:Lcom/zykj/view/board/play/PlaySpeedRatePopup;

    .line 36
    .line 37
    if-eqz p1, :cond_4

    .line 38
    .line 39
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iget-object v3, v3, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 44
    .line 45
    iget-object v3, v3, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Lcom/zykj/view/board/play/e;

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/e;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v3, v0, v1}, Lcom/zykj/view/board/play/PlaySpeedRatePopup;->showPopup(Landroid/view/View;Ljava/lang/String;Lr6/c;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_4
    const-string p0, "playSpeedRatePopup"

    .line 85
    .line 86
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0
.end method

.method private static final initView$lambda$7$lambda$4(Lcom/zykj/view/board/play/SketchPlayFragment;D)Ld6/s;
    .locals 6

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-wide v1, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->changeSpeed$default(Lcom/zykj/view/board/play/SketchPlayFragment;DZILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final initView$lambda$7$lambda$6$lambda$5(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/view/board/play/SpeedRate;)Ld6/s;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SpeedRate;->getSpeed()D

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v1, p0

    .line 14
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/play/SketchPlayFragment;->changeSpeed$default(Lcom/zykj/view/board/play/SketchPlayFragment;DZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final initView$lambda$8(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->getFullscreenClickListener()Lr6/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private static final initView$lambda$9(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->getSeekBarVisibleManually()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->toggleControlBarVisible()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->getSketchTapAction()Lr6/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 25
    .line 26
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 27
    .line 28
    const-string v0, "ivFullscreen"

    .line 29
    .line 30
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
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
    :cond_2
    return-void
.end method

.method public static synthetic j(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->permissionRequest$lambda$11(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$9(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/view/board/play/SpeedRate;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$7$lambda$6$lambda$5(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/view/board/play/SpeedRate;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$1(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$2(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/play/SketchPlayFragment;D)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$7$lambda$4(Lcom/zykj/view/board/play/SketchPlayFragment;D)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView$lambda$8(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final permissionRequest$lambda$11(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/Boolean;)V
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
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->writeFileCallback:Lr6/a;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->writeFileCallback:Lr6/a;

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic play$default(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;IZLr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    move v2, p2

    .line 7
    and-int/lit8 p2, p6, 0x4

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    :cond_1
    move v3, p3

    .line 13
    and-int/lit8 p2, p6, 0x8

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    move-object v4, p3

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move-object v4, p4

    .line 21
    :goto_0
    and-int/lit8 p2, p6, 0x10

    .line 22
    .line 23
    if-eqz p2, :cond_3

    .line 24
    .line 25
    move-object v5, p3

    .line 26
    :goto_1
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    goto :goto_2

    .line 29
    :cond_3
    move-object v5, p5

    .line 30
    goto :goto_1

    .line 31
    :goto_2
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->play(Ljava/lang/String;IZLr6/c;Lr6/c;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static final play$lambda$10(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILr6/c;Lr6/c;)Ld6/s;
    .locals 9

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move v2, p1

    .line 10
    move-object v4, p2

    .line 11
    move v5, p3

    .line 12
    move-object v6, p4

    .line 13
    move-object v7, p5

    .line 14
    invoke-direct/range {v1 .. v8}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ILr6/c;Lr6/c;Lh6/c;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lr6/e;)Lkotlinx/coroutines/w0;

    .line 18
    .line 19
    .line 20
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 21
    .line 22
    return-object p0
.end method

.method private static final playStatusListener_delegate$lambda$12(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic q()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/SketchPlayFragment;->handleConfig$lambda$14()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic seekTo$default(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/a;Lr6/a;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p6, p5, 0x4

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    move-object p4, v0

    .line 17
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/play/SketchPlayFragment;->seekTo(IZLr6/a;Lr6/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic showProgress$default(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ZILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->showProgress(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final showSeekBar()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 2
    .line 3
    if-lez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "mBinding"

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->groupSeekBar:Landroidx/constraintlayout/widget/Group;

    .line 15
    .line 16
    const-string v3, "groupSeekBar"

    .line 17
    .line 18
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->getShowFullscreenButton()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 40
    .line 41
    const-string v1, "ivFullscreen"

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_2
    return-void
.end method

.method private final sketchResumePlaying()V
    .locals 3

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
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$sketchResumePlaying$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchResumePlaying$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lr6/e;)Lkotlinx/coroutines/w0;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final startControlBarJob()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->autoHideSeekBarJob:Lkotlinx/coroutines/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "getViewLifecycleOwner(...)"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, Lcom/zykj/view/board/play/SketchPlayFragment$startControlBarJob$1;

    .line 23
    .line 24
    invoke-direct {v2, p0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$startControlBarJob$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lr6/e;)Lkotlinx/coroutines/w0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->autoHideSeekBarJob:Lkotlinx/coroutines/w0;

    .line 32
    .line 33
    return-void
.end method

.method private final toggleControlBarVisible()V
    .locals 3

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
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lr6/e;)Lkotlinx/coroutines/w0;

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final cancelAutoHideJob()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->autoHideSeekBarJob:Lkotlinx/coroutines/w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final changeSpeed(DZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "mBinding"

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    :try_start_1
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 10
    .line 11
    invoke-virtual {v1, p1, p2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->setRate(D)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, "X"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    if-eqz p3, :cond_3

    .line 46
    .line 47
    sget v1, Lcom/zykj/view/R$string;->speed_rate_change:I

    .line 48
    .line 49
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, v1, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-array p2, v0, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v2

    .line 71
    :cond_1
    if-eqz p3, :cond_3

    .line 72
    .line 73
    sget p1, Lcom/zykj/view/R$string;->micro_lesson_not_support_speed:I

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-array p2, v0, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 89
    :catch_0
    if-eqz p3, :cond_3

    .line 90
    .line 91
    sget p1, Lcom/zykj/view/R$string;->device_not_support_speed:I

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-array p2, v0, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    return-void
.end method

.method public final getFloatProgress()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->progress:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 5
    .line 6
    int-to-float v1, v1

    .line 7
    div-float/2addr v0, v1

    .line 8
    return v0
.end method

.method public final getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->progress:I

    .line 2
    .line 3
    return v0
.end method

.method public final getScreenBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getScreenBitmap()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

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

.method public final getSpeedRate()D
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSpeedRatePopup:Lcom/zykj/view/board/play/PlaySpeedRatePopup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v1, v2, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 11
    .line 12
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/play/PlaySpeedRatePopup;->getCurrentSpeedRate(Ljava/lang/String;)D

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0

    .line 27
    :cond_0
    const-string v0, "mBinding"

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string v0, "playSpeedRatePopup"

    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final hideProgress()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mProgressDialog:Landroid/app/ProgressDialog;

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
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mProgressDialog:Landroid/app/ProgressDialog;

    .line 10
    .line 11
    return-void
.end method

.method public final isCanPlay()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mTotalTime:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final isPlaying()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v3, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 15
    .line 16
    if-eq v0, v3, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return v0

    .line 35
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 40
    return v0

    .line 41
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1
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
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "getRoot(...)"

    .line 23
    .line 24
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method public onDestroyView()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->hideProgress()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->isReady:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->stopPlay()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, "mBinding"

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->release()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->destroy()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->isReady:Z

    .line 43
    .line 44
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public onHiddenChanged(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->stopPlay()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->stopPlay()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->continueWhenResume:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->startPlay()V

    .line 9
    .line 10
    .line 11
    :cond_0
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
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfig:Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->handleConfig(Lcom/zykj/view/board/play/NewPlayerConfig;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final performClickStartPlay()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_b

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v3, Lcom/zykj/view/board/play/SketchPlayFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    aget v0, v3, v0

    .line 25
    .line 26
    :goto_0
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eq v0, v4, :cond_8

    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    if-eq v0, v5, :cond_5

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    if-eq v0, v3, :cond_3

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    if-eq v0, v3, :cond_1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iput-boolean v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->continueWhenResume:Z

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->sketchStartPlaying()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 52
    .line 53
    sget v1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_3
    iput-boolean v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->continueWhenResume:Z

    .line 64
    .line 65
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->sketchResumePlaying()V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 75
    .line 76
    sget v1, Lcom/zykj/view/R$drawable;->view_icon_record_stop:I

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_5
    iput-boolean v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->continueWhenResume:Z

    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 89
    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 102
    .line 103
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 104
    .line 105
    sget v1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v1

    .line 115
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v1

    .line 119
    :cond_8
    iput-boolean v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->continueWhenResume:Z

    .line 120
    .line 121
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 122
    .line 123
    if-eqz v0, :cond_a

    .line 124
    .line 125
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 131
    .line 132
    if-eqz v0, :cond_9

    .line 133
    .line 134
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 135
    .line 136
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 137
    .line 138
    sget v1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v1

    .line 148
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v1
.end method

.method public final play(Ljava/lang/String;IZLr6/c;Lr6/c;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/view/board/play/c;

    .line 7
    .line 8
    move-object v2, p0

    .line 9
    move-object v4, p1

    .line 10
    move v5, p2

    .line 11
    move v3, p3

    .line 12
    move-object v7, p4

    .line 13
    move-object v6, p5

    .line 14
    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/play/c;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILr6/c;Lr6/c;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v2, Lcom/zykj/view/board/play/SketchPlayFragment;->writeFileCallback:Lr6/a;

    .line 18
    .line 19
    iget-object p1, v2, Lcom/zykj/view/board/play/SketchPlayFragment;->permissionRequest:Landroidx/activity/result/ActivityResultLauncher;

    .line 20
    .line 21
    const-string p2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final seekTo(IZLr6/a;Lr6/a;)V
    .locals 8
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lr6/a;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

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
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v2, p0

    .line 18
    move v3, p1

    .line 19
    move v4, p2

    .line 20
    move-object v5, p3

    .line 21
    move-object v6, p4

    .line 22
    invoke-direct/range {v1 .. v7}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/a;Lr6/a;Lh6/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lr6/e;)Lkotlinx/coroutines/w0;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final setAutoHideSeekBarState(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 2
    .line 3
    const/16 v8, 0x7d

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    move v2, p1

    .line 13
    invoke-static/range {v0 .. v9}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->copy$default(Lcom/zykj/view/board/play/SketchPlayExtraConfig;ZZZZLr6/a;Lr6/c;Lr6/c;ILjava/lang/Object;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 18
    .line 19
    return-void
.end method

.method public final setCustomSpeedWindow(Lr6/e;)V
    .locals 1
    .param p1    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/e;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "showCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSpeedRateShowCall:Lr6/e;

    .line 7
    .line 8
    return-void
.end method

.method public final setFullscreenClickListener(Lr6/c;)V
    .locals 11
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "fullscreenClickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 7
    .line 8
    const/16 v9, 0x3f

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v8, p1

    .line 18
    invoke-static/range {v1 .. v10}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->copy$default(Lcom/zykj/view/board/play/SketchPlayExtraConfig;ZZZZLr6/a;Lr6/c;Lr6/c;ILjava/lang/Object;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 23
    .line 24
    return-void
.end method

.method public final setFullscreenRes(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "mBinding"

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1
.end method

.method public final setFullscreenSelected(Z)V
    .locals 3

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
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$setFullscreenSelected$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$setFullscreenSelected$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;ZLh6/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lr6/e;)Lkotlinx/coroutines/w0;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setFullscreenVisible(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 2
    .line 3
    const/16 v8, 0x7e

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    move v1, p1

    .line 13
    invoke-static/range {v0 .. v9}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->copy$default(Lcom/zykj/view/board/play/SketchPlayExtraConfig;ZZZZLr6/a;Lr6/c;Lr6/c;ILjava/lang/Object;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 26
    .line 27
    const-string v0, "ivFullscreen"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/16 v0, 0x8

    .line 37
    .line 38
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string p1, "mBinding"

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    throw p1
.end method

.method public final setInterceptWhenVideo(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 2
    .line 3
    const/16 v8, 0x77

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    move v4, p1

    .line 13
    invoke-static/range {v0 .. v9}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->copy$default(Lcom/zykj/view/board/play/SketchPlayExtraConfig;ZZZZLr6/a;Lr6/c;Lr6/c;ILjava/lang/Object;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->touchSwitchView:Lcom/zykj/view/widget/TouchSwitchView;

    .line 24
    .line 25
    xor-int/lit8 v0, v4, 0x1

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p1, "mBinding"

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1
.end method

.method public final setNewPlayerConfig(Lcom/zykj/view/board/play/NewPlayerConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/view/board/play/NewPlayerConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "newPlayerConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mNewPlayerConfig:Lcom/zykj/view/board/play/NewPlayerConfig;

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
    invoke-direct {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->handleConfig(Lcom/zykj/view/board/play/NewPlayerConfig;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setOnAutoHideAction(Lr6/a;)V
    .locals 11
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onAutoHideAction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 7
    .line 8
    const/16 v9, 0x6f

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    move-object v6, p1

    .line 18
    invoke-static/range {v1 .. v10}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->copy$default(Lcom/zykj/view/board/play/SketchPlayExtraConfig;ZZZZLr6/a;Lr6/c;Lr6/c;ILjava/lang/Object;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 23
    .line 24
    return-void
.end method

.method public final setScaleEnable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->setScaleEnable(Z)V

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

.method public final setSeekBarProgressColor(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "drawable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->seekBar:Landroid/widget/SeekBar;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "mBinding"

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
.end method

.method public final setSeekBarThumbColor(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->seekBar:Landroid/widget/SeekBar;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/AbsSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p1, "mBinding"

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    throw p1
.end method

.method public final setSeekBarVisibleManually(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 2
    .line 3
    const/16 v8, 0x7b

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    move v3, p1

    .line 13
    invoke-static/range {v0 .. v9}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->copy$default(Lcom/zykj/view/board/play/SketchPlayExtraConfig;ZZZZLr6/a;Lr6/c;Lr6/c;ILjava/lang/Object;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 18
    .line 19
    return-void
.end method

.method public final setSketchTapAction(Lr6/c;)V
    .locals 11
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "sketchTapAction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 7
    .line 8
    const/16 v9, 0x5f

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    move-object v7, p1

    .line 18
    invoke-static/range {v1 .. v10}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->copy$default(Lcom/zykj/view/board/play/SketchPlayExtraConfig;ZZZZLr6/a;Lr6/c;Lr6/c;ILjava/lang/Object;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->extraConfig:Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 23
    .line 24
    return-void
.end method

.method public final setSpeedRateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "drawable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvSpeedRate:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "mBinding"

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
.end method

.method public final setSpeedRateItemColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->playSpeedRatePopup:Lcom/zykj/view/board/play/PlaySpeedRatePopup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/play/PlaySpeedRatePopup;->setItemTextColor(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p1, "playSpeedRatePopup"

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1
.end method

.method public setUserVisibleHint(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->stopPlay()V

    .line 13
    .line 14
    .line 15
    :cond_0
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
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mProgressDialog:Landroid/app/ProgressDialog;

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
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mProgressDialog:Landroid/app/ProgressDialog;

    .line 25
    .line 26
    return-void
.end method

.method public final sketchStartPlaying()V
    .locals 3

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
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lr6/e;)Lkotlinx/coroutines/w0;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final startPlay()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->isReady:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v1, Lcom/zykj/view/board/play/SketchPlayFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    aget v0, v1, v0

    .line 26
    .line 27
    :goto_0
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    if-eq v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->sketchStartPlaying()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->sketchResumePlaying()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    const-string v0, "mBinding"

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    throw v0

    .line 49
    :cond_4
    :goto_1
    return-void
.end method

.method public final stopPlay()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->isReady:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "mBinding"

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v3, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 19
    .line 20
    if-eq v0, v3, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v3, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 33
    .line 34
    if-ne v0, v3, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->mBinding:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_4
    return-void
.end method
