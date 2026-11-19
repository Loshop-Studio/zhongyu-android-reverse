.class public Lanet/channel/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lanetwork/channel/config/IRemoteConfig;


# static fields
.field private static a:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "com.taobao.orange.OrangeConfig"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lanet/channel/c/a;->a:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 3
    sput-boolean v0, Lanet/channel/c/a;->a:Z

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs getConfig([Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    sget-boolean v0, Lanet/channel/c/a;->a:Z

    const-string v1, "awcn.OrangeConfigImpl"

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "no orange sdk"

    .line 2
    invoke-static {v1, v0, v3, p1}, Lanet/channel/util/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/taobao/orange/OrangeConfig;->getInstance()Lcom/taobao/orange/OrangeConfig;

    move-result-object v0

    aget-object v4, p1, v2

    const/4 v5, 0x1

    aget-object v5, p1, v5

    const/4 v6, 0x2

    aget-object p1, p1, v6

    invoke-virtual {v0, v4, v5, p1}, Lcom/taobao/orange/OrangeConfig;->getConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "get config failed!"

    .line 4
    invoke-static {v1, v2, v3, p1, v0}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-object v3
.end method

.method public onConfigUpdate(Ljava/lang/String;)V
    .locals 9

    const-string v0, "true"

    const-string v1, "networkSdk"

    .line 1
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "namespace"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string v5, "awcn.OrangeConfigImpl"

    const-string v6, "onConfigUpdate"

    const/4 v7, 0x0

    .line 2
    invoke-static {v5, v6, v7, v2}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x3

    :try_start_0
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_empty_scheme_https_switch"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 3
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 4
    sget-object v6, Lanet/channel/strategy/c$a;->a:Lanet/channel/strategy/c;

    .line 5
    invoke-virtual {v6, v5}, Lanet/channel/strategy/c;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_spdy_enable_switch"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 6
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 7
    invoke-static {v5}, Lanetwork/channel/config/NetworkConfigCenter;->setSpdyEnabled(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_http_cache_switch"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 8
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 9
    invoke-static {v5}, Lanetwork/channel/config/NetworkConfigCenter;->setHttpCacheEnable(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_http_cache_flag"

    aput-object v6, v5, v3

    aput-object v7, v5, v1

    .line 10
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 11
    invoke-static {v5}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v5, v6}, Lanetwork/channel/config/NetworkConfigCenter;->setCacheFlag(J)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_0
    :try_start_4
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_https_sni_enable_switch"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 12
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 13
    invoke-static {v5}, Lanet/channel/AwcnConfig;->setHttpsSniEnable(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_accs_session_bg_switch"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 14
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 15
    invoke-static {v5}, Lanet/channel/AwcnConfig;->setAccsSessionCreateForbiddenInBg(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_request_statistic_sample_rate"

    aput-object v6, v5, v3

    const-string v6, "10000"

    aput-object v6, v5, v1

    .line 16
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 17
    invoke-static {v5}, Lanetwork/channel/config/NetworkConfigCenter;->setRequestStatisticSampleRate(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_request_forbidden_bg"

    aput-object v6, v5, v3

    aput-object v7, v5, v1

    .line 18
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 20
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 21
    invoke-static {v5}, Lanetwork/channel/config/NetworkConfigCenter;->setBgRequestForbidden(Z)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :cond_1
    :try_start_8
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_url_white_list_bg"

    aput-object v6, v5, v3

    aput-object v7, v5, v1

    .line 22
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lanetwork/channel/config/NetworkConfigCenter;->updateWhiteListMap(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_biz_white_list_bg"

    aput-object v6, v5, v3

    aput-object v7, v5, v1

    .line 23
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 25
    invoke-static {v5}, Lanetwork/channel/config/NetworkConfigCenter;->updateBizWhiteList(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    :cond_2
    :try_start_a
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_amdc_preset_hosts"

    aput-object v6, v5, v3

    aput-object v7, v5, v1

    .line 26
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 28
    invoke-static {v5}, Lanetwork/channel/config/NetworkConfigCenter;->setAmdcPresetHosts(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    :cond_3
    :try_start_b
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_horse_race_switch"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 29
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 30
    invoke-static {v5}, Lanet/channel/AwcnConfig;->setHorseRaceEnable(Z)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "tnet_enable_header_cache"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 31
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 32
    invoke-static {v5}, Lanet/channel/AwcnConfig;->setTnetHeaderCacheEnable(Z)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    :try_start_d
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_http3_enable_switch"

    aput-object v6, v5, v3

    aput-object v7, v5, v1

    .line 33
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 34
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 35
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 36
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    const-string v8, "HTTP3_ENABLE"

    .line 37
    invoke-interface {v6, v8, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 38
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 39
    invoke-static {v5}, Lanet/channel/AwcnConfig;->setHttp3OrangeEnable(Z)V

    if-nez v5, :cond_4

    .line 40
    invoke-static {v4}, Lanet/channel/AwcnConfig;->setHttp3Enable(Z)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    :cond_4
    :try_start_e
    new-array v5, v2, [Ljava/lang/String;

    aput-object p1, v5, v4

    const-string v6, "network_response_buffer_switch"

    aput-object v6, v5, v3

    aput-object v0, v5, v1

    .line 41
    invoke-virtual {p0, v5}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 42
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setResponseBufferEnable(Z)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    :try_start_f
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_get_session_async_switch"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 43
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 46
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    const-string v6, "SESSION_ASYNC_OPTIMIZE"

    .line 47
    invoke-interface {v5, v6, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 48
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    :cond_5
    :try_start_10
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_bg_forbid_request_threshold"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 49
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_6

    const/4 v0, 0x0

    .line 52
    :cond_6
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setBgForbidRequestThreshold(I)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    :cond_7
    :try_start_11
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_normal_thread_pool_executor_size"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 53
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_8

    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 56
    invoke-static {v0}, Lanet/channel/thread/ThreadPoolExecutorFactory;->setNormalExecutorPoolSize(I)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    :cond_8
    :try_start_12
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_idle_session_close_switch"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 57
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    .line 59
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 60
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIdleSessionCloseEnable(Z)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    :cond_9
    :try_start_13
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_monitor_requests"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 61
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a

    .line 63
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setMonitorRequestList(Ljava/lang/String;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    :cond_a
    :try_start_14
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_session_preset_hosts"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 64
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 65
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 66
    invoke-static {v0}, Lanet/channel/AwcnConfig;->registerPresetSessions(Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    :cond_b
    :try_start_15
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_ipv6_blacklist_switch"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 67
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_c

    .line 69
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 70
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIpv6BlackListEnable(Z)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    :cond_c
    :try_start_16
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_ipv6_blacklist_ttl"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 71
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 73
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 74
    invoke-static {v5, v6}, Lanet/channel/AwcnConfig;->setIpv6BlackListTtl(J)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    :cond_d
    :try_start_17
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_url_degrade_list"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 75
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_e

    .line 77
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setDegradeRequestList(Ljava/lang/String;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    :cond_e
    :try_start_18
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_delay_retry_request_no_network"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 78
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    .line 80
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 81
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setRequestDelayRetryForNoNetwork(Z)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    :cond_f
    :try_start_19
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_bind_service_optimize"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 82
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_10

    .line 84
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 85
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    const-string v6, "SERVICE_OPTIMIZE"

    .line 86
    invoke-interface {v5, v6, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 87
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    :cond_10
    :try_start_1a
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_forbid_next_launch_optimize"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 88
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_11

    .line 90
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 91
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    const-string v6, "NEXT_LAUNCH_FORBID"

    .line 92
    invoke-interface {v5, v6, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 93
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    :cond_11
    :try_start_1b
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_detect_enable_switch"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 94
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 95
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_12

    .line 96
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 97
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setNetworkDetectEnable(Z)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    :cond_12
    :try_start_1c
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_ping6_enable_switch"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 98
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 99
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_13

    .line 100
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 101
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setPing6Enable(Z)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    :cond_13
    :try_start_1d
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_ipv6_global_enable_swtich"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 102
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 103
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_14

    .line 104
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 105
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIpv6Enable(Z)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    :cond_14
    :try_start_1e
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_xquic_cong_control"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 106
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 107
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_15

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 109
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setXquicCongControl(I)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    :cond_15
    :try_start_1f
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_http3_detect_valid_time"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 110
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 111
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_16

    .line 112
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 113
    invoke-static {v5, v6}, Lanet/channel/e/a;->a(J)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_1f

    :catch_1f
    :cond_16
    :try_start_20
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_ip_stack_detect_by_udp_connect_enable_switch"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 114
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_17

    .line 116
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 117
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIpStackDetectByUdpConnect(Z)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_20

    :catch_20
    :cond_17
    :try_start_21
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_cookie_monitor"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 118
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_18

    .line 120
    invoke-static {v0}, Lanetwork/channel/cookie/CookieManager;->setTargetMonitorCookieName(Ljava/lang/String;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_21

    :catch_21
    :cond_18
    :try_start_22
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_cookie_header_redundant_fix"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 121
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_19

    .line 123
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 124
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setCookieHeaderRedundantFix(Z)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_22

    :catch_22
    :cond_19
    :try_start_23
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_channel_local_instance_enable_switch"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 125
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1a

    .line 127
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 128
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setChannelLocalInstanceEnable(Z)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_23

    :catch_23
    :cond_1a
    :try_start_24
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_allow_spdy_when_bind_service_failed"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 129
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1b

    .line 131
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 132
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setAllowSpdyWhenBindServiceFailed(Z)V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_24

    :catch_24
    :cond_1b
    :try_start_25
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string v5, "network_send_connect_info_by_service"

    aput-object v5, v0, v3

    aput-object v7, v0, v1

    .line 133
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 134
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1c

    .line 135
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 136
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setSendConnectInfoByService(Z)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_25

    :catch_25
    :cond_1c
    :try_start_26
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v4

    const-string p1, "network_http_dns_notify_white_list"

    aput-object p1, v0, v3

    aput-object v7, v0, v1

    .line 137
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 138
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1d

    .line 139
    invoke-static {p1}, Lanet/channel/AwcnConfig;->setHttpDnsNotifyWhiteList(Ljava/lang/String;)V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_26

    :catch_26
    :cond_1d
    return-void
.end method

.method public register()V
    .locals 7

    const-string v0, "networkSdk"

    .line 1
    sget-boolean v1, Lanet/channel/c/a;->a:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "awcn.OrangeConfigImpl"

    if-nez v1, :cond_0

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "no orange sdk"

    .line 2
    invoke-static {v4, v1, v3, v0}, Lanet/channel/util/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/taobao/orange/OrangeConfig;->getInstance()Lcom/taobao/orange/OrangeConfig;

    move-result-object v1

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lanet/channel/c/b;

    invoke-direct {v6, p0}, Lanet/channel/c/b;-><init>(Lanet/channel/c/a;)V

    invoke-virtual {v1, v5, v6}, Lcom/taobao/orange/OrangeConfig;->registerListener([Ljava/lang/String;Lcom/taobao/orange/OrangeConfigListenerV1;)V

    const-string v1, "network_empty_scheme_https_switch"

    const-string v5, "true"

    .line 4
    filled-new-array {v0, v1, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "register fail"

    .line 5
    invoke-static {v4, v2, v3, v0, v1}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public unRegister()V
    .locals 4

    .line 1
    sget-boolean v0, Lanet/channel/c/a;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "awcn.OrangeConfigImpl"

    const-string v3, "no orange sdk"

    .line 2
    invoke-static {v2, v3, v0, v1}, Lanet/channel/util/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/taobao/orange/OrangeConfig;->getInstance()Lcom/taobao/orange/OrangeConfig;

    move-result-object v0

    const-string v1, "networkSdk"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/taobao/orange/OrangeConfig;->unregisterListener([Ljava/lang/String;)V

    return-void
.end method
