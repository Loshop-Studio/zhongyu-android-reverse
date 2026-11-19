# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final Lcom/zykj/mistake/activity/MistakeDetailActivity;
.super Lcom/zykj/mistake/base/BaseMVPActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseMVPActivity<",
        "Lcom/zykj/mistake/presenter/MistakeDetailPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/mistake/activity/MistakeDetailActivity;",
        "Lcom/zykj/mistake/base/BaseMVPActivity;",
        "Lcom/zykj/mistake/presenter/MistakeDetailPresenter;",
        "Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;",
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
        "SMAP\nMistakeDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailActivity.kt\ncom/zykj/mistake/activity/MistakeDetailActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,917:1\n1869#2,2:918\n1869#2,2:920\n1869#2,2:922\n774#2:924\n865#2,2:925\n1869#2,2:927\n1869#2,2:929\n1869#2:931\n1761#2,3:932\n1870#2:935\n774#2:936\n865#2,2:937\n1869#2,2:939\n774#2:941\n865#2,2:942\n1869#2,2:944\n774#2:946\n865#2:947\n1761#2,3:948\n866#2:951\n774#2:953\n865#2,2:954\n1869#2,2:956\n295#2,2:958\n1#3:952\n*S KotlinDebug\n*F\n+ 1 MistakeDetailActivity.kt\ncom/zykj/mistake/activity/MistakeDetailActivity\n*L\n192#1:918,2\n220#1:920,2\n235#1:922,2\n391#1:924\n391#1:925,2\n541#1:927,2\n593#1:929,2\n660#1:931\n664#1:932,3\n660#1:935\n801#1:936\n801#1:937,2\n801#1:939,2\n803#1:941\n803#1:942,2\n804#1:944,2\n881#1:946\n881#1:947\n881#1:948,3\n881#1:951\n477#1:953\n477#1:954,2\n477#1:956,2\n701#1:958,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic s:I


# instance fields
.field public e:Landroid/widget/PopupWindow;

.field public f:Landroid/app/Dialog;

.field public g:Ll4/i;

.field public h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

.field public final i:Ljava/util/ArrayList;

.field public final j:I

.field public final k:Ljava/util/ArrayList;

.field public l:Lcom/zykj/mistake/adapter/DetailPagerAdapter;

.field public m:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

.field public n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

.field public o:J

.field public p:J

.field public final q:Ljava/util/ArrayList;

.field public r:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x6

    .line 19
    iput v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->j:I

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->k:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v0, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->m:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 34
    .line 35
    new-instance v0, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 36
    .line 37
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->q:Ljava/util/ArrayList;

    .line 48
    .line 49
    return-void
.end method

.method public static x(Lcom/zykj/mistake/activity/MistakeDetailActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;
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
    new-instance p2, Lcom/zykj/mistake/activity/w;

    .line 72
    .line 73
    const/16 p3, 0xa

    .line 74
    .line 75
    invoke-direct {p2, p0, p3}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

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
    const/4 p3, 0x1

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
    invoke-direct {p2, p3, p1, p0}, Lcom/zykj/mistake/activity/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

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
.method public final A()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->n:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getRealTitle()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 21
    .line 22
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->m:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 26
    .line 27
    iget-wide v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->o:J

    .line 28
    .line 29
    long-to-int v1, v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;->setBookId(I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->m:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;->getItemIds()Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    long-to-int v1, v1

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    new-instance v0, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 56
    .line 57
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 61
    .line 62
    iget-wide v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->o:J

    .line 63
    .line 64
    long-to-int v1, v1

    .line 65
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setBookId(I)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getItemIds()Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    long-to-int v1, v1

    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getNumber()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_0

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 111
    .line 112
    .line 113
    move-result-wide v1

    .line 114
    long-to-int v1, v1

    .line 115
    sget-object v2, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 116
    .line 117
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-interface {v2, v1}, Lcom/zykj/mistake/network/b;->j(I)Lq5/e;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v2, Lb5/d;

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-direct {v2, v0, v3}, Lb5/d;-><init>(Lcom/zykj/mistake/presenter/MistakeDetailPresenter;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isRelatedQstGroup()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_1

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 156
    .line 157
    .line 158
    move-result-wide v1

    .line 159
    long-to-int v1, v1

    .line 160
    sget-object v2, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 161
    .line 162
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-interface {v2, v1}, Lcom/zykj/mistake/network/b;->b(I)Lq5/e;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    new-instance v2, Lb5/d;

    .line 171
    .line 172
    const/4 v3, 0x1

    .line 173
    invoke-direct {v2, v0, v3}, Lb5/d;-><init>(Lcom/zykj/mistake/presenter/MistakeDetailPresenter;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 185
    .line 186
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 191
    .line 192
    .line 193
    move-result-wide v1

    .line 194
    long-to-int v1, v1

    .line 195
    sget-object v2, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 196
    .line 197
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-interface {v2, v1}, Lcom/zykj/mistake/network/b;->s(I)Lq5/e;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    new-instance v2, Lb5/d;

    .line 206
    .line 207
    const/4 v3, 0x2

    .line 208
    invoke-direct {v2, v0, v3}, Lb5/d;-><init>(Lcom/zykj/mistake/presenter/MistakeDetailPresenter;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public final B(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->v()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final C()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->b:Lcom/zykj/mistake/widget/FlowLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->u()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 36
    .line 37
    iget-object v4, v4, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->b:Lcom/zykj/mistake/widget/FlowLayout;

    .line 38
    .line 39
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    # RE layout layout/item_mistake_tag_little (0x7f0c0065), APK res/Me.xml
    sget v6, Lcom/zykj/mistake/R$layout;->item_mistake_tag_little:I

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    invoke-virtual {v5, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget v6, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    check-cast v6, Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v7, -0x1

    .line 70
    if-eq v3, v7, :cond_3

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    const/4 v7, 0x1

    .line 75
    if-eq v3, v7, :cond_1

    .line 76
    .line 77
    const/4 v7, 0x2

    .line 78
    if-eq v3, v7, :cond_0

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    sget v3, Lcom/zykj/mistake/R$drawable;->bg_tag_red:I

    .line 82
    .line 83
    invoke-virtual {v6, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    sget v3, Lcom/zykj/mistake/R$drawable;->bg_tag_yellow:I

    .line 88
    .line 89
    invoke-virtual {v6, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    sget v3, Lcom/zykj/mistake/R$drawable;->bg_tag_green:I

    .line 94
    .line 95
    invoke-virtual {v6, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    sget v3, Lcom/zykj/mistake/R$drawable;->bg_blue_corner:I

    .line 100
    .line 101
    invoke-virtual {v6, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    return-void
.end method

.method public final D()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getHasStem()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 12
    .line 13
    sget-object v0, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getQstPath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowAnswer()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, "?showAnalysis="

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 55
    .line 56
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->q:Lcom/zykj/mistake/widget/StemWebView;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/widget/StemWebView;->b(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->h:Landroid/widget/RelativeLayout;

    .line 68
    .line 69
    const/16 v1, 0x8

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final o()I
    .locals 1

    .line 1
    # RE layout layout/activity_mistake_detail (0x7f0c0020), APK res/XW.xml
    sget v0, Lcom/zykj/mistake/R$layout;->activity_mistake_detail:I

    .line 2
    .line 3
    return v0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    if-ne p2, p1, :cond_1

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    const-string p1, "EDIT_MISTAKE_DATA"

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    new-instance p3, Lk1/a;

    .line 24
    .line 25
    const-class v0, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 26
    .line 27
    invoke-direct {p3, v0}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1, p3}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getTitle()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-virtual {p2, p3}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setTitle(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getStemShoot()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setStemShoot(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->A()V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

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
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

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
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 33
    .line 34
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawer(I)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1
.end method

.method public final q()V
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/mistake/adapter/DetailPagerAdapter;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getSupportFragmentManager(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lcom/zykj/mistake/adapter/DetailPagerAdapter;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;Landroidx/fragment/app/FragmentManager;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->l:Lcom/zykj/mistake/adapter/DetailPagerAdapter;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->p:Lcom/zykj/mistake/widget/CustomViewPager;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->l:Lcom/zykj/mistake/adapter/DetailPagerAdapter;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->p:Lcom/zykj/mistake/widget/CustomViewPager;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 58
    .line 59
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->p:Lcom/zykj/mistake/widget/CustomViewPager;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/flyco/tablayout/SlidingTabLayout;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    # RE layout layout/dialog_show_more (0x7f0c004b), APK res/Fm.xml
    sget v1, Lcom/zykj/mistake/R$layout;->dialog_show_more:I

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Landroid/widget/PopupWindow;

    .line 75
    .line 76
    const/4 v3, -0x2

    .line 77
    invoke-direct {v1, v0, v3, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->e:Landroid/widget/PopupWindow;

    .line 81
    .line 82
    sget v1, Lcom/zykj/mistake/R$id;->ll_ask:I

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 89
    .line 90
    new-instance v3, Lcom/zykj/mistake/activity/v;

    .line 91
    .line 92
    invoke-direct {v3, p0}, Lcom/zykj/mistake/activity/v;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    .line 97
    .line 98
    sget v1, Lcom/zykj/mistake/R$id;->ll_edit:I

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 105
    .line 106
    new-instance v3, Lcom/zykj/mistake/activity/w;

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-direct {v3, p0, v4}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    .line 114
    .line 115
    sget v1, Lcom/zykj/mistake/R$id;->ll_remove:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 122
    .line 123
    new-instance v1, Lcom/zykj/mistake/activity/w;

    .line 124
    .line 125
    const/4 v3, 0x1

    .line 126
    invoke-direct {v1, p0, v3}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->e:Landroid/widget/PopupWindow;

    .line 133
    .line 134
    const-string v1, "mMorePopUpWindow"

    .line 135
    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    const/4 v3, 0x1

    .line 139
    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->e:Landroid/widget/PopupWindow;

    .line 143
    .line 144
    if-eqz v0, :cond_2

    .line 145
    .line 146
    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->e:Landroid/widget/PopupWindow;

    .line 150
    .line 151
    if-eqz v0, :cond_1

    .line 152
    .line 153
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-direct {v1, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 160
    .line 161
    .line 162
    new-instance v0, Ll4/i;

    .line 163
    .line 164
    const/4 v1, 0x6

    .line 165
    invoke-direct {v0, p0, v1}, Ll4/i;-><init>(Landroid/content/Context;I)V

    .line 166
    .line 167
    .line 168
    iput-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->g:Ll4/i;

    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 175
    .line 176
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 177
    .line 178
    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 186
    .line 187
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 188
    .line 189
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->j:Landroid/widget/TextView;

    .line 190
    .line 191
    sget v1, Lcom/zykj/mistake/R$string;->edit_tag:I

    .line 192
    .line 193
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 205
    .line 206
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 207
    .line 208
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->b:Landroid/widget/TextView;

    .line 209
    .line 210
    new-instance v1, Lcom/zykj/mistake/activity/w;

    .line 211
    .line 212
    const/4 v4, 0x4

    .line 213
    invoke-direct {v1, p0, v4}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 224
    .line 225
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 226
    .line 227
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->a:Landroid/widget/TextView;

    .line 228
    .line 229
    new-instance v1, Lcom/zykj/mistake/activity/w;

    .line 230
    .line 231
    const/4 v4, 0x5

    .line 232
    invoke-direct {v1, p0, v4}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    .line 237
    .line 238
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    # RE layout layout/dialog_remove_mistake (0x7f0c0049), APK res/DT.xml
    sget v1, Lcom/zykj/mistake/R$layout;->dialog_remove_mistake:I

    .line 243
    .line 244
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v1, "inflate(...)"

    .line 249
    .line 250
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    sget v1, Lcom/zykj/mistake/R$id;->tv_cancel:I

    .line 254
    .line 255
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, Landroid/widget/TextView;

    .line 260
    .line 261
    new-instance v4, Lcom/zykj/mistake/activity/w;

    .line 262
    .line 263
    const/4 v5, 0x2

    .line 264
    invoke-direct {v4, p0, v5}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 268
    .line 269
    .line 270
    sget v1, Lcom/zykj/mistake/R$id;->tv_confirm:I

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Landroid/widget/TextView;

    .line 277
    .line 278
    new-instance v4, Lcom/zykj/mistake/activity/w;

    .line 279
    .line 280
    const/4 v5, 0x3

    .line 281
    invoke-direct {v4, p0, v5}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    new-instance v1, Landroid/app/Dialog;

    .line 288
    .line 289
    sget v4, Lcom/zykj/mistake/R$style;->remind_dialog_theme:I

    .line 290
    .line 291
    invoke-direct {v1, p0, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 292
    .line 293
    .line 294
    iput-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->f:Landroid/app/Dialog;

    .line 295
    .line 296
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 297
    .line 298
    .line 299
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->f:Landroid/app/Dialog;

    .line 300
    .line 301
    if-eqz v0, :cond_0

    .line 302
    .line 303
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 311
    .line 312
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->d:Landroid/widget/ImageView;

    .line 313
    .line 314
    new-instance v1, Lcom/zykj/mistake/activity/w;

    .line 315
    .line 316
    const/4 v2, 0x6

    .line 317
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 328
    .line 329
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->f:Landroid/widget/ImageView;

    .line 330
    .line 331
    new-instance v1, Lcom/zykj/mistake/activity/w;

    .line 332
    .line 333
    const/4 v2, 0x7

    .line 334
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 345
    .line 346
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->e:Landroid/widget/ImageView;

    .line 347
    .line 348
    new-instance v1, Lcom/zykj/mistake/activity/w;

    .line 349
    .line 350
    const/16 v2, 0x8

    .line 351
    .line 352
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 363
    .line 364
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->m:Landroid/widget/TextView;

    .line 365
    .line 366
    new-instance v1, Lcom/zykj/mistake/activity/w;

    .line 367
    .line 368
    const/16 v2, 0x9

    .line 369
    .line 370
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/w;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 381
    .line 382
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->k:Landroid/widget/TextView;

    .line 383
    .line 384
    const-string v1, "tvLast"

    .line 385
    .line 386
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    new-instance v1, Lcom/zykj/mistake/activity/x;

    .line 390
    .line 391
    const/4 v2, 0x0

    .line 392
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/x;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 393
    .line 394
    .line 395
    invoke-static {v0, v1}, Lcom/zykj/mistake/utils/e;->e(Landroid/view/View;Lr6/a;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 403
    .line 404
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->l:Landroid/widget/TextView;

    .line 405
    .line 406
    const-string v1, "tvNext"

    .line 407
    .line 408
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    new-instance v1, Lcom/zykj/mistake/activity/x;

    .line 412
    .line 413
    const/4 v2, 0x1

    .line 414
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/x;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V

    .line 415
    .line 416
    .line 417
    invoke-static {v0, v1}, Lcom/zykj/mistake/utils/e;->e(Landroid/view/View;Lr6/a;)V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :cond_0
    const-string v0, "mRemoveMistakeDialog"

    .line 422
    .line 423
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v2

    .line 427
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v2

    .line 431
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw v2

    .line 435
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v2

    .line 439
    :cond_4
    const-string v0, "mDetailPagerAdapter"

    .line 440
    .line 441
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw v2
.end method

.method public final s()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "bookId"

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->o:J

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "topicId"

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iput-wide v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->p:J

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "mistakeList"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_0
    if-ge v2, v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    new-instance v4, Lcom/google/gson/g;

    .line 55
    .line 56
    invoke-direct {v4}, Lcom/google/gson/g;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v5, Lk1/a;

    .line 60
    .line 61
    const-class v6, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 62
    .line 63
    invoke-direct {v5, v6}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v3, v5}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v4, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->q:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "position"

    .line 81
    .line 82
    const/4 v2, -0x1

    .line 83
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 88
    .line 89
    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Lcom/bumptech/glide/b;->b()V

    .line 94
    .line 95
    .line 96
    new-instance v0, Ljava/lang/Thread;

    .line 97
    .line 98
    new-instance v1, Lcom/zykj/mistake/activity/u;

    .line 99
    .line 100
    invoke-direct {v1, p0}, Lcom/zykj/mistake/activity/u;-><init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->A()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final u()Ljava/util/ArrayList;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getDiff()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getDiff()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    sget-object v3, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    .line 25
    .line 26
    aget-object v3, v3, v1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getDiff()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-long v4, v1

    .line 35
    const/4 v8, 0x4

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-direct/range {v2 .. v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAttainedLevel()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    new-instance v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAttainedLevel()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    sget-object v3, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    .line 64
    .line 65
    aget-object v3, v3, v1

    .line 66
    .line 67
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAttainedLevel()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    int-to-long v4, v1

    .line 74
    const/4 v8, 0x4

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x1

    .line 78
    invoke-direct/range {v2 .. v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getErrorReason()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    new-instance v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getErrorReason()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/lit8 v1, v1, -0x1

    .line 101
    .line 102
    sget-object v3, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    .line 103
    .line 104
    aget-object v3, v3, v1

    .line 105
    .line 106
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 107
    .line 108
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getErrorReason()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    int-to-long v4, v1

    .line 113
    const/4 v8, 0x4

    .line 114
    const/4 v9, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x2

    .line 117
    invoke-direct/range {v2 .. v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getMistakeTags()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 130
    .line 131
    .line 132
    return-object v0
.end method

# RE I/O 读取布尔偏好（SharedPreferences.getBoolean）。
.method public final v()V
    .locals 4

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
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getHasStem()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object v0, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getQstPath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "?showAnalysis=false"

    .line 35
    .line 36
    invoke-static {v0, v2, v3}, Landroid/support/v4/media/f;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->q:Lcom/zykj/mistake/widget/StemWebView;

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/widget/StemWebView;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->h:Landroid/widget/RelativeLayout;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->D()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "get(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 15
    .line 16
    return-object v0
.end method

.method public final y()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->g:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getExtraStems()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    check-cast v4, Ljava/lang/String;

    .line 33
    .line 34
    new-instance v5, Landroid/widget/ImageView;

    .line 35
    .line 36
    invoke-direct {v5, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 40
    .line 41
    const/4 v7, -0x1

    .line 42
    const/4 v8, -0x2

    .line 43
    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    sget v8, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 51
    .line 52
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    sget v9, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 61
    .line 62
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    sget v10, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 71
    .line 72
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    sget v11, Lcom/zykj/mistake/R$dimen;->view_2:I

    .line 81
    .line 82
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    check-cast v6, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 97
    .line 98
    iget-object v6, v6, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->g:Landroid/widget/LinearLayout;

    .line 99
    .line 100
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-virtual {v6, p0}, Lo0/h;->c(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v6}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    iput-object v4, v6, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 116
    .line 117
    const/4 v7, 0x1

    .line 118
    iput-boolean v7, v6, Lcom/bumptech/glide/f;->y:Z

    .line 119
    .line 120
    sget v7, Lcom/zykj/mistake/R$mipmap;->pic_error:I

    .line 121
    .line 122
    invoke-virtual {v6, v7}, Lr0/a;->h(I)Lr0/a;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Lcom/bumptech/glide/f;

    .line 127
    .line 128
    new-instance v7, Lcom/zykj/mistake/activity/y;

    .line 129
    .line 130
    invoke-direct {v7, v5, p0, v4}, Lcom/zykj/mistake/activity/y;-><init>(Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeDetailActivity;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/f;->z(Ls0/i;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 142
    .line 143
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->i:Landroid/widget/ScrollView;

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 153
    .line 154
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->q:Lcom/zykj/mistake/widget/StemWebView;

    .line 155
    .line 156
    const/16 v1, 0x8

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->i:Landroid/widget/ScrollView;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->q:Lcom/zykj/mistake/widget/StemWebView;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
