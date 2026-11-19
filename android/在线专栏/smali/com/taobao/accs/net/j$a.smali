.class public Lcom/taobao/accs/net/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lanet/channel/IAuth;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/taobao/accs/net/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:I

.field private c:Ljava/lang/String;

.field private final d:Lcom/taobao/accs/net/b;

.field private final e:Lcom/alibaba/sdk/android/logger/ILog;


# direct methods
.method public constructor <init>(Lcom/taobao/accs/net/b;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/taobao/accs/net/b;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/accs/net/j$a;->c:Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/accs/"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/taobao/accs/net/b;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/taobao/accs/net/j$a;->a:Ljava/lang/String;

    .line 4
    iget p2, p1, Lcom/taobao/accs/net/b;->c:I

    iput p2, p0, Lcom/taobao/accs/net/j$a;->b:I

    .line 5
    iput-object p1, p0, Lcom/taobao/accs/net/j$a;->d:Lcom/taobao/accs/net/b;

    .line 6
    invoke-virtual {p1}, Lcom/taobao/accs/net/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/taobao/accs/utl/AccsLogger;->getLogger(Ljava/lang/Object;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/accs/net/j$a;->e:Lcom/alibaba/sdk/android/logger/ILog;

    return-void
.end method

.method static synthetic a(Lcom/taobao/accs/net/j$a;)Lcom/alibaba/sdk/android/logger/ILog;
    .locals 0

    iget-object p0, p0, Lcom/taobao/accs/net/j$a;->e:Lcom/alibaba/sdk/android/logger/ILog;

    return-object p0
.end method

.method static synthetic b(Lcom/taobao/accs/net/j$a;)Lcom/taobao/accs/net/b;
    .locals 0

    iget-object p0, p0, Lcom/taobao/accs/net/j$a;->d:Lcom/taobao/accs/net/b;

    return-object p0
.end method


# virtual methods
.method public auth(Lanet/channel/Session;Lanet/channel/IAuth$AuthCallback;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/j$a;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "auth"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "URL"

    aput-object v3, v1, v2

    iget-object v2, p0, Lcom/taobao/accs/net/j$a;->a:Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 2
    new-instance v0, Lanet/channel/request/Request$Builder;

    invoke-direct {v0}, Lanet/channel/request/Request$Builder;-><init>()V

    iget-object v1, p0, Lcom/taobao/accs/net/j$a;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Lanet/channel/request/Request$Builder;->setUrl(Ljava/lang/String;)Lanet/channel/request/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lanet/channel/request/Request$Builder;->build()Lanet/channel/request/Request;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/taobao/accs/net/s;

    invoke-direct {v1, p0, p2}, Lcom/taobao/accs/net/s;-><init>(Lcom/taobao/accs/net/j$a;Lanet/channel/IAuth$AuthCallback;)V

    invoke-virtual {p1, v0, v1}, Lanet/channel/Session;->request(Lanet/channel/request/Request;Lanet/channel/RequestCb;)Lanet/channel/request/Cancelable;

    return-void
.end method
