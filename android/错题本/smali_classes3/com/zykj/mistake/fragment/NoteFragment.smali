.class public final Lcom/zykj/mistake/fragment/NoteFragment;
.super Lcom/zykj/mistake/base/BaseMVPFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseMVPFragment<",
        "Lcom/zykj/mistake/presenter/NotePresenter;",
        "Lcom/zykj/mistake/databinding/FragmentNoteBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/mistake/fragment/NoteFragment;",
        "Lcom/zykj/mistake/base/BaseMVPFragment;",
        "Lcom/zykj/mistake/presenter/NotePresenter;",
        "Lcom/zykj/mistake/databinding/FragmentNoteBinding;",
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
        "SMAP\nNoteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoteFragment.kt\ncom/zykj/mistake/fragment/NoteFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,366:1\n13472#2,2:367\n*S KotlinDebug\n*F\n+ 1 NoteFragment.kt\ncom/zykj/mistake/fragment/NoteFragment\n*L\n152#1:367,2\n*E\n"
    }
.end annotation


# instance fields
.field public final d:Ljava/lang/String;

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public final h:Lcom/zykj/view/utils/ImagePicker;

.field public final i:Lcom/zykj/mistake/adapter/DetailNoteImageAdapter;

.field public final j:I

.field public k:Z

.field public l:Ll4/d;

.field public m:Lcom/zykj/mistake/utils/g;

.field public final n:Landroid/os/Messenger;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "DrawBoardData"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->d:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->f:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->g:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, Lcom/zykj/view/utils/ImagePicker;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->h:Lcom/zykj/view/utils/ImagePicker;

    .line 22
    .line 23
    new-instance v0, Lcom/zykj/mistake/adapter/DetailNoteImageAdapter;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/zykj/mistake/adapter/DetailNoteImageAdapter;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->i:Lcom/zykj/mistake/adapter/DetailNoteImageAdapter;

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    iput v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->j:I

    .line 32
    .line 33
    new-instance v0, Landroid/os/Messenger;

    .line 34
    .line 35
    new-instance v1, Lcom/blankj/utilcode/util/h;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-direct {v1, p0, v2}, Lcom/blankj/utilcode/util/h;-><init>(Landroid/content/ComponentCallbacks;I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->n:Landroid/os/Messenger;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->fragment_note:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentNoteBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentNoteBinding;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    const-string v0, "ivNoteThumbnail"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lq4/c;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, v1}, Lq4/c;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, Lcom/zykj/mistake/utils/e;->e(Landroid/view/View;Lr6/a;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Landroidx/camera/core/impl/d;

    .line 24
    .line 25
    const/16 v0, 0x11

    .line 26
    .line 27
    invoke-direct {p1, p0, v0}, Landroidx/camera/core/impl/d;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->i:Lcom/zykj/mistake/adapter/DetailNoteImageAdapter;

    .line 31
    .line 32
    iput-object p1, v0, Lcom/chad/library/adapter/base/BaseQuickAdapter;->c:Landroidx/camera/core/impl/d;

    .line 33
    .line 34
    iget-object p1, v0, Lcom/chad/library/adapter/base/BaseQuickAdapter;->d:Lf5/a;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    new-instance v1, Lq4/f;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lq4/f;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p1, La1/a;->e:Lq4/f;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentNoteBinding;

    .line 50
    .line 51
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentNoteBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v0, "Please first implements DraggableModule"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public final i()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/mistake/presenter/NotePresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "itemId"

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->e:J

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "noteUrl"

    .line 20
    .line 21
    const-string v2, ""

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "getString(...)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->f:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v3, "pictureNoteUrl"

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    array-length v4, v1

    .line 53
    move v5, v3

    .line 54
    :goto_0
    if-ge v5, v4, :cond_0

    .line 55
    .line 56
    aget-object v6, v1, v5

    .line 57
    .line 58
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget v4, p0, Lcom/zykj/mistake/fragment/NoteFragment;->j:I

    .line 69
    .line 70
    if-ge v1, v4, :cond_1

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_1
    const-string v1, "Board/Pictures"

    .line 76
    .line 77
    invoke-static {v1}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, p0, Lcom/zykj/mistake/fragment/NoteFragment;->g:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p0, Lcom/zykj/mistake/fragment/NoteFragment;->f:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-lez v1, :cond_2

    .line 90
    .line 91
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 92
    .line 93
    iget-object v2, p0, Lcom/zykj/mistake/fragment/NoteFragment;->d:Ljava/lang/String;

    .line 94
    .line 95
    iget-wide v4, p0, Lcom/zykj/mistake/fragment/NoteFragment;->e:J

    .line 96
    .line 97
    new-instance v6, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v2, "/"

    .line 106
    .line 107
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v2}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v2, p0, Lcom/zykj/mistake/fragment/NoteFragment;->f:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v4, "getAbsolutePath(...)"

    .line 131
    .line 132
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    new-instance v4, Lcom/zykj/mistake/utils/h;

    .line 136
    .line 137
    invoke-direct {v4, v1, v2}, Lcom/zykj/mistake/utils/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, Landroidx/navigation/e;

    .line 141
    .line 142
    const/16 v5, 0x18

    .line 143
    .line 144
    invoke-direct {v1, v5, p0, v4}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    new-instance v5, Lq4/c;

    .line 148
    .line 149
    invoke-direct {v5, p0, v3}, Lq4/c;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v2, v1, v5}, Lcom/zykj/mistake/utils/h;->a(Ljava/lang/String;Lr6/a;Lr6/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catch_0
    move-exception v1

    .line 157
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 158
    .line 159
    .line 160
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/zykj/mistake/fragment/NoteFragment;->i:Lcom/zykj/mistake/adapter/DetailNoteImageAdapter;

    .line 161
    .line 162
    iget-object v2, v1, Lcom/chad/library/adapter/base/BaseQuickAdapter;->b:Ljava/util/List;

    .line 163
    .line 164
    if-eq v0, v2, :cond_4

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-eqz v4, :cond_3

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_5

    .line 185
    .line 186
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 196
    .line 197
    .line 198
    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 199
    .line 200
    .line 201
    :goto_2
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 202
    .line 203
    .line 204
    new-instance v0, Ll4/d;

    .line 205
    .line 206
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-string v2, "requireContext(...)"

    .line 211
    .line 212
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v0, v1}, Ll4/d;-><init>(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    iput-object v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->l:Ll4/d;

    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;->h()Lcom/zykj/mistake/base/BasePresenter;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Lcom/zykj/mistake/presenter/NotePresenter;

    .line 225
    .line 226
    sget-object v1, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 227
    .line 228
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    const-string v2, "com.zykj.mistake"

    .line 233
    .line 234
    invoke-interface {v1, v2}, Lcom/zykj/mistake/network/b;->m(Ljava/lang/String;)Lq5/e;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v2, Lb5/i;

    .line 239
    .line 240
    invoke-direct {v2, v0, v3}, Lb5/i;-><init>(Lcom/zykj/mistake/base/BasePresenter;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/mistake/utils/f;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/zykj/mistake/fragment/NoteFragment;->e:J

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lcom/zykj/mistake/fragment/NoteFragment;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v3, "/"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lcom/zykj/mistake/utils/h;

    .line 35
    .line 36
    invoke-direct {p1, v0, v1}, Lcom/zykj/mistake/utils/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/mistake/utils/h;->d()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_0
    if-eqz p1, :cond_3

    .line 44
    .line 45
    new-instance v0, Ljava/io/File;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/4 v1, 0x1

    .line 73
    if-ne v0, v1, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lcom/zykj/mistake/databinding/FragmentNoteBinding;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/zykj/mistake/databinding/FragmentNoteBinding;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 83
    .line 84
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1, p1}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lr0/a;->r()Lr0/a;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lcom/bumptech/glide/f;

    .line 97
    .line 98
    sget-object v1, Lb0/o;->b:Lb0/m;

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lcom/bumptech/glide/f;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_0
    return-void

    .line 110
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentNoteBinding;

    .line 115
    .line 116
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentNoteBinding;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 117
    .line 118
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Lcom/zykj/mistake/service/UploadIntentService;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "UPLOAD_TYPE"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-string v1, "UPLOAD_PATH"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    const-string p1, "UPLOAD_MESSENGER"

    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/fragment/NoteFragment;->n:Landroid/os/Messenger;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/zykj/mistake/utils/g;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lcom/zykj/mistake/utils/g;-><init>(Landroidx/activity/result/ActivityResultCaller;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/mistake/fragment/NoteFragment;->m:Lcom/zykj/mistake/utils/g;

    .line 10
    .line 11
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/fragment/NoteFragment;->k(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
