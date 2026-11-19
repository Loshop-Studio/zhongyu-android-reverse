.class public final Lcom/friday/main/viewmodel/HomeViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/HomeViewModel;->m(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/main/viewmodel/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/HomeViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$a;->c:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lje/e;Ljava/io/IOException;)V
    .locals 1

    .line 1
    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lje/e;Lje/y;)V
    .locals 3

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lje/y;->e()Lje/z;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lje/z;->string()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p2, p0, Lcom/friday/main/viewmodel/HomeViewModel$a;->c:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 26
    .line 27
    :try_start_0
    const-class v0, Lcom/friday/main/model/VersionUpdate;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/friday/main/model/VersionUpdate;

    .line 34
    .line 35
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "updateInfo"

    .line 40
    .line 41
    invoke-virtual {v1, v2, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {v0}, Lcom/friday/main/model/VersionUpdate;->getResult()Lcom/friday/main/model/Result;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lcom/friday/main/model/Result;->getVersionCode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-le v1, p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/friday/main/viewmodel/HomeViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance p2, Le2/a;

    .line 63
    .line 64
    invoke-direct {p2, v0}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    :catch_0
    :cond_1
    return-void
.end method
