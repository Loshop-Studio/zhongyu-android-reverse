.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->a:I

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->b:Z

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/app/Activity;

    .line 9
    .line 10
    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 11
    .line 12
    const-string v1, "$this$DisposableEffect"

    .line 13
    .line 14
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->b:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const-string p1, ""

    .line 24
    .line 25
    const-string v1, "\u8bf7\u7a0d\u5019\u3002"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {v0, p1, v1, v2, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    :cond_1
    :goto_0
    new-instance v0, Lcom/zykj/mistake/main/loading/AppLoadingOverlayKt$AppLoadingOverlay$lambda$5$lambda$4$$inlined$onDispose$1;

    .line 49
    .line 50
    invoke-direct {v0, p1}, Lcom/zykj/mistake/main/loading/AppLoadingOverlayKt$AppLoadingOverlay$lambda$5$lambda$4$$inlined$onDispose$1;-><init>(Landroid/app/ProgressDialog;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 57
    .line 58
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->b:Z

    .line 59
    .line 60
    check-cast p1, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Ld6/s;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroidx/compose/runtime/MutableState;

    .line 70
    .line 71
    check-cast p1, Landroidx/compose/ui/unit/Density;

    .line 72
    .line 73
    const-string v1, "$this$offset"

    .line 74
    .line 75
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->b:Z

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p1}, Lt6/a;->q(F)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move p1, v1

    .line 99
    :goto_1
    int-to-long v2, p1

    .line 100
    const/16 p1, 0x20

    .line 101
    .line 102
    shl-long/2addr v2, p1

    .line 103
    int-to-long v0, v1

    .line 104
    const-wide v4, 0xffffffffL

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    and-long/2addr v0, v4

    .line 110
    or-long/2addr v0, v2

    .line 111
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->box-impl(J)Landroidx/compose/ui/unit/IntOffset;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :pswitch_2
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 123
    .line 124
    check-cast p1, Lcom/zykj/mistake/entity/resp/GetMyTagResp;

    .line 125
    .line 126
    const-string v1, "resp"

    .line 127
    .line 128
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/GetMyTagResp;->getResult()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-nez p1, :cond_3

    .line 136
    .line 137
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 138
    .line 139
    :cond_3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->b:Z

    .line 140
    .line 141
    if-eqz v1, :cond_4

    .line 142
    .line 143
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/b1;

    .line 144
    .line 145
    invoke-direct {v1, p1}, Lcom/zykj/mistake/feature/notebook/detail/b1;-><init>(Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/d1;

    .line 150
    .line 151
    invoke-direct {v1, p1}, Lcom/zykj/mistake/feature/notebook/detail/d1;-><init>(Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    :goto_2
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 155
    .line 156
    .line 157
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 158
    .line 159
    return-object p1

    .line 160
    :pswitch_3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 163
    .line 164
    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 165
    .line 166
    const-string v1, "$this$DisposableEffect"

    .line 167
    .line 168
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1;

    .line 172
    .line 173
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/v;->b:Z

    .line 174
    .line 175
    invoke-direct {p1, v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Z)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
