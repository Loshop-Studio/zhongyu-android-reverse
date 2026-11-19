.class public Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;
.super Lcom/zykj/mistake/base/BaseMVPActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseMVPActivity<",
        "Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;",
        "Lcom/zykj/mistake/base/BaseMVPActivity;",
        "Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;",
        "",
        "<init>",
        "()V",
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
        "SMAP\nMistakeCreateOrEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCreateOrEditActivity.kt\ncom/zykj/mistake/activity/MistakeCreateOrEditActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1137:1\n257#2,2:1138\n257#2,2:1140\n257#2,2:1142\n257#2,2:1144\n257#2,2:1146\n257#2,2:1148\n257#2,2:1186\n257#2,2:1190\n1#3:1150\n1563#4:1151\n1634#4,3:1152\n774#4:1155\n865#4,2:1156\n1869#4,2:1158\n774#4:1160\n865#4,2:1161\n1869#4,2:1163\n1761#4,3:1165\n1761#4,3:1168\n1761#4,3:1171\n1761#4,3:1174\n1869#4:1177\n1761#4,3:1178\n1870#4:1181\n1869#4,2:1188\n295#4,2:1192\n12637#5,2:1182\n12434#5,2:1184\n*S KotlinDebug\n*F\n+ 1 MistakeCreateOrEditActivity.kt\ncom/zykj/mistake/activity/MistakeCreateOrEditActivity\n*L\n318#1:1138,2\n328#1:1140,2\n348#1:1142,2\n352#1:1144,2\n415#1:1146,2\n416#1:1148,2\n156#1:1186,2\n385#1:1190,2\n498#1:1151\n498#1:1152,3\n555#1:1155\n555#1:1156,2\n555#1:1158,2\n557#1:1160\n557#1:1161,2\n558#1:1163,2\n907#1:1165,3\n912#1:1168,3\n917#1:1171,3\n922#1:1174,3\n926#1:1177\n927#1:1178,3\n926#1:1181\n256#1:1188,2\n689#1:1192,2\n1038#1:1182,2\n1126#1:1184,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic u:I


# instance fields
.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:I

.field public final j:Ld6/e;

.field public final k:Lcom/zykj/view/utils/ImagePicker;

.field public final l:Ljava/lang/String;

.field public m:Z

.field public final n:Ld6/e;

.field public o:Lcom/zykj/mistake/entity/EditMistakeData;

.field public final p:[Ljava/lang/String;

.field public final q:[Ljava/lang/Integer;

.field public final r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

.field public final s:Lcom/zykj/mistake/utils/g;

.field public final t:Landroid/os/Messenger;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;-><init>()V

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
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->g:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 31
    .line 32
    const/4 v0, 0x6

    .line 33
    iput v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->i:I

    .line 34
    .line 35
    new-instance v0, Lcom/zykj/mistake/activity/i;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, v1}, Lcom/zykj/mistake/activity/i;-><init>(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->j:Ld6/e;

    .line 46
    .line 47
    new-instance v0, Lcom/zykj/view/utils/ImagePicker;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-direct {v0, v1, p0, v2, v1}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->k:Lcom/zykj/view/utils/ImagePicker;

    .line 55
    .line 56
    const-string v0, "CreateMistake/Pictures"

    .line 57
    .line 58
    invoke-static {v0}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->l:Ljava/lang/String;

    .line 63
    .line 64
    new-instance v0, Lcom/zykj/mistake/activity/i;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-direct {v0, p0, v1}, Lcom/zykj/mistake/activity/i;-><init>(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->n:Ld6/e;

    .line 75
    .line 76
    const-string v0, ""

    .line 77
    .line 78
    filled-new-array {v0, v0, v0, v0}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->p:[Ljava/lang/String;

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    filled-new-array {v0, v0, v0, v0}, [Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->q:[Ljava/lang/Integer;

    .line 94
    .line 95
    new-instance v0, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 96
    .line 97
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 101
    .line 102
    new-instance v0, Lcom/zykj/mistake/utils/g;

    .line 103
    .line 104
    invoke-direct {v0, p0}, Lcom/zykj/mistake/utils/g;-><init>(Landroidx/activity/result/ActivityResultCaller;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->s:Lcom/zykj/mistake/utils/g;

    .line 108
    .line 109
    new-instance v0, Landroid/os/Messenger;

    .line 110
    .line 111
    new-instance v1, Lcom/blankj/utilcode/util/h;

    .line 112
    .line 113
    const/4 v2, 0x2

    .line 114
    invoke-direct {v1, p0, v2}, Lcom/blankj/utilcode/util/h;-><init>(Landroid/content/ComponentCallbacks;I)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->t:Landroid/os/Messenger;

    .line 121
    .line 122
    return-void
.end method

.method public static C(Landroid/widget/ImageView;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget p1, Lcom/zykj/mistake/R$drawable;->bg_mistake_create_solid_box:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget p1, Lcom/zykj/mistake/R$drawable;->bg_mistake_create_dash_box:I

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static u(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.zykj.mistake.widget.FlowLayout"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/zykj/mistake/widget/FlowLayout;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4, v2}, Landroid/view/View;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->setSelected(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;
    .locals 4

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p2, v1

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move p3, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p3, 0x1

    .line 14
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    # RE layout layout/item_mistake_tag (0x7f0c0063), APK res/Cz.xml
    sget v2, Lcom/zykj/mistake/R$layout;->item_mistake_tag:I

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget v2, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroid/widget/TextView;

    .line 35
    .line 36
    sget v3, Lcom/zykj/mistake/R$id;->iv_add:I

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Landroid/widget/ImageView;

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    .line 45
    .line 46
    .line 47
    const/16 p2, 0x8

    .line 48
    .line 49
    if-eqz p3, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2, p2}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    new-instance p2, Lcom/zykj/mistake/activity/j;

    .line 72
    .line 73
    const/4 p3, 0x1

    .line 74
    invoke-direct {p2, p0, p3}, Lcom/zykj/mistake/activity/j;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    new-instance p2, Lcom/zykj/mistake/activity/k;

    .line 81
    .line 82
    const/4 p3, 0x0

    .line 83
    invoke-direct {p2, v0, p0, p1, p3}, Lcom/zykj/mistake/activity/k;-><init>(Landroid/view/View;Lcom/zykj/mistake/base/BaseMVPActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    new-instance p2, Lcom/zykj/mistake/activity/l;

    .line 90
    .line 91
    invoke-direct {p2, p3, p1, p0}, Lcom/zykj/mistake/activity/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 14
    .line 15
    .line 16
    sget v0, Lcom/zykj/mistake/R$string;->edit_mistake_success:I

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "getString(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

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
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 36
    .line 37
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2, v1}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "EDIT_MISTAKE_DATA"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 55
    .line 56
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->t:Lorg/angmarch/views/NiceSpinner;

    .line 57
    .line 58
    invoke-virtual {v1}, Lorg/angmarch/views/NiceSpinner;->getSelectedIndex()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget-object v2, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->e:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {v1, v2}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;

    .line 69
    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;->getContent()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const/4 v1, 0x0

    .line 78
    :goto_0
    if-nez v1, :cond_1

    .line 79
    .line 80
    const-string v1, ""

    .line 81
    .line 82
    :cond_1
    const-string v2, "EDIT_MISTAKE_SUBJECT_NAME"

    .line 83
    .line 84
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->f:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2, v1}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "EDIT_MISTAKE_TAGS"

    .line 98
    .line 99
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    const/4 v1, -0x1

    .line 103
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final B(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ILandroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->d(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/zykj/mistake/activity/q;

    .line 6
    .line 7
    invoke-direct {v0, p0, p3, p1, p2}, Lcom/zykj/mistake/activity/q;-><init>(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lio/reactivex/internal/operators/observable/b;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lio/reactivex/internal/operators/observable/b;-><init>(Lcom/zykj/mistake/activity/q;)V

    .line 13
    .line 14
    .line 15
    sget-object p2, Lc6/f;->a:Lq5/j;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lq5/e;->d(Lq5/j;)Lio/reactivex/internal/operators/observable/j;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lr5/b;->a()Lr5/e;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Lq5/e;->a(Lr5/e;)Lio/reactivex/internal/operators/observable/f;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Lcom/zykj/mistake/activity/t;

    .line 30
    .line 31
    invoke-direct {p2, p4, p5, p6, p0}, Lcom/zykj/mistake/activity/t;-><init>(ILandroid/widget/ImageView;Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lq5/e;->b(Lq5/g;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final o()I
    .locals 1

    .line 1
    # RE layout layout/activity_mistake_create_or_edit (0x7f0c001f), APK res/wi.xml
    sget v0, Lcom/zykj/mistake/R$layout;->activity_mistake_create_or_edit:I

    .line 2
    .line 3
    return v0
.end method

.method public final q()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "editMistakeData"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    move-result-object v1

    .line 3
    new-instance v2, Lk1/a;

    const-class v3, Lcom/zykj/mistake/entity/EditMistakeData;

    invoke-direct {v2, v3}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/entity/EditMistakeData;

    .line 6
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 7
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->t:Lorg/angmarch/views/NiceSpinner;

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 9
    new-instance v2, Lcom/zykj/mistake/activity/r;

    invoke-direct {v2, p0}, Lcom/zykj/mistake/activity/r;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;)V

    invoke-virtual {v0, v2}, Lorg/angmarch/views/NiceSpinner;->setOnSpinnerItemSelectedListener(La8/e;)V

    .line 10
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 11
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->u:Landroid/widget/TextView;

    .line 12
    iget-object v2, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v2, :cond_0

    .line 13
    sget v2, Lcom/zykj/mistake/R$string;->edit_mistake:I

    goto :goto_0

    .line 14
    :cond_0
    sget v2, Lcom/zykj/mistake/R$string;->custom_mistake:I

    .line 15
    :goto_0
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->h:Landroid/widget/ImageButton;

    new-instance v2, Lcom/zykj/mistake/activity/j;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, Lcom/zykj/mistake/activity/j;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->d:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/zykj/mistake/entity/EditMistakeData;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    const-string v2, ""

    :cond_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "isCustomMistake"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x0

    .line 19
    const-string v3, "ivSecondStem"

    const-string v4, "ivFirstStem"

    const/4 v5, 0x0

    if-eqz v0, :cond_7

    .line 20
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->l:Landroid/widget/ImageView;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v4

    check-cast v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v4, v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->n:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v6, "ivFirstStemDelete"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v6, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/zykj/mistake/entity/EditMistakeData;->getStem()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v2, v6}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v6, v5

    .line 23
    :goto_1
    invoke-virtual {p0, v2, v0, v4, v6}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->y(ILandroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->q:Landroid/widget/ImageView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->s:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v4, "ivSecondStemDelete"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v4, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/zykj/mistake/entity/EditMistakeData;->getStem()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v1, v4}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object v4, v5

    .line 27
    :goto_2
    invoke-virtual {p0, v1, v0, v3, v4}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->y(ILandroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->j:Landroid/widget/ImageView;

    const-string v3, "ivFirstAnswer"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v4, "ivFirstAnswerDelete"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v4, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/zykj/mistake/entity/EditMistakeData;->getAnswer()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {v2, v4}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_3

    :cond_5
    move-object v4, v5

    :goto_3
    const/4 v6, 0x2

    .line 31
    invoke-virtual {p0, v6, v0, v3, v4}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->y(ILandroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->o:Landroid/widget/ImageView;

    const-string v3, "ivSecondAnswer"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->p:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v4, "ivSecondAnswerDelete"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v4, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/zykj/mistake/entity/EditMistakeData;->getAnswer()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-static {v1, v4}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    :cond_6
    const/4 v1, 0x3

    .line 35
    invoke-virtual {p0, v1, v0, v3, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->y(ILandroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/String;)V

    goto/16 :goto_5

    .line 36
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->l:Landroid/widget/ImageView;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v4

    check-cast v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v4, v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->m:Landroid/widget/ImageView;

    const-string v6, "ivFirstStemBackground"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v6, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lcom/zykj/mistake/entity/EditMistakeData;->getStem()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-static {v2, v6}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_a

    :cond_8
    iget-object v6, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lcom/zykj/mistake/entity/EditMistakeData;->getStemShoot()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_9
    move-object v6, v5

    .line 39
    :cond_a
    :goto_4
    invoke-virtual {p0, v0, v4, v6}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->x(Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->q:Landroid/widget/ImageView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->r:Landroid/widget/ImageView;

    const-string v4, "ivSecondStemBackground"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v4, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lcom/zykj/mistake/entity/EditMistakeData;->getStem()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-static {v1, v4}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    .line 43
    :cond_b
    invoke-virtual {p0, v0, v3, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->x(Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->f:Landroidx/constraintlayout/widget/Group;

    const-string v1, "groupAnswer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    .line 45
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 46
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->d:Landroid/widget/EditText;

    .line 47
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->d:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 48
    sget v5, Lcom/zykj/mistake/R$id;->view_fixed_content_width_anchor:I

    iput v5, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 49
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 51
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 52
    sget v4, Lcom/zykj/mistake/R$id;->view_fixed_content_width_anchor:I

    iput v4, v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 53
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->g:Landroidx/constraintlayout/widget/Group;

    const-string v3, "groupPhotoTip"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 56
    :goto_5
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 57
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/zykj/mistake/entity/EditMistakeData;->getTag()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 58
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 59
    :cond_c
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->z(Ljava/util/ArrayList;)V

    .line 60
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->a:Landroid/widget/TextView;

    new-instance v1, Lcom/zykj/mistake/activity/j;

    const/4 v3, 0x4

    invoke-direct {v1, p0, v3}, Lcom/zykj/mistake/activity/j;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    const-string v1, "btnMainConfirm"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/mistake/activity/i;

    const/4 v3, 0x2

    invoke-direct {v1, p0, v3}, Lcom/zykj/mistake/activity/i;-><init>(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;I)V

    invoke-static {v0, v1}, Lcom/zykj/mistake/utils/e;->e(Landroid/view/View;Lr6/a;)V

    .line 62
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 63
    iget-object v1, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->j:Landroid/widget/TextView;

    sget v3, Lcom/zykj/mistake/R$string;->add_mistake_tag:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 65
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 66
    sget v3, Lcom/zykj/mistake/R$string;->easy:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v3, "getString(...)"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    new-instance v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-wide/16 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    const/4 v5, 0x6

    .line 68
    invoke-static {p0, v4, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 69
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 70
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 71
    sget v4, Lcom/zykj/mistake/R$string;->normal:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-wide/16 v8, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 73
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 74
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 76
    sget v4, Lcom/zykj/mistake/R$string;->hard:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x3

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 78
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 79
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 81
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 82
    sget v4, Lcom/zykj/mistake/R$string;->unknow:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x1

    const/4 v11, 0x1

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 84
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 85
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 87
    sget v4, Lcom/zykj/mistake/R$string;->generally:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x2

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 89
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 90
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 91
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 92
    sget v4, Lcom/zykj/mistake/R$string;->obviously:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x3

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 94
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 95
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 96
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 97
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 98
    sget v4, Lcom/zykj/mistake/R$string;->concept:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x1

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 100
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 101
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 102
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 103
    sget v4, Lcom/zykj/mistake/R$string;->examination:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x2

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 105
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 106
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 107
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 108
    sget v4, Lcom/zykj/mistake/R$string;->calculate:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x3

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 110
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v4

    .line 111
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 113
    sget v4, Lcom/zykj/mistake/R$string;->careless:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    const-wide/16 v8, 0x4

    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 115
    invoke-static {p0, v6, v2, v5}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    move-result-object v2

    .line 116
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    iget-object v1, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->b:Landroid/widget/TextView;

    new-instance v2, Lcom/zykj/mistake/activity/j;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lcom/zykj/mistake/activity/j;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    iget-object v1, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->a:Landroid/widget/TextView;

    new-instance v2, La5/f;

    const/4 v3, 0x4

    invoke-direct {v2, v3, p0, v0}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final s()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "isCustomMistake"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 14
    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/EditMistakeData;->getId()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setId(Ljava/lang/Long;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/EditMistakeData;->getStemShoot()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    :cond_1
    const-string v0, ""

    .line 43
    .line 44
    :cond_2
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setStemShoot(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/EditMistakeData;->getStem()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setExtraStems(Ljava/util/ArrayList;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/EditMistakeData;->getAnswer()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setExtraAnswers(Ljava/util/ArrayList;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 91
    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/EditMistakeData;->getId()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    goto :goto_0

    .line 103
    :cond_6
    move-object v0, v1

    .line 104
    :goto_0
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setId(Ljava/lang/Long;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setStemShoot(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setExtraStems(Ljava/util/ArrayList;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setExtraAnswers(Ljava/util/ArrayList;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 121
    .line 122
    sget-object v1, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 123
    .line 124
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {v1}, Lcom/zykj/mistake/network/b;->u()Lq5/e;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v2, Lb5/b;

    .line 133
    .line 134
    const/4 v3, 0x4

    .line 135
    invoke-direct {v2, v0, v3}, Lb5/b;-><init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 146
    .line 147
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    const-string v2, "com.zykj.mistake"

    .line 152
    .line 153
    invoke-interface {v1, v2}, Lcom/zykj/mistake/network/b;->m(Ljava/lang/String;)Lq5/e;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    new-instance v2, Lb5/b;

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-direct {v2, v0, v3}, Lb5/b;-><init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final w(Lcom/zykj/mistake/entity/resp/CustomTagInfo;Z)Landroid/view/View;
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    # RE layout layout/item_mistake_tag_delete (0x7f0c0064), APK res/IG.xml
    sget v1, Lcom/zykj/mistake/R$layout;->item_mistake_tag_delete:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget v1, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/widget/TextView;

    .line 19
    .line 20
    sget v2, Lcom/zykj/mistake/R$id;->iv_item_tag_delete:I

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/widget/ImageView;

    .line 27
    .line 28
    sget v3, Lcom/zykj/mistake/R$id;->iv_add:I

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Landroid/widget/ImageView;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    new-instance p2, Lcom/zykj/mistake/activity/j;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-direct {p2, p0, v1}, Lcom/zykj/mistake/activity/j;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    new-instance p2, La5/f;

    .line 77
    .line 78
    const/4 v1, 0x3

    .line 79
    invoke-direct {p2, v1, p0, p1}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method

.method public final x(Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2, p0}, Lo0/h;->c(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p3}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    new-instance v0, Lr0/d;

    .line 16
    .line 17
    invoke-direct {v0}, Lr0/a;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lb0/o;->b:Lb0/m;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lr0/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Lr0/a;->r()Lr0/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 37
    .line 38
    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->C(Landroid/widget/ImageView;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/16 v0, 0x8

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    :goto_0
    new-instance p2, La5/f;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-direct {p2, v0, p3, p0}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final y(ILandroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p4, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, p0}, Lo0/h;->c(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p4}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lr0/d;

    .line 17
    .line 18
    invoke-direct {v2}, Lr0/a;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v3, Lb0/o;->b:Lb0/m;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lr0/d;

    .line 28
    .line 29
    invoke-virtual {v2}, Lr0/a;->r()Lr0/a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, p2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2, v1}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->C(Landroid/widget/ImageView;Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v0}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->C(Landroid/widget/ImageView;Z)V

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x8

    .line 58
    .line 59
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    :goto_0
    new-instance v1, Lcom/zykj/mistake/activity/s;

    .line 63
    .line 64
    move-object v3, p0

    .line 65
    move v4, p1

    .line 66
    move-object v2, p2

    .line 67
    move-object v6, p3

    .line 68
    move-object v5, p4

    .line 69
    invoke-direct/range {v1 .. v6}, Lcom/zykj/mistake/activity/s;-><init>(Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;ILjava/lang/String;Landroid/widget/ImageView;)V

    .line 70
    .line 71
    .line 72
    move v3, v4

    .line 73
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    move-object v7, v6

    .line 77
    move-object v6, v2

    .line 78
    new-instance v2, Lcom/zykj/mistake/activity/s;

    .line 79
    .line 80
    move-object v4, p0

    .line 81
    invoke-direct/range {v2 .. v7}, Lcom/zykj/mistake/activity/s;-><init>(ILcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 82
    .line 83
    .line 84
    move-object v6, v7

    .line 85
    invoke-virtual {v6, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final z(Ljava/util/ArrayList;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v1, p0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->i:I

    .line 17
    .line 18
    if-ge v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 27
    .line 28
    new-instance v1, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 29
    .line 30
    const/16 v7, 0xf

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct/range {v1 .. v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-virtual {p0, v1, v2}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->w(Lcom/zykj/mistake/entity/resp/CustomTagInfo;Z)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x0

    .line 54
    move v2, v1

    .line 55
    :goto_0
    if-ge v2, v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 70
    .line 71
    iget-object v4, v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 72
    .line 73
    invoke-virtual {p0, v3, v1}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->w(Lcom/zykj/mistake/entity/resp/CustomTagInfo;Z)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-void
.end method
