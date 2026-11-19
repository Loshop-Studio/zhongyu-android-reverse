.class public final Lcom/zykj/curricula/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/curricula/MainActivity$JsToJava;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/curricula/MainActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n318#2,7:224\n256#2,2:231\n*E\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/curricula/MainActivity\n*L\n156#1,7:224\n195#1,2:231\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0002J\u0008\u0010\u0013\u001a\u00020\u0012H\u0002J\u0008\u0010\u0014\u001a\u00020\u0012H\u0002J\u0008\u0010\u0015\u001a\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u001a\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0008\u0010\u001e\u001a\u00020\u0012H\u0014J\u0008\u0010\u001f\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\nj\u0008\u0012\u0004\u0012\u00020\u0004`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006!"
    }
    d2 = {
        "Lcom/zykj/curricula/MainActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "apiHost",
        "",
        "apiToken",
        "homeUrl",
        "isInitSuccess",
        "",
        "localWhiteList",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "permissions",
        "",
        "[Ljava/lang/String;",
        "checkIsInWhiteWebUrlList",
        "url",
        "getPermission",
        "",
        "initWebViewUrl",
        "initWhiteUrlList",
        "initialize",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onKeyDown",
        "keyCode",
        "",
        "event",
        "Landroid/view/KeyEvent;",
        "onResume",
        "requestUserCenter",
        "JsToJava",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;

.field private apiHost:Ljava/lang/String;

.field private apiToken:Ljava/lang/String;

.field private homeUrl:Ljava/lang/String;

.field private isInitSuccess:Z

.field private final localWhiteList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private permissions:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 28
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/curricula/MainActivity;->permissions:[Ljava/lang/String;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/curricula/MainActivity;->localWhiteList:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic access$checkIsInWhiteWebUrlList(Lcom/zykj/curricula/MainActivity;Ljava/lang/String;)Z
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/zykj/curricula/MainActivity;->checkIsInWhiteWebUrlList(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getApiHost$p(Lcom/zykj/curricula/MainActivity;)Ljava/lang/String;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getApiToken$p(Lcom/zykj/curricula/MainActivity;)Ljava/lang/String;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/zykj/curricula/MainActivity;->apiToken:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getHomeUrl$p(Lcom/zykj/curricula/MainActivity;)Ljava/lang/String;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/zykj/curricula/MainActivity;->homeUrl:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$initWebViewUrl(Lcom/zykj/curricula/MainActivity;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/zykj/curricula/MainActivity;->initWebViewUrl()V

    return-void
.end method

.method public static final synthetic access$initWhiteUrlList(Lcom/zykj/curricula/MainActivity;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/zykj/curricula/MainActivity;->initWhiteUrlList()V

    return-void
.end method

.method public static final synthetic access$isInitSuccess$p(Lcom/zykj/curricula/MainActivity;)Z
    .locals 0

    .line 26
    iget-boolean p0, p0, Lcom/zykj/curricula/MainActivity;->isInitSuccess:Z

    return p0
.end method

.method public static final synthetic access$setApiHost$p(Lcom/zykj/curricula/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setApiToken$p(Lcom/zykj/curricula/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/zykj/curricula/MainActivity;->apiToken:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setHomeUrl$p(Lcom/zykj/curricula/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/zykj/curricula/MainActivity;->homeUrl:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setInitSuccess$p(Lcom/zykj/curricula/MainActivity;Z)V
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/zykj/curricula/MainActivity;->isInitSuccess:Z

    return-void
.end method

.method private final checkIsInWhiteWebUrlList(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    .line 189
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    iget-object p1, p0, Lcom/zykj/curricula/MainActivity;->localWhiteList:Ljava/util/ArrayList;

    check-cast p1, Ljava/lang/Iterable;

    .line 231
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    .line 196
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v5

    const-string v6, "httpUrl.host"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    invoke-static {v5, v4, v0, v6, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v2

    .line 232
    :cond_1
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0

    :catch_0
    move-exception p1

    .line 191
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->printStackTrace()V

    return v0
.end method

.method private final getPermission()V
    .locals 2

    .line 123
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    .line 124
    invoke-virtual {p0, v0}, Lcom/zykj/curricula/MainActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->permissions:[Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/zykj/curricula/MainActivity;->requestPermissions([Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method private final initWebViewUrl()V
    .locals 13

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://demo.exam.zykj.org/dev/index.html?apiHost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&apiToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/curricula/MainActivity;->apiToken:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "#/index/courseChoosing/StudentsCoursesList"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/curricula/MainActivity;->homeUrl:Ljava/lang/String;

    .line 152
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/CharSequence;

    const-string v7, "test"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v0, v7, v6, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-ne v0, v5, :cond_0

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "http://test.school.zykj.org/index.html?apiHost="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/curricula/MainActivity;->apiToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/curricula/MainActivity;->homeUrl:Ljava/lang/String;

    goto/16 :goto_4

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    if-eqz v0, :cond_7

    check-cast v0, Ljava/lang/CharSequence;

    const-string v7, "dev.xxg.zyyx.cc"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v0, v7, v6, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 155
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v7, v0

    check-cast v7, Ljava/lang/CharSequence;

    const-string v0, "."

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 225
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, -0x1

    if-eqz v10, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 226
    check-cast v10, Ljava/lang/String;

    .line 156
    check-cast v10, Ljava/lang/CharSequence;

    const-string v12, "api"

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v10, v12, v6, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    const/4 v9, -0x1

    :goto_1
    if-ne v9, v11, :cond_3

    const/4 v9, 0x1

    .line 160
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    move-object v4, v7

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_2
    if-ge v6, v4, :cond_6

    if-ne v6, v9, :cond_4

    const-string v8, "school"

    .line 163
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 165
    :cond_4
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    :goto_3
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v8, v5

    if-eq v6, v8, :cond_5

    .line 168
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 172
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/index.html?apiHost="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/zykj/curricula/MainActivity;->apiHost:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/curricula/MainActivity;->apiToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/curricula/MainActivity;->homeUrl:Ljava/lang/String;

    .line 174
    :cond_7
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const v2, 0x34fd9000

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainActivity"

    invoke-static {v1, v0}, Lcom/zykj/utlils/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->homeUrl:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "loadUrl"

    invoke-static {v1, v0}, Lcom/zykj/utlils/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    sget v0, Lcom/zykj/curricula/R$id;->web_curricula:I

    invoke-virtual {p0, v0}, Lcom/zykj/curricula/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    new-instance v1, Lcom/zykj/curricula/MainActivity$initWebViewUrl$1;

    invoke-direct {v1, p0}, Lcom/zykj/curricula/MainActivity$initWebViewUrl$1;-><init>(Lcom/zykj/curricula/MainActivity;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final initWhiteUrlList()V
    .locals 2

    .line 210
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/zykj/curricula/MainActivity;->homeUrl:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 212
    invoke-virtual {v0}, Ljava/net/MalformedURLException;->printStackTrace()V

    const/4 v0, 0x0

    .line 215
    :goto_0
    iget-object v1, p0, Lcom/zykj/curricula/MainActivity;->localWhiteList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-eqz v0, :cond_0

    .line 217
    iget-object v1, p0, Lcom/zykj/curricula/MainActivity;->localWhiteList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->localWhiteList:Ljava/util/ArrayList;

    const-string v1, "zykj.org"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method private final initialize()V
    .locals 6

    const/4 v0, 0x1

    .line 53
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 54
    sget v1, Lcom/zykj/curricula/R$id;->web_curricula:I

    invoke-virtual {p0, v1}, Lcom/zykj/curricula/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    const-string v2, "web_curricula"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const-string v3, "web_curricula.settings"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 55
    sget v1, Lcom/zykj/curricula/R$id;->web_curricula:I

    invoke-virtual {p0, v1}, Lcom/zykj/curricula/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    new-instance v4, Lcom/zykj/curricula/MainActivity$JsToJava;

    invoke-direct {v4, p0}, Lcom/zykj/curricula/MainActivity$JsToJava;-><init>(Lcom/zykj/curricula/MainActivity;)V

    const-string v5, "JsToJava"

    invoke-virtual {v1, v4, v5}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    sget v1, Lcom/zykj/curricula/R$id;->web_curricula:I

    invoke-virtual {p0, v1}, Lcom/zykj/curricula/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    const-string v0, "window"

    .line 59
    invoke-virtual {p0, v0}, Lcom/zykj/curricula/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/view/WindowManager;

    .line 60
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 61
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 62
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v0, v0

    const/16 v3, 0x64

    int-to-double v3, v3

    .line 64
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v3

    const/16 v3, 0x4e2

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 66
    sget v1, Lcom/zykj/curricula/R$id;->web_curricula:I

    invoke-virtual {p0, v1}, Lcom/zykj/curricula/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 68
    sget v0, Lcom/zykj/curricula/R$id;->web_curricula:I

    invoke-virtual {p0, v0}, Lcom/zykj/curricula/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/curricula/MainActivity$initialize$1;

    invoke-direct {v1, p0}, Lcom/zykj/curricula/MainActivity$initialize$1;-><init>(Lcom/zykj/curricula/MainActivity;)V

    check-cast v1, Landroid/webkit/WebViewClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method private final requestUserCenter()V
    .locals 2

    .line 134
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    new-instance v1, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;

    invoke-direct {v1, p0}, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;-><init>(Lcom/zykj/curricula/MainActivity;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->getServerInfo(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/curricula/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/curricula/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 37
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    # RE layout layout/activity_main (0x7f09001c), APK res/layout/activity_main.xml
    const p1, 0x7f09001c

    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/curricula/MainActivity;->setContentView(I)V

    .line 40
    invoke-direct {p0}, Lcom/zykj/curricula/MainActivity;->getPermission()V

    .line 42
    invoke-direct {p0}, Lcom/zykj/curricula/MainActivity;->initialize()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 113
    invoke-virtual {p0}, Lcom/zykj/curricula/MainActivity;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    .line 116
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onResume()V
    .locals 0

    .line 46
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 48
    invoke-direct {p0}, Lcom/zykj/curricula/MainActivity;->requestUserCenter()V

    return-void
.end method
