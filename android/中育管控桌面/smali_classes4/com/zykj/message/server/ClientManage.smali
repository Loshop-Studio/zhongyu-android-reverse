.class public abstract enum Lcom/zykj/message/server/ClientManage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/message/server/ClientManage$INSTANCES;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/message/server/ClientManage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fj\u0002\u0008\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/message/server/ClientManage;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "",
        "Lm4/a;",
        "a",
        "()Ljava/util/Map;",
        "key",
        "",
        "c",
        "(Ljava/lang/String;)V",
        "stub",
        "b",
        "(Lm4/a;)V",
        "messageserver_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/message/server/ClientManage;

.field public static final synthetic b:[Lcom/zykj/message/server/ClientManage;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/zykj/message/server/ClientManage$INSTANCES;

    const-string v1, "INSTANCES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/message/server/ClientManage$INSTANCES;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/message/server/ClientManage;->a:Lcom/zykj/message/server/ClientManage;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/zykj/message/server/ClientManage;

    aput-object v0, v1, v2

    sput-object v1, Lcom/zykj/message/server/ClientManage;->b:[Lcom/zykj/message/server/ClientManage;

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
    invoke-direct {p0, p1, p2}, Lcom/zykj/message/server/ClientManage;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/server/ClientManage;
    .locals 1

    const-class v0, Lcom/zykj/message/server/ClientManage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/message/server/ClientManage;

    return-object p0
.end method

.method public static values()[Lcom/zykj/message/server/ClientManage;
    .locals 1

    sget-object v0, Lcom/zykj/message/server/ClientManage;->b:[Lcom/zykj/message/server/ClientManage;

    invoke-virtual {v0}, [Lcom/zykj/message/server/ClientManage;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/server/ClientManage;

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method

.method public abstract b(Lm4/a;)V
.end method

.method public abstract c(Ljava/lang/String;)V
.end method
