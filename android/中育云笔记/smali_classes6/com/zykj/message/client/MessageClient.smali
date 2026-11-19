.class public abstract enum Lcom/zykj/message/client/MessageClient;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/message/client/MessageClient$INSTANCES;,
        Lcom/zykj/message/client/MessageClient$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/message/client/MessageClient;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/zykj/message/client/MessageClient;

.field public static final synthetic d:[Lcom/zykj/message/client/MessageClient;

.field public static final e:Lcom/zykj/message/client/MessageClient$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/zykj/message/client/MessageClient$INSTANCES;

    const-string v1, "INSTANCES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/zykj/message/client/MessageClient;

    aput-object v0, v1, v2

    sput-object v1, Lcom/zykj/message/client/MessageClient;->d:[Lcom/zykj/message/client/MessageClient;

    new-instance v0, Lcom/zykj/message/client/MessageClient$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/message/client/MessageClient$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/message/client/MessageClient;->e:Lcom/zykj/message/client/MessageClient$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/zykj/message/client/MessageClient;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/client/MessageClient;
    .locals 1

    const-class v0, Lcom/zykj/message/client/MessageClient;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/message/client/MessageClient;

    return-object p0
.end method

.method public static values()[Lcom/zykj/message/client/MessageClient;
    .locals 1

    sget-object v0, Lcom/zykj/message/client/MessageClient;->d:[Lcom/zykj/message/client/MessageClient;

    invoke-virtual {v0}, [Lcom/zykj/message/client/MessageClient;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/client/MessageClient;

    return-object v0
.end method


# virtual methods
.method public abstract a(Lcb/b;)V
.end method

.method public abstract c(Lhd/l;)V
.end method

.method public abstract d()Lcom/zykj/message/server/bean/UserInfo;
.end method

.method public abstract e(Landroid/app/Application;)V
.end method

.method public abstract f()Z
.end method

.method public abstract g(Lhd/l;)V
.end method

.method public abstract k(Ldb/a;)V
.end method

.method public abstract m(Landroid/app/Application;)V
.end method

.method public abstract n()V
.end method

.method public abstract o(Ldb/a;)V
.end method
