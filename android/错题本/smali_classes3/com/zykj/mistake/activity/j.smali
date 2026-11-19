.class public final synthetic Lcom/zykj/mistake/activity/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/base/BaseMVPActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/base/BaseMVPActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/j;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/j;->b:Lcom/zykj/mistake/base/BaseMVPActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/j;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/activity/j;->b:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lcom/zykj/mistake/activity/SketchActivity;

    .line 9
    .line 10
    iget-object v0, v1, Lcom/zykj/mistake/activity/SketchActivity;->m:Ll4/k;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Ll4/k;->a:Lcom/zykj/mistake/activity/SketchActivity;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget v3, Lcom/zykj/mistake/R$dimen;->view_43:I

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    neg-int v2, v2

    .line 30
    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget v3, Lcom/zykj/mistake/R$dimen;->view_5:I

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, p1, v2, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p1, "mMenuPopupWindow"

    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    throw p1

    .line 51
    :pswitch_0
    check-cast v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 52
    .line 53
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    check-cast v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 60
    .line 61
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    check-cast v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 68
    .line 69
    iget-object p1, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->f:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 72
    .line 73
    .line 74
    iget-object v0, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p1}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->z(Ljava/util/ArrayList;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 89
    .line 90
    const v0, 0x800005

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawer(I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_3
    check-cast v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 98
    .line 99
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 100
    .line 101
    iget-object p1, v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->j:Ld6/e;

    .line 102
    .line 103
    invoke-interface {p1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Ll4/i;

    .line 108
    .line 109
    sget v0, Lcom/zykj/mistake/R$string;->add_mistake_tag:I

    .line 110
    .line 111
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v2, "getString(...)"

    .line 116
    .line 117
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Lcom/zykj/mistake/activity/m;

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    invoke-direct {v2, v1, v3}, Lcom/zykj/mistake/activity/m;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    sget v1, Ll4/i;->d:I

    .line 127
    .line 128
    const-string v1, ""

    .line 129
    .line 130
    invoke-virtual {p1, v0, v1, v2}, Ll4/i;->a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_4
    check-cast v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 135
    .line 136
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 137
    .line 138
    invoke-virtual {v1}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 143
    .line 144
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 145
    .line 146
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v0}, Lcom/zykj/mistake/network/b;->f()Lq5/e;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v1, Lb5/b;

    .line 155
    .line 156
    const/4 v2, 0x5

    .line 157
    invoke-direct {v1, p1, v2}, Lb5/b;-><init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v0, v1}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
