.class public final Lcom/zykj/cloudhelper/activity/NoteManagerActivity;
.super Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity<",
        "Lcom/zykj/cloudhelper/databinding/ActivityNoteManagerBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/friday/common/base/BaseActivity;->$stable:I

    sput v0, Lcom/zykj/cloudhelper/activity/NoteManagerActivity;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_note_manager (0x7f0c0020), APK res/rk.xml
    sget v0, Lcom/zykj/cloudhelper/R$layout;->activity_note_manager:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 8
    .line 9
    .line 10
    const-string v0, "\u672a\u68c0\u6d4b\u5230\u76f8\u5173\u53c2\u6570"

    .line 11
    .line 12
    invoke-static {v0}, Lz1/b;->d(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lf2/c;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 25
    .line 26
    .line 27
    const-string v0, "\u7f51\u7edc\u672a\u8fde\u63a5"

    .line 28
    .line 29
    invoke-static {v0}, Lz1/b;->d(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->s()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    const-string v0, "\u4e91\u7b14\u8bb0\u672a\u767b\u5f55"

    .line 50
    .line 51
    invoke-static {v0}, Lz1/b;->d(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->finishAllActivities()V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/friday/common/helper/c;->f()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v2, "userId"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 92
    .line 93
    .line 94
    const-string v0, "\u7528\u6237\u4e0d\u4e00\u81f4"

    .line 95
    .line 96
    invoke-static {v0}, Lz1/b;->d(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "com.zykj.pickfile"

    .line 109
    .line 110
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget v1, Lcom/zykj/cloudhelper/R$id;->fl_container:I

    .line 125
    .line 126
    sget-object v2, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->i:Lcom/zykj/cloudhelper/fragment/PickNoteFragment$a;

    .line 127
    .line 128
    invoke-virtual {v2}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$a;->a()Lcom/zykj/cloudhelper/fragment/PickNoteFragment;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget v1, Lcom/zykj/cloudhelper/R$id;->fl_container:I

    .line 149
    .line 150
    sget-object v2, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->m:Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$a;

    .line 151
    .line 152
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    const-string v5, "ossUrl"

    .line 165
    .line 166
    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v2, v3, v4}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$a;->a(Landroid/net/Uri;Ljava/lang/String;)Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 179
    .line 180
    .line 181
    return-void
.end method
