.class public final Lcom/friday/document/view/share/ShareSearchActivity;
.super Lcom/friday/document/view/share/Hilt_ShareSearchActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/document/ShareSearchActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/share/Hilt_ShareSearchActivity<",
        "Lcom/friday/document/databinding/ShareSearchActivityBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;

.field public final h:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/Hilt_ShareSearchActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/share/ShareSearchActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/share/ShareSearchActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/document/view/share/ShareSearchActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/document/view/share/ShareSearchActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/document/view/share/ShareSearchActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/document/view/share/ShareSearchActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/document/view/share/ShareSearchActivity;->g:Lqc/d;

    .line 32
    .line 33
    new-instance v0, Lx2/m;

    .line 34
    .line 35
    invoke-direct {v0}, Lx2/m;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/document/view/share/ShareSearchActivity;->h:Lqc/d;

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic N(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/share/ShareSearchActivity;->Z(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/friday/document/view/share/ShareSearchActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/share/ShareSearchActivity;->b0(Lcom/friday/document/view/share/ShareSearchActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic P(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/share/ShareSearchActivity;->Y(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q()Lcom/friday/document/view/share/ShareSearchAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/view/share/ShareSearchActivity;->d0()Lcom/friday/document/view/share/ShareSearchAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic R(Lcom/friday/document/view/share/ShareSearchActivity;ILcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity;->c0(Lcom/friday/document/view/share/ShareSearchActivity;ILcom/friday/document/model/ShareFile;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/share/ShareSearchActivity;->a0(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/databinding/ShareSearchActivityBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->W()Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic V(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/view/share/ShareSearchAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->X()Lcom/friday/document/view/share/ShareSearchAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final Y(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "12"

    .line 18
    .line 19
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-virtual/range {v1 .. v6}, Lcom/friday/common/helper/c;->k(Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget p0, Lcom/friday/document/R$string;->download_error:I

    .line 34
    .line 35
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 39
    .line 40
    return-object p0
.end method

.method public static final Z(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getParentId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getTxtFilePath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const/16 v9, 0x8

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-static/range {v1 .. v10}, Lcom/friday/common/helper/c;->q(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget p0, Lcom/friday/document/R$string;->download_error:I

    .line 39
    .line 40
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 44
    .line 45
    return-object p0
.end method

.method public static final a0(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 5

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "7"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOthersPath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1, v2}, Lcom/friday/common/helper/c;->d(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    const-string v1, "11"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isDir(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    :try_start_0
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ".zip"

    .line 91
    .line 92
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v4, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :catch_0
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 153
    .line 154
    .line 155
    const-string p0, "\u5fae\u8bfe\u6587\u4ef6\u89e3\u538b\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 156
    .line 157
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_1
    :goto_0
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 164
    .line 165
    .line 166
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->shareNotePath()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v1, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/c;->t(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_2
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOthersPath()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/c;->m(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_3
    sget p0, Lcom/friday/document/R$string;->download_error:I

    .line 209
    .line 210
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 211
    .line 212
    .line 213
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 214
    .line 215
    return-object p0
.end method

.method public static final b0(Lcom/friday/document/view/share/ShareSearchActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final c0(Lcom/friday/document/view/share/ShareSearchActivity;ILcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/friday/document/R$id;->iv_go:I

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "ShareSearchToDetailPath"

    .line 11
    .line 12
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, p2}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget v0, Lcom/friday/document/R$id;->ll_container:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v4, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-direct {v4, p2, p0, p1}, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/ShareSearchActivity;Lvc/c;)V

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 45
    .line 46
    return-object p0
.end method

.method public static final d0()Lcom/friday/document/view/share/ShareSearchAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/view/share/ShareSearchAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/view/share/ShareSearchAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final W()Lcom/friday/document/viewmodel/StudentShareViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareSearchActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final X()Lcom/friday/document/view/share/ShareSearchAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareSearchActivity;->h:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/view/share/ShareSearchAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final e0(Landroidx/appcompat/widget/SearchView;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "mSearchPlate"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "null cannot be cast to non-null type android.view.View"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Landroid/view/View;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    :goto_2
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/share_search_activity (0x7f0c014a), APK res/Xv.xml
    sget v0, Lcom/friday/document/R$layout;->share_search_activity:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->initDataSource()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public initDataSource()V
    .locals 6

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initDataSource()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v3, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v3, p0, v1}, Lcom/friday/document/view/share/ShareSearchActivity$initDataSource$1;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->W()Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lx2/p;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lx2/p;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lcom/friday/document/view/share/ShareSearchActivity$b;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Lcom/friday/document/view/share/ShareSearchActivity$b;-><init>(Lhd/l;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->W()Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lx2/q;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Lx2/q;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Lcom/friday/document/view/share/ShareSearchActivity$b;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Lcom/friday/document/view/share/ShareSearchActivity$b;-><init>(Lhd/l;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->W()Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Lx2/r;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lx2/r;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lcom/friday/document/view/share/ShareSearchActivity$b;

    .line 76
    .line 77
    invoke-direct {v2, v1}, Lcom/friday/document/view/share/ShareSearchActivity$b;-><init>(Lhd/l;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public initView()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;->f:Landroid/widget/ImageView;

    .line 11
    .line 12
    new-instance v1, Lx2/n;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lx2/n;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;->e:Landroidx/appcompat/widget/Toolbar;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;->d:Landroidx/appcompat/widget/SearchView;

    .line 53
    .line 54
    sget v2, Lcom/friday/document/R$string;->query_in_all_share:I

    .line 55
    .line 56
    invoke-static {v2}, Lz1/b;->f(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->onActionViewExpanded()V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lcom/friday/document/view/share/ShareSearchActivity;->e0(Landroidx/appcompat/widget/SearchView;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1;

    .line 79
    .line 80
    invoke-direct {v1, p0}, Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$OnQueryTextListener;)V

    .line 84
    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    :try_start_0
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 88
    .line 89
    const-class v2, Landroidx/appcompat/widget/SearchView;

    .line 90
    .line 91
    const-string v3, "mSearchSrcTextView"

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v2, "null cannot be cast to non-null type android.widget.TextView"

    .line 105
    .line 106
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    check-cast v0, Landroid/widget/TextView;

    .line 110
    .line 111
    const-class v2, Landroid/widget/TextView;

    .line 112
    .line 113
    const-string v3, "mDeviceProvisionedState"

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v2, Lcom/friday/document/view/share/ShareSearchActivity$a;

    .line 130
    .line 131
    invoke-direct {v2}, Lcom/friday/document/view/share/ShareSearchActivity$a;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setCustomInsertionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 138
    .line 139
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    goto :goto_0

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_1

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 162
    .line 163
    .line 164
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;

    .line 169
    .line 170
    iget-object v0, v0, Lcom/friday/document/databinding/ShareSearchActivityBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 173
    .line 174
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 182
    .line 183
    .line 184
    new-instance v2, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-direct {v2, v3, v1}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    sget v3, Lcom/friday/document/R$drawable;->shape_search:I

    .line 198
    .line 199
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->X()Lcom/friday/document/view/share/ShareSearchAdapter;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareSearchActivity;->X()Lcom/friday/document/view/share/ShareSearchAdapter;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v1, Lx2/o;

    .line 224
    .line 225
    invoke-direct {v1, p0}, Lx2/o;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Lcom/friday/document/view/share/ShareSearchAdapter;->g(Lhd/p;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method
