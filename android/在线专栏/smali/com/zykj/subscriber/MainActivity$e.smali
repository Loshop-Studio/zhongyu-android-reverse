# RE note 本类字节码直接引用的读写或显示接口包括偏好设置、JSON。
.class final Lcom/zykj/subscriber/MainActivity$e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity;->O(Lcom/zykj/message/server/bean/UserInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Ljava/lang/String;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/message/server/bean/UserInfo;

.field final synthetic b:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/message/server/bean/UserInfo;Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$e;->a:Lcom/zykj/message/server/bean/UserInfo;

    iput-object p2, p0, Lcom/zykj/subscriber/MainActivity$e;->b:Lcom/zykj/subscriber/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
# RE I/O 写入 JSON（Gson.toJson）、保存字符串偏好（SharedPreferences$Editor.putString）。
.method public final a(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$e;->a:Lcom/zykj/message/server/bean/UserInfo;

    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$e;->b:Lcom/zykj/subscriber/MainActivity;

    .line 2
    new-instance v2, Lcom/zykj/subscriber/entity/LocalUserInfo;

    .line 3
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "userInfo.userName"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/String;

    move-result-object v0

    const-string v4, "userInfo.realName"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {v2, p1, v3, v0}, Lcom/zykj/subscriber/entity/LocalUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {p1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "LocalUserInfo->"

    .line 7
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "MainActivity"

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-static {v1}, Ll2/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "SP_LOCAL_USER_INFO"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$e;->a(Ljava/lang/String;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
