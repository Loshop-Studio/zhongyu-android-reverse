.class public final synthetic Lcom/zykj/view/board/play/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/play/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const-string v0, "com.zykj.mistake.feature.review.ReviewContract.PracticeScene"

    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->values()[Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lm7/y0;->e(Ljava/lang/String;[Ljava/lang/Enum;)Lm7/y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :pswitch_0
    const-string v0, "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract.EntryMode"

    .line 21
    .line 22
    invoke-static {}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->values()[Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0, v1}, Lm7/y0;->e(Ljava/lang/String;[Ljava/lang/Enum;)Lm7/y;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_1
    new-instance v0, Lm7/d;

    .line 32
    .line 33
    sget-object v2, Lp4/g;->a:Lp4/g;

    .line 34
    .line 35
    invoke-direct {v0, v2, v1}, Lm7/d;-><init>(Li7/b;I)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_2
    const-string v0, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract.EntryMode"

    .line 40
    .line 41
    invoke-static {}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->values()[Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v0, v1}, Lm7/y0;->e(Ljava/lang/String;[Ljava/lang/Enum;)Lm7/y;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "MainNavController not provided"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :pswitch_4
    new-instance v0, Lokhttp3/z;

    .line 59
    .line 60
    invoke-direct {v0}, Lokhttp3/z;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lcoil3/network/okhttp/internal/a;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Lcoil3/network/okhttp/internal/a;-><init>(Lokhttp3/z;)V

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :pswitch_5
    sget-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->Companion:Lp4/f;

    .line 70
    .line 71
    invoke-virtual {v0}, Lp4/f;->serializer()Li7/b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_6
    const-string v0, "com.zykj.mistake.feature.mistake.model.MistakeTagType"

    .line 77
    .line 78
    invoke-static {}, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->values()[Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v0, v1}, Lm7/y0;->e(Ljava/lang/String;[Ljava/lang/Enum;)Lm7/y;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_7
    new-instance v0, Lm7/d;

    .line 88
    .line 89
    sget-object v2, Lp4/g;->a:Lp4/g;

    .line 90
    .line 91
    invoke-direct {v0, v2, v1}, Lm7/d;-><init>(Li7/b;I)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_8
    sget-object v0, Ln7/f;->b:Ln7/e;

    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_9
    sget-object v0, Ln7/w;->b:Ln7/v;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_a
    sget-object v0, Ln7/q;->b:Lm7/e1;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_b
    sget-object v0, Ln7/s;->b:Lk7/h;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_c
    sget-object v0, Ln7/z;->b:Lk7/h;

    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_d
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->d()Li7/b;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0

    .line 115
    :pswitch_e
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->e()Li7/b;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0

    .line 120
    :pswitch_f
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->a()Li7/b;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :pswitch_10
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->b()Li7/b;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :pswitch_11
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->c()Li7/b;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :pswitch_12
    sget v0, Ll4/e;->b:I

    .line 136
    .line 137
    return-object v2

    .line 138
    :pswitch_13
    sget v0, Ll4/d;->b:I

    .line 139
    .line 140
    :pswitch_14
    return-object v2

    .line 141
    :pswitch_15
    invoke-static {}, Landroidx/savedstate/compose/LocalSavedStateRegistryOwnerKt;->a()Landroidx/savedstate/SavedStateRegistryOwner;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0

    .line 146
    :pswitch_16
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/zykj/mistake/network/a;->c()Lcom/zykj/mistake/network/c;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_17
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 154
    .line 155
    invoke-virtual {v0}, Lcom/zykj/mistake/network/a;->c()Lcom/zykj/mistake/network/c;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :pswitch_18
    new-instance v0, Landroid/os/Handler;

    .line 161
    .line 162
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 167
    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_19
    invoke-static {}, Lcom/zykj/view/dialog/TextEditDialog;->f()Ld6/s;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    return-object v0

    .line 175
    :pswitch_1a
    invoke-static {}, Lcom/zykj/view/dialog/CommonTipDialog;->b()Ld6/s;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :pswitch_1b
    invoke-static {}, Lcom/zykj/view/board/simple/SimpleFragment;->i()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    return-object v0

    .line 185
    :pswitch_1c
    invoke-static {}, Lcom/zykj/view/board/play/SketchPlayFragment;->q()Ld6/s;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    return-object v0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
