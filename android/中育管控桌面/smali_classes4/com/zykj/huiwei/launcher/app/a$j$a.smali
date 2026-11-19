# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/app/a$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public final b:I


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->b:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ly4/c;->a(Ly4/a;)Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_UpdateSettingsDataStoreFactory;->updateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->p()Lf5/a0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideVersionServiceFactory;->provideVersionService(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/VersionService;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :pswitch_2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->p()Lf5/a0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideDeviceServiceFactory;->provideDeviceService(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/DeviceService;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :pswitch_3
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->g(Lcom/zykj/huiwei/launcher/app/a$j;)Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideAppListFactory;->provideAppList(Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :pswitch_4
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->i()Lf5/a0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideGatewayServiceFactory;->provideGatewayService(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/GatewayService;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_5
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->p()Lf5/a0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideNotificationFactory;->provideNotification(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->p()Lf5/a0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideGalleryServiceFactory;->provideGalleryService(Lf5/a0;)Lcom/zykj/gallery/api/PictureService;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0

    .line 95
    :pswitch_7
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->p()Lf5/a0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideHomeServiceFactory;->provideHomeService(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :pswitch_8
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->h()Lf5/a0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideAuthServiceFactory;->provideAuthService(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/AuthService;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0

    .line 117
    :pswitch_9
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;

    .line 118
    .line 119
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 120
    .line 121
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->j:La5/f;

    .line 122
    .line 123
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Lcom/zykj/huiwei/launcher/api/AuthService;

    .line 128
    .line 129
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 130
    .line 131
    iget-object v2, v2, Lcom/zykj/huiwei/launcher/app/a$j;->d:La5/f;

    .line 132
    .line 133
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 138
    .line 139
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 140
    .line 141
    iget-object v3, v3, Lcom/zykj/huiwei/launcher/app/a$j;->h:La5/f;

    .line 142
    .line 143
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 148
    .line 149
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;-><init>(Lcom/zykj/huiwei/launcher/api/AuthService;Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_a
    invoke-static {}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideUnauthorizedFlowFactory;->provideUnauthorizedFlow()Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_b
    invoke-static {}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory;->provideHeaderBeanFlow()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :pswitch_c
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->p()Lf5/a0;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/ApiProvide_ProvideUserServiceFactory;->provideUserService(Lf5/a0;)Lcom/zykj/huiwei/launcher/api/UserService;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_d
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 175
    .line 176
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Ly4/c;->a(Ly4/a;)Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_StudentInfoDataStoreFactory;->studentInfoDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :pswitch_e
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 190
    .line 191
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Ly4/c;->a(Ly4/a;)Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_SettingDataStoreFactory;->settingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    return-object v0

    .line 204
    :pswitch_f
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 205
    .line 206
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Ly4/c;->a(Ly4/a;)Landroid/content/Context;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_UserCacheBeanDataStoreFactory;->userCacheBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    return-object v0

    .line 219
    :pswitch_10
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 220
    .line 221
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v0}, Ly4/c;->a(Ly4/a;)Landroid/content/Context;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;->serverBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    return-object v0

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
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
