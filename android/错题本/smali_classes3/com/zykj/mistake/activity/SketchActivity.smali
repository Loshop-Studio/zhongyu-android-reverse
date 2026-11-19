.class public final Lcom/zykj/mistake/activity/SketchActivity;
.super Lcom/zykj/mistake/base/BaseMVPActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseMVPActivity<",
        "Lcom/zykj/mistake/presenter/SketchPresenter;",
        "Lcom/zykj/mistake/databinding/ActivitySketchBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/mistake/activity/SketchActivity;",
        "Lcom/zykj/mistake/base/BaseMVPActivity;",
        "Lcom/zykj/mistake/presenter/SketchPresenter;",
        "Lcom/zykj/mistake/databinding/ActivitySketchBinding;",
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
        "SMAP\nSketchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchActivity.kt\ncom/zykj/mistake/activity/SketchActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,612:1\n3829#2:613\n4344#2,2:614\n1869#3,2:616\n1869#3,2:618\n*S KotlinDebug\n*F\n+ 1 SketchActivity.kt\ncom/zykj/mistake/activity/SketchActivity\n*L\n353#1:613\n353#1:614,2\n357#1:616,2\n478#1:618,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic v:I


# instance fields
.field public e:J

.field public f:Ljava/lang/String;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/util/ArrayList;

.field public i:Ljava/util/ArrayList;

.field public j:Lcom/zykj/view/board/board/BoardFragment;

.field public k:Lcom/zykj/mistake/utils/h;

.field public l:Landroidx/appcompat/app/AlertDialog;

.field public m:Ll4/k;

.field public n:Lcom/zykj/mistake/dialog/WebViewShotDialog;

.field public final o:Lcom/zykj/mistake/entity/req/SetNoteReq;

.field public p:Ljava/lang/String;

.field public q:Z

.field public final r:Lcom/zykj/view/utils/ImagePicker;

.field public s:Z

.field public t:Ll4/d;

.field public final u:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/entity/req/SetNoteReq;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/SetNoteReq;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity;->o:Lcom/zykj/mistake/entity/req/SetNoteReq;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/view/utils/ImagePicker;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v0, v1, p0, v2, v1}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity;->r:Lcom/zykj/view/utils/ImagePicker;

    .line 19
    .line 20
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 21
    .line 22
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lcom/zykj/mistake/activity/r;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/zykj/mistake/activity/r;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity;->u:Landroidx/activity/result/ActivityResultLauncher;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final o()I
    .locals 1

    .line 1
    # RE layout layout/activity_sketch (0x7f0c0022), APK res/jQ.xml
    sget v0, Lcom/zykj/mistake/R$layout;->activity_sketch:I

    .line 2
    .line 3
    return v0
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
    iget-object p1, p0, Lcom/zykj/mistake/activity/SketchActivity;->p:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance p2, Landroidx/lifecycle/k;

    .line 16
    .line 17
    const/16 v0, 0xc

    .line 18
    .line 19
    invoke-direct {p2, v0}, Landroidx/lifecycle/k;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/activity/SketchActivity;->w(Ljava/lang/String;Lr6/a;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const-string p1, "mUploadDataPath"

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :cond_1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
.end method

.method public final q()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/mistake/databinding/ActivitySketchBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivitySketchBinding;->a:Landroid/widget/ImageView;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/mistake/activity/j;

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/j;-><init>(Lcom/zykj/mistake/base/BaseMVPActivity;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ll4/d;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Ll4/d;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity;->t:Ll4/d;

    .line 24
    .line 25
    return-void
.end method

.method public final s()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/mistake/presenter/SketchPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "itemId"

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->e:J

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "canOpenCamera"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput-boolean v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->s:Z

    .line 29
    .line 30
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->o:Lcom/zykj/mistake/entity/req/SetNoteReq;

    .line 31
    .line 32
    iget-wide v4, v0, Lcom/zykj/mistake/activity/SketchActivity;->e:J

    .line 33
    .line 34
    invoke-virtual {v1, v4, v5}, Lcom/zykj/mistake/entity/req/SetNoteReq;->setMistakeItemId(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "stemUrl"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->f:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "noteUrl"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v2, "stemPathList"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->g:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "answerPathList"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->h:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v2, "revisedAnswerPathList"

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->i:Ljava/util/ArrayList;

    .line 93
    .line 94
    sget-object v1, Lcom/zykj/mistake/utils/f;->a:Ljava/lang/String;

    .line 95
    .line 96
    iget-wide v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->e:J

    .line 97
    .line 98
    new-instance v4, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v5, "DrawBoardData/upload/"

    .line 101
    .line 102
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v1}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->p:Ljava/lang/String;

    .line 117
    .line 118
    new-instance v1, Lcom/zykj/mistake/utils/h;

    .line 119
    .line 120
    iget-wide v4, v0, Lcom/zykj/mistake/activity/SketchActivity;->e:J

    .line 121
    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v6, "DrawBoardData/"

    .line 125
    .line 126
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {v2}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const/4 v4, 0x0

    .line 141
    invoke-direct {v1, v2, v4}, Lcom/zykj/mistake/utils/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 145
    .line 146
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 147
    .line 148
    invoke-direct {v1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 149
    .line 150
    .line 151
    sget v2, Lcom/zykj/mistake/R$string;->submit_failed:I

    .line 152
    .line 153
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    sget v2, Lcom/zykj/mistake/R$string;->retry:I

    .line 162
    .line 163
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    new-instance v5, Lcom/zykj/mistake/activity/e0;

    .line 168
    .line 169
    invoke-direct {v5, v0, v3}, Lcom/zykj/mistake/activity/e0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v2, v5}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    sget v2, Lcom/zykj/mistake/R$string;->give_up:I

    .line 177
    .line 178
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    new-instance v5, Lcom/zykj/mistake/activity/e0;

    .line 183
    .line 184
    const/4 v6, 0x1

    .line 185
    invoke-direct {v5, v0, v6}, Lcom/zykj/mistake/activity/e0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v2, v5}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const-string v2, "create(...)"

    .line 197
    .line 198
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->l:Landroidx/appcompat/app/AlertDialog;

    .line 202
    .line 203
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->f:Ljava/lang/String;

    .line 204
    .line 205
    if-eqz v1, :cond_0

    .line 206
    .line 207
    new-instance v2, Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 208
    .line 209
    invoke-direct {v2, v1}, Lcom/zykj/mistake/dialog/WebViewShotDialog;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iput-object v2, v0, Lcom/zykj/mistake/activity/SketchActivity;->n:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 213
    .line 214
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    iget-object v2, v0, Lcom/zykj/mistake/activity/SketchActivity;->f:Ljava/lang/String;

    .line 220
    .line 221
    const-string v5, "getString(...)"

    .line 222
    .line 223
    if-nez v2, :cond_1

    .line 224
    .line 225
    iget-object v2, v0, Lcom/zykj/mistake/activity/SketchActivity;->g:Ljava/util/ArrayList;

    .line 226
    .line 227
    if-eqz v2, :cond_2

    .line 228
    .line 229
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_1

    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_1
    new-instance v2, Lg4/b;

    .line 237
    .line 238
    sget v7, Lcom/zykj/mistake/R$drawable;->icon_sketch_menu_stem:I

    .line 239
    .line 240
    sget v8, Lcom/zykj/mistake/R$string;->stem:I

    .line 241
    .line 242
    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    new-instance v9, Lcom/zykj/mistake/activity/a0;

    .line 250
    .line 251
    invoke-direct {v9, v0, v6}, Lcom/zykj/mistake/activity/a0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 252
    .line 253
    .line 254
    invoke-direct {v2, v7, v8, v9}, Lg4/b;-><init>(ILjava/lang/String;Lr6/a;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    :cond_2
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/activity/SketchActivity;->h:Ljava/util/ArrayList;

    .line 261
    .line 262
    const/4 v7, 0x2

    .line 263
    if-eqz v2, :cond_4

    .line 264
    .line 265
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_3

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_3
    new-instance v2, Lg4/b;

    .line 273
    .line 274
    sget v8, Lcom/zykj/mistake/R$drawable;->icon_sketch_menu_answer:I

    .line 275
    .line 276
    sget v9, Lcom/zykj/mistake/R$string;->answer:I

    .line 277
    .line 278
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    new-instance v10, Lcom/zykj/mistake/activity/a0;

    .line 286
    .line 287
    invoke-direct {v10, v0, v7}, Lcom/zykj/mistake/activity/a0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 288
    .line 289
    .line 290
    invoke-direct {v2, v8, v9, v10}, Lg4/b;-><init>(ILjava/lang/String;Lr6/a;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    :cond_4
    :goto_1
    iget-object v2, v0, Lcom/zykj/mistake/activity/SketchActivity;->i:Ljava/util/ArrayList;

    .line 297
    .line 298
    const/4 v8, 0x3

    .line 299
    if-eqz v2, :cond_6

    .line 300
    .line 301
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_5

    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_5
    new-instance v2, Lg4/b;

    .line 309
    .line 310
    sget v9, Lcom/zykj/mistake/R$drawable;->icon_sketch_menu_revise_answer:I

    .line 311
    .line 312
    sget v10, Lcom/zykj/mistake/R$string;->revise_answer:I

    .line 313
    .line 314
    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    new-instance v5, Lcom/zykj/mistake/activity/a0;

    .line 322
    .line 323
    invoke-direct {v5, v0, v8}, Lcom/zykj/mistake/activity/a0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 324
    .line 325
    .line 326
    invoke-direct {v2, v9, v10, v5}, Lg4/b;-><init>(ILjava/lang/String;Lr6/a;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    :cond_6
    :goto_2
    new-instance v2, Ll4/k;

    .line 333
    .line 334
    invoke-direct {v2, v0, v1}, Ll4/k;-><init>(Lcom/zykj/mistake/activity/SketchActivity;Ljava/util/ArrayList;)V

    .line 335
    .line 336
    .line 337
    iput-object v2, v0, Lcom/zykj/mistake/activity/SketchActivity;->m:Ll4/k;

    .line 338
    .line 339
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 340
    .line 341
    const-string v2, "mMicroLessonUtils"

    .line 342
    .line 343
    if-eqz v1, :cond_d

    .line 344
    .line 345
    iput-object v4, v1, Lcom/zykj/mistake/utils/h;->c:Ljava/lang/Integer;

    .line 346
    .line 347
    iput-object v4, v1, Lcom/zykj/mistake/utils/h;->b:Ljava/lang/String;

    .line 348
    .line 349
    sget-object v5, Lcom/zykj/view/board/board/BoardFragment;->Companion:Lcom/zykj/view/board/board/BoardFragment$Companion;

    .line 350
    .line 351
    if-eqz v1, :cond_c

    .line 352
    .line 353
    invoke-virtual {v1}, Lcom/zykj/mistake/utils/h;->e()Z

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    if-eqz v1, :cond_9

    .line 358
    .line 359
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 360
    .line 361
    if-eqz v1, :cond_8

    .line 362
    .line 363
    invoke-virtual {v1}, Lcom/zykj/mistake/utils/h;->b()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    const/4 v9, 0x6

    .line 368
    if-ne v1, v9, :cond_9

    .line 369
    .line 370
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 371
    .line 372
    if-eqz v1, :cond_7

    .line 373
    .line 374
    iget-object v1, v1, Lcom/zykj/mistake/utils/h;->a:Ljava/lang/String;

    .line 375
    .line 376
    goto :goto_3

    .line 377
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw v4

    .line 381
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v4

    .line 385
    :cond_9
    const-string v1, ""

    .line 386
    .line 387
    :goto_3
    new-instance v2, Landroid/content/Intent;

    .line 388
    .line 389
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 390
    .line 391
    .line 392
    const-string v9, "com.zykj.manage"

    .line 393
    .line 394
    const-string v10, "com.zykj.gallery.ui.share.ShareActivity"

    .line 395
    .line 396
    invoke-virtual {v2, v9, v10}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 397
    .line 398
    .line 399
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 404
    .line 405
    .line 406
    move-result-object v9

    .line 407
    invoke-virtual {v9, v2, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    if-eqz v10, :cond_a

    .line 412
    .line 413
    invoke-virtual {v2, v9}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    if-eqz v10, :cond_a

    .line 418
    .line 419
    invoke-virtual {v9, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-eqz v2, :cond_a

    .line 428
    .line 429
    move v14, v6

    .line 430
    goto :goto_4

    .line 431
    :cond_a
    move v14, v3

    .line 432
    :goto_4
    new-instance v9, Lcom/zykj/view/board/board/BoardViewConfig;

    .line 433
    .line 434
    const/16 v20, 0x204

    .line 435
    .line 436
    const/16 v21, 0x0

    .line 437
    .line 438
    const/4 v10, 0x1

    .line 439
    const/4 v11, 0x1

    .line 440
    const/4 v12, 0x0

    .line 441
    const/4 v13, 0x1

    .line 442
    const/4 v15, 0x1

    .line 443
    const/16 v16, 0x1

    .line 444
    .line 445
    const/16 v17, 0x1

    .line 446
    .line 447
    const/16 v18, 0x1

    .line 448
    .line 449
    const/16 v19, 0x0

    .line 450
    .line 451
    invoke-direct/range {v9 .. v21}, Lcom/zykj/view/board/board/BoardViewConfig;-><init>(ZZZZZZZZZLcom/zykj/view/board/board/ConfirmButtonType;ILkotlin/jvm/internal/e;)V

    .line 452
    .line 453
    .line 454
    new-instance v10, Lcom/zykj/view/board/board/BoardSketchConfig;

    .line 455
    .line 456
    const/16 v18, 0x63

    .line 457
    .line 458
    const/4 v11, 0x0

    .line 459
    const/4 v14, 0x3

    .line 460
    const/4 v15, 0x5

    .line 461
    const/16 v16, 0x0

    .line 462
    .line 463
    const/16 v17, 0x0

    .line 464
    .line 465
    invoke-direct/range {v10 .. v19}, Lcom/zykj/view/board/board/BoardSketchConfig;-><init>(Lcom/zykj/view/utils/ZoomPointSolution;ZZIIZZILkotlin/jvm/internal/e;)V

    .line 466
    .line 467
    .line 468
    new-instance v11, Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 469
    .line 470
    new-instance v13, Lcom/zykj/mistake/activity/c0;

    .line 471
    .line 472
    invoke-direct {v13, v0, v7}, Lcom/zykj/mistake/activity/c0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 473
    .line 474
    .line 475
    new-instance v2, Lcom/zykj/mistake/activity/c0;

    .line 476
    .line 477
    invoke-direct {v2, v0, v8}, Lcom/zykj/mistake/activity/c0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 478
    .line 479
    .line 480
    new-instance v6, Lcom/zykj/mistake/activity/c0;

    .line 481
    .line 482
    const/4 v7, 0x4

    .line 483
    invoke-direct {v6, v0, v7}, Lcom/zykj/mistake/activity/c0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 484
    .line 485
    .line 486
    new-instance v7, Lcom/zykj/mistake/activity/a0;

    .line 487
    .line 488
    invoke-direct {v7, v0, v3}, Lcom/zykj/mistake/activity/a0;-><init>(Lcom/zykj/mistake/activity/SketchActivity;I)V

    .line 489
    .line 490
    .line 491
    const/16 v25, 0x1f4d

    .line 492
    .line 493
    const/16 v26, 0x0

    .line 494
    .line 495
    const/4 v14, 0x0

    .line 496
    const/4 v15, 0x0

    .line 497
    const/16 v18, 0x0

    .line 498
    .line 499
    const/16 v20, 0x0

    .line 500
    .line 501
    const/16 v22, 0x0

    .line 502
    .line 503
    const/16 v23, 0x0

    .line 504
    .line 505
    const/16 v24, 0x0

    .line 506
    .line 507
    move-object/from16 v16, v2

    .line 508
    .line 509
    move-object/from16 v17, v6

    .line 510
    .line 511
    move-object/from16 v19, v7

    .line 512
    .line 513
    invoke-direct/range {v11 .. v26}, Lcom/zykj/view/board/board/BoardCallbackConfig;-><init>(ZLr6/c;Lr6/e;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILkotlin/jvm/internal/e;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v5, v1, v9, v10, v11}, Lcom/zykj/view/board/board/BoardFragment$Companion;->newInstance(Ljava/lang/String;Lcom/zykj/view/board/board/BoardViewConfig;Lcom/zykj/view/board/board/BoardSketchConfig;Lcom/zykj/view/board/board/BoardCallbackConfig;)Lcom/zykj/view/board/board/BoardFragment;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    iput-object v1, v0, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 521
    .line 522
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    sget v2, Lcom/zykj/mistake/R$id;->sketch_fragment:I

    .line 531
    .line 532
    iget-object v3, v0, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 533
    .line 534
    if-eqz v3, :cond_b

    .line 535
    .line 536
    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 541
    .line 542
    .line 543
    return-void

    .line 544
    :cond_b
    const-string v1, "mSketchFragment"

    .line 545
    .line 546
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v4

    .line 550
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    throw v4

    .line 554
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v4
.end method

.method public final u(Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->d(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/lang/Thread;

    .line 6
    .line 7
    new-instance v1, Landroidx/camera/core/impl/utils/a;

    .line 8
    .line 9
    const/16 v2, 0xb

    .line 10
    .line 11
    invoke-direct {v1, v2, p1, p0}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final v()V
    .locals 10

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity;->p:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_e

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 21
    .line 22
    const-string v4, "mMicroLessonUtils"

    .line 23
    .line 24
    if-eqz v3, :cond_d

    .line 25
    .line 26
    iget-object v3, v3, Lcom/zykj/mistake/utils/h;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :cond_1
    new-instance v5, Ljava/io/File;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const-string v7, "_next"

    .line 45
    .line 46
    invoke-static {v6, v7}, Landroid/support/v4/media/f;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-direct {v5, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v6, Ljava/io/File;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    const-string v8, "_backup"

    .line 60
    .line 61
    invoke-static {v7, v8}, Landroid/support/v4/media/f;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-direct {v6, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v5}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v6}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_3

    .line 79
    .line 80
    :try_start_0
    invoke-static {v0, v5}, Lkotlin/io/a;->u(Ljava/io/File;Ljava/io/File;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v3

    .line 94
    invoke-static {v3}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :goto_1
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-static {v3}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_2

    .line 109
    .line 110
    move-object v3, v7

    .line 111
    :cond_2
    check-cast v3, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_4

    .line 118
    .line 119
    :cond_3
    new-instance v3, Lcom/zykj/mistake/utils/h;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    const-string v8, "getAbsolutePath(...)"

    .line 126
    .line 127
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v3, v7, v2}, Lcom/zykj/mistake/utils/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Lcom/zykj/mistake/utils/h;->e()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_5

    .line 138
    .line 139
    :cond_4
    invoke-static {v5}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_5
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    invoke-virtual {v1, v6}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_6

    .line 154
    .line 155
    invoke-static {v5}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_6
    invoke-virtual {v5, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_8

    .line 164
    .line 165
    :try_start_1
    invoke-static {v5, v1}, Lkotlin/io/a;->u(Ljava/io/File;Ljava/io/File;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 177
    goto :goto_2

    .line 178
    :catchall_1
    move-exception v3

    .line 179
    invoke-static {v3}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    :goto_2
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-static {v3}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    if-eqz v9, :cond_7

    .line 194
    .line 195
    move-object v3, v7

    .line 196
    :cond_7
    check-cast v3, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_9

    .line 203
    .line 204
    :cond_8
    new-instance v3, Lcom/zykj/mistake/utils/h;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v3, v7, v2}, Lcom/zykj/mistake/utils/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Lcom/zykj/mistake/utils/h;->e()Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-nez v3, :cond_b

    .line 221
    .line 222
    :cond_9
    invoke-static {v1}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_a

    .line 230
    .line 231
    invoke-virtual {v6, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 232
    .line 233
    .line 234
    :cond_a
    invoke-static {v5}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_b
    invoke-static {v5}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v6}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v0}, Lcom/zykj/mistake/utils/f;->a(Ljava/io/File;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lcom/zykj/mistake/activity/SketchActivity;->k:Lcom/zykj/mistake/utils/h;

    .line 248
    .line 249
    if-eqz v0, :cond_c

    .line 250
    .line 251
    iput-object v2, v0, Lcom/zykj/mistake/utils/h;->c:Ljava/lang/Integer;

    .line 252
    .line 253
    iput-object v2, v0, Lcom/zykj/mistake/utils/h;->b:Ljava/lang/String;

    .line 254
    .line 255
    return-void

    .line 256
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v2

    .line 260
    :cond_d
    invoke-static {v4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v2

    .line 264
    :cond_e
    const-string v0, "mUploadDataPath"

    .line 265
    .line 266
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v2
.end method

.method public final w(Ljava/lang/String;Lr6/a;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->d(Z)V

    .line 3
    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/zykj/mistake/activity/SketchActivity;->q:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v5, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;

    .line 13
    .line 14
    invoke-direct {v5, p0, p2, p1, v0}, Lcom/zykj/mistake/activity/SketchActivity$saveData$2;-><init>(Lcom/zykj/mistake/activity/SketchActivity;Lr6/a;Ljava/lang/String;Lh6/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v6, 0x7

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static/range {v1 .. v7}, Lcom/zykj/view/board/board/BoardFragment;->getSavePath$default(Lcom/zykj/view/board/board/BoardFragment;ZZLr6/e;Lr6/e;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p1, "mSketchFragment"

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method
