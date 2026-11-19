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

    .line 1
    :try_start_0
    const-string v0, "com.taobao.orange.OrangeConfig"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lanet/channel/c/a;->a:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    const/4 v0, 0x0

    .line 11
    sput-boolean v0, Lanet/channel/c/a;->a:Z

    .line 12
    .line 13
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

    .line 2
    .line 3
    const-string v1, "awcn.OrangeConfigImpl"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, "no orange sdk"

    .line 10
    .line 11
    new-array v0, v2, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v1, p1, v3, v0}, Lanet/channel/util/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v3

    .line 17
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/taobao/orange/OrangeConfig;->getInstance()Lcom/taobao/orange/OrangeConfig;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    aget-object v4, p1, v2

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    aget-object v5, p1, v5

    .line 25
    .line 26
    const/4 v6, 0x2

    .line 27
    aget-object p1, p1, v6

    .line 28
    .line 29
    invoke-virtual {v0, v4, v5, p1}, Lcom/taobao/orange/OrangeConfig;->getConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object p1

    .line 34
    :catch_0
    move-exception p1

    .line 35
    const-string v0, "get config failed!"

    .line 36
    .line 37
    new-array v2, v2, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v0, v3, p1, v2}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v3
.end method

.method public onConfigUpdate(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "true"

    const-string v1, "networkSdk"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    .line 2
    const-string v1, "namespace"

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "awcn.OrangeConfigImpl"

    const-string v3, "onConfigUpdate"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4, v1}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :try_start_0
    const-string v1, "network_empty_scheme_https_switch"

    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 4
    sget-object v2, Lanet/channel/strategy/c$a;->a:Lanet/channel/strategy/c;

    .line 5
    invoke-virtual {v2, v1}, Lanet/channel/strategy/c;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    :catch_0
    :try_start_1
    const-string v1, "network_spdy_enable_switch"

    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 7
    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->setSpdyEnabled(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 8
    :catch_1
    :try_start_2
    const-string v1, "network_http_cache_switch"

    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 9
    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->setHttpCacheEnable(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 10
    :catch_2
    :try_start_3
    const-string v1, "network_http_cache_flag"

    filled-new-array {p1, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lanetwork/channel/config/NetworkConfigCenter;->setCacheFlag(J)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 12
    :catch_3
    :cond_0
    :try_start_4
    const-string v1, "network_https_sni_enable_switch"

    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 13
    invoke-static {v1}, Lanet/channel/AwcnConfig;->setHttpsSniEnable(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 14
    :catch_4
    :try_start_5
    const-string v1, "network_accs_session_bg_switch"

    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 15
    invoke-static {v1}, Lanet/channel/AwcnConfig;->setAccsSessionCreateForbiddenInBg(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 16
    :catch_5
    :try_start_6
    const-string v1, "network_request_statistic_sample_rate"

    const-string v2, "10000"

    filled-new-array {p1, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 17
    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->setRequestStatisticSampleRate(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 18
    :catch_6
    :try_start_7
    const-string v1, "network_request_forbidden_bg"

    filled-new-array {p1, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 20
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 21
    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->setBgRequestForbidden(Z)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 22
    :catch_7
    :cond_1
    :try_start_8
    const-string v1, "network_url_white_list_bg"

    filled-new-array {p1, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->updateWhiteListMap(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 23
    :catch_8
    :try_start_9
    const-string v1, "network_biz_white_list_bg"

    filled-new-array {p1, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 25
    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->updateBizWhiteList(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    .line 26
    :catch_9
    :cond_2
    :try_start_a
    const-string v1, "network_amdc_preset_hosts"

    filled-new-array {p1, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 28
    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->setAmdcPresetHosts(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    .line 29
    :catch_a
    :cond_3
    :try_start_b
    const-string v1, "network_horse_race_switch"

    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 30
    invoke-static {v1}, Lanet/channel/AwcnConfig;->setHorseRaceEnable(Z)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    .line 31
    :catch_b
    :try_start_c
    const-string v1, "tnet_enable_header_cache"

    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 32
    invoke-static {v1}, Lanet/channel/AwcnConfig;->setTnetHeaderCacheEnable(Z)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    const/4 v1, 0x0

    .line 33
    :try_start_d
    const-string v2, "network_http3_enable_switch"

    filled-new-array {p1, v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 34
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 35
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 36
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 37
    const-string v5, "HTTP3_ENABLE"

    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 38
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 39
    invoke-static {v2}, Lanet/channel/AwcnConfig;->setHttp3OrangeEnable(Z)V

    if-nez v2, :cond_4

    .line 40
    invoke-static {v1}, Lanet/channel/AwcnConfig;->setHttp3Enable(Z)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    .line 41
    :catch_d
    :cond_4
    :try_start_e
    const-string v2, "network_response_buffer_switch"

    filled-new-array {p1, v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 42
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setResponseBufferEnable(Z)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    .line 43
    :catch_e
    :try_start_f
    const-string v0, "network_get_session_async_switch"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 46
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 47
    const-string v3, "SESSION_ASYNC_OPTIMIZE"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 48
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    .line 49
    :catch_f
    :cond_5
    :try_start_10
    const-string v0, "network_bg_forbid_request_threshold"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_6

    goto :goto_0

    :cond_6
    move v1, v0

    .line 52
    :goto_0
    invoke-static {v1}, Lanetwork/channel/config/NetworkConfigCenter;->setBgForbidRequestThreshold(I)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    .line 53
    :catch_10
    :cond_7
    :try_start_11
    const-string v0, "network_normal_thread_pool_executor_size"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 56
    invoke-static {v0}, Lanet/channel/thread/ThreadPoolExecutorFactory;->setNormalExecutorPoolSize(I)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    .line 57
    :catch_11
    :cond_8
    :try_start_12
    const-string v0, "network_idle_session_close_switch"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 59
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 60
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIdleSessionCloseEnable(Z)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12

    .line 61
    :catch_12
    :cond_9
    :try_start_13
    const-string v0, "network_monitor_requests"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 63
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setMonitorRequestList(Ljava/lang/String;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    .line 64
    :catch_13
    :cond_a
    :try_start_14
    const-string v0, "network_session_preset_hosts"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 65
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 66
    invoke-static {v0}, Lanet/channel/AwcnConfig;->registerPresetSessions(Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14

    .line 67
    :catch_14
    :cond_b
    :try_start_15
    const-string v0, "network_ipv6_blacklist_switch"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 69
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 70
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIpv6BlackListEnable(Z)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_15

    .line 71
    :catch_15
    :cond_c
    :try_start_16
    const-string v0, "network_ipv6_blacklist_ttl"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_d

    .line 73
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 74
    invoke-static {v0, v1}, Lanet/channel/AwcnConfig;->setIpv6BlackListTtl(J)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_16

    .line 75
    :catch_16
    :cond_d
    :try_start_17
    const-string v0, "network_url_degrade_list"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    .line 77
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setDegradeRequestList(Ljava/lang/String;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_17

    .line 78
    :catch_17
    :cond_e
    :try_start_18
    const-string v0, "network_delay_retry_request_no_network"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_f

    .line 80
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 81
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setRequestDelayRetryForNoNetwork(Z)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_18

    .line 82
    :catch_18
    :cond_f
    :try_start_19
    const-string v0, "network_bind_service_optimize"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 84
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 85
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 86
    const-string v2, "SERVICE_OPTIMIZE"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 87
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_19

    .line 88
    :catch_19
    :cond_10
    :try_start_1a
    const-string v0, "network_forbid_next_launch_optimize"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_11

    .line 90
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 91
    invoke-static {}, Lanetwork/channel/http/NetworkSdkSetting;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 92
    const-string v2, "NEXT_LAUNCH_FORBID"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 93
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_1a

    .line 94
    :catch_1a
    :cond_11
    :try_start_1b
    const-string v0, "network_detect_enable_switch"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 95
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_12

    .line 96
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 97
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setNetworkDetectEnable(Z)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_1b

    .line 98
    :catch_1b
    :cond_12
    :try_start_1c
    const-string v0, "network_ping6_enable_switch"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 99
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_13

    .line 100
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 101
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setPing6Enable(Z)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_1c

    .line 102
    :catch_1c
    :cond_13
    :try_start_1d
    const-string v0, "network_ipv6_global_enable_swtich"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 103
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_14

    .line 104
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 105
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIpv6Enable(Z)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_1d

    .line 106
    :catch_1d
    :cond_14
    :try_start_1e
    const-string v0, "network_xquic_cong_control"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 107
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_15

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 109
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setXquicCongControl(I)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1e

    .line 110
    :catch_1e
    :cond_15
    :try_start_1f
    const-string v0, "network_http3_detect_valid_time"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 111
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_16

    .line 112
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 113
    invoke-static {v0, v1}, Lanet/channel/e/a;->a(J)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_1f

    .line 114
    :catch_1f
    :cond_16
    :try_start_20
    const-string v0, "network_ip_stack_detect_by_udp_connect_enable_switch"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_17

    .line 116
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 117
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setIpStackDetectByUdpConnect(Z)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_20

    .line 118
    :catch_20
    :cond_17
    :try_start_21
    const-string v0, "network_cookie_monitor"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_18

    .line 120
    invoke-static {v0}, Lanetwork/channel/cookie/CookieManager;->setTargetMonitorCookieName(Ljava/lang/String;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_21

    .line 121
    :catch_21
    :cond_18
    :try_start_22
    const-string v0, "network_cookie_header_redundant_fix"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_19

    .line 123
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 124
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setCookieHeaderRedundantFix(Z)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_22

    .line 125
    :catch_22
    :cond_19
    :try_start_23
    const-string v0, "network_channel_local_instance_enable_switch"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1a

    .line 127
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 128
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setChannelLocalInstanceEnable(Z)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_23

    .line 129
    :catch_23
    :cond_1a
    :try_start_24
    const-string v0, "network_allow_spdy_when_bind_service_failed"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1b

    .line 131
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 132
    invoke-static {v0}, Lanetwork/channel/config/NetworkConfigCenter;->setAllowSpdyWhenBindServiceFailed(Z)V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_24

    .line 133
    :catch_24
    :cond_1b
    :try_start_25
    const-string v0, "network_send_connect_info_by_service"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 134
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1c

    .line 135
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 136
    invoke-static {v0}, Lanet/channel/AwcnConfig;->setSendConnectInfoByService(Z)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_25

    .line 137
    :catch_25
    :cond_1c
    :try_start_26
    const-string v0, "network_http_dns_notify_white_list"

    filled-new-array {p1, v0, v4}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;

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

    .line 1
    const-string v0, "networkSdk"

    .line 2
    .line 3
    sget-boolean v1, Lanet/channel/c/a;->a:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "awcn.OrangeConfigImpl"

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v0, "no orange sdk"

    .line 12
    .line 13
    new-array v1, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v4, v0, v3, v1}, Lanet/channel/util/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/taobao/orange/OrangeConfig;->getInstance()Lcom/taobao/orange/OrangeConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    filled-new-array {v0}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    new-instance v6, Lanet/channel/c/b;

    .line 28
    .line 29
    invoke-direct {v6, p0}, Lanet/channel/c/b;-><init>(Lanet/channel/c/a;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v5, v6}, Lcom/taobao/orange/OrangeConfig;->registerListener([Ljava/lang/String;Lcom/taobao/orange/OrangeConfigListenerV1;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "network_empty_scheme_https_switch"

    .line 36
    .line 37
    const-string v5, "true"

    .line 38
    .line 39
    filled-new-array {v0, v1, v5}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Lanet/channel/c/a;->getConfig([Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception v0

    .line 48
    const-string v1, "register fail"

    .line 49
    .line 50
    new-array v2, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v4, v1, v3, v0, v2}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public unRegister()V
    .locals 4

    .line 1
    sget-boolean v0, Lanet/channel/c/a;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "awcn.OrangeConfigImpl"

    .line 9
    .line 10
    const-string v2, "no orange sdk"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v1, v2, v3, v0}, Lanet/channel/util/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {}, Lcom/taobao/orange/OrangeConfig;->getInstance()Lcom/taobao/orange/OrangeConfig;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "networkSdk"

    .line 22
    .line 23
    filled-new-array {v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/taobao/orange/OrangeConfig;->unregisterListener([Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
