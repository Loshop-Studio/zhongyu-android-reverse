.class Lcom/taobao/accs/net/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/android/spdy/AccsSSLCallback;


# instance fields
.field final synthetic a:Lcom/taobao/accs/net/w;


# direct methods
.method public constructor <init>(Lcom/taobao/accs/net/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/taobao/accs/net/aa;->a:Lcom/taobao/accs/net/w;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getSSLPublicKey(I[B)[B
    .locals 0

    .line 1
    invoke-static {}, Lcom/taobao/accs/utl/UtilityImpl;->a()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
