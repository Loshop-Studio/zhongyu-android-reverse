.class public final Lcom/zykj/lib/login/provide/UserBeanSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/core/Serializer;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/datastore/core/Serializer<",
        "Lcom/zykj/lib/login/proto/UserBean;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/lib/login/provide/UserBeanSerializer;

.field public static final b:Lcom/zykj/lib/login/proto/UserBean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/lib/login/provide/UserBeanSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/lib/login/provide/UserBeanSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/lib/login/provide/UserBeanSerializer;->a:Lcom/zykj/lib/login/provide/UserBeanSerializer;

    .line 7
    .line 8
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/UserBean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getDefaultInstance(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/lib/login/provide/UserBeanSerializer;->b:Lcom/zykj/lib/login/proto/UserBean;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/provide/UserBeanSerializer;->b:Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lcom/zykj/lib/login/proto/UserBean;Ljava/io/OutputStream;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/lib/login/provide/UserBeanSerializer$writeTo$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p2, v2}, Lcom/zykj/lib/login/provide/UserBeanSerializer$writeTo$2;-><init>(Lcom/zykj/lib/login/proto/UserBean;Ljava/io/OutputStream;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 23
    .line 24
    return-object p1
.end method

.method public bridge synthetic getDefaultValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/login/provide/UserBeanSerializer;->a()Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public readFrom(Ljava/io/InputStream;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/lib/login/provide/UserBeanSerializer$readFrom$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lcom/zykj/lib/login/provide/UserBeanSerializer$readFrom$2;-><init>(Ljava/io/InputStream;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public bridge synthetic writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/lib/login/provide/UserBeanSerializer;->b(Lcom/zykj/lib/login/proto/UserBean;Ljava/io/OutputStream;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
