.class public final synthetic Lq4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq4/b;->a:I

    iput-object p1, p0, Lq4/b;->b:Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lq4/b;->a:I

    .line 2
    .line 3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    iget-object v2, p0, Lq4/b;->b:Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    .line 12
    .line 13
    const-string v0, "userInfo"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p1, Lcom/zykj/message/server/bean/UserInfo;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, p1, Lcom/zykj/message/server/bean/UserInfo;->c:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, "_"

    .line 31
    .line 32
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v4, "<set-?>"

    .line 43
    .line 44
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/zykj/mistake/utils/e;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object p1, p1, Lcom/zykj/message/server/bean/UserInfo;->a:Ljava/lang/Long;

    .line 54
    .line 55
    const-string v2, "getId(...)"

    .line 56
    .line 57
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    const-string p1, "zykjMistake"

    .line 65
    .line 66
    invoke-virtual {v0, p1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, "SP_USER_ID"

    .line 75
    .line 76
    invoke-interface {p1, v0, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 77
    .line 78
    .line 79
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_0
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 84
    .line 85
    const-string v0, "it"

    .line 86
    .line 87
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p1, Lcom/zykj/message/server/bean/ServerInfo;->c:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v4, p1, Lcom/zykj/message/server/bean/ServerInfo;->b:Ljava/lang/String;

    .line 93
    .line 94
    iget-object p1, p1, Lcom/zykj/message/server/bean/ServerInfo;->a:Lcom/zykj/message/server/bean/Status;

    .line 95
    .line 96
    sget-object v5, Lcom/zykj/message/server/bean/Status;->LOGIN:Lcom/zykj/message/server/bean/Status;

    .line 97
    .line 98
    if-ne p1, v5, :cond_0

    .line 99
    .line 100
    sget-object p1, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 101
    .line 102
    const-string p1, "getServerUrl(...)"

    .line 103
    .line 104
    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sput-object v4, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 108
    .line 109
    const-string p1, "getToken(...)"

    .line 110
    .line 111
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sput-object v0, Lcom/zykj/mistake/network/a;->c:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v5, "SP_API_URL"

    .line 121
    .line 122
    invoke-static {p1, v5, v4}, Lcom/zykj/mistake/utils/d;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const-string v4, "SP_API_TOKEN"

    .line 130
    .line 131
    invoke-static {p1, v4, v0}, Lcom/zykj/mistake/utils/d;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sget-object p1, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 135
    .line 136
    new-instance v0, Lq4/b;

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    invoke-direct {v0, v2, v4}, Lq4/b;-><init>(Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient;->getUserInfo(Lr6/c;)V

    .line 143
    .line 144
    .line 145
    iget-boolean p1, v2, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->d:Z

    .line 146
    .line 147
    if-eqz p1, :cond_0

    .line 148
    .line 149
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseMVPFragment;->h()Lcom/zykj/mistake/base/BasePresenter;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Lcom/zykj/mistake/presenter/MainPresenter;

    .line 154
    .line 155
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Lcom/zykj/mistake/network/b;->p()Lq5/e;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    new-instance v5, Lb5/a;

    .line 164
    .line 165
    invoke-direct {v5, p1, v4}, Lb5/a;-><init>(Lcom/zykj/mistake/presenter/MainPresenter;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v0, v5}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 169
    .line 170
    .line 171
    iput-boolean v3, v2, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->d:Z

    .line 172
    .line 173
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseMVPFragment;->h()Lcom/zykj/mistake/base/BasePresenter;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Lcom/zykj/mistake/presenter/MainPresenter;

    .line 178
    .line 179
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const-string v2, "com.zykj.mistake"

    .line 184
    .line 185
    invoke-interface {v0, v2}, Lcom/zykj/mistake/network/b;->m(Ljava/lang/String;)Lq5/e;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    new-instance v2, Lb5/a;

    .line 190
    .line 191
    invoke-direct {v2, p1, v3}, Lb5/a;-><init>(Lcom/zykj/mistake/presenter/MainPresenter;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0, v2, v3}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 195
    .line 196
    .line 197
    :cond_0
    return-object v1

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
