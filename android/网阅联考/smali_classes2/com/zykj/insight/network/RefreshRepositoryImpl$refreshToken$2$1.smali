.class final Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "serverInfo",
        "",
        "a",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/insight/network/RefreshRepositoryImpl;


# direct methods
.method public constructor <init>(Lcom/zykj/insight/network/RefreshRepositoryImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2$1;->a:Lcom/zykj/insight/network/RefreshRepositoryImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2$1;->a:Lcom/zykj/insight/network/RefreshRepositoryImpl;

    .line 5
    .line 6
    invoke-static {v1}, Lcom/zykj/insight/network/RefreshRepositoryImpl;->c(Lcom/zykj/insight/network/RefreshRepositoryImpl;)Lcom/zykj/http/bean/HeaderLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    move-object v3, v2

    .line 15
    check-cast v3, Lcom/zykj/http/bean/HeaderBean;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->e()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const/4 v8, 0x0

    .line 27
    const/16 v9, 0x17

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    invoke-static/range {v3 .. v10}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-static {v1}, Lcom/zykj/insight/network/RefreshRepositoryImpl;->c(Lcom/zykj/insight/network/RefreshRepositoryImpl;)Lcom/zykj/http/bean/HeaderLiveData;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {v1}, Lcom/zykj/insight/network/RefreshRepositoryImpl;->b(Lcom/zykj/insight/network/RefreshRepositoryImpl;)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->e()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, v0, p1}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p1, " token\u83b7\u53d6\u6210\u529f"

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2$1;->a:Lcom/zykj/insight/network/RefreshRepositoryImpl;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/zykj/insight/network/RefreshRepositoryImpl;->d(Lcom/zykj/insight/network/RefreshRepositoryImpl;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2$1;->a:Lcom/zykj/insight/network/RefreshRepositoryImpl;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, " token\u83b7\u53d6\u5931\u8d25"

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2$1;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p1
.end method
