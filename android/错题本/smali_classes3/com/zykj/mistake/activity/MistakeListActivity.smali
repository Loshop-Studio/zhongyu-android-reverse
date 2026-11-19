# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final Lcom/zykj/mistake/activity/MistakeListActivity;
.super Lcom/zykj/mistake/base/BaseMVPActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseMVPActivity<",
        "Lcom/zykj/mistake/presenter/MistakeListPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/mistake/activity/MistakeListActivity;",
        "Lcom/zykj/mistake/base/BaseMVPActivity;",
        "Lcom/zykj/mistake/presenter/MistakeListPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;",
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
        "SMAP\nMistakeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeListActivity.kt\ncom/zykj/mistake/activity/MistakeListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,854:1\n1869#2,2:855\n1869#2,2:857\n1869#2:859\n1869#2:860\n774#2:861\n865#2,2:862\n1869#2,2:864\n1870#2:866\n1870#2:867\n1869#2:868\n230#2,2:869\n1870#2:871\n1761#2,3:872\n1761#2,3:875\n1761#2,3:878\n1869#2:881\n1761#2,3:882\n1870#2:885\n774#2:886\n865#2,2:887\n774#2:889\n865#2,2:890\n1869#2,2:892\n774#2:894\n865#2,2:895\n1869#2,2:897\n774#2:899\n865#2,2:900\n1869#2,2:902\n774#2:904\n865#2,2:905\n1869#2,2:907\n1869#2,2:909\n774#2:911\n865#2,2:912\n1869#2,2:914\n230#2,2:916\n*S KotlinDebug\n*F\n+ 1 MistakeListActivity.kt\ncom/zykj/mistake/activity/MistakeListActivity\n*L\n172#1:855,2\n269#1:857,2\n288#1:859\n293#1:860\n294#1:861\n294#1:862,2\n295#1:864,2\n293#1:866\n288#1:867\n621#1:868\n621#1:869,2\n621#1:871\n674#1:872,3\n685#1:875,3\n696#1:878,3\n701#1:881\n705#1:882,3\n701#1:885\n777#1:886\n777#1:887,2\n830#1:889\n830#1:890,2\n830#1:892,2\n832#1:894\n832#1:895,2\n832#1:897,2\n389#1:899\n389#1:900,2\n389#1:902,2\n407#1:904\n407#1:905,2\n407#1:907,2\n412#1:909,2\n440#1:911\n440#1:912,2\n462#1:914,2\n738#1:916,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic x:I


# instance fields
.field public final e:Ljava/util/ArrayList;

.field public f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

.field public g:Landroid/app/Dialog;

.field public h:Ll4/i;

.field public final i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public final n:Lcom/zykj/mistake/entity/req/MistakeListReq;

.field public final o:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

.field public final p:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

.field public q:J

.field public r:J

.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/ArrayList;

.field public final u:Ljava/util/ArrayList;

.field public final v:I

.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 1

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
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v0, 0xa

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->i:I

    .line 14
    .line 15
    new-instance v0, Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MistakeListReq;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->o:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 28
    .line 29
    new-instance v0, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->p:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->u:Ljava/util/ArrayList;

    .line 56
    .line 57
    const/4 v0, 0x6

    .line 58
    iput v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->v:I

    .line 59
    .line 60
    return-void
.end method

.method public static D(Landroid/view/ViewGroup;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public static y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;
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
    new-instance p2, Lcom/zykj/mistake/activity/z;

    .line 72
    .line 73
    const/16 p3, 0xb

    .line 74
    .line 75
    invoke-direct {p2, p0, p3}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    .line 80
    .line 81
    new-instance p2, Lcom/zykj/mistake/activity/k;

    .line 82
    .line 83
    const/4 p3, 0x2

    .line 84
    invoke-direct {p2, v0, p0, p1, p3}, Lcom/zykj/mistake/activity/k;-><init>(Landroid/view/View;Lcom/zykj/mistake/base/BaseMVPActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    new-instance p2, Lcom/zykj/mistake/activity/l;

    .line 91
    .line 92
    invoke-direct {p2, p0, p1}, Lcom/zykj/mistake/activity/l;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method


# virtual methods
.method public final A(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    if-ge v2, v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 29
    .line 30
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 31
    .line 32
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3, v1}, Landroid/view/View;->setSelected(Z)V

    .line 39
    .line 40
    .line 41
    check-cast v3, Landroid/view/ViewGroup;

    .line 42
    .line 43
    invoke-static {v3, p1}, Lcom/zykj/mistake/activity/MistakeListActivity;->D(Landroid/view/ViewGroup;Z)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    move v2, v1

    .line 64
    :goto_1
    if-ge v2, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 71
    .line 72
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 73
    .line 74
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3, v1}, Landroid/view/View;->setSelected(Z)V

    .line 81
    .line 82
    .line 83
    check-cast v3, Landroid/view/ViewGroup;

    .line 84
    .line 85
    invoke-static {v3, p1}, Lcom/zykj/mistake/activity/MistakeListActivity;->D(Landroid/view/ViewGroup;Z)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 96
    .line 97
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 98
    .line 99
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    move v2, v1

    .line 106
    :goto_2
    if-ge v2, v0, :cond_2

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 113
    .line 114
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 115
    .line 116
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3, v1}, Landroid/view/View;->setSelected(Z)V

    .line 123
    .line 124
    .line 125
    check-cast v3, Landroid/view/ViewGroup;

    .line 126
    .line 127
    invoke-static {v3, p1}, Lcom/zykj/mistake/activity/MistakeListActivity;->D(Landroid/view/ViewGroup;Z)V

    .line 128
    .line 129
    .line 130
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 138
    .line 139
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 140
    .line 141
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    move v2, v1

    .line 148
    :goto_3
    if-ge v2, v0, :cond_3

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 155
    .line 156
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 157
    .line 158
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 159
    .line 160
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v3, v1}, Landroid/view/View;->setSelected(Z)V

    .line 165
    .line 166
    .line 167
    check-cast v3, Landroid/view/ViewGroup;

    .line 168
    .line 169
    invoke-static {v3, p1}, Lcom/zykj/mistake/activity/MistakeListActivity;->D(Landroid/view/ViewGroup;Z)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v2, v2, 0x1

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_3
    return-void
.end method

.method public final B(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->q:Landroid/widget/TextView;

    .line 10
    .line 11
    sget v0, Lcom/zykj/mistake/R$string;->practice_mode_open:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->q:Landroid/widget/TextView;

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->q:Landroid/widget/TextView;

    .line 40
    .line 41
    sget v0, Lcom/zykj/mistake/R$string;->practice_mode_close:I

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 55
    .line 56
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->q:Landroid/widget/TextView;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final C(Landroid/view/View;Lcom/zykj/mistake/entity/resp/CustomTagInfo;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->w:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->c:Lcom/zykj/mistake/widget/FlowLayout;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    :cond_0
    :goto_0
    if-ge v2, v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 44
    .line 45
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v6, 0x3

    .line 50
    if-ne v5, v6, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    const/4 v0, 0x1

    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final E(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->m:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {v1, v0, p1}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->a(ZLjava/lang/Integer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->p:Landroid/widget/TextView;

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->o:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->q:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->h:Landroid/widget/LinearLayout;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeListActivity;->w()V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeListActivity;->v()V

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    const-string p1, "mMistakeListAdapter"

    .line 89
    .line 90
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    throw p1
.end method

.method public final o()I
    .locals 1

    .line 1
    # RE layout layout/activity_mistake_list (0x7f0c0021), APK res/da1.xml
    sget v0, Lcom/zykj/mistake/R$layout;->activity_mistake_list:I

    .line 2
    .line 3
    return v0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const-string p1, "IS_DELETED"

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget p1, Lcom/zykj/mistake/R$string;->remove_mistake_success:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "getString(...)"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/bumptech/glide/b;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x4

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 18
    .line 19
    const v1, 0x800005

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->isDrawerOpen(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v2, 0x1

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawer(I)V

    .line 38
    .line 39
    .line 40
    return v2

    .line 41
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->m:Z

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeListActivity;->x()V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    :cond_2
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1
.end method

.method public final onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setSkipCount(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/presenter/MistakeListPresenter;->d(Lcom/zykj/mistake/entity/req/MistakeListReq;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

# RE I/O 读取布尔偏好（SharedPreferences.getBoolean）。
.method public final q()V
    .locals 6

    .line 1
    const-string v0, "zykjMistake"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v2, "SP_CONTACT_MODE"

    .line 9
    .line 10
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/activity/MistakeListActivity;->B(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->q:Landroid/widget/TextView;

    .line 24
    .line 25
    new-instance v1, Lcom/zykj/mistake/activity/z;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 41
    .line 42
    sget v1, Lcom/zykj/mistake/R$color;->colorPrimary:I

    .line 43
    .line 44
    filled-new-array {v1}, [I

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 58
    .line 59
    new-instance v1, Lcom/zykj/mistake/activity/r;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Lcom/zykj/mistake/activity/r;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"

    .line 80
    .line 81
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 91
    .line 92
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 93
    .line 94
    new-instance v2, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;

    .line 95
    .line 96
    invoke-direct {v2, p0, v0}, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;Landroidx/recyclerview/widget/GridLayoutManager;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 103
    .line 104
    const-string v1, "mMistakeList"

    .line 105
    .line 106
    iget-object v2, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p0, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->a:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 115
    .line 116
    iput-object v2, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->b:Ljava/util/ArrayList;

    .line 117
    .line 118
    iput-object p0, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter;->c:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 119
    .line 120
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 127
    .line 128
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 129
    .line 130
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    if-eqz v1, :cond_1

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 136
    .line 137
    .line 138
    new-instance v0, Ll4/i;

    .line 139
    .line 140
    const/4 v1, 0x6

    .line 141
    invoke-direct {v0, p0, v1}, Ll4/i;-><init>(Landroid/content/Context;I)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->h:Ll4/i;

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 151
    .line 152
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 163
    .line 164
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 165
    .line 166
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->j:Landroid/widget/TextView;

    .line 167
    .line 168
    sget v3, Lcom/zykj/mistake/R$string;->edit_tag:I

    .line 169
    .line 170
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 182
    .line 183
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 184
    .line 185
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->b:Landroid/widget/TextView;

    .line 186
    .line 187
    new-instance v3, Lcom/zykj/mistake/activity/z;

    .line 188
    .line 189
    const/4 v4, 0x1

    .line 190
    invoke-direct {v3, p0, v4}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 201
    .line 202
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 203
    .line 204
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->a:Landroid/widget/TextView;

    .line 205
    .line 206
    new-instance v3, Lcom/zykj/mistake/activity/z;

    .line 207
    .line 208
    const/4 v4, 0x2

    .line 209
    invoke-direct {v3, p0, v4}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    .line 214
    .line 215
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    # RE layout layout/item_mistake_tag (0x7f0c0063), APK res/Cz.xml
    sget v3, Lcom/zykj/mistake/R$layout;->item_mistake_tag:I

    .line 220
    .line 221
    invoke-virtual {v0, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget v3, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 226
    .line 227
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    check-cast v3, Landroid/widget/TextView;

    .line 232
    .line 233
    sget v4, Lcom/zykj/mistake/R$string;->no_tag:I

    .line 234
    .line 235
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    new-instance v4, La5/f;

    .line 243
    .line 244
    const/4 v5, 0x6

    .line 245
    invoke-direct {v4, v5, v0, p0}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 256
    .line 257
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 258
    .line 259
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->c:Lcom/zykj/mistake/widget/FlowLayout;

    .line 260
    .line 261
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    # RE layout layout/dialog_remove_mistake (0x7f0c0049), APK res/DT.xml
    sget v3, Lcom/zykj/mistake/R$layout;->dialog_remove_mistake:I

    .line 269
    .line 270
    invoke-virtual {v0, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    const-string v3, "inflate(...)"

    .line 275
    .line 276
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    sget v3, Lcom/zykj/mistake/R$id;->tv_cancel:I

    .line 280
    .line 281
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    check-cast v3, Landroid/widget/TextView;

    .line 286
    .line 287
    new-instance v4, Lcom/zykj/mistake/activity/z;

    .line 288
    .line 289
    const/16 v5, 0x9

    .line 290
    .line 291
    invoke-direct {v4, p0, v5}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 295
    .line 296
    .line 297
    sget v3, Lcom/zykj/mistake/R$id;->tv_confirm:I

    .line 298
    .line 299
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    check-cast v3, Landroid/widget/TextView;

    .line 304
    .line 305
    new-instance v4, Lcom/zykj/mistake/activity/z;

    .line 306
    .line 307
    const/16 v5, 0xa

    .line 308
    .line 309
    invoke-direct {v4, p0, v5}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    .line 314
    .line 315
    new-instance v3, Landroid/app/Dialog;

    .line 316
    .line 317
    sget v4, Lcom/zykj/mistake/R$style;->remind_dialog_theme:I

    .line 318
    .line 319
    invoke-direct {v3, p0, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 320
    .line 321
    .line 322
    iput-object v3, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 323
    .line 324
    invoke-virtual {v3, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 328
    .line 329
    if-eqz v0, :cond_0

    .line 330
    .line 331
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 339
    .line 340
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->c:Landroid/widget/ImageView;

    .line 341
    .line 342
    new-instance v1, Lcom/zykj/mistake/activity/z;

    .line 343
    .line 344
    const/4 v2, 0x3

    .line 345
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 356
    .line 357
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->p:Landroid/widget/TextView;

    .line 358
    .line 359
    new-instance v1, Lcom/zykj/mistake/activity/z;

    .line 360
    .line 361
    const/4 v2, 0x4

    .line 362
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 373
    .line 374
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->o:Landroid/widget/TextView;

    .line 375
    .line 376
    new-instance v1, Lcom/zykj/mistake/activity/z;

    .line 377
    .line 378
    const/4 v2, 0x5

    .line 379
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 390
    .line 391
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->f:Landroid/widget/LinearLayout;

    .line 392
    .line 393
    new-instance v1, Lcom/zykj/mistake/activity/z;

    .line 394
    .line 395
    const/4 v2, 0x6

    .line 396
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 407
    .line 408
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->g:Landroid/widget/LinearLayout;

    .line 409
    .line 410
    new-instance v1, Lcom/zykj/mistake/activity/z;

    .line 411
    .line 412
    const/4 v2, 0x7

    .line 413
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 424
    .line 425
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->i:Landroid/widget/LinearLayout;

    .line 426
    .line 427
    new-instance v1, Lcom/zykj/mistake/activity/z;

    .line 428
    .line 429
    const/16 v2, 0x8

    .line 430
    .line 431
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/z;-><init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 435
    .line 436
    .line 437
    return-void

    .line 438
    :cond_0
    const-string v0, "mRemoveMistakeDialog"

    .line 439
    .line 440
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    throw v2

    .line 444
    :cond_1
    const-string v0, "mMistakeListAdapter"

    .line 445
    .line 446
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v2
.end method

.method public final s()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->r:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "name"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "bookId"

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    iput-wide v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->q:J

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "topicId"

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    iput-wide v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->r:J

    .line 47
    .line 48
    iget-wide v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->q:J

    .line 49
    .line 50
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setBookId(Ljava/lang/Long;)V

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x14

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setMaxResultCount(I)V

    .line 62
    .line 63
    .line 64
    iget-wide v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->q:J

    .line 65
    .line 66
    long-to-int v0, v0

    .line 67
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->o:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;->setBookId(I)V

    .line 70
    .line 71
    .line 72
    iget-wide v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->q:J

    .line 73
    .line 74
    long-to-int v0, v0

    .line 75
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->p:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setBookId(I)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setSkipCount(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/presenter/MistakeListPresenter;->d(Lcom/zykj/mistake/entity/req/MistakeListReq;Z)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->j:Landroid/widget/LinearLayout;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->j:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->f:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->d:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->m:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->g:Landroid/widget/LinearLayout;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->e:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->n:Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->f:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->d:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->m:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->g:Landroid/widget/LinearLayout;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->e:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->n:Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->m:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-boolean v3, p0, Lcom/zykj/mistake/activity/MistakeListActivity;->m:Z

    .line 15
    .line 16
    invoke-virtual {v1, v3, v2}, Lcom/zykj/mistake/adapter/MistakeListAdapter;->a(ZLjava/lang/Integer;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->p:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 35
    .line 36
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->o:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 46
    .line 47
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->q:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 57
    .line 58
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->h:Landroid/widget/LinearLayout;

    .line 59
    .line 60
    const/16 v1, 0x8

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    const-string v0, "mMistakeListAdapter"

    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v2
.end method

.method public final z(Ljava/util/ArrayList;Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 10
    .line 11
    iget-object v2, v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 12
    .line 13
    iget-object v2, v2, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 23
    .line 24
    iget-object v2, v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 25
    .line 26
    iget-object v2, v2, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 36
    .line 37
    iget-object v2, v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 38
    .line 39
    iget-object v2, v2, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 49
    .line 50
    iget-object v2, v2, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 51
    .line 52
    iget-object v2, v2, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    move v3, v2

    .line 59
    :goto_0
    const/4 v4, 0x4

    .line 60
    const/4 v5, 0x1

    .line 61
    const/4 v6, 0x3

    .line 62
    if-ge v3, v6, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 69
    .line 70
    iget-object v6, v6, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 71
    .line 72
    iget-object v6, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 73
    .line 74
    new-instance v7, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 75
    .line 76
    sget-object v15, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    .line 77
    .line 78
    aget-object v8, v15, v3

    .line 79
    .line 80
    add-int/lit8 v9, v3, 0x1

    .line 81
    .line 82
    move v11, v9

    .line 83
    int-to-long v9, v11

    .line 84
    const/4 v13, 0x4

    .line 85
    const/4 v14, 0x0

    .line 86
    move v12, v11

    .line 87
    const/4 v11, 0x0

    .line 88
    move/from16 v16, v12

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    invoke-direct/range {v7 .. v14}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_1

    .line 99
    .line 100
    :cond_0
    move v5, v2

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    move v9, v2

    .line 107
    :cond_2
    if-ge v9, v8, :cond_0

    .line 108
    .line 109
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    add-int/lit8 v9, v9, 0x1

    .line 114
    .line 115
    check-cast v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 116
    .line 117
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-nez v11, :cond_2

    .line 122
    .line 123
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    aget-object v11, v15, v3

    .line 128
    .line 129
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_2

    .line 134
    .line 135
    :goto_1
    invoke-static {v0, v7, v5, v4}, Lcom/zykj/mistake/activity/MistakeListActivity;->y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    move/from16 v3, v16

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_3
    move v3, v2

    .line 146
    :goto_2
    if-ge v3, v6, :cond_7

    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    check-cast v7, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 153
    .line 154
    iget-object v7, v7, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 155
    .line 156
    iget-object v7, v7, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 157
    .line 158
    new-instance v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 159
    .line 160
    sget-object v16, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    .line 161
    .line 162
    aget-object v9, v16, v3

    .line 163
    .line 164
    add-int/lit8 v10, v3, 0x1

    .line 165
    .line 166
    move v12, v10

    .line 167
    int-to-long v10, v12

    .line 168
    const/4 v14, 0x4

    .line 169
    const/4 v15, 0x0

    .line 170
    move v13, v12

    .line 171
    const/4 v12, 0x0

    .line 172
    move/from16 v17, v13

    .line 173
    .line 174
    const/4 v13, 0x1

    .line 175
    invoke-direct/range {v8 .. v15}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-eqz v9, :cond_5

    .line 183
    .line 184
    :cond_4
    move v3, v2

    .line 185
    goto :goto_3

    .line 186
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    move v10, v2

    .line 191
    :cond_6
    if-ge v10, v9, :cond_4

    .line 192
    .line 193
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    add-int/lit8 v10, v10, 0x1

    .line 198
    .line 199
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 200
    .line 201
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    if-ne v12, v5, :cond_6

    .line 206
    .line 207
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    aget-object v12, v16, v3

    .line 212
    .line 213
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-eqz v11, :cond_6

    .line 218
    .line 219
    move v3, v5

    .line 220
    :goto_3
    invoke-static {v0, v8, v3, v4}, Lcom/zykj/mistake/activity/MistakeListActivity;->y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 225
    .line 226
    .line 227
    move/from16 v3, v17

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_7
    move v3, v2

    .line 231
    :goto_4
    const/4 v6, 0x2

    .line 232
    if-ge v3, v4, :cond_b

    .line 233
    .line 234
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    check-cast v7, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 239
    .line 240
    iget-object v7, v7, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 241
    .line 242
    iget-object v7, v7, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 243
    .line 244
    new-instance v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 245
    .line 246
    sget-object v16, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    .line 247
    .line 248
    aget-object v9, v16, v3

    .line 249
    .line 250
    add-int/lit8 v10, v3, 0x1

    .line 251
    .line 252
    move v12, v10

    .line 253
    int-to-long v10, v12

    .line 254
    const/4 v14, 0x4

    .line 255
    const/4 v15, 0x0

    .line 256
    move v13, v12

    .line 257
    const/4 v12, 0x0

    .line 258
    move/from16 v17, v13

    .line 259
    .line 260
    const/4 v13, 0x2

    .line 261
    invoke-direct/range {v8 .. v15}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    if-eqz v9, :cond_9

    .line 269
    .line 270
    :cond_8
    move v3, v2

    .line 271
    goto :goto_5

    .line 272
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    move v10, v2

    .line 277
    :cond_a
    if-ge v10, v9, :cond_8

    .line 278
    .line 279
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    add-int/lit8 v10, v10, 0x1

    .line 284
    .line 285
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 286
    .line 287
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    if-ne v12, v6, :cond_a

    .line 292
    .line 293
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    aget-object v12, v16, v3

    .line 298
    .line 299
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    if-eqz v11, :cond_a

    .line 304
    .line 305
    move v3, v5

    .line 306
    :goto_5
    invoke-static {v0, v8, v3, v4}, Lcom/zykj/mistake/activity/MistakeListActivity;->y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 311
    .line 312
    .line 313
    move/from16 v3, v17

    .line 314
    .line 315
    goto :goto_4

    .line 316
    :cond_b
    if-eqz p2, :cond_c

    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 323
    .line 324
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 325
    .line 326
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 327
    .line 328
    new-instance v7, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 329
    .line 330
    const/16 v13, 0xf

    .line 331
    .line 332
    const/4 v14, 0x0

    .line 333
    const/4 v8, 0x0

    .line 334
    const-wide/16 v9, 0x0

    .line 335
    .line 336
    const/4 v11, 0x0

    .line 337
    const/4 v12, 0x0

    .line 338
    invoke-direct/range {v7 .. v14}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v0, v7, v2, v6}, Lcom/zykj/mistake/activity/MistakeListActivity;->y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 346
    .line 347
    .line 348
    :cond_c
    iget-object v3, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->u:Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    move v7, v2

    .line 355
    :goto_6
    if-ge v7, v6, :cond_10

    .line 356
    .line 357
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    add-int/lit8 v7, v7, 0x1

    .line 362
    .line 363
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 364
    .line 365
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    check-cast v9, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 370
    .line 371
    iget-object v9, v9, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 372
    .line 373
    iget-object v9, v9, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    if-eqz v10, :cond_e

    .line 380
    .line 381
    :cond_d
    move v10, v2

    .line 382
    goto :goto_7

    .line 383
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    move v11, v2

    .line 388
    :cond_f
    if-ge v11, v10, :cond_d

    .line 389
    .line 390
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v12

    .line 394
    add-int/lit8 v11, v11, 0x1

    .line 395
    .line 396
    check-cast v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 397
    .line 398
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 399
    .line 400
    .line 401
    move-result-wide v13

    .line 402
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 403
    .line 404
    .line 405
    move-result-wide v15

    .line 406
    cmp-long v12, v13, v15

    .line 407
    .line 408
    if-nez v12, :cond_f

    .line 409
    .line 410
    move v10, v5

    .line 411
    :goto_7
    invoke-static {v0, v8, v10, v4}, Lcom/zykj/mistake/activity/MistakeListActivity;->y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 412
    .line 413
    .line 414
    move-result-object v8

    .line 415
    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 416
    .line 417
    .line 418
    goto :goto_6

    .line 419
    :cond_10
    return-void
.end method
