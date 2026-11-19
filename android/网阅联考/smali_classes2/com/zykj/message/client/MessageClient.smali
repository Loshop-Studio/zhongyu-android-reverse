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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0006\u001a\u00020\u0004H&J\u001c\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0007H&J\u001e\u0010\u000b\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u00040\u0007H&J\u0008\u0010\r\u001a\u00020\u000cH&j\u0002\u0008\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/message/client/MessageClient;",
        "",
        "Landroid/app/Application;",
        "context",
        "",
        "d",
        "e",
        "Lkotlin/Function1;",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "callBack",
        "a",
        "c",
        "",
        "b",
        "<init>",
        "(Ljava/lang/String;I)V",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/message/client/MessageClient;

.field public static final synthetic b:[Lcom/zykj/message/client/MessageClient;

.field public static final c:Lcom/zykj/message/client/MessageClient$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/zykj/message/client/MessageClient;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES;

    const-string v2, "INSTANCES"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    aput-object v1, v0, v3

    sput-object v0, Lcom/zykj/message/client/MessageClient;->b:[Lcom/zykj/message/client/MessageClient;

    new-instance v0, Lcom/zykj/message/client/MessageClient$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/message/client/MessageClient$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    sget-object v0, Lcom/zykj/message/client/MessageClient;->b:[Lcom/zykj/message/client/MessageClient;

    invoke-virtual {v0}, [Lcom/zykj/message/client/MessageClient;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/client/MessageClient;

    return-object v0
.end method


# virtual methods
.method public abstract a(Lkotlin/jvm/functions/Function1;)V
.end method

.method public abstract b()Z
.end method

.method public abstract c(Lkotlin/jvm/functions/Function1;)V
.end method

.method public abstract d(Landroid/app/Application;)V
.end method

.method public abstract e()V
.end method
