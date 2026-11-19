# RE note 本类字节码直接引用的读写或显示接口包括偏好设置、JSON。
.class public final Lcom/zykj/subscriber/MainActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/subscriber/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/gson/Gson;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field final synthetic b:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$b;->b:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$b;->a:Lcom/google/gson/Gson;

    return-void
.end method


# virtual methods
# RE I/O 写入 JSON（Gson.toJson）。
.method public final checkUrls(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "urls"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavascriptInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_2

    add-int/lit8 v3, v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/zykj/subscriber/MainActivity$b;->b:Lcom/zykj/subscriber/MainActivity;

    .line 6
    invoke-static {v4, v2}, Lcom/zykj/subscriber/MainActivity;->m(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 7
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    move v2, v3

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$b;->a:Lcom/google/gson/Gson;

    invoke-virtual {p1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(badUrlList)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

# RE I/O 读取字符串偏好（SharedPreferences.getString）。
.method public final getUserInfo()Ljava/lang/String;
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$b;->b:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v0}, Ll2/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "SP_LOCAL_USER_INFO"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "LocalUserInfo->"

    .line 2
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MainActivity"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final open_file(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$b;->b:Lcom/zykj/subscriber/MainActivity;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$b$a;

    invoke-direct {v1, v0, p1}, Lcom/zykj/subscriber/MainActivity$b$a;-><init>(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)V

    invoke-static {v0, p1, v1}, Lcom/zykj/subscriber/MainActivity;->n(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;Lx2/l;)V

    return-void
.end method

.method public final open_html(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$b;->b:Lcom/zykj/subscriber/MainActivity;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$b$b;

    invoke-direct {v1, v0}, Lcom/zykj/subscriber/MainActivity$b$b;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-static {v0, p1, v1}, Lcom/zykj/subscriber/MainActivity;->n(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;Lx2/l;)V

    return-void
.end method

.method public final refreshToken()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "OkHttp"

    const-string v1, "\u7f51\u9875\u62a5\u9519\uff0c\u8c03\u7528refreshToken"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object v0, Lz1/b;->a:Lz1/b;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$b$c;

    iget-object v2, p0, Lcom/zykj/subscriber/MainActivity$b;->b:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {v1, v2}, Lcom/zykj/subscriber/MainActivity$b$c;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v0, v1}, Lz1/b;->f(Lx2/l;)V

    return-void
.end method

.method public final transmitUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url--?"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "JsToJava"

    invoke-static {v0, p1}, Ll2/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
